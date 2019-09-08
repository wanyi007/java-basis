package com.huobi.dataStructure.link;


/**
 * @author wanyi
 * @version V1.0
 * 完整的link集合写法
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-15 23:59
 */
public class LinkList {
    private Link first;
    public LinkList(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id,double dd){
        Link link = new Link(id, dd);
        link.next = first;
        first = link;
    }
    public Link deleteFirst(){
        Link tmp = first;
        first = first.next;
        return tmp;
    }
    public void displayList(){
        System.out.println("List(fist----->last): ");
        Link current = first;
        while (current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
    //查找一个节点
    public Link find(int key){
        Link current = first;
        while (current.iData!=key){
            if (current.next == null){
                return null;
            }else{
                current = current.next;
            }
        }
        return current;
    }
    //删除一个节点
    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while(current.iData!=key){
            if (current.next==null){
                return null;
            }else{
                previous = current;
                current = current.next;
            }
        }
        if (current==first){
            first = first.next;
        }else{
            previous.next = current.next;
        }
        return current;
    }
}
