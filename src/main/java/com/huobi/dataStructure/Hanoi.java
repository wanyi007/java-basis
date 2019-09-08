package com.huobi.dataStructure;

/**
 * @author wanyi
 * @version V1.0
 * 河内之塔  算法
 * @Package com.huobi.dataStructure
 * @date 2019-07-19 10:33
 */
public class Hanoi {

    private static volatile int count = 0;
    public static void main(String[] args) {
        int n = 3;
        hanoi(n,'A','B','C');
        System.out.printf("count:"+count);
    }

    public static void hanoi(int n,char A,char B,char C){
        count++;
        if(n == 1){
            //System.out.printf("这个简单，直接将" + A +"的"+n+"个盘子移动到" + C + "！");
        }
        else{
            hanoi(n-1,A,B,C);
            //System.out.printf("将" + A +"的"+n+"个盘子移动到" + C + "！");
            hanoi(n-1,B,A,C);
        }
    }
}
