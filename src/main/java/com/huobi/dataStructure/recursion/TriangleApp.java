package com.huobi.dataStructure.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wanyi
 * @version V1.0
 * 递归三角形 V.2
 * @Package com.huobi.dataStructure.recursion
 * @date 2019-09-01 22:49
 */
public class TriangleApp {
    static int theNumber;
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle="+theAnswer);
    }
    public static int triangle(int n){
        if (n == 1){
            return 1;
        }else {
            return (n + triangle(n-1 ));

        }    }

        public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }

        public static int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }
}
