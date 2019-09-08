package com.huobi.designPatterns.strategyMode;

/**
 * @author wanyi
 * @version V1.0
 * 封装了具体的算法或者行为，继承与Strategy
 * @Package com.huobi.designPatterns.strategyMode
 * @date 2019-08-14 23:21
 */
public class ConcerteStrategyA extends Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A的实现");
    }
}
