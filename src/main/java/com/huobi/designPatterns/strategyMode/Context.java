package com.huobi.designPatterns.strategyMode;

/**
 * @author wanyi
 * @version V1.0
 * 维护对一个strategy的引用
 * @Package com.huobi.designPatterns.strategyMode
 * @date 2019-08-14 23:30
 */
public class Context {
     Strategy strategy;
     public Context(Strategy strategy){
         this.strategy = strategy;
     }
     //上下文接口
    public void ContextInterFace(){
         strategy.AlgorithmInterface();
    }
}
