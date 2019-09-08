package com.huobi.dataStructure;


import scala.collection.concurrent.TNode;

import java.util.Stack;

/**
 * @author wanyi
 * @version V1.0
 * 遍历一个二叉树，查找第K大的节点
 * @Package com.huobi.dataStructure
 * @date 2019-06-30 16:58
 */
public class KthSmallest {
    public static void main(String[] args) {

    }

    public static int  kthSmallest(Node root, int k){
        Stack<Node> s = new Stack<>();
        Node p = root;
        while (s.size() > 0 || p!= null){
            if(p!=null){
                s.push(p);
                p = p.leftChild;
            }else{
                p = s.pop();
                --k;
                if (k == 0){
                    return p.data;
                }
                p = p.rightChild;
            }

        }
        return  -1 ;
    }
    private static class Node{
        Node leftChild;
        Node rightChild;
        int data;

        Node(int newData){
            leftChild = null;
            rightChild = null;
            data = newData;
        }
    }
}
