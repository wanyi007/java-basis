package com.huobi.designPatterns.factoryMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns
 * @date 2019-08-13 23:59
 */
public class OperationDiv extends Operation_v1 {
    @Override
    public double GetResult() throws Exception {
        double result = 0;
        if (getNumberB() == 0) throw new Exception("除数不能为零");
        result = getNumberA() / getNumberB();
        return result;
    }
}
