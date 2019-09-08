package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-25 14:15
 */
public class DoublyLinkedApp {
    public static void main(String[] args) {
        DoublyLinkedList thelist = new DoublyLinkedList();
        thelist.insertFirst(22);
        thelist.insertFirst(33);
        thelist.insertFirst(44);

        thelist.insertLast(55);

        thelist.displayForward();

        thelist.insertAfter(22,77);

        thelist.displayForward();
    }
}
