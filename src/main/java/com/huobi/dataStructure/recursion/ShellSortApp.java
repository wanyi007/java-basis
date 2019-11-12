package com.huobi.dataStructure.recursion;

/**
 * @author wanyi
 * @version V1.
 * 希尔排序主程序
 * @Package com.huobi.dataStructure.recursion
 * @date 2019-10-21 19:50
 */
public class ShellSortApp {
    public static void main(String[] args) {
        int maxSize = 1000;
        ArraySh arr;
        arr = new ArraySh(maxSize);

        for(int j = 0;j<maxSize;j++){
            long n = (int)(java.lang.Math.random()*999);
            arr.insert(n);
        }

        arr.display();
        arr.shellSort();
        arr.display();
    }
}
