package com.huobi.dataStructure.recursion;

/**
 * @author wanyi
 * @version V1.0
 * 归并排序对象
 * @Package com.huobi.dataStructure.recursion
 * @date 2019-09-11 16:02
 */
public class DArray {
    private long[] theArray;
    private int nElems;

    public DArray(int max){
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int j=0;j<nElems;j++){
            System.out.print(theArray[j]+" ");
            System.out.println("");
        }
    }

    public void mergeSort(){
        long[] workSpace = new long[nElems];
        recMergeSort(workSpace,0,nElems-1);
    }

    private void recMergeSort(long[] workSpace,int lowerBound,int upperBound){
        if(lowerBound == upperBound){
            return;
        }else{
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace,lowerBound,mid);
            recMergeSort(workSpace,mid+1,upperBound);
            merge(workSpace,lowerBound,mid+1,upperBound);
        }
    }

    private void merge(long[] workSpace,int lowPtr,int highPer,int upperBound){
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPer - 1;
        int n = upperBound - lowerBound + 1;

        while(lowPtr <= mid && highPer <= upperBound){
            if(theArray[lowPtr] < theArray[highPer]){
                workSpace[j++] = theArray[lowPtr++];
            }else{
                workSpace[j++] = theArray[highPer++];
            }
        }

        while (lowPtr <= mid){
            workSpace[j++] = theArray[lowPtr++];
        }

        while (highPer <= upperBound){
            workSpace[j++] = theArray[highPer++];
        }

        for (j=0;j<n;j++){
            theArray[lowerBound+j] = workSpace[j];
        }

    }
}
