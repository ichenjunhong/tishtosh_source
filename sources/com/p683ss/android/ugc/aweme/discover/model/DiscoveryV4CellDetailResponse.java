package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse */
public final class DiscoveryV4CellDetailResponse extends BaseResponse {
    @C17952c(mo34828a = "aweme_list")
    public final List<Aweme> awemeList;
    @C17952c(mo34828a = "has_more")
    public final boolean hasMore;
    @C17952c(mo34828a = "log_pb")
    public final LogPbBean logPb;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse copy$default(com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse r0, java.util.List<com.p683ss.android.ugc.aweme.feed.model.Aweme> r1, boolean r2, com.p683ss.android.ugc.aweme.feed.model.LogPbBean r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.awemeList
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            boolean r2 = r0.hasMore
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r0.logPb
        L_0x0012:
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse, java.util.List, boolean, com.ss.android.ugc.aweme.feed.model.LogPbBean, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse");
    }

    public final DiscoveryV4CellDetailResponse copy(List<Aweme> list, boolean z, LogPbBean logPbBean) {
        C52711k.m112240b(logPbBean, "logPb");
        return new DiscoveryV4CellDetailResponse(list, z, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoveryV4CellDetailResponse) {
                DiscoveryV4CellDetailResponse discoveryV4CellDetailResponse = (DiscoveryV4CellDetailResponse) obj;
                if (C52711k.m112239a((Object) this.awemeList, (Object) discoveryV4CellDetailResponse.awemeList)) {
                    if (!(this.hasMore == discoveryV4CellDetailResponse.hasMore) || !C52711k.m112239a((Object) this.logPb, (Object) discoveryV4CellDetailResponse.logPb)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<Aweme> list = this.awemeList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryV4CellDetailResponse(awemeList=");
        sb.append(this.awemeList);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(")");
        return sb.toString();
    }

    public DiscoveryV4CellDetailResponse(List<Aweme> list, boolean z, LogPbBean logPbBean) {
        C52711k.m112240b(logPbBean, "logPb");
        this.awemeList = list;
        this.hasMore = z;
        this.logPb = logPbBean;
    }

    public /* synthetic */ DiscoveryV4CellDetailResponse(List list, boolean z, LogPbBean logPbBean, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            z = true;
        }
        this(list, z, logPbBean);
    }
}
