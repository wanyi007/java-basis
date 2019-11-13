package com.huobi.dataStructure.algorithm;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.algorithm
 * @date 2019-11-13 13:44
 */

/**
 * 爬楼梯
 * 需要N阶你才能到达楼顶
 * 每次你只能爬1或2个台阶，一共有多少种不同的方法爬到楼顶。
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int i = climbStairs(10);
        System.out.println(i);
    }

    public static int climbStairs(int n){
        if (n==1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<=n;++i){
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];
    }
}
