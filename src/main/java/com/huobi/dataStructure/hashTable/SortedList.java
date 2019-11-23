package com.huobi.dataStructure.hashTable;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.hashTable
 * @date 2019-11-20 19:36
 */
public class SortedList {
    private Link first;
    public void SortedList(){
        first = null;
    }

    public void insert(Link theLink){
        int key = theLink.getKey();
        Link previous = null;
        Link current = first;

        while(current != null && key > current.getKey()){
            previous = current;
            current = current.next;
        }

        if (previous == null){
            first = theLink;
        }else{
            previous.next = theLink;
        }
        theLink.next = current;
    }

    public void delete(int key){
        Link previous = null;
        Link current = first;
        while(current != null && key != current.getKey()){
            previous = current;
            current = current.next;
        }
        if(previous == null){
            first = first.next;
        }else{
            previous.next = current.next;
        }
    }

    public Link find(int key){
        Link current = first;
        while(current != null && current.getKey() <= key){
            if (current.getKey() == key){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void dispalyList(){
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

}
