package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-18 23:30
 */
public class FirstLastApp {
    public static void main(String[] args) {
        FirstLastLink theList = new FirstLastLink();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.displayLink();
//////

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayLink();

        theList.deleteFirst();
        theList.deleteFirst();
        theList.displayLink();
    }
}
