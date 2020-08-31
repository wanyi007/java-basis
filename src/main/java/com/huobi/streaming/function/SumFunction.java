package com.huobi.streaming.function;

import org.apache.flink.table.functions.ScalarFunction;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.streaming.function
 * @date 2020-08-22 12:37
 */
public class SumFunction extends ScalarFunction {
    public Integer eval(Integer a,Integer b){
        return a+b;
    }
}
