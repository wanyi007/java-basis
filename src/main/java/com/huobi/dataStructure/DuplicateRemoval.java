package com.huobi.dataStructure;

import java.util.*;

/**
 * @author wanyi
 * @version V1.0
 * 数组去重
 * @Package com.huobi.dataStructure
 * @date 2019-06-30 10:05
 */
public class DuplicateRemoval {
    public static void main(String[] args) {
        int[] ints = {1, 10, 10, 44, 4, 4, 6, 7};
        HashMap<Object, Object> map = new HashMap<>();
        //useSet(ints);
        useList(ints);
    }


    //方法一  使用hashset进行排序
//    public static void useSet(int[] arr){
//        Set set = new HashSet();
//        for (int i = 0;i < arr.length;i++){
//            set.add(arr[i]);
//        }
//        Object[] newArr = set.toArray();
//        for (int i =0;i < newArr.length;i++){
//            System.out.println(" " + newArr[i]);
//        }

     //方法二  利用list的contains 过滤
     public static void useList(int[] arr) {
         List<Integer> list = new ArrayList();
         for (int i = 0; i < arr.length; i++) {
             if (!list.contains(arr[i])) {
                 list.add(arr[i]);
             }
         }
         //toArray()方法会返回一个包含集合所有元素的Object类型数组
         Object[] newArr = list.toArray();
         for (int i = 0; i < newArr.length; i++) {
             System.out.println(" " + newArr[i]);
         }

     }
        }





