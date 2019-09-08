package com.huobi.dataStructure.link.iterator;

/**
 * @author wanyi
 * @version V1.0
 * 迭代器类
 * @Package com.huobi.dataStructure.link.iterator
 * @date 2019-08-26 23:54
 */
public class LinkIterator {
    private Link current;
    private Link previous;
    private LinkList ourList;

    public LinkIterator(LinkList list){
        ourList = list;
        reset();
    }

    public void reset(){
        current = ourList.getFirst();
        previous = null;
    }

    public void nextLink(){
        previous = current;
        current = current.next;
    }

    public boolean atEnd(){
        return (current == current.next);
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(long dd){
        Link newLink = new Link(dd);
        if (ourList.isEmpty()){
            ourList.setFirst(newLink);
            current = newLink;
        }else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    public void insertBefore(long dd){
        Link newLink = new Link(dd);
        if (previous == null){
           newLink.next =  ourList.getFirst();
           ourList.setFirst(newLink);
           reset();
        }else{
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public long deleteCurrent(){
        long value = current.dData;
        if (previous == null){
            ourList.setFirst(current.next);
            reset();
        }else{
            previous.next = current.next;
            if (atEnd()){
                reset();
            }else {
                current = current.next;
            }
        }
        return value;
    }
}
