package com.huobi.leetcode.simple.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定两个数组,编写一个函数来计算它们的交集
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *
 * 说明:
 *     输出结果中的每个元素出现的次数,应与元素在两个数组中出现的次数的最小值一致.
 *     我们可以不用考虑输出的顺序.
 *
 *
 * @Package com.huobi.leetcode.simple.Array
 * @date 12/18/20 9:57 AM
 */
public class 两个数组的交集2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] intersect = intersect(nums1, nums2);
        for (int i = 0;i< intersect.length;i++){
            System.out.println(intersect[i]);
        }
    }

    //双指针遍历 排序
    public static int[] intersect(int[] nums1,int[] nums2){
        //排序两个数组
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int length1 = nums1.length;
        int length2 = nums2.length;

        int index = 0,index1 =0,index2 =0;
        //先创建一个空数组
        int[] nums = new int[Math.min(length1,length2)];

        while(index1 < length1 && index2 < length2){
            if(nums1[index1] < nums2[index2]){
                index1 ++;
            }else if(nums1[index1] > nums2[index2]){
                index2 ++;
            }else{
                nums[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }

        }
        return Arrays.copyOfRange(nums,0,index);
    }
}
