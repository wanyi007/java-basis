package com.huobi.leetcode.simple;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wanyi
 * @version V1.0
 *
 *
 * @Package com.huobi.leetcode.simple
 * @date 2020-11-26 19:46
 */
public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            //生成第N行
            int n = i;
            List<Integer> temp = new ArrayList<>();
            for(int j=n;j>=0;j--){
                temp.add(C(n,j));
            }
            res.add(temp);
        }
        return res;
    }
    private int  C(int n,int m){
        return F(n).divide(F(n-m).multiply(F(m))).intValue();
    }
    private BigInteger F(int x){
        if(x==0||x==1)    return BigInteger.valueOf(1);
        return F(x-1).multiply(BigInteger.valueOf(x));
    }

}
