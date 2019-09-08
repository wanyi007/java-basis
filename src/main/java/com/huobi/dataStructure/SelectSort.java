package com.huobi.dataStructure;

/**
 * @author wanyi
 * @version V1.
 * 选择排序
 * 跟冒泡最大的区别是，在第二层循环的时候之比较最小的值，再挪用位置，不用每次比较就去挪用位置，消耗性能
 * @Package com.huobi.dataStructure
 * @date 2019-07-25 16:34
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {1,2,77,55,44,33,22};
        SelectSort(a,7);
        for (int i =0;i<a.length;i++){
            System.out.printf(a[i]+" ");
        }
    }

    public static void SelectSort(int[] a, int b) {
        int min, in, out;
        for (out = 0; out < b - 1; out++) {
            min = out;
            for (in = out + 1; in < b; in++) {
                if (a[in] < a[min]) {
                    int temp = a[in];
                    a[in] = a[min];
                    a[min] = temp;
                }
            }
        }
    }
}
