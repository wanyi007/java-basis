package com.huobi.designPatterns.DecoratorMode;



/**
 * @author wanyi
 * @version V1.0
 * 第一版虽然没有什么毛病，但是违背了开放-封闭原则
 * @Package com.huobi.designPatterns.DecoratorMode
 * @date 2019-12-06 09:43
 */
public class Person_v1 {
    private String name;

    public Person_v1(String name){
        this.name = name;
    }

    public void WearTShirts(){
        System.out.println("大T恤 ");
    }

    public void WearBigTrouser(){
        System.out.println("垮裤 ");
    }
    public void WearSneakers(){
        System.out.println("破球鞋 ");
    }
    public void WearTie(){
        System.out.println("领带 ");
    }
    public void WearSuit(){
        System.out.println("西装 ");
    }
    public void WearLeatherShoes(){
        System.out.println("皮鞋 ");
    }
    public void Show(){
        System.out.println("装扮的{0}"+name);
    }
}
