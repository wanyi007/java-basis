package com.huobi.dataStructure.recursion;

/**
 * @author wanyi
 * @version V1.0
 * 归并排序mian
 * @Package com.huobi.dataStructure.recursion
 * @date 2019-09-11 16:41
 */
public class MergeSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DArray arr;
        arr = new DArray(maxSize);

        arr.insert(64);
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(12);
        arr.insert(85);
        arr.insert(44);
        arr.insert(3);
        arr.insert(99);
        arr.insert(0);
        arr.insert(108);
        arr.insert(36);

        arr.display();
        System.out.println(" ");
        arr.mergeSort();

        arr.display();
    }
}
