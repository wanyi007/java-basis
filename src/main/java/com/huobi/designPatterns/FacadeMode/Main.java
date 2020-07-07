package com.huobi.designPatterns.FacadeMode;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns.FacadeMode
 * @date 2019-12-10 12:56
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.MethA();
        facade.MethB();
    }
}
