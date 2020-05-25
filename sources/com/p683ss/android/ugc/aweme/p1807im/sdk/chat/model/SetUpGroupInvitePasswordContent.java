package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SetUpGroupInvitePasswordContent */
public final class SetUpGroupInvitePasswordContent extends BaseContent {
    private final String conversationId;
    private final int shareType;

    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getShareType() {
        return this.shareType;
    }

    public final void setMsgHint(String str) {
        this.msgHint = str;
    }

    public SetUpGroupInvitePasswordContent(String str, int i) {
        C52711k.m112240b(str, "conversationId");
        this.conversationId = str;
        this.shareType = i;
    }
}
