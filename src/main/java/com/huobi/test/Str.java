package com.huobi.test;

import java.io.UnsupportedEncodingException;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.test
 * @date 2020-08-21 16:12
 */
public class Str {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我们是什么";
        byte[] bytes = str.getBytes();
        System.out.println(new String(bytes,"UTF-16LE"));
    }
}
