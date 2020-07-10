package com.huobi.leetcode;

/**
 * @author wanyi
 * @version V1.0
 *
 * 题号：6 Z字形变换
 *
 * 将给定的一个字符串根据给定的行数，从上往下，从左往右进行z字形变换。
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 *
 *
 * @Package com.huobi.leetcode
 * @date 2020-07-09 13:48
 */
public class Z字形变换 {
    public String convert(String s, int numRows) {
        if(s.length()==0 || numRows <=1 || s == null){
            return s;
        }

        StringBuilder[] array = new StringBuilder[numRows];
        for(int i = 0;i < array.length;i++){
            array[i] = new StringBuilder();
        }
        int targe = 1;
        int index = 0;
        for(char c:s.toCharArray()){
            array[index].append(c);
            index += targe;
            if(index == 0 || index == numRows -1){
                targe = -targe;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < array.length;i++){
            result.append(array[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Z字形变换 z字形变换 = new Z字形变换();
        System.out.println(z字形变换.convert("LEETCODEISHIRING",4));
    }

}
