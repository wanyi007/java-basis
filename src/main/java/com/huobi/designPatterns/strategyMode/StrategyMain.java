package com.huobi.designPatterns.strategyMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns.strategyMode
 * @date 2019-08-14 23:34
 */
public class StrategyMain {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcerteStrategyA());
        context.ContextInterFace();
        context = new Context(new ConcreteStrategyB());
        context.ContextInterFace();
        context = new Context(new ConcreteStrategyC());
        context.ContextInterFace();
    }
}
