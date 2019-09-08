package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-19 22:54
 */
public class LinkStarkApp {
    public static void main(String[] args) {
        LinkStark linkStark = new LinkStark();
        linkStark.push(22,33);
        linkStark.push(32,44);
        linkStark.push(42,55);
        linkStark.push(52,66);

        linkStark.displayStack();

        linkStark.pop();
        linkStark.displayStack();
    }
}
