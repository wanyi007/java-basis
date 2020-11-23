package com.huobi.leetcode.simple;

import com.huobi.leetcode.utils.TreeNode;

/**
 * @author wanyi
 * @version V1.0
 *
 * 给定两个相同的树，编写一个函数来检验他们是否相同
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-20 19:42
 */
public class 相同的树 {
        public boolean isSameTree(TreeNode p,TreeNode q){
            if(p == null && q == null)
                return true;
            if(p == null || q == null)
                return false;
            if(p.val != q.val)
                return false;
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
}
