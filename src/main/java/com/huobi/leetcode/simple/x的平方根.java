package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.leetcode.simple
 * @date 2020-10-13 23:01
 */
public class x的平方根 {
    public static void main(String[] args) {

    }

    public int mySqrt(int x){
        if (x == 0) {
            return 0;
        }
        int ans = (int) Math.exp(0.5 * Math.log(x));
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }
}
