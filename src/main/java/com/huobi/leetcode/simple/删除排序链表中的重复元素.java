package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.ListNode;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 输入: 1->1->2
 * 输出: 1->2
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-10-28 22:39
 */

/**
 * 算法解析
 *
 * 由于输入的列表已经排序，我们可以通过将节点的值与它之后的节点进行比较确认是否重复，如果它是重复的，我们更改当前节点的next指针，以便
 * 它跳过下一个节点并直接指向下一个节点之后的节点
 */
public class 删除排序链表中的重复元素 {

    public ListNode deleteDuplicates (ListNode head){
        ListNode current = head;
        while(current!=null && current.next != null){
            if (current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}
