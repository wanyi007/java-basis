package com.huobi.dataStructure.binaryTree.tree234;

/**
 * @author wanyi
 * @version V1.0
 * 对象表示存储在节点中的数据项
 * @Package com.huobi.dataStructure.binaryTree
 * @date 2019-11-12 14:09
 */
public class DataItem {
    public long dData;
    public DataItem(long dd){
        dData = dd;
    }
    public void displayItem(){
        System.out.print("/"+dData);
    }
}
