package com.huobi.test;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.test
 * @date 2020-10-13 16:09
 */
public class LazyLoading {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.huobi.test.LazyLoading$x");
    }
    public static class P{
        final static int i = 8;
        static int j = 9;
        static {
            //只要被加载过这个P一定是被打印出来的，因为一个classload内存之后有几个步骤
            /**
             * 1:loading
             * 2:linking
             * 3:initlalizing  这个过程会执行静态句块，所以被load进来这个语句块一定被执行过，P一旦打印就证明这个class被load进来了
             */
            System.out.println("P");
        }
    }

    public static class x extends P{
        static {
            System.out.println("x");
        }
    }
}
