package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-21 23:55
 */
public class SortedArrListApp {
    public static void main(String[] args) {
        int size = 10;
        LinkA[] linkAS = new LinkA[size];
        for (int i = 0; i<size;i++){
            int n = (int)(java.lang.Math.random()*99);
            LinkA linkA = new LinkA(n);
            linkAS[i] = linkA;
        }
        System.out.println("Unsorted array: ");
        for (int i = 0;i<size;i++){
            System.out.println(linkAS[i].dData+" ");
        }
        System.out.println(" ");
        SortedArrList sortedArrList = new SortedArrList(linkAS);
        for (int j = 0;j < size;j++){
            linkAS[j] = sortedArrList.remove();
            System.out.println("Sorted Array: ");
        }
        for (int j = 0;j < size;j++){
            System.out.println(linkAS[j].dData+" ");
        }
        System.out.println(" ");
    }
}
