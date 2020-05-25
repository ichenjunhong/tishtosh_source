package com.p683ss.android.ugc.aweme.notice.api.bean;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.StrangerNoticeMessage */
public class StrangerNoticeMessage {
    @C17952c(mo34828a = "client_msg_id")
    long clientMsgId;
    @C17952c(mo34828a = "content")
    String content;
    @C17952c(mo34828a = "create_time")
    long createTime;
    @C17952c(mo34828a = "device_id")
    long deviceId;
    @C17952c(mo34828a = "ext")
    String ext;
    @C17952c(mo34828a = "from_user")
    SimpleUser fromUser;
    @C17952c(mo34828a = "msg_type")
    int msgType;
    @C17952c(mo34828a = "to_user")
    SimpleUser toUser;

    public long getClientMsgId() {
        return this.clientMsgId;
    }

    public String getContent() {
        return this.content;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public String getExt() {
        return this.ext;
    }

    public SimpleUser getFromUser() {
        return this.fromUser;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public SimpleUser getToUser() {
        return this.toUser;
    }

    public boolean isRecalled() {
        if (!TextUtils.isEmpty(this.ext)) {
            try {
                if (TextUtils.equals("true", (CharSequence) ((HashMap) new C17971f().mo34884a(this.ext, HashMap.class)).get("s:is_recalled"))) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setClientMsgId(long j) {
        this.clientMsgId = j;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDeviceId(long j) {
        this.deviceId = j;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setFromUser(SimpleUser simpleUser) {
        this.fromUser = simpleUser;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setToUser(SimpleUser simpleUser) {
        this.toUser = simpleUser;
    }
}
