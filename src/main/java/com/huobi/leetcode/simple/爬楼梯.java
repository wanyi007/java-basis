package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-10-27 13:44
 */
public class 爬楼梯 {
    public static void main(String[] args) {
        爬楼梯 mm = new 爬楼梯();
        System.out.println("mm:"+mm.climbStairs(33));
    }
    //使用动态规划的方式解决
    public int climbStairs(int n){
        if(n == 1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3;i<= n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

