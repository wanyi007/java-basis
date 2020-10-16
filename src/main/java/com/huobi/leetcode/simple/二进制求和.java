package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-10-13 22:48
 */
public class 二进制求和 {
    public static void main(String[] args) {

    }

    public String addBinary(String a,String b){
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }

}
