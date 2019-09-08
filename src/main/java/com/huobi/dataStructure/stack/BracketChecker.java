package com.huobi.dataStructure.stack;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.stack
 * @date 2019-07-26 10:52
 */
public class BracketChecker {
    private String input;

    public BracketChecker(String in){
        input = in;
    }

    //校验数据的是否为完全对称
    public void check(){
        int stackSize = input.length();
        StackChar theStackChar = new StackChar(stackSize);
        for (int j = 0;j< stackSize;j++){
            char ch = input.charAt(j);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStackChar.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!theStackChar.isEmpty()){
                        char chx = theStackChar.pop();
                        if((ch == '}' && ch != '{') ||
                                (ch == ']' && ch != '[') ||
                                (ch == ')' && ch != '(')){
                            System.out.println("Error:"+ch+" at "+j);
                        }else
                            System.out.println("Error:"+ch+" at "+j);
                        break;
                    }
                default:
                    break;
            }
            if(!theStackChar.isEmpty()){
                System.out.println("Error:missing right delimiter");
            }
        }
    }
}
