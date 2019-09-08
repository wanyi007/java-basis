package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * 双向链表对象
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-25 12:56
 */
public class DoublyLinkedList {
    private DoublyLink first;
    private DoublyLink last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(long dd){
        DoublyLink newLink = new DoublyLink(dd);

        if (isEmpty()){
            last = newLink;
        }else{
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd){
        DoublyLink newLink = new DoublyLink(dd);

        if (isEmpty()){
            first = newLink;
        }else{
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }
    public DoublyLink deleteFirst(){
        DoublyLink temp = first;
        if (first.next == null){
            last = null;
        }else{
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public DoublyLink deleteLast(){
        DoublyLink temp = last;

        if (first.next == null){
            first = null;
        }else{
            last.previous.next = null;
        }
        last = last.previous;
        return last;
    }

    public boolean insertAfter(long key,long dd){
        DoublyLink current = this.first;
        while(current.dData != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }

        DoublyLink newLinK = new DoublyLink(dd);
        if (current == last){
            newLinK.next = null;
            last = newLinK;
        }else{
            newLinK.next = current.next;
            current.next.previous = newLinK;
        }

        newLinK.previous = current;
        current.next = newLinK;
        return true;
    }

    public DoublyLink deleteKey(long key){
        DoublyLink current = first;

        while(current.dData != key){
            current = current.next;
            if (current == null){
                return null;
            }
        }
        if (current == first){
            first = current.next;
        }else{
            current.previous.next = current.next;
        }
        return current;
    }

    public void displayForward(){
        System.out.println("List  (first -->  last): ");
        DoublyLink current = this.first;

        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    public void displayBackward(){
        System.out.println("List  (last   --> first): ");
        DoublyLink current = this.last;
        while (current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println(" ");
    }

}
