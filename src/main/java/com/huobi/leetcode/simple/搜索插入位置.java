package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-08-17 18:18
 */
public class 搜索插入位置 {
    public static void main(String[] args) {
        搜索插入位置 mm = new 搜索插入位置();
        int[] nn = {-1,3,6,8,80};
        System.out.println(mm.searchInsert(nn,0));
    }

    public int searchInsert(int[] nums,int target){
        for (int i = 0;i< nums.length;i++){
            if (nums[i] == target || nums[i] > target){
                return i;
            }else if(nums[nums.length-1] < target){
                return nums.length;
            }
        }
        return 0;
    }
}
