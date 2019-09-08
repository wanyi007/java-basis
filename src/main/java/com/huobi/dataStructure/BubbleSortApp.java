package com.huobi.dataStructure;

/**
 * @author wanyi
 * @version V1.0
 * 冒泡排序
 * 比较次数公式 (N-1)+(N-2)+(N-3)+...+1=N*(N-1)/2  约为N^2/2次
 * 交换和比较的次数都是N^2成正比，由于常数不在大O表示法中，可以忽略2，所以冒泡排序运行时间是O(N^2)
 * @Package com.huobi.dataStructure
 * @date 2019-07-25 10:04
 */
public class BubbleSortApp {
    public static void main(String[] args) {
        int[] a = {1,5,3,7,4,8,8,10,55,44,33};
        bubbleSort(a,11);
        for (int i =0;i<a.length;i++)
            System.out.printf(a[i]+" ");
    }

    public static void bubbleSort(int[] a, int i){
        for (int out =i-1; out>1; out--)
            for (int in =0;in<out;in++)
                if(a[in]>a[in+1]) {
                    int temp = a[in];
                    a[in] = a[in+1];
                    a[in+1] = temp;
                }

    }
}
