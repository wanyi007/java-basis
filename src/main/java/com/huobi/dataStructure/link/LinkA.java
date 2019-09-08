package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-18 23:34
 */
public class LinkA {
    public long dData;
    public LinkA next;

    public LinkA(long d){
        this.dData = d;
    }
    public void displayLink(){
        System.out.println(dData+" ");
    }
}
