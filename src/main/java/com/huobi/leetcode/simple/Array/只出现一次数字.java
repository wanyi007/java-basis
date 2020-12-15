package com.huobi.leetcode.simple.Array;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定一个非空数组,除了某个元素只出现一次外,其余元素均出现两次,找出那个只出现一次的元素.
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-12-15 13:20
 */
public class 只出现一次数字 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singeNumber(nums));
    }
    public static int singeNumber(int[] nums){
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;

    }

}
