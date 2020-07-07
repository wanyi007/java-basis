package com.huobi.designPatterns.DecoratorMode;

/**
 * @author wanyi
 * @version V1.0
 * 装饰模式
 * @Package com.huobi.designPatterns.DecoratorMode
 * @date 2019-12-06 13:52
 */
public class Person_v2 {
    public Person_v2(){

    }

    private String name;
    public Person_v2(String name){
        this.name = name;
    }

    public void Show(){
        System.out.println("装扮的："+name);
    }
}
