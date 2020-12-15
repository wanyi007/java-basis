package com.huobi.leetcode.simple.Array;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * @Package com.huobi.leetcode.simple
 * @date 2020-08-09 16:46
 */
public class 删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1;j < nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        删除排序数组中的重复项 nums = new 删除排序数组中的重复项();
        int[] mm = {1,1,2,4,4,6,6,6,6};
        System.out.println(nums.removeDuplicates(mm));
    }
}
