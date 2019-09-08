package com.huobi.designPatterns.factoryMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns
 * @date 2019-08-13 23:40
 */
public class Operation_v1 {
    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }
    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double GetResult() throws Exception {
        double result = 0;
        return result;
    }
}
