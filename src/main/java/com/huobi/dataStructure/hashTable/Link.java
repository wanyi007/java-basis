package com.huobi.dataStructure.hashTable;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.hashTable
 * @date 2019-11-20 19:30
 */
public class Link {
    private int iData;
    public Link next;

    public Link(int it){
        iData = it;
    }

    public int getKey(){
        return iData;
    }

    public void displayLink(){
        System.out.println(iData+" ");
    }
}
