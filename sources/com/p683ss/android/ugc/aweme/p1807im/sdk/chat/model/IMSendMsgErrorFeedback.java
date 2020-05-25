package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.IMSendMsgErrorFeedback */
public final class IMSendMsgErrorFeedback {
    @C17952c(mo34828a = "err_code")
    private int errorCode;
    @C17952c(mo34828a = "err_desc")
    private String errorDesc = "";
    @C17952c(mo34828a = "log_id")
    private String logId = "";
    @C17952c(mo34828a = "msg_type")
    private int msgType = -1;

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    public final String toJsonString() {
        String a = C35277o.m79761a(this);
        if (a == null) {
            return "";
        }
        return a;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorDesc(String str) {
        this.errorDesc = str;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setMsgType(int i) {
        this.msgType = i;
    }
}
