package com.huobi.dataStructure.recursion;

/**
 * @author wanyi
 * @version V1.0
 * 三角函数
 * 1，3，6，10，15，21，，，，
 * @Package com.huobi.dataStructure.recursion
 * @date 2019-09-01 22:25
 */
public class triangle {
    public static void main(String[] args) {
        int total = 0;
        int n = 10;
        while (n > 0){
            total = total + n;
            --n;
        }
        System.out.println("total:"+total);
    }
}
