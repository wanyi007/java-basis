package com.huobi.interFace;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.interFace
 * @date 2019-07-25 18:02
 */
public class ObjectSortApp {
    public static void main(String[] args) {
        ArrayInOb arr = new ArrayInOb(10);
        arr.insert("aas","bbb",12);
        arr.insert("has","bbb",12);
        arr.insert("cas","bbb",12);
        arr.insert("das","bbb",12);
        arr.insert("eas","bbb",12);
        arr.insert("fas","bbb",12);

        arr.insertionSort();
        arr.display();
    }
}
