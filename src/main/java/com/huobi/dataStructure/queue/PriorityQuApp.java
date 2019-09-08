package com.huobi.dataStructure.queue;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.queue
 * @date 2019-07-26 17:37
 */
public class PriorityQuApp {
    public static void main(String[] args) {
        PriorityQueue thePQ = new PriorityQueue(5);
        thePQ.insert(10);
        thePQ.insert(20);
        thePQ.insert(30);
        thePQ.insert(40);
        thePQ.insert(50);
        while (!thePQ.isEmpty()){
            long n = thePQ.remove();
            System.out.println(n);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
