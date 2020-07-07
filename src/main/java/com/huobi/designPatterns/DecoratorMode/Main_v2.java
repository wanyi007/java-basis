package com.huobi.designPatterns.DecoratorMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns.DecoratorMode
 * @date 2019-12-06 16:10
 */
public class Main_v2 {
    public static void main(String[] args) {
        Person_v2 xc = new Person_v2("小菜");
        BigTrouser_v2 bt = new BigTrouser_v2();
        TShirts_v2 th = new TShirts_v2();
        bt.Show();
        th.Show();
    }
}
