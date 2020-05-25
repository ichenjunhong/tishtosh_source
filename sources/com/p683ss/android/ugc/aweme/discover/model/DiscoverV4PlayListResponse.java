package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse */
public final class DiscoverV4PlayListResponse extends BaseResponse {
    public BannerList bannerList;
    @C17952c(mo34828a = "cells")
    public final List<DiscoverPlayListStructV4> cells;
    @C17952c(mo34828a = "has_more")
    public final int hasMore;
    @C17952c(mo34828a = "log_pb")
    public final LogPbBean logPb;
    @C17952c(mo34828a = "next_cursor")
    public final int nextCursor;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4>, for r6v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse copy$default(com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r3, int r4, int r5, java.util.List<com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r6, com.p683ss.android.ugc.aweme.feed.model.LogPbBean r7, com.p683ss.android.ugc.aweme.discover.model.BannerList r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            int r4 = r3.nextCursor
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            int r5 = r3.hasMore
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r6 = r3.cells
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.feed.model.LogPbBean r7 = r3.logPb
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.discover.model.BannerList r8 = r3.bannerList
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse, int, int, java.util.List, com.ss.android.ugc.aweme.feed.model.LogPbBean, com.ss.android.ugc.aweme.discover.model.BannerList, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse");
    }

    public final DiscoverV4PlayListResponse copy(int i, int i2, List<DiscoverPlayListStructV4> list, LogPbBean logPbBean, BannerList bannerList2) {
        C52711k.m112240b(logPbBean, "logPb");
        DiscoverV4PlayListResponse discoverV4PlayListResponse = new DiscoverV4PlayListResponse(i, i2, list, logPbBean, bannerList2);
        return discoverV4PlayListResponse;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverV4PlayListResponse) {
                DiscoverV4PlayListResponse discoverV4PlayListResponse = (DiscoverV4PlayListResponse) obj;
                if (this.nextCursor == discoverV4PlayListResponse.nextCursor) {
                    if (!(this.hasMore == discoverV4PlayListResponse.hasMore) || !C52711k.m112239a((Object) this.cells, (Object) discoverV4PlayListResponse.cells) || !C52711k.m112239a((Object) this.logPb, (Object) discoverV4PlayListResponse.logPb) || !C52711k.m112239a((Object) this.bannerList, (Object) discoverV4PlayListResponse.bannerList)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.nextCursor) * 31) + Integer.hashCode(this.hasMore)) * 31;
        List<DiscoverPlayListStructV4> list = this.cells;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode3 = (hashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31;
        BannerList bannerList2 = this.bannerList;
        if (bannerList2 != null) {
            i = bannerList2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4PlayListResponse(nextCursor=");
        sb.append(this.nextCursor);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", cells=");
        sb.append(this.cells);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(", bannerList=");
        sb.append(this.bannerList);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4PlayListResponse(int i, int i2, List<DiscoverPlayListStructV4> list, LogPbBean logPbBean, BannerList bannerList2) {
        C52711k.m112240b(logPbBean, "logPb");
        this.nextCursor = i;
        this.hasMore = i2;
        this.cells = list;
        this.logPb = logPbBean;
        this.bannerList = bannerList2;
    }

    public /* synthetic */ DiscoverV4PlayListResponse(int i, int i2, List list, LogPbBean logPbBean, BannerList bannerList2, int i3, C52707g gVar) {
        if ((i3 & 16) != 0) {
            bannerList2 = null;
        }
        this(i, i2, list, logPbBean, bannerList2);
    }
}
