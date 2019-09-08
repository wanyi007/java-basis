package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * 双向link对象
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-25 12:53
 */
public class DoublyLink {
    public long dData;
    public DoublyLink next;
    public DoublyLink previous;

    public DoublyLink(long d){
        dData = d;
    }

    public void displayLink(){
        System.out.println(dData +" ");
    }
}
