package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定一个整数数组,判断是否存在重复元素
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false
 *
 * 输入: [1,2,3,1]
 * 输出: true
 *
 * 输入: [1,2,3,4]
 * 输出: false
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-12-15 12:58
 */
public class 存在重复元素 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] num2 = {2,3,4,1,5};
        System.out.println(containsDuplicate(nums));
    }
    //双指针遍历
    public static boolean containsDuplicate(int[] nums){
        if(nums.length == 0){
            return false;
        }
        for (int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j< nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

