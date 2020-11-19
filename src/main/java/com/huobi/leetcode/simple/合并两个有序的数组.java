package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 输入：
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出：[1,2,2,3,5,6]
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-19 19:00
 */

/**
 * 解题思路
 * 1:当i或者j大于等于0的时候,表明两个都还没比较完
 */
public class 合并两个有序的数组 {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        if (n == 0){ return; }

        int i = m - 1;
        int j = n - 1;

        int cur_max_pos = nums1.length -1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[cur_max_pos--] = nums1[i--];
            }else{
                nums1[cur_max_pos--] = nums2[j--];
            }

        }
        while (j >= 0) {
            nums1[cur_max_pos--] = nums2[j--];
        }

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        合并两个有序的数组 arrays = new 合并两个有序的数组();
        arrays.merge(nums1,3,nums2,3);
        for (int i = 0;i <  nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
}
