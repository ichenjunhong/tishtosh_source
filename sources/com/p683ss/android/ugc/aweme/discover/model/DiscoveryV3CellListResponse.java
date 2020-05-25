package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse */
public final class DiscoveryV3CellListResponse extends BaseResponse {
    @C17952c(mo34828a = "cells")
    public List<DiscoveryCellStructV3> cells;
    @C17952c(mo34828a = "has_more")
    public int hasMore;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "next_cursor")
    public int nextCursor;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse copy$default(com.p683ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse r0, int r1, java.util.List<com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3> r2, int r3, com.p683ss.android.ugc.aweme.feed.model.LogPbBean r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            int r1 = r0.nextCursor
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3> r2 = r0.cells
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            int r3 = r0.hasMore
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r0.logPb
        L_0x0018:
            com.ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse, int, java.util.List, int, com.ss.android.ugc.aweme.feed.model.LogPbBean, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse");
    }

    public final DiscoveryV3CellListResponse copy(int i, List<DiscoveryCellStructV3> list, int i2, LogPbBean logPbBean) {
        C52711k.m112240b(logPbBean, "logPb");
        return new DiscoveryV3CellListResponse(i, list, i2, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoveryV3CellListResponse) {
                DiscoveryV3CellListResponse discoveryV3CellListResponse = (DiscoveryV3CellListResponse) obj;
                if ((this.nextCursor == discoveryV3CellListResponse.nextCursor) && C52711k.m112239a((Object) this.cells, (Object) discoveryV3CellListResponse.cells)) {
                    if (!(this.hasMore == discoveryV3CellListResponse.hasMore) || !C52711k.m112239a((Object) this.logPb, (Object) discoveryV3CellListResponse.logPb)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.nextCursor) * 31;
        List<DiscoveryCellStructV3> list = this.cells;
        int i = 0;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.hasMore)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryV3CellListResponse(nextCursor=");
        sb.append(this.nextCursor);
        sb.append(", cells=");
        sb.append(this.cells);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(")");
        return sb.toString();
    }

    public final void setLogPb(LogPbBean logPbBean) {
        C52711k.m112240b(logPbBean, "<set-?>");
        this.logPb = logPbBean;
    }

    public DiscoveryV3CellListResponse(int i, List<DiscoveryCellStructV3> list, int i2, LogPbBean logPbBean) {
        C52711k.m112240b(logPbBean, "logPb");
        this.nextCursor = i;
        this.cells = list;
        this.hasMore = i2;
        this.logPb = logPbBean;
    }

    public /* synthetic */ DiscoveryV3CellListResponse(int i, List list, int i2, LogPbBean logPbBean, int i3, C52707g gVar) {
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        this(i, list, i2, logPbBean);
    }
}
