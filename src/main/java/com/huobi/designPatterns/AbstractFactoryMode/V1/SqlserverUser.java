package com.huobi.designPatterns.AbstractFactoryMode.V1;

/**
 * @author wanyi
 * @version V1.0
 * 用于操作User表
 * @Package com.huobi.designPatterns.AbstractFactoryMode.V1
 * @date 2019-12-20 15:09
 */
public class SqlserverUser {
    public void Insert(User user){
        System.out.println("SQL Server 中给User表增加一条记录");
    }

    public User GetUser(int id){
        System.out.println("在SQL Server 中根据ID得到User表一条记录");
        return null;
    }

}
