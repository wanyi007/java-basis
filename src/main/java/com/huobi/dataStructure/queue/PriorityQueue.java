package com.huobi.dataStructure.queue;

/**
 * @author wanyi
 * @version V1.0
 * 优先级队列 对象
 * @Package com.huobi.dataStructure.queue
 * @date 2019-07-26 17:18
 */
public class PriorityQueue {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQueue(int s){
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item){
        int j;
        if(nItems == 0){
            queArray[nItems++] = item;
        }else{
            for (j = nItems -1;j>=0;j--){
                if (item>queArray[j]){
                    queArray[j+1] = queArray[j];
                }else{
                    break;
                }
            }
            queArray[j+1] = item;
            nItems ++;
        }
    }

    public long remove(){
        int m = --nItems;
        System.out.println(m);
        return queArray[m];
    }

    public long peekMin(){
        return queArray[nItems-1];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }
}
