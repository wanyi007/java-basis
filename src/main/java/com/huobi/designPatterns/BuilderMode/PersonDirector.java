package com.huobi.designPatterns.BuilderMode;

/**
 * @author wanyi
 * @version V1.0
 * 指挥者类
 * 控制建造过程，隔离用户与建造者过程关联
 * @Package com.huobi.designPatterns.BuilderMode
 * @date 2019-12-10 13:29
 */
public class PersonDirector {
    private PersonBuilder pb;

    //用户告诉指挥者，我需要一个什么样的小人
    public PersonDirector(PersonBuilder pb){
        this.pb = pb;
    }

    public void CreatePerson(){
        pb.BuildHead();
        pb.BuildBody();
        pb.BuildArmLeft();
        pb.BuildArmRight();
        pb.BuildLegLeft();
        pb.BuildLegRight();
    }

}
