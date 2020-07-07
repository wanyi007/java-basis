package com.huobi.designPatterns.prototypeMode;

/**
 * @author wanyi
 * @version V1.0
 * 原型抽象类
 * 关键在于这个Clone方法
 * @Package com.huobi.designPatterns.prototypeMode
 * @date 2019-12-06 17:24
 */
public abstract class Prototype {
    private String id;
    public Prototype(String id){
        this.id = id;
    }

    public String Id(){
        return id;
    }

    public abstract Prototype Clone();
}
