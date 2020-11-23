package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.TreeNode;

/**
 * @author wanyi
 * @version V1.0
 *
 * 定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-23 20:09
 */
public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root){
        if (root == null ){
            return 0;
        }
        //递归左子树和右子树的最大值
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

}
