package com.huobi.designPatterns.DecoratorMode;

/**
 * @author wanyi
 * @version V1.0
 * 各种服饰子类
 * @Package com.huobi.designPatterns.DecoratorMode
 * @date 2019-12-06 10:00
 */
public class TShirts extends Finery {
    @Override
    public void Show() {
        System.out.println("大T恤 ");
    }
}
