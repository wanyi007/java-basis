package com.huobi.dataStructure.algorithm;

/**
 * @author wanyi
 * @version V1.0
 *
 * 懒汉模式  --线程安全
 * @Package com.huobi.dataStructure
 * @date 2019-07-17 10:36
 */
public class Singleton {
    /**
     * 定义一个变量来存储创建好的类实例
     */
    private static Singleton uniqueInstance = null;
    /**
     * 私有化构造方法，好在内部控制创建实例的数目
     */
    private Singleton(){};

    /**
     * 定义一个方法为客户端提供实例
     * 一个Singleton的实例
     */
    public synchronized static Singleton getInstance(){
        //判断存储的变量是否有值
        if(uniqueInstance == null){
            //如果没有，就创建一个类实例，并把值赋值给存储类的实例的变量
            uniqueInstance = new Singleton();
        }
        //如果有值，那就直接使用
        return uniqueInstance;
    }
}
