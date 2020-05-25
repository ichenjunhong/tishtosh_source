package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ShopMessage */
public final class ShopMessage implements Serializable {
    @C17952c(mo34828a = "content")
    private String content = "";
    @C17952c(mo34828a = "created_at")
    private long createdAt;
    @C17952c(mo34828a = "expire_at")
    private long expireAt;
    @C17952c(mo34828a = "message_id")
    private String messageId = "";
    @C17952c(mo34828a = "read")
    private boolean read;
    @C17952c(mo34828a = "type")
    private String type = "";
    @C17952c(mo34828a = "url")
    private String url;

    public final String getContent() {
        return this.content;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getExpireAt() {
        return this.expireAt;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setExpireAt(long j) {
        this.expireAt = j;
    }

    public final void setRead(boolean z) {
        this.read = z;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setContent(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.content = str;
    }

    public final void setMessageId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.messageId = str;
    }

    public final void setType(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.type = str;
    }
}
