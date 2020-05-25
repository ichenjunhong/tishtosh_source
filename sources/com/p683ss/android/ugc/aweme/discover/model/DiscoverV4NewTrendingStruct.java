package com.p683ss.android.ugc.aweme.discover.model;

import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct */
public final class DiscoverV4NewTrendingStruct {
    public static final Companion Companion = new Companion(null);
    public final BannerList bannerList;
    public final Category category;
    public final List<DiscoverPlayListStructV4> cellList;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct copy$default(com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct r0, com.p683ss.android.ugc.aweme.discover.model.Category r1, com.p683ss.android.ugc.aweme.discover.model.BannerList r2, java.util.List<com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            com.ss.android.ugc.aweme.discover.model.Category r1 = r0.category
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.discover.model.BannerList r2 = r0.bannerList
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r3 = r0.cellList
        L_0x0012:
            com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct, com.ss.android.ugc.aweme.discover.model.Category, com.ss.android.ugc.aweme.discover.model.BannerList, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct");
    }

    public final DiscoverV4NewTrendingStruct copy(Category category2, BannerList bannerList2, List<DiscoverPlayListStructV4> list) {
        return new DiscoverV4NewTrendingStruct(category2, bannerList2, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.cellList, (java.lang.Object) r3.cellList) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct r3 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct) r3
            com.ss.android.ugc.aweme.discover.model.Category r0 = r2.category
            com.ss.android.ugc.aweme.discover.model.Category r1 = r3.category
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.discover.model.BannerList r0 = r2.bannerList
            com.ss.android.ugc.aweme.discover.model.BannerList r1 = r3.bannerList
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r0 = r2.cellList
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r3 = r3.cellList
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Category category2 = this.category;
        int i = 0;
        int hashCode = (category2 != null ? category2.hashCode() : 0) * 31;
        BannerList bannerList2 = this.bannerList;
        int hashCode2 = (hashCode + (bannerList2 != null ? bannerList2.hashCode() : 0)) * 31;
        List<DiscoverPlayListStructV4> list = this.cellList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4NewTrendingStruct(category=");
        sb.append(this.category);
        sb.append(", bannerList=");
        sb.append(this.bannerList);
        sb.append(", cellList=");
        sb.append(this.cellList);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4NewTrendingStruct(Category category2, BannerList bannerList2, List<DiscoverPlayListStructV4> list) {
        this.category = category2;
        this.bannerList = bannerList2;
        this.cellList = list;
    }
}
