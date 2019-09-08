package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * 自引用写法
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-01 14:49
 */
public class Link {
    public int iData;
    public double dData;
    public Link next;

    public Link(int id,double dd){
        this.iData = id;
        this.dData = dd;
    }
    public void displayLink(){
        System.out.println("{"+iData+","+dData+"}");
    }
}
