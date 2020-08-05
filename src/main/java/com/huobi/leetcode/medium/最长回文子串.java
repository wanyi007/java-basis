package com.huobi.leetcode.medium;

/**
 * @author wanyi
 * @version V1.0
 *
 * 题号：5  最长回文子串
 * 给定一个字符串s,找到s中最长的回文子串，假设字符串s的最大长度为1000.
 *
 * 示例1：
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 *
 * 示例2：
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 本代码采用的中心扩算方法
 * 还有一种 Manache（马拉车）算法，解法更优
 *
 * @Package com.huobi.leetcode
 * @date 2020-07-07 13:45
 */
public class 最长回文子串 {
    public static void main(String[] args) {
        String s = "abcddcba";
        System.out.println(longestPalindrome(s));
//        System.out.println(expandAroundCenter(s,7,7));
    }
    public static String longestPalindrome(String s){
        if(s == null || s.length() < 1){
            return "";
        }

        int start  = 0,end = 0;
        //核心利用中心扩算法查找
        for(int i = 0;i < s.length(); i++){
            int len1 = expandAroundCenter(s,i,i);
            int len2 = expandAroundCenter(s,i,i+1);
            int len  = Math.max(len1,len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start,end+1);
    }

    public static int expandAroundCenter(String s,int left,int right){
        int L = left,R = right;
        while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}
