package com.huobi.dataStructure.graph;

/**
 * @author wanyi
 * @version V1.0
 * 创建最基本的栈对象
 * @Package com.huobi.dataStructure.map
 * @date 2019-11-29 15:49
 */
public class StackX {
   private final int SIZE = 20;
   private int[] st;
   private int top;

   public StackX(){
       st = new int[SIZE];
       top = -1;
   }

   public void push(int j){
       st[++top] = j;
   }

   public int pop(){
       return st[top--];
   }

   public int peek(){
       return st[top];

   }

   public boolean isEmpty(){
       return top == -1;
   }
}
