package com.huobi.dataStructure.link.iterator;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link.iterator
 * @date 2019-08-26 23:49
 */
public class Link {
    public Link next;
    public long dData;

    public Link(long d){
        dData = d;
    }

    public void displayLink(){
        System.out.println(dData + " ");
    }
}
