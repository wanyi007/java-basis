package com.huobi.designPatterns.AbstractFactoryMode.V1;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns.AbstractFactoryMode.V1
 * @date 2019-12-20 15:43
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        SqlserverUser su = new SqlserverUser();
        su.Insert(user);
        su.GetUser(1);
    }
}
