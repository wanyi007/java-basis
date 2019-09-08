package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-18 23:37
 */
public class FirstLastLink {

        private LinkA first;
        private LinkA last;
        public FirstLastLink(){
            first = null;
            last = null;
        }
        public boolean isEmpty(){
            return first == null;
        }
        public void insertFirst(long dd){
            LinkA newLink = new LinkA(dd);
            if (isEmpty())
                last = newLink;
            newLink.next = first;
            first = newLink;
        }
        public void insertLast(long dd){
            LinkA newLink = new LinkA(dd);
            if (isEmpty()){
                first = newLink;
            }else {
                last.next = newLink;
            }
            last = newLink;
        }

        public long deleteFirst(){
            long tmp = first.dData;
            if (first.next == null)
                last = null;
            first = first.next;
            return tmp;
        }
        public void displayLink(){
            System.out.println("List (first-->last): ");
            LinkA current = this.first;
            while(current!=null){
                current.displayLink();
                current = current.next;

            }
            System.out.println(" "); }
}
