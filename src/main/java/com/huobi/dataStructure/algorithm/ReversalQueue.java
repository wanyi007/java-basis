package com.huobi.dataStructure.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author wanyi
 * @version V1.0
 * 翻转队列的前k个元素
 * @Package com.huobi.dataStructure
 * @date 2019-06-30 15:22
 */
public class ReversalQueue {
    public static void main(String[] args) {
        Queue<String> queue =new  LinkedList();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");
        queue.offer("6");
        queue.offer("7");
        queue.offer("8");
        reversalQueue(queue,5);

    }

    public static void reversalQueue (Queue queue, int k){
        Stack stack = new Stack();
        Queue newQueue = new LinkedList();
        int size = queue.size();
        for(int i =0 ; i < k;i++){
            stack.push(queue.poll());
        }
        for(int i = 0;i < size;i++){
            if(i < k){
                newQueue.offer(stack.pop());
            }else{
                newQueue.offer(queue.poll());
            }
            //打印
            while (newQueue.size() > 0 ){
                System.out.printf(" "+newQueue.poll());
            }
        }    }
}

