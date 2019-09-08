package com.huobi.designPatterns.factoryMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns
 * @date 2019-08-13 23:47
 */
public class OperationAdd extends Operation_v1 {
    @Override
    public double GetResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}
