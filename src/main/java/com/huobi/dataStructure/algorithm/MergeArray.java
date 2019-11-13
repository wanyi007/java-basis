package com.huobi.dataStructure.algorithm;

/**
 * @author wanyi
 * @version V1.0
 * 合并两个已经排序好的数组
 * @Package com.huobi.dataStructure
 * @date 2019-06-28 11:20
 */
public class MergeArray {
    private static short cout;

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 5, 10, 11,888};
        int[] b = new int[]{2, 3, 6, 9,999};
        int[] c = new int[a.length + b.length];
        MergeArrayDe(a, b, c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "\t");
        }
    }

    static void MergeArrayDe(int a[], int b[], int c[]){
        int i = 0;
        int j = 0;
        int k = 0;
        // 如果a或b有一个遍历完了就停止
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++]; // c[k] 赋值为 a[i]，先赋值再加1
            } else {
                c[k++] = b[j++];
            }
        }
        // 如果 i < a.length，说明b都添加进数组c了，只剩下比b大的a，挨个添加就行
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

    }

}

