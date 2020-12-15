package com.huobi.streaming.flink;

import com.huobi.streaming.function.SumFunction;
import com.huobi.streaming.utils.FileUtils;
import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSink;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.ExecutionCheckpointingOptions;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableEnvironment;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.types.Row;
import scala.util.parsing.json.JSON;

import static org.apache.flink.table.api.Expressions.$;


/**
 * @author wanyi
 * @version V1.0
 *
 *
 * @Package com.huobi.streaming.flink
 * @date 2020-08-19 21:48
 */
public class VhctypeRt {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        //设置watermark的生成时间
        env.getConfig().setAutoWatermarkInterval(200);
        EnvironmentSettings build = EnvironmentSettings.newInstance().useBlinkPlanner().inStreamingMode().build();

        StreamTableEnvironment tabEnv = StreamTableEnvironment.create(env,build);

        //设置checkpoint -- 仅消费一次
        tabEnv.getConfig().getConfiguration().set(ExecutionCheckpointingOptions.CHECKPOINTING_MODE, CheckpointingMode.EXACTLY_ONCE);

        //注册函数
        tabEnv.registerFunction("sumF",new SumFunction());

        DataStreamSource<Tuple3<Long, String, Double>> ds = env.addSource(new SourceFunction<Tuple3<Long, String, Double>>() {
            @Override
            public void run(SourceContext<Tuple3<Long, String, Double>> sourceContext) throws Exception {
                while (true) {
                    sourceContext.collect(new Tuple3<Long, String, Double>(1L, "A", Math.random()));
                    Thread.sleep(1000L);
                }
            }

            @Override
            public void cancel() {

            }
        });
        String sourceTable = "";

        Table table = tabEnv.fromDataStream(ds, $("user"), $("product"), $("amount"));
        System.out.println(table.getSchema());
        tabEnv.createTemporaryView("view",table);

        String query = "select product,sum(amount) from view group by product";

        Table view1 = tabEnv.sqlQuery(query);
        DataStream<Tuple2<Boolean, Row>> tuple2DataStream = tabEnv.toRetractStream(view1, Row.class);

        env.execute();

        //设置使用事件时间
//        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
//
//        Kafka kafka = new Kafka()
//                .version("0.11")
//                .topic(sourceTable)
//                .property("bootstrap.servers", "bootstrap.ip")
//                .property("group.id", "")
//                .startFromLatest()
//                .sinkPartitionerRoundRobin();
//
//        //读取源表
//        tabEnv.connect(kafka).createTemporaryTable("table1");
//        //注册外表
//        tabEnv.connect(kafka).createTemporaryTable("outputtable");
//        Table table1 = tabEnv.sqlQuery("select * from table1");
//        //将table1注册成临时表
//        tabEnv.createTemporaryView("view1",table1);
//        //将table1写入结果表
//        TableResult outputtable = table1.executeInsert("outputtable");
//
//        tabEnv.execute("job_java");


    }
}
