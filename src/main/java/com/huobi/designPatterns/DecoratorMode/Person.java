package com.huobi.designPatterns.DecoratorMode;

/**
 * @author wanyi
 * @version V1.0
 * 开放-封闭原则
 * @Package com.huobi.designPatterns.DecoratorMode
 * @date 2019-12-06 09:54
 */
public class Person {
    private String name;
    public Person (String name){
        this.name = name;
    }
    public void Show(){
        System.out.println("装扮的："+name);
    }
}
