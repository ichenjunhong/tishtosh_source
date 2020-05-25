package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ViewMoreStat */
public final class ViewMoreStat {
    @C17952c(mo34828a = "schema")
    public String scheme;
    @C17952c(mo34828a = "title")
    public String title;

    public static /* synthetic */ ViewMoreStat copy$default(ViewMoreStat viewMoreStat, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewMoreStat.title;
        }
        if ((i & 2) != 0) {
            str2 = viewMoreStat.scheme;
        }
        return viewMoreStat.copy(str, str2);
    }

    public final ViewMoreStat copy(String str, String str2) {
        C52711k.m112240b(str2, "scheme");
        return new ViewMoreStat(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.scheme, (java.lang.Object) r3.scheme) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.ViewMoreStat
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.model.ViewMoreStat r3 = (com.p683ss.android.ugc.aweme.discover.model.ViewMoreStat) r3
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.scheme
            java.lang.String r3 = r3.scheme
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.ViewMoreStat.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.scheme;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewMoreStat(title=");
        sb.append(this.title);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(")");
        return sb.toString();
    }

    public final void setScheme(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.scheme = str;
    }

    public ViewMoreStat(String str, String str2) {
        C52711k.m112240b(str2, "scheme");
        this.title = str;
        this.scheme = str2;
    }
}
