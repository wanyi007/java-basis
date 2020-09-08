package com.huobi.leetcode.CodeInterviewGuide.stack;

import java.util.Stack;

/**
 * @author wanyi
 * @version V1.0
 * 题目：
 *  实现一个特殊的栈，在实现栈的基本功能上，再实现返回栈中最小元素的操作
 *要求：
 *  1：pop,push,getMin操作的时间复杂度都是O（1）；
 *  2：设计的栈类型可以使用现成的栈结构。
 *
 *
 * @Package com.huobi.leetcode.CodeInterviewGuide.stack
 * @date 2020-09-08 10:27
 */
public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum){
        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum <= this.getMin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty!");
        }
        int value = this.stackData.pop();
        if(value == this.getMin()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty!");
        }
        //返回栈顶部的数据，不删除
        return this.stackMin.peek();
    }

}
