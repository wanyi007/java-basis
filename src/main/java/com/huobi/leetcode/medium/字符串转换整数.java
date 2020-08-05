package com.huobi.leetcode.medium;

/**
 * @author wanyi
 * @version V1.0
 *
 * @Package com.huobi.leetcode
 * @date 2020-07-11 09:08
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 题号：8 字符串转整数 atoi
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：
 *
 * 如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
 * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
 * 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。
 *
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0 。
 *
 * 提示：
 *
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 *
 *
 * 示例 1:
 *
 * 输入: "42"
 * 输出: 42
 * 示例 2:
 *
 * 输入: "   -42"
 * 输出: -42
 * 解释: 第一个非空白字符为 '-', 它是一个负号。
 *      我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
 * 示例 3:
 *
 * 输入: "4193 with words"
 * 输出: 4193
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 * 示例 4:
 *
 * 输入: "words and 987"
 * 输出: 0
 * 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
 *      因此无法执行有效的转换。
 * 示例 5:
 *
 * 输入: "-91283472332"
 * 输出: -2147483648
 * 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
 *      因此返回 INT_MIN (−231) 。
 *
 */
public class 字符串转换整数 {
    final String START = "start";
    final String SIGNED = "signed";
    final String IN_NUM = "int_number";
    final String END = "end";
    String state = START;
    Map<String,String[]> map;
    public int sig = 1;
    public long ans = 0;

    public 字符串转换整数(){
        map = new HashMap<>();
        map.put(START,new String[]{START,SIGNED,IN_NUM,END});
        map.put(SIGNED,new String[]{END,END,IN_NUM,END});
        map.put(IN_NUM,new String[]{END,END,IN_NUM,END});
        map.put(END,new String[]{END,END,END,END});
    }

    //判断字符
    public int getCol(char c){
        if(c == ' '){
            return 0;
        }
        if (c == '+' || c == '-'){
            return 1;
        }
        if (c >= '0' && c <= '9'){
            return 2;
        }
        return 3;
    }

    public void get(char c){
        state = map.get(state)[getCol(c)];
        if(state.equals(IN_NUM)){
            ans = ans * 10 + c - '0';
            if (sig == 1){
                ans = Math.min(ans,Integer.MAX_VALUE);
            }else{
                ans = Math.min(ans,-(long)Integer.MIN_VALUE);
            }
        }
        else if(state.equals(SIGNED)){
            sig = c == '+' ? 1:-1;
        }
    }



    public int myAtoi(String str){
        字符串转换整数 automaton = new 字符串转换整数();
        char[] chars = str.toCharArray();
        for (char ch:chars){
            automaton.get(ch);
        }
        return automaton.sig * ((int) automaton.ans);
    }

    public static void main(String[] args) {
        字符串转换整数 aut = new 字符串转换整数();
        System.out.println(aut.myAtoi("-2311421sdadasda"));
    }
}
