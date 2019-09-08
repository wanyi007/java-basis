package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-20 19:19
 */
public class LinkQueue {
    private FirstLastLink theLink;

    public LinkQueue(){
        theLink = new FirstLastLink();
    }

    public boolean isEmpty(){
        return theLink.isEmpty();
    }

    public void insert(long d){
        theLink.insertLast(d);
    }

    public long remove(){
        return theLink.deleteFirst();
    }

    public void displayQueue(){
        System.out.println("Queue (front --> rear)");
        theLink.displayLink();
    }

}


