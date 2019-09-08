package com.huobi.interFace;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.interFace
 * @date 2019-07-22 20:07
 */
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(33);
        arr.insert(77);
        arr.insert(99);
        arr.insert(22);
        arr.insert(74);
        arr.insert(87);
        arr.insert(71);

        arr.display();

        int se = 33;
        if(arr.find(se)){
            System.out.printf("Found:"+se);
        }else{
            System.out.printf("Can't find:"+se);
        }

        arr.delete(33);
        arr.delete(77);
        arr.display();

    }
}
