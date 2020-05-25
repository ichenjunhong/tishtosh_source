package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchOperationV2 */
public final class SearchOperationV2 {
    @C17952c(mo34828a = "banner_info")
    public BannerInfo bannerInfo;
    @C17952c(mo34828a = "doc_id")
    public String docId;
    @C17952c(mo34828a = "nav_info")
    public NavInfo navInfo;
    @C17952c(mo34828a = "stats_title")
    public List<String> statTitles;
    @C17952c(mo34828a = "stats_info")
    public List<Stat> stats;
    @C17952c(mo34828a = "tag_info")
    public List<Tag> tags;
    @C17952c(mo34828a = "update_time")
    public String updateTime;
    @C17952c(mo34828a = "stats_view_more")
    public ViewMoreStat viewMore;

    public static /* synthetic */ SearchOperationV2 copy$default(SearchOperationV2 searchOperationV2, BannerInfo bannerInfo2, NavInfo navInfo2, List list, List list2, List list3, ViewMoreStat viewMoreStat, String str, String str2, int i, Object obj) {
        SearchOperationV2 searchOperationV22 = searchOperationV2;
        int i2 = i;
        return searchOperationV2.copy((i2 & 1) != 0 ? searchOperationV22.bannerInfo : bannerInfo2, (i2 & 2) != 0 ? searchOperationV22.navInfo : navInfo2, (i2 & 4) != 0 ? searchOperationV22.tags : list, (i2 & 8) != 0 ? searchOperationV22.stats : list2, (i2 & 16) != 0 ? searchOperationV22.statTitles : list3, (i2 & 32) != 0 ? searchOperationV22.viewMore : viewMoreStat, (i2 & 64) != 0 ? searchOperationV22.updateTime : str, (i2 & 128) != 0 ? searchOperationV22.docId : str2);
    }

    public final SearchOperationV2 copy(BannerInfo bannerInfo2, NavInfo navInfo2, List<Tag> list, List<Stat> list2, List<String> list3, ViewMoreStat viewMoreStat, String str, String str2) {
        List<Tag> list4 = list;
        C52711k.m112240b(list, C42311c.f106869m);
        SearchOperationV2 searchOperationV2 = new SearchOperationV2(bannerInfo2, navInfo2, list4, list2, list3, viewMoreStat, str, str2);
        return searchOperationV2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.docId, (java.lang.Object) r3.docId) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005b
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.SearchOperationV2
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.discover.model.SearchOperationV2 r3 = (com.p683ss.android.ugc.aweme.discover.model.SearchOperationV2) r3
            com.ss.android.ugc.aweme.discover.model.BannerInfo r0 = r2.bannerInfo
            com.ss.android.ugc.aweme.discover.model.BannerInfo r1 = r3.bannerInfo
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.discover.model.NavInfo r0 = r2.navInfo
            com.ss.android.ugc.aweme.discover.model.NavInfo r1 = r3.navInfo
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.util.List<com.ss.android.ugc.aweme.discover.model.Tag> r0 = r2.tags
            java.util.List<com.ss.android.ugc.aweme.discover.model.Tag> r1 = r3.tags
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.util.List<com.ss.android.ugc.aweme.discover.model.Stat> r0 = r2.stats
            java.util.List<com.ss.android.ugc.aweme.discover.model.Stat> r1 = r3.stats
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.util.List<java.lang.String> r0 = r2.statTitles
            java.util.List<java.lang.String> r1 = r3.statTitles
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.discover.model.ViewMoreStat r0 = r2.viewMore
            com.ss.android.ugc.aweme.discover.model.ViewMoreStat r1 = r3.viewMore
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.updateTime
            java.lang.String r1 = r3.updateTime
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.docId
            java.lang.String r3 = r3.docId
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.SearchOperationV2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        BannerInfo bannerInfo2 = this.bannerInfo;
        int i = 0;
        int hashCode = (bannerInfo2 != null ? bannerInfo2.hashCode() : 0) * 31;
        NavInfo navInfo2 = this.navInfo;
        int hashCode2 = (hashCode + (navInfo2 != null ? navInfo2.hashCode() : 0)) * 31;
        List<Tag> list = this.tags;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<Stat> list2 = this.stats;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.statTitles;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        ViewMoreStat viewMoreStat = this.viewMore;
        int hashCode6 = (hashCode5 + (viewMoreStat != null ? viewMoreStat.hashCode() : 0)) * 31;
        String str = this.updateTime;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.docId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchOperationV2(bannerInfo=");
        sb.append(this.bannerInfo);
        sb.append(", navInfo=");
        sb.append(this.navInfo);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", stats=");
        sb.append(this.stats);
        sb.append(", statTitles=");
        sb.append(this.statTitles);
        sb.append(", viewMore=");
        sb.append(this.viewMore);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", docId=");
        sb.append(this.docId);
        sb.append(")");
        return sb.toString();
    }

    public final void setTags(List<Tag> list) {
        C52711k.m112240b(list, "<set-?>");
        this.tags = list;
    }

    public SearchOperationV2(BannerInfo bannerInfo2, NavInfo navInfo2, List<Tag> list, List<Stat> list2, List<String> list3, ViewMoreStat viewMoreStat, String str, String str2) {
        C52711k.m112240b(list, C42311c.f106869m);
        this.bannerInfo = bannerInfo2;
        this.navInfo = navInfo2;
        this.tags = list;
        this.stats = list2;
        this.statTitles = list3;
        this.viewMore = viewMoreStat;
        this.updateTime = str;
        this.docId = str2;
    }
}
