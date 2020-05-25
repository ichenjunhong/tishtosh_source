package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.DouYinRedPacketContent */
public class DouYinRedPacketContent extends BaseContent {
    @C17952c(mo34828a = "order_no")
    private String orderNo;
    @C17952c(mo34828a = "redpacket_no")
    private String redPacketNo;
    @C17952c(mo34828a = "redpacket_type")
    private int redPacketType;
    @C17952c(mo34828a = "title")
    private String title;

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getRedPacketNo() {
        return this.redPacketNo;
    }

    public int getRedPacketType() {
        return this.redPacketType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getMsgHint() {
        StringBuilder sb = new StringBuilder();
        sb.append(C11010c.m22280a().getString(R.string.gj7));
        sb.append(this.title);
        return sb.toString();
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setRedPacketNo(String str) {
        this.redPacketNo = str;
    }

    public void setRedPacketType(int i) {
        this.redPacketType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
