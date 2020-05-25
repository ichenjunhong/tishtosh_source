package com.p683ss.android.ugc.aweme.search.p2121a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.a.b */
public final class C41399b implements Serializable {
    @C17952c(mo34828a = "caption_info")
    public C41398a captionInfo;
    @C17952c(mo34828a = "match_info")
    public List<C41400c> matchInfoList;
    @C17952c(mo34828a = "query_limit")
    public int queryLimit;
    @C17952c(mo34828a = "total_limit")
    public int totalLimit;

    public final C41398a getCaptionInfo() {
        return this.captionInfo;
    }

    public final List<C41400c> getMatchInfoList() {
        return this.matchInfoList;
    }

    public final int getQueryLimit() {
        return this.queryLimit;
    }

    public final int getTotalLimit() {
        return this.totalLimit;
    }

    public final void setCaptionInfo(C41398a aVar) {
        this.captionInfo = aVar;
    }

    public final void setMatchInfoList(List<C41400c> list) {
        this.matchInfoList = list;
    }

    public final void setQueryLimit(int i) {
        this.queryLimit = i;
    }

    public final void setTotalLimit(int i) {
        this.totalLimit = i;
    }
}
