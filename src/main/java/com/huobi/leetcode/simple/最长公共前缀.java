package com.huobi.leetcode.simple;

import java.util.HashMap;

/**
 * @author wanyi
 * @version V1.0
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 * @Package com.huobi.leetcode.simple
 * @date 2020-08-09 09:44
 */
public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs){
       if (strs == null || strs.length == 0){
           return "";
       }

       int length = strs[0].length();
       int count = strs.length;

       for(int i = 0;i< length;i++){
            char c = strs[0].charAt(i);
            for(int j = 1;j < count;j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
       }

       return strs[0];
    }

    public static void main(String[] args) {
        最长公共前缀 objefct = new 最长公共前缀();
        String[] strs = {"aabbcc","aabcc","aacc"};
        System.out.println(objefct.longestCommonPrefix(strs));
    }
}
