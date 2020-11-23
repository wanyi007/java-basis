package com.huobi.leetcode.utils;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.leetcode.utils
 * @date 2020-11-20 19:36
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){};
    public TreeNode(int val){this.val=val;}
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
