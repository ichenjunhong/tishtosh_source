package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ShopUserMessage */
public final class ShopUserMessage implements Serializable {
    @C17952c(mo34828a = "has_more")
    private boolean hasMore;
    @C17952c(mo34828a = "has_unread")
    private boolean hasUnread;
    @C17952c(mo34828a = "messages")
    private List<ShopMessage> messages;
    @C17952c(mo34828a = "status_code")
    private int statusCode;
    @C17952c(mo34828a = "status_msg")
    private String statusMsg;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getHasUnread() {
        return this.hasUnread;
    }

    public final List<ShopMessage> getMessages() {
        return this.messages;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setHasUnread(boolean z) {
        this.hasUnread = z;
    }

    public final void setMessages(List<ShopMessage> list) {
        this.messages = list;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
