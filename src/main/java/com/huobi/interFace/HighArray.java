package com.huobi.interFace;

/**
 * @author wanyi
 * @version V1.0
 * 设计一个数组对象
 * @Package com.huobi.interFace
 * @date 2019-07-22 19:39
 */
class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchkey){
        int j;
        for (j = 0;j< nElems;j++)
            if (a[j] == searchkey)
                break;
        if(nElems == j){
            return false;
        }else{
            return true;
        }
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j;
        for(j = 0;j<nElems;j++){
            if(value == a[j]){
                break;
            }
        }
        if(j == nElems){
            return false;
        }
        else{
            for(int k =j;k<nElems;k++){
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void display(){
        for(int j =0;j<nElems;j++){
            System.out.printf(a[j]+" ");
            System.out.printf(" ");
        }
    }



}
