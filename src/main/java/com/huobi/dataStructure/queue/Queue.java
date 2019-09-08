package com.huobi.dataStructure.queue;

/**
 * @author wanyi
 * @version V1.0
 * 创建一个队列
 * @Package com.huobi.dataStructure.queue
 * @date 2019-07-26 15:30
 */
public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front; //头
    private int rear; //尾
    private int nItems;

    public Queue(int s){
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j){
        if (rear == maxSize -1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }

    public long remove(){
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems --;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public int size(){
        return nItems;
    }
}
