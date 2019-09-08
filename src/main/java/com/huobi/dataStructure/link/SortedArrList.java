package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-21 23:47
 */
public class SortedArrList {
    private LinkA first;
     public SortedArrList(){
         first = null;
     }
     public SortedArrList(LinkA[] linkArr){
        first = null;
        for (int i = 0; i< linkArr.length;i++){
            insert(linkArr[i]);
        }
     }

     public void insert(LinkA k){
         LinkA previous = null;
         LinkA current = first;

         while (current != null && k.dData>current.dData){
             previous = current;
             current = current.next;
         }

         if (previous == null){
             first = k;
         }else {
             previous.next = k;

         }
         k.next = current;
     }

     public LinkA remove(){
         LinkA temp = first;
         first = first.next;
         return temp;
     }
}
