package com.huobi.streaming;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks;
import org.apache.flink.streaming.api.functions.windowing.WindowFunction;
import org.apache.flink.streaming.api.watermark.Watermark;
import org.apache.flink.streaming.api.windowing.assigners.TumblingEventTimeWindows;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.util.Collector;

import javax.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStreamSource;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.streaming
 * @date 2019-05-28 10:18
 */
public class StreaingWindowWatermark {

    public static void main(String[] args) throws Exception{

        //定义socket端口号
        int port = 9000;

        //获取运行环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        //设置使用event_time,默认是process.time
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);

        //设置并行度为1,默认并行度是机器的CPU核数
        env.setParallelism(1);

        //获取socket的数据
        DataStreamSource<String> text = env.socketTextStream("localhost", port, "\n");

        DataStream<Tuple2<String, Long>> inputMap = text.map(new MapFunction<String, Tuple2<String, Long>>() {
            @Override
            public Tuple2<String, Long> map(String value) throws Exception {
                String[] arr = value.split(",");
                return new Tuple2<>(arr[0], Long.parseLong(arr[1]));
            }
        });


        //抽取timestamp和生成watermark
        DataStream<Tuple2<String, Long>> waterMarkStream = inputMap.assignTimestampsAndWatermarks(new AssignerWithPeriodicWatermarks<Tuple2<String, Long>>() {

            Long currentMaxTimestamp = 0L;
            final Long maxOutOfOrderness = 10000L;// 最大允许的乱序时间是10s

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            /**
             * 定义生成watermark的逻辑
             * 默认100ms被调用一次
             */
            @Nullable
            @Override
            public Watermark getCurrentWatermark() {
                return new Watermark(currentMaxTimestamp - maxOutOfOrderness);
            }

            //定义如何提取timestamp
            @Override
            public long extractTimestamp(Tuple2<String, Long> element, long previousElementTimestamp) {
                long timestamp = element.f1;
                currentMaxTimestamp = Math.max(timestamp, currentMaxTimestamp);
                long id = Thread.currentThread().getId();
                System.out.println("currentThreadId:"+id+",key:"+element.f0+",eventtime:["+element.f1+"|"+sdf.format(element.f1)+"],currentMaxTimestamp:["+currentMaxTimestamp+"|"+
                        sdf.format(currentMaxTimestamp)+"],watermark:["+getCurrentWatermark().getTimestamp()+"|"+sdf.format(getCurrentWatermark().getTimestamp())+"]");
                return timestamp;
            }
        });

        DataStream<String> window = waterMarkStream.keyBy(0)
                .window(TumblingEventTimeWindows.of(Time.seconds(3))) //按照消息的eventtime分配窗口
                .apply(new WindowFunction<Tuple2<String, Long>, String, Tuple, TimeWindow>() {

                    @Override
                    public void apply(Tuple tuple, TimeWindow window, Iterable<Tuple2<String, Long>> input, Collector<String> out) throws Exception {
                        String key = tuple.toString();
                        ArrayList<Long> arrList = new ArrayList<>();
                        Iterator<Tuple2<String, Long>> it = input.iterator();
                        while (it.hasNext()) {
                            Tuple2<String, Long> next = it.next();
                            arrList.add(next.f1);
                        }
                        Collections.sort(arrList);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        String result = key + "," + arrList.size() + "," + sdf.format(arrList.get(0)) + "," + sdf.format(arrList.get(arrList.size() - 1))
                                + "," + sdf.format(window.getStart()) + "," + sdf.format(window.getEnd());
                        out.collect(result);
                    }
                });
        window.print();
        env.execute("eventtime-watermark");

    }
}
