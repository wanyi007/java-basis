package com.huobi.designPatterns.AbstractFactoryMode.V1;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.designPatterns.AbstractFactoryMode.V1
 * @date 2019-12-20 14:48
 */
public class User {
    private int _id;
    private String _name;

    public User(){
    }

    public void setId(int value){
        _id = value;
    }

    public void setName(String value){
       _name = value;
    }

    public int getId(){
        return _id;
    }

    public String getName(){
        return _name;
    }
}
