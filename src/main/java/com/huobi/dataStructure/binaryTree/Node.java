package com.huobi.dataStructure.binaryTree;

/**
 * @author wanyi
 * @version V1.0
 * 基本的树node的节点
 * @Package com.huobi.dataStructure.binaryTree
 * @date 2019-10-28 14:00
 */
public class Node {
    int iData;
    double dData;
    Node leftChild;
    Node rightChild;

    public void displayNode(){
        System.out.print("{");
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("}");
    }
}
