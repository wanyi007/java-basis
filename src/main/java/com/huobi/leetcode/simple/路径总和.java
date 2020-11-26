package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.TreeNode;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和.
 * 说明:叶子节点是指没有子节点的节点
 *
 * sum = 22；
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 *
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-26 19:12
 */
public class 路径总和 {
    public boolean hasPathSum(TreeNode  root,int sum){
     if (root == null ){
        return false;
     }
     //递减的判断最后是否能整减
     if (root.left == null && root.right == null){
         return sum - root.val == 0;
     }
     return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum-root.val);
    }
}

