package com.huobi.leetcode.simple;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author wanyi
 * @version V1.0
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 * @Package com.huobi.leetcode.simple
 * @date 2020-08-09 10:14
 */
public class 有效的括号 {
    private HashMap<Character,Character> mappings;
    public 有效的括号(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if (this.mappings.containsKey(c)){
                char topElememt = stack.empty() ? '#' : stack.pop();

                if(topElememt != this.mappings.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        有效的括号 mm = new 有效的括号();
        System.out.println(mm.isValid("(){}[]"));
    }

}
