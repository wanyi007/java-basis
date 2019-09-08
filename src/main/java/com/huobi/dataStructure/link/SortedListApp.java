package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-21 23:39
 */
public class SortedListApp {
    public static void main(String[] args) {
        SortedList theList = new SortedList();
        theList.insert(22,33);
        theList.insert(55,44);
        theList.insert(44,55);
        theList.displayList();

        theList.remove();

        theList.displayList();
    }
}
