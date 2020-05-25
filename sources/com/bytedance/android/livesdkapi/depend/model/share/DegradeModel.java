package com.bytedance.android.livesdkapi.depend.model.share;

import com.google.gson.p1076a.C17952c;

public class DegradeModel {
    @C17952c(mo34828a = "desc")
    private String desc;
    @C17952c(mo34828a = "weixin")
    private int weiXin;
    @C17952c(mo34828a = "weixin_timeline")
    private int weiXinMoment;

    public String getDesc() {
        return this.desc;
    }

    public int getWeiXin() {
        return this.weiXin;
    }

    public int getWeiXinMoment() {
        return this.weiXinMoment;
    }

    public boolean isWeixinDegrade() {
        if (this.weiXin == 1) {
            return true;
        }
        return false;
    }

    public boolean isWeixinTimelineDegrade() {
        if (this.weiXinMoment == 1) {
            return true;
        }
        return false;
    }

    public String toJsonString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"weixin");
        sb.append("\":");
        sb.append(this.weiXin);
        sb.append(",");
        sb.append("\"weixin_timeline");
        sb.append("\":");
        sb.append(this.weiXinMoment);
        sb.append("}");
        return sb.toString();
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setWeiXin(int i) {
        this.weiXin = i;
    }

    public void setWeiXinMoment(int i) {
        this.weiXinMoment = i;
    }
}
