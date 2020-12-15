package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）
 *
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 *
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-12-03 13:11
 */
public class 买卖股票的最佳时机II {
    public static void main(String[] args) {
        int[] test = new int[]{3, 4, 3, 6, 8, 2};

        买卖股票的最佳时机II mm = new 买卖股票的最佳时机II();
        System.out.println(""+ mm.maxProfit(test));
    }

    public int maxProfit(int[] profit){
        int n = profit.length;
        int dp0 = 0, dp1 = -profit[0];
        for (int i = 1; i < n; ++i) {
            int newDp0 = Math.max(dp0, dp1 + profit[i]);
            int newDp1 = Math.max(dp1, dp0 - profit[i]);
            dp0 = newDp0;
            dp1 = newDp1;
        }
        return dp0;
    }
}
