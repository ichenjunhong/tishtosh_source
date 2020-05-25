package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4 */
public final class DiscoverV4TrendingCategoryStructV4 {
    @C17952c(mo34828a = "cover_url")
    public final UrlModel coverUrl;
    @C17952c(mo34828a = "hashtag_text")
    public final String hashtagText;
    @C17952c(mo34828a = "hashtag_name")
    public final String hastagName;
    public LogPbBean logPb;

    public static /* synthetic */ DiscoverV4TrendingCategoryStructV4 copy$default(DiscoverV4TrendingCategoryStructV4 discoverV4TrendingCategoryStructV4, String str, String str2, UrlModel urlModel, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discoverV4TrendingCategoryStructV4.hastagName;
        }
        if ((i & 2) != 0) {
            str2 = discoverV4TrendingCategoryStructV4.hashtagText;
        }
        if ((i & 4) != 0) {
            urlModel = discoverV4TrendingCategoryStructV4.coverUrl;
        }
        if ((i & 8) != 0) {
            logPbBean = discoverV4TrendingCategoryStructV4.logPb;
        }
        return discoverV4TrendingCategoryStructV4.copy(str, str2, urlModel, logPbBean);
    }

    public final DiscoverV4TrendingCategoryStructV4 copy(String str, String str2, UrlModel urlModel, LogPbBean logPbBean) {
        C52711k.m112240b(str, "hastagName");
        return new DiscoverV4TrendingCategoryStructV4(str, str2, urlModel, logPbBean);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.logPb, (java.lang.Object) r3.logPb) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4 r3 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4) r3
            java.lang.String r0 = r2.hastagName
            java.lang.String r1 = r3.hastagName
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.hashtagText
            java.lang.String r1 = r3.hashtagText
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.coverUrl
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.coverUrl
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r2.logPb
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r3.logPb
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.hastagName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hashtagText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.coverUrl;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4TrendingCategoryStructV4(hastagName=");
        sb.append(this.hastagName);
        sb.append(", hashtagText=");
        sb.append(this.hashtagText);
        sb.append(", coverUrl=");
        sb.append(this.coverUrl);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4TrendingCategoryStructV4(String str, String str2, UrlModel urlModel, LogPbBean logPbBean) {
        C52711k.m112240b(str, "hastagName");
        this.hastagName = str;
        this.hashtagText = str2;
        this.coverUrl = urlModel;
        this.logPb = logPbBean;
    }

    public /* synthetic */ DiscoverV4TrendingCategoryStructV4(String str, String str2, UrlModel urlModel, LogPbBean logPbBean, int i, C52707g gVar) {
        if ((i & 8) != 0) {
            logPbBean = null;
        }
        this(str, str2, urlModel, logPbBean);
    }
}
