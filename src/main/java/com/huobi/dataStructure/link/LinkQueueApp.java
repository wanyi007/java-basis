package com.huobi.dataStructure.link;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.dataStructure.link
 * @date 2019-08-20 19:26
 */
public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.insert(55);
        linkQueue.insert(66);
        linkQueue.displayQueue();

        linkQueue.insert(77);
        linkQueue.insert(88);

        linkQueue.displayQueue();

        linkQueue.remove();
        linkQueue.displayQueue();
    }
}
