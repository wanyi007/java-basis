package com.huobi.designPatterns.BuilderMode;

/**
 * @author wanyi
 * @version V1.0
 * 抽象建造人类
 * @Package com.huobi.designPatterns.BuilderMode
 * @date 2019-12-10 13:23
 */
public abstract class PersonBuilder {
    private String g;
    private String p;

    public PersonBuilder(String g,String p){
        this.g = g;
        this.p = p;
    }

    public abstract void BuildHead();
    public abstract void BuildBody();
    public abstract void BuildArmLeft();
    public abstract void BuildArmRight();
    public abstract void BuildLegLeft();
    public abstract void BuildLegRight();
}
