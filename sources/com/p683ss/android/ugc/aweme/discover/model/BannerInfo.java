package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.BannerInfo */
public final class BannerInfo {
    @C17952c(mo34828a = "bg_color")
    public String bgColor;
    @C17952c(mo34828a = "schema")
    public String scheme;
    @C17952c(mo34828a = "url")
    public String url;

    public static /* synthetic */ BannerInfo copy$default(BannerInfo bannerInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerInfo.url;
        }
        if ((i & 2) != 0) {
            str2 = bannerInfo.bgColor;
        }
        if ((i & 4) != 0) {
            str3 = bannerInfo.scheme;
        }
        return bannerInfo.copy(str, str2, str3);
    }

    public final BannerInfo copy(String str, String str2, String str3) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "bgColor");
        C52711k.m112240b(str3, "scheme");
        return new BannerInfo(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.scheme, (java.lang.Object) r3.scheme) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.BannerInfo
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.discover.model.BannerInfo r3 = (com.p683ss.android.ugc.aweme.discover.model.BannerInfo) r3
            java.lang.String r0 = r2.url
            java.lang.String r1 = r3.url
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.bgColor
            java.lang.String r1 = r3.bgColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.scheme
            java.lang.String r3 = r3.scheme
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.BannerInfo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bgColor;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.scheme;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerInfo(url=");
        sb.append(this.url);
        sb.append(", bgColor=");
        sb.append(this.bgColor);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(")");
        return sb.toString();
    }

    public final void setBgColor(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.bgColor = str;
    }

    public final void setScheme(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.scheme = str;
    }

    public final void setUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.url = str;
    }

    public BannerInfo(String str, String str2, String str3) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "bgColor");
        C52711k.m112240b(str3, "scheme");
        this.url = str;
        this.bgColor = str2;
        this.scheme = str3;
    }
}
