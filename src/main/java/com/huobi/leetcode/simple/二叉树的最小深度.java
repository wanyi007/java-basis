package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.TreeNode;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定一个二叉树，找出其最小的深度
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-26 11:13
 */
public class 二叉树的最小深度 {
    public int minDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int ans = Integer.MAX_VALUE;
        if(root.left != null) {
            ans = Math.min(minDepth(root.left), ans);
        }
        if(root.right != null) {
            ans = Math.min(minDepth(root.right), ans);
        }
        return ans + 1;
    }
}
