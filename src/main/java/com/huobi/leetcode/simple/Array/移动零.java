package com.huobi.leetcode.simple.Array;

import java.util.Arrays;

/**
 * @author wanyi
 * @version V1.0
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 *
 * @Package com.huobi.leetcode.simple.Array
 * @date 12/20/20 2:21 PM
 */
public class 移动零 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    /**
     * 使用双指针，左指针指向当前已经处理好的序列的尾部，右指针指向待处理序列的头部。
     *
     * 右指针不断向右移动，每次右指针指向非零数，则将左右指针对应的数交换，同时左指针右移。
     *
     * 注意到以下性质：
     *
     * 左指针左边均为非零数；
     *
     * 右指针左边直到左指针处均为零。
     *
     * @param nums
     * @return
     */
    public static int[] moveZeroes(int[] nums){
        int n = nums.length,left = 0,right = 0;
        while(right < n){
            if(nums[right]!=0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
        return nums;
    }

    public static void swap(int[] nums,int left,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
