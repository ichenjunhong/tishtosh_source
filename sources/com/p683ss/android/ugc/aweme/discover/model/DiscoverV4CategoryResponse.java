package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse */
public final class DiscoverV4CategoryResponse {
    public BannerList bannerList;
    @C17952c(mo34828a = "category_list")
    public final List<DiscoverCategoryStructV4> categoryList;
    @C17952c(mo34828a = "log_pb")
    public final LogPbBean logPb;
    @C17952c(mo34828a = "trending_hashtag_list")
    public final List<DiscoverV4TrendingCategoryStructV4> trendingList;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4>, for r1v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse copy$default(com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse r0, java.util.List<com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r1, java.util.List<com.p683ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4> r2, com.p683ss.android.ugc.aweme.feed.model.LogPbBean r3, com.p683ss.android.ugc.aweme.discover.model.BannerList r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r1 = r0.categoryList
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4> r2 = r0.trendingList
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r0.logPb
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.discover.model.BannerList r4 = r0.bannerList
        L_0x0018:
            com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse, java.util.List, java.util.List, com.ss.android.ugc.aweme.feed.model.LogPbBean, com.ss.android.ugc.aweme.discover.model.BannerList, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse");
    }

    public final DiscoverV4CategoryResponse copy(List<DiscoverCategoryStructV4> list, List<DiscoverV4TrendingCategoryStructV4> list2, LogPbBean logPbBean, BannerList bannerList2) {
        return new DiscoverV4CategoryResponse(list, list2, logPbBean, bannerList2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.bannerList, (java.lang.Object) r3.bannerList) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse r3 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse) r3
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r0 = r2.categoryList
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r1 = r3.categoryList
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4> r0 = r2.trendingList
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4> r1 = r3.trendingList
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r2.logPb
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = r3.logPb
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.discover.model.BannerList r0 = r2.bannerList
            com.ss.android.ugc.aweme.discover.model.BannerList r3 = r3.bannerList
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<DiscoverCategoryStructV4> list = this.categoryList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<DiscoverV4TrendingCategoryStructV4> list2 = this.trendingList;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode3 = (hashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31;
        BannerList bannerList2 = this.bannerList;
        if (bannerList2 != null) {
            i = bannerList2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4CategoryResponse(categoryList=");
        sb.append(this.categoryList);
        sb.append(", trendingList=");
        sb.append(this.trendingList);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(", bannerList=");
        sb.append(this.bannerList);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4CategoryResponse(List<DiscoverCategoryStructV4> list, List<DiscoverV4TrendingCategoryStructV4> list2, LogPbBean logPbBean, BannerList bannerList2) {
        this.categoryList = list;
        this.trendingList = list2;
        this.logPb = logPbBean;
        this.bannerList = bannerList2;
    }

    public /* synthetic */ DiscoverV4CategoryResponse(List list, List list2, LogPbBean logPbBean, BannerList bannerList2, int i, C52707g gVar) {
        if ((i & 8) != 0) {
            bannerList2 = null;
        }
        this(list, list2, logPbBean, bannerList2);
    }
}
