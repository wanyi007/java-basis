package com.huobi.dataStructure.algorithm;

import java.util.Scanner;

/**
 * @author wanyi
 * @version V1.0
 * 巴斯卡（Pascal）三角形算法解析
 * @Package com.huobi.dataStructure
 * @date 2019-07-21 16:16
 */
public class PascalTest {
    public static void main(String[] args) {
        PascalTest pascal = new PascalTest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入巴斯卡三角行数：");
        int num = scanner.nextInt();
        pascal.pascalAssemble(num);
    }
    public void pascalAssemble(int num){
        int[][] value = new int[num][num];
        for(int i=0;i<num;i++){
            value[i][0] = 1;
            value[i][i] = 1;
            if(i>1){
                for(int j = 1;j<i;j++){
                    value[i][j] = value[i-1][j-1] + value[i-1][j];
                }
            }
        }
        for(int i = 0; i < num ;i++){
            for(int k = 0; k <= num - i;k++){
                System.out.print("   ");
            }
            for(int j = 0; j<= i ;j++){
                System.out.print(value[i][j]+"     ");
            }
            System.out.println();
        }
    }
}
