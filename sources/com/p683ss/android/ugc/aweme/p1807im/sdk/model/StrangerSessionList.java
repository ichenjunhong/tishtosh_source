package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.StrangerSessionList */
public class StrangerSessionList {
    @C17952c(mo34828a = "has_more")
    boolean hasMore;
    @C17952c(mo34828a = "session_list")
    List<StrangerMsgSession> lastMsg;
    @C17952c(mo34828a = "next_cursor")
    int nextCursor;
    @C17952c(mo34828a = "status_code")
    int statusCode;

    public List<StrangerMsgSession> getLastMsg() {
        return this.lastMsg;
    }

    public int getNextCursor() {
        return this.nextCursor;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLastMsg(List<StrangerMsgSession> list) {
        this.lastMsg = list;
    }

    public void setNextCursor(int i) {
        this.nextCursor = i;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }
}
