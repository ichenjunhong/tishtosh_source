package com.p683ss.android.ugc.aweme.forward.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.utils.C47917gi;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.model.UserDynamicList */
public class UserDynamicList extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "dongtai_list")
    private List<C32415c> dynamicList;
    @C17952c(mo34828a = "has_more")
    private int hasMore;
    @C17952c(mo34828a = "max_cursor")
    private long maxCursor;
    @C17952c(mo34828a = "min_cursor")
    private long minCursor;
    String requestId;

    public List<C32415c> getDynamicList() {
        return this.dynamicList;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setDynamicList(List<C32415c> list) {
        this.dynamicList = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setRequestId(String str) {
        this.requestId = str;
        if (!C47917gi.m103681a((Collection<? extends T>) this.dynamicList)) {
            for (C32415c cVar : this.dynamicList) {
                if (cVar != null) {
                    cVar.setRequestId(str);
                }
            }
        }
    }
}
