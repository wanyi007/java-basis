package com.huobi.dataStructure.queue;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.queue
 * @date 2019-07-26 16:37
 */
public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()){
            long n = theQueue.remove();
            System.out.println(n);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
