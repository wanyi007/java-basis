package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 *
 * @Package com.huobi.leetcode
 * @date 2020-07-20 19:46
 */
public class 回文数 {
    public boolean isPalindrome(int x){
        if(x < 0 || x % 10 == 0 && x != 0 ){
            // 特殊情况：
            // 如上所述，当 x < 0 时，x 不是回文数。
            // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
            // 则其第一位数字也应该是 0
            // 只有 0 满足这一属性
            return false;
        }
        int revertedNumber = 0;
        while(x > revertedNumber){
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        /**
         * 当数字长度是奇数时，我们可以通过revertedNumber/10去除中位的数字，
         *
         */
        return x == revertedNumber || x == revertedNumber/10;
    }

    public static void main(String[] args) {
        回文数 test = new 回文数();
        System.out.println(test.isPalindrome(1221));
    }
}
