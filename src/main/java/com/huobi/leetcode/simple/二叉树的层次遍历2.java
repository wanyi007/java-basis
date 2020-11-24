package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanyi
 * @version V1.0
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 返回 :
 *  [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-23 23:04
 */
public class 二叉树的层次遍历2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        levelHelper(res, root, 0);
        return res;
    }
    public void levelHelper(List<List<Integer>> list,TreeNode root,int level){
        //边界判断
        if(root == null){
            return;
        }
        if (level >= list.size()){
            list.add(0,new ArrayList<>());
        }
        //下面就是继续的打印了
        list.get(list.size()-1-level).add(root.val);
        levelHelper(list, root.left, level + 1);
        levelHelper(list, root.right, level + 1);
    }
}
