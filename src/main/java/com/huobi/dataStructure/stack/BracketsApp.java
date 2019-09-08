package com.huobi.dataStructure.stack;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.stack
 * @date 2019-07-26 11:13
 */
public class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while(true){
            System.out.println("Enter string containing delimiters");
            System.out.flush();
            input = getString();
            if (input.equals(" ")){
                break;
            }
            BracketChecker bracketChecker = new BracketChecker(input);
            bracketChecker.check();
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
