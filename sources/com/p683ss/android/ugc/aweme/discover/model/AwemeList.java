package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.AwemeList */
public class AwemeList implements Serializable {
    @C17952c(mo34828a = "aweme_list")
    private List<Aweme> awemeList;
    @C17952c(mo34828a = "cursor")
    private long cursor;
    @C17952c(mo34828a = "has_more")
    private int hasMore;
    @C17952c(mo34828a = "status_code")
    private int statusCode;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }
}
