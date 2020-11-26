package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.TreeNode;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定一个二叉树 判断它是否是高度平衡二叉树
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 *
 *
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-26 10:47
 */
public class 平衡二叉树 {

    public boolean isBalanced(TreeNode root){
        if (root == null){
            return true;
        }
        //判断是否为完全二叉树
        return Math.abs(depth(root.left)-depth(root.right))<=1 && isBalanced(root.right) && isBalanced(root.right);
    }

    //采取自顶而下的方式遍历树
    public int depth(TreeNode root){
        if (root == null ){
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
