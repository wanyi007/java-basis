package com.huobi.designPatterns.prototypeMode;


/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns.prototypeMode
 * @date 2019-12-06 17:33
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototypel pl = new ConcretePrototypel("I");
        ConcretePrototypel cl = (ConcretePrototypel)pl.Clone();
        System.out.println("Cloned:"+cl.Id());

    }
}
