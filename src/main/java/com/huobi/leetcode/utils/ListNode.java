package com.huobi.leetcode.utils;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.leetcode.utils
 * @date 2020-08-09 14:09
 */
public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    public ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
