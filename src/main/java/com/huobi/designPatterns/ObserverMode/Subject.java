package com.huobi.designPatterns.ObserverMode;

import java.util.List;
import java.util.Observer;

/**
 * @author wanyi
 * @version V1.0
 * 主题通知者，把所有观察者对象引用保存在一个聚集里，每个主题有任意数量的观察者
 * @Package com.huobi.designPatterns.ObserverMode
 * @date 2019-12-17 13:44
 */
public abstract class Subject {
    private List<Observer> observers;

    public void Attach(Observer observers){

    }

}
