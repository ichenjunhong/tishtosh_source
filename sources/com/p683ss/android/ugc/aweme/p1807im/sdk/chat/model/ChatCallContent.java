package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ChatCallContent */
public final class ChatCallContent extends BaseContent {
    @C17952c(mo34828a = "voip_content")
    private String content;
    @C17952c(mo34828a = "voip_status")
    private int status;

    public final String getContent() {
        return this.content;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getMsgHint() {
        StringBuilder sb = new StringBuilder();
        sb.append(C11010c.m22280a().getResources().getString(R.string.fsh));
        String str = this.content;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
