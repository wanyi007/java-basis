package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-08-18 21:25
 */
public class 最大子序和 {
    public static void main(String[] args) {
        最大子序和 mm = new 最大子序和();
        int[] nums = {1,2,-4,5,6,7,-9};
        System.out.println(mm.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums){
        int len = nums.length;
        int a = nums[0];
        int pre = 0;
        for (int i = 1;i< len;i++){
            if (nums[i-1]>0){
                nums[i]+=nums[i-1];
            }
            a = Math.max(a,nums[i]);
        }
        return a;
    }
}
