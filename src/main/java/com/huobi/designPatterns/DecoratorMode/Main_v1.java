package com.huobi.designPatterns.DecoratorMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns.DecoratorMode
 * @date 2019-12-06 09:51
 */
public class Main_v1 {
    public static void main(String[] args) {
        Person_v1 xc = new Person_v1("小菜");

        xc.WearTShirts();
        xc.WearSneakers();
        xc.WearBigTrouser();
        xc.Show();
    }
}
