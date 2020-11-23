package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.TreeNode;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定一个二叉树，检查它是否是镜像对称的
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-23 19:49
 */
public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root){
        if(root == null ){
            return true;
        }
        return cmp(root.left,root.right);
    }
    public  boolean cmp(TreeNode n1,TreeNode n2){
        if(n1 == null && n2 ==  null){
            return true;
        }
        if (n1 == null || n2  == null || n1.val!=n2.val){
            return false;
        }
        return cmp(n1.left,n2.right) && cmp(n1.right,n2.left);
    }

}
