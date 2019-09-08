package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-18 17:34
 */
public class LinkListApp {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        //插入数据
        linkList.insertFirst(22,2.99);
        linkList.insertFirst(44,4.99);
        linkList.insertFirst(66,6.99);
        linkList.insertFirst(88,8.99);
        //展示数据
        linkList.displayList();
        while(!linkList.isEmpty()){
            Link link = linkList.deleteFirst();
            System.out.println("Deleted:");
            link.displayLink();
            System.out.println(" ");
        }
        linkList.displayList();
    }
}
