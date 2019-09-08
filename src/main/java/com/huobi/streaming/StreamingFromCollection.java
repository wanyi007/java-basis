package com.huobi.streaming;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.ArrayList;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.streaming
 * @date 2019-05-16 11:24
 */
public class StreamingFromCollection {
    public static void main(String[] args) throws Exception {
        //获取Flink的运行环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(15);
        data.add(20);



        //指定数据源
        DataStreamSource<Integer> collectionData = env.fromCollection(data);

        //通map对数据进行处理
        DataStream<Integer> num = collectionData.map(new MapFunction<Integer, Integer>() {
            @Override
            public Integer map(Integer value) throws Exception {
                return value + 1;
            }
        });

        //直接打印
        num.print().setParallelism(1);

        env.execute("StreamingFromCollection");

    }
}
