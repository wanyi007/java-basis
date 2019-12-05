package com.huobi.dataStructure.heap;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.heap
 * @date 2019-11-26 13:38
 */
public class Node {
    private int iData;

    public Node(int key){
        iData = key;
    }

    public int getKey(){
        return iData;
    }

    public void setKey(int id){
        iData = id;
    }

}
