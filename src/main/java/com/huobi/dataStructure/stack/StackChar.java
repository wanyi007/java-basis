package com.huobi.dataStructure.stack;

/**
 * @author wanyi
 * @version V1.0
 * char类型  栈   栈不需要移动和比较数据
 * @Package com.huobi.dataStructure.stack
 * @date 2019-07-26 10:37
 */
public class StackChar {
    private int maxSize;
    private char[] stackArr;
    private int top;

    public StackChar(int s){
        maxSize = s;
        stackArr = new char[maxSize];
        top = -1;
    }

    public void push(char j){
        stackArr[++top] = j;
    }

    public char pop(){
        return stackArr[top--];
    }

    public char peek(){
        return stackArr[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return  (top == maxSize -1);
    }

}
