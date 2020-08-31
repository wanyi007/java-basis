package com.huobi.streaming.flink.test;


import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.flink.table.api.DataTypes;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.descriptors.FileSystem;
import org.apache.flink.table.descriptors.Schema;
import org.apache.flink.table.typeutils.RowIntervalTypeInfo;
import org.apache.flink.types.Row;


import static org.apache.flink.table.api.Expressions.$;

/**
 * @author wanyi
 * @version V1.0
 *
 * 模拟数据写入本地CSV文件
 *
 * @Package com.huobi.streaming.flink.test
 * @date 2020-08-28 16:34
 */
public class sinkLocalTest {

    public static void main(String[] args) throws Exception {
        //获取流的入口
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        //设置使用的分支和解析
        EnvironmentSettings build = EnvironmentSettings.newInstance().useBlinkPlanner().inStreamingMode().build();
        StreamTableEnvironment tabEnv = StreamTableEnvironment.create(env, build);

        //模拟制造流式数据源
        DataStreamSource<Tuple4<Long, String, Double, String>> tuple4DataStreamSource = env.addSource(new SourceFunction<Tuple4<Long, String, Double, String>>() {
            //具体制造逻辑
            @Override
            public void run(SourceContext<Tuple4<Long, String, Double, String>> ctx) throws Exception {
                while (true) {
                    ctx.collect(new Tuple4<Long, String, Double, String>(1L, "wanyi", 3.0, "test"));
                    Thread.sleep(2000);
                }
            }

            @Override
            public void cancel() {

            }
        });

        //将流映射成table
//        Table table = tabEnv.fromDataStream(tuple4DataStreamSource, $("id"), $("name"), $("money"), $("state"));
//        tabEnv.createTemporaryView("view",table);
        //等效于上面👆注释的这两步骤
        tabEnv.createTemporaryView("view",tuple4DataStreamSource,$("id"), $("name"), $("money"));

        String query = "select id,name,sum(money)from view group by id,name";

        Table sqlQuery = tabEnv.sqlQuery(query);

        DataStream<Tuple2<Boolean, Row>> tuple2DataStream = tabEnv.toRetractStream(sqlQuery, Row.class);
        //过滤输出数据
        tuple2DataStream.filter(new FilterFunction<Tuple2<Boolean, Row>>() {
            @Override
            public boolean filter(Tuple2<Boolean, Row> value) throws Exception {
                return value.f0;
            }
        }).map(new MapFunction<Tuple2<Boolean, Row>, Object>() {
            @Override
            public Object map(Tuple2<Boolean, Row> value) throws Exception {
                return value.f1;
            }
        }).print();

        //一但table别转化成datastream，必须使用StreamExecutionEnvironment的execute()方法执行该DataStream作业。
        env.execute();
    }
}
