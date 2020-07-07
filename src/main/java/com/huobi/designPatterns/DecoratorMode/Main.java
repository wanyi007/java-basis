package com.huobi.designPatterns.DecoratorMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns.DecoratorMode
 * @date 2019-12-06 10:09
 */
public class Main {
    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("装扮： ");
        Finery dtx = new TShirts();
        Finery kk = new BigTrouser();

        dtx.Show();
        kk.Show();
    }
}
