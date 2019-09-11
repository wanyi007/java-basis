package com.huobi.dataStructure.recursion;

/**
 * @author wanyi
 * @version V1.0
 * 汉诺塔问题
 * @Package com.huobi.dataStructure.recursion
 * @date 2019-09-11 15:13
 */
public class TowersApp {
    public static void main(String[] args) {
        doTowers(3,'A','B','C');
    }

    public static void doTowers(int topN,char from, char inter,char to){
        if (topN == 1){
            System.out.println("Disk 1 from "+ from + " to " + to);
        }else {
            doTowers(topN -1,from,to,inter);
            System.out.println("Disk " + topN + " from " + from + " to " +to);
            doTowers(topN-1,inter,from,to);
        }

    }
}
