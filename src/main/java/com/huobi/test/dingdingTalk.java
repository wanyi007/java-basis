package com.huobi.test;

import java.util.Arrays;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest ;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.taobao.api.ApiException;

/**
 * @author wanyi
 * @version V1.0
 * @Package com.huobi.test
 * @date 2020-03-09 22:15
 */
public class dingdingTalk {
    public static void main(String[] args) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/robot/send?access_token=2d9917ab8cbbcf315f601d740c67ab42b29f7f72b667d32c070bf04b59984066");
        OapiRobotSendRequest request = new OapiRobotSendRequest();
        request.setMsgtype("text");
        OapiRobotSendRequest.Text text = new OapiRobotSendRequest.Text();
        text.setContent("测试文本消息");
        request.setText(text);
        OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
        at.setAtMobiles(Arrays.asList("132xxxxxxxx"));
        request.setAt(at);

        request.setMsgtype("link");
        OapiRobotSendRequest.Link link = new OapiRobotSendRequest.Link();
        link.setMessageUrl("https://www.dingtalk.com/");
        link.setPicUrl("");
        link.setTitle("时代的打卡提醒火车向前开");
        link.setText("这个即将发布的新版本，创始人xx称它为“红树林”。\n" +
                "而在此之前，打卡提醒每当面临重大升级，产品经理们都会取一个应景的代号，这一次，为什么是“红树林");
        request.setLink(link);

        request.setMsgtype("markdown");
        OapiRobotSendRequest.Markdown markdown = new OapiRobotSendRequest.Markdown();
        markdown.setTitle("杭州天打卡提醒气");
        markdown.setText("#### 杭州天气 @156xxxx8827\n" +
                "> 9度，西北风1级打卡提醒，空气良89，相对温度73%\n\n" +
                "> ![screenshot](https://gw.alicdn.com/tfs/TB1ut3xxbsrBKNjSZFpXXcXhFXa-846-786.png)\n"  +
                "> ###### 10点20分发布 [天气](http://www.thinkpage.cn/) \n");
        request.setMarkdown(markdown);
        OapiRobotSendResponse response = client.execute(request);
        System.out.println(response.isSuccess()+response.getErrmsg());
    }
}
