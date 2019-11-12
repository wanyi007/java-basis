package com.huobi.dataStructure.recursion;

/**
 * @author wanyi
 * @version V1.0
 * 希尔排序数组对-象
 * @Package com.huobi.dataStructure.recursion
 * @date 2019-10-21 19:37
 */
public class ArraySh {
    private long[] theArray;
    private int nElems;

    public ArraySh(int max){
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }

    public void display(){
        System.out.print("A=");
        for (int j=0;j<nElems;j++){
            System.out.print(theArray[j]+" ");
            System.out.println("");
        }
    }

    //希尔排序逻辑
    public void shellSort(){
        int inner,outer;
        long temp;

        int h = 1;
        while(h <= nElems/3){
            h = h*3+1;
        }

        while (h>0){
            for (outer=h;outer<nElems;outer++){
                temp = theArray[outer];
                inner = outer;

                while(inner > h-1 && theArray[inner-h] >= temp){
                    theArray[inner] = theArray[inner-h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h-1)/3;
        }
    }
}
