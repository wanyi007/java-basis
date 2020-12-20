package com.huobi.leetcode.simple.Array;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.leetcode.simple
 * @date 2020-12-03 13:54
 */
public class 旋转数组 {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums,int k){
        int len  = nums.length;
        k = k % len;
        int count = 0;         // 记录交换位置的次数，n个同学一共需要换n次
        for(int start = 0; count < len; start++) {
            int cur = start;       // 从0位置开始换位子
            int pre = nums[cur];
            do{
                int next = (cur + k) % len;
                int temp = nums[next];    // 来到角落...
                nums[next] = pre;
                pre = temp;
                cur = next;
                count++;
            }while(start != cur);     // 循环暂停，回到起始位置，角落无人

        }
    }
}
