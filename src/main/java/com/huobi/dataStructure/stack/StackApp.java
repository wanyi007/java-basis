package com.huobi.dataStructure.stack;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.stack
 * @date 2019-07-26 10:07
 */
public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);

        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
