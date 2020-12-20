package com.huobi.leetcode.simple;

import java.util.Arrays;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-10-13 22:15
 */
public class 加一 {
    public static void main(String[] args) {
        加一 mm = new 加一();
        int[] m = {9,9,9,9};
        System.out.println(Arrays.toString(mm.pulsOne(m)));
    }

    public int[] pulsOne(int[] digits){
        for (int i = digits.length-1;i >= 0;i--){
            digits[i]++;
            //判断是否是10
            digits[i] = digits[i]%10;
            if (digits[i] !=0){return digits;}
        }
        //是10的话就把第一位=d1
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
