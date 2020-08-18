package com.huobi.leetcode.simple;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.leetcode.simple
 * @date 2020-08-18 23:49
 */
public class 最后一个单词的长度 {
    public static void main(String[] args) {
        最后一个单词的长度 mm = new 最后一个单词的长度();
        System.out.println(mm.lengthOfLastWord(" "));
    }

    public int lengthOfLastWord(String s){
        int len = s.length();
        int pre = 0;
        if (s == ""){
            return 0;
        }
        for (int i = 0;i < len;i++){
            if (s.charAt(i) == ' '){
                pre = i;
            }
        }
        return len - pre -1;
    }
}
