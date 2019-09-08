package com.huobi.designPatterns;

import java.io.Console;
import java.util.Scanner;

/**
 * @author wanyi
 * @version V1.0
 * 计算器实现第一版
 * @Package com.huobi.designPatterns
 * @date 2019-08-13 23:05
 */
public class Operation {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("请输入数字A：");
            double numberA = sc.nextDouble();
            System.out.printf("请输入数字B：");
            double numberB = sc.nextDouble();
            System.out.printf("请输入运算符：");
            String operate = sc.next();
            double result = GetResult(numberA, numberB, operate);
            System.out.printf("运算结果是："+result);
        }catch (Exception x){
            System.out.printf("您输入有错："+x.getMessage());
        }
    }



    public static double GetResult(double numberA,double numberB,String operate){
        double result = 0d;
        switch (operate){
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }
        return result;
    }


}
