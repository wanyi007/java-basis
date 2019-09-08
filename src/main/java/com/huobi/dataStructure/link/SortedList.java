package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-21 23:19
 */
public class SortedList {
    private Link first;
    public SortedList(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insert(int dd, double bb){
        Link newLink = new Link(dd, bb);
        Link previous = null;
        Link current = first;

        while(current!=null && dd>current.iData){
            previous = current;
            current = current.next;
        }

        if (previous == null){
            first = newLink;
        }else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    public Link remove(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List  (first --> last)");
        Link current = this.first;
        while (current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}
