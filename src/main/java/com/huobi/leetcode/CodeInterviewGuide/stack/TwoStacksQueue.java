package com.huobi.leetcode.CodeInterviewGuide.stack;

import java.util.Stack;

/**
 * @author wanyi
 * @version V1.0
 *
 * 编写一个类，用两个栈实现队列，支持队列的基本操作(add,poll,peek)
 * poll 删除队列第一个元素
 * peek 查询队列第一个元素
 * add 向队列添加元素
 * @Package com.huobi.leetcode.CodeInterviewGuide.stack
 * @date 2020-09-08 19:07
 */
public class TwoStacksQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStacksQueue(){
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void add(int newNum){
        stackPush.push(newNum);
    }

    public int poll(){
        if (stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is Empty!");
        }else if(stackPop.isEmpty()){
                while(!stackPush.isEmpty()){
                    stackPop.push(stackPush.pop());
                }
        }
        return stackPop.pop();
    }

    public int peek(){
        if (stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is Empty!");
        }else if(stackPop.isEmpty()){
            while(!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}
