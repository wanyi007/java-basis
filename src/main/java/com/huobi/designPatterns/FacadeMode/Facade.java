package com.huobi.designPatterns.FacadeMode;

/**
 * @author wanyi
 * @version V1.0
 * 外观统一调用
 * @Package com.huobi.designPatterns.FacadeMode
 * @date 2019-12-10 11:33
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void MethA(){
        System.out.println("方法组A：------");
        one.MethodOne();
        two.MethTwo();
        four.MethFour();
    }

    public void MethB(){
        System.out.println("方法组B：------");
        two.MethTwo();
        three.MethThree();
    }


}
