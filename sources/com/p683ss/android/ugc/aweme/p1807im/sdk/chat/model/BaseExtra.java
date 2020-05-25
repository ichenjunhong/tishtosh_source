package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent.Key;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra */
public class BaseExtra implements Serializable {
    @C17952c(mo34828a = "status_code")
    int statusCode;
    @C17952c(mo34828a = "status_msg")
    StatusMessage statusMsg;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra$MessageContent */
    public static class MessageContent {
        @C17952c(mo34828a = "template")
        Key[] template;
        @C17952c(mo34828a = "tips")
        String tips;

        public Key[] getTemplate() {
            return this.template;
        }

        public String getTips() {
            return this.tips;
        }

        public void setTemplate(Key[] keyArr) {
            this.template = keyArr;
        }

        public void setTips(String str) {
            this.tips = str;
        }

        public static SystemContent toSystemContent(MessageContent messageContent) {
            SystemContent systemContent = new SystemContent();
            systemContent.setType(100);
            systemContent.tips = messageContent.tips;
            systemContent.template = messageContent.template;
            return systemContent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra$StatusMessage */
    public static class StatusMessage {
        @C17952c(mo34828a = "msg_content")
        MessageContent msgContent;
        @C17952c(mo34828a = "msg_type")
        int msgType;

        public MessageContent getMsgContent() {
            return this.msgContent;
        }

        public int getMsgType() {
            return this.msgType;
        }

        public void setMsgContent(MessageContent messageContent) {
            this.msgContent = messageContent;
        }

        public void setMsgType(int i) {
            this.msgType = i;
        }
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public StatusMessage getStatusMsg() {
        return this.statusMsg;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(StatusMessage statusMessage) {
        this.statusMsg = statusMessage;
    }
}
