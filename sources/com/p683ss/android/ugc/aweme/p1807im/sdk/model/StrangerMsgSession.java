package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.StrangerMsgSession */
public class StrangerMsgSession {
    @C17952c(mo34828a = "last_msg")
    StrangerMessage lastMsg;
    @C17952c(mo34828a = "session_id")
    long sessionId;
    @C17952c(mo34828a = "unread_count")
    int unreadCount;

    public StrangerMessage getLastMsg() {
        return this.lastMsg;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public int getUnreadCount() {
        return this.unreadCount;
    }

    public void setLastMsg(StrangerMessage strangerMessage) {
        this.lastMsg = strangerMessage;
    }

    public void setSessionId(long j) {
        this.sessionId = j;
    }

    public void setUnreadCount(int i) {
        this.unreadCount = i;
    }
}
