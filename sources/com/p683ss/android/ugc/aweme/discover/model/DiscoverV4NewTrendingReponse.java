package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingReponse */
public final class DiscoverV4NewTrendingReponse extends BaseResponse {
    public BannerList bannerList;
    @C17952c(mo34828a = "category_list")
    public final List<Category> categoryList;
    @C17952c(mo34828a = "has_more")
    public final int hasMore;
    @C17952c(mo34828a = "next_cursor")
    public final int nextCursor;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.Category>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingReponse copy$default(com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingReponse r0, int r1, int r2, java.util.List<com.p683ss.android.ugc.aweme.discover.model.Category> r3, com.p683ss.android.ugc.aweme.discover.model.BannerList r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            int r1 = r0.nextCursor
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            int r2 = r0.hasMore
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.util.List<com.ss.android.ugc.aweme.discover.model.Category> r3 = r0.categoryList
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.discover.model.BannerList r4 = r0.bannerList
        L_0x0018:
            com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingReponse r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingReponse.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingReponse, int, int, java.util.List, com.ss.android.ugc.aweme.discover.model.BannerList, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingReponse");
    }

    public final DiscoverV4NewTrendingReponse copy(int i, int i2, List<? extends Category> list, BannerList bannerList2) {
        return new DiscoverV4NewTrendingReponse(i, i2, list, bannerList2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverV4NewTrendingReponse) {
                DiscoverV4NewTrendingReponse discoverV4NewTrendingReponse = (DiscoverV4NewTrendingReponse) obj;
                if (this.nextCursor == discoverV4NewTrendingReponse.nextCursor) {
                    if (!(this.hasMore == discoverV4NewTrendingReponse.hasMore) || !C52711k.m112239a((Object) this.categoryList, (Object) discoverV4NewTrendingReponse.categoryList) || !C52711k.m112239a((Object) this.bannerList, (Object) discoverV4NewTrendingReponse.bannerList)) {
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
        List<Category> list = this.categoryList;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        BannerList bannerList2 = this.bannerList;
        if (bannerList2 != null) {
            i = bannerList2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4NewTrendingReponse(nextCursor=");
        sb.append(this.nextCursor);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", categoryList=");
        sb.append(this.categoryList);
        sb.append(", bannerList=");
        sb.append(this.bannerList);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4NewTrendingReponse(int i, int i2, List<? extends Category> list, BannerList bannerList2) {
        this.nextCursor = i;
        this.hasMore = i2;
        this.categoryList = list;
        this.bannerList = bannerList2;
    }

    public /* synthetic */ DiscoverV4NewTrendingReponse(int i, int i2, List list, BannerList bannerList2, int i3, C52707g gVar) {
        if ((i3 & 8) != 0) {
            bannerList2 = null;
        }
        this(i, i2, list, bannerList2);
    }
}
