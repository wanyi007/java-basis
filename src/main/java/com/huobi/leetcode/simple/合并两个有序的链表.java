package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.ListNode;

/**
 * @author wanyi
 * @version V1.0
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @Package com.huobi.leetcode.simple
 * @date 2020-08-09 14:07
 */
public class 合并两个有序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;

        while(l1 != null && l2 != null){
            if (l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }

            prev = prev.next;
        }

        prev.next = l1 == null ? l2:l1;

        return prehead.next;
    }

}
