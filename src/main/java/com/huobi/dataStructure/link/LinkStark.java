package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * 用链表实现栈
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-19 22:45
 */
public class LinkStark {
    private LinkList theList;
    public LinkStark(){
        theList = new LinkList();
    }
    public void push(int dd,double jj){
        theList.insertFirst(dd,jj);
    }
    public Link pop(){
        return theList.deleteFirst();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void displayStack(){
        System.out.println("Stack (top -->  bottom)");
        theList.displayList();
    }

}
