package com.huobi.dataStructure.algorithm;

/**
 * @author wanyi
 * @version V1.0
 * 不用除法求数组乘积
 * @Package com.huobi.dataStructure
 * @date 2019-07-17 09:26
 */
public class ArrayMultiplication {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int[] b = new int[]{a.length};
        System.out.println(a.length);
        int[] ints = arryMultiplication(a, b, 6);
        for (int i =0;i<ints.length;i++){
            System.out.printf("arr"+ints[i]);
        }
    }
    public static int[] arryMultiplication(int[] A, int[] B, int n){
        int left = 1;
        int right = 1;
        for(int i = 0;i<n;i++){
            B[i] = 1;
        }
        for(int i=0;i<n;i++){
            B[i]*=left;
            B[n-1-i]*=right;
            left*=A[i];
            right*=A[n-1-i];
        }
        return B;
    }
}
