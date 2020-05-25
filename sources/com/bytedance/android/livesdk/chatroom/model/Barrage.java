package com.bytedance.android.livesdk.chatroom.model;

import com.google.gson.p1076a.C17952c;

public class Barrage {
    @C17952c(mo34828a = "content")
    private String content;
    @C17952c(mo34828a = "left_diamond")
    private int leftDiamond;
    @C17952c(mo34828a = "msg_id")
    private long msgId;
    @C17952c(mo34828a = "order_id")
    private String orderId;
    @C17952c(mo34828a = "msg")
    private String screenChatMsg;

    public String getContent() {
        return this.content;
    }

    public int getLeftDiamond() {
        return this.leftDiamond;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getScreenChatMsg() {
        return this.screenChatMsg;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLeftDiamond(int i) {
        this.leftDiamond = i;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setScreenChatMsg(String str) {
        this.screenChatMsg = str;
    }
}
