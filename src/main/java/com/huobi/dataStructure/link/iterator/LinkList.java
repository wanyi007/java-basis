package com.huobi.dataStructure.link.iterator;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link.iterator
 * @date 2019-08-26 23:51
 */
public class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }

    public Link getFirst(){
        return first;
    }

    public void setFirst(Link f){
        first = f;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public LinkIterator getIterator(){
        return new LinkIterator(this);
    }

    public void displayList(){
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(first.dData+" ");
    }
}
