package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.TreeNode;

/**
 * @author wanyi
 * @version V1.0
 *
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 *  因为需要转换成一个高度平衡的二叉树
 *  分析：BST的中序遍历是升序的，因此本题等同于根据中序遍历的序列恢复二叉搜索树。
 *  因此我们可以以升序序列中的任一个元素作为根节点，以该元素左边的升序序列构建左子树，
 *  以该元素右边的升序序列构建右子树，这样得到的树就是一棵二叉搜索树啦～
 *  又因为本题要求高度平衡，因此我们需要选择升序序列的中间元素作为根节点奥～
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-24 16:34
 */
public class 将有序数组转换成二叉搜索树 {
    public TreeNode sortedArrayToBST( int[] nums){
        return bfs(nums,0,nums.length-1);
    }

    public TreeNode bfs(int[] nums,int lo,int hi){
        if (lo > hi){
            return null;
        }

        //升序的数组的中间元素作为节点root
        int mid = lo + (lo+hi)/2;
        TreeNode root = new TreeNode(nums[mid]);
        //递归构建root的左子树和右子树
        root.left = bfs(nums,lo,mid-1);
        root.right = bfs(nums,mid+1,hi);
        return root;
    }
}
