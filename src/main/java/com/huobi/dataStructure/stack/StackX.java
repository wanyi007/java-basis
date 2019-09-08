package com.huobi.dataStructure.stack;

/**
 * @author wanyi
 * @version V1.0
 * 定义一个栈对象
 * @Package com.huobi.dataStructure.stack
 * @date 2019-07-26 09:47
 */
public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    public void push(long j){
        stackArray[++top] = j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize-1);
    }
}
