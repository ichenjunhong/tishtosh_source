package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Stat */
public final class Stat {
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "schema")
    public String scheme;
    @C17952c(mo34828a = "stats_detail")
    public List<StatText> statDetails;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.StatText>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.model.Stat copy$default(com.p683ss.android.ugc.aweme.discover.model.Stat r0, java.lang.String r1, java.lang.String r2, java.util.List<com.p683ss.android.ugc.aweme.discover.model.StatText> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r1 = r0.name
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            java.lang.String r2 = r0.scheme
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.util.List<com.ss.android.ugc.aweme.discover.model.StatText> r3 = r0.statDetails
        L_0x0012:
            com.ss.android.ugc.aweme.discover.model.Stat r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.Stat.copy$default(com.ss.android.ugc.aweme.discover.model.Stat, java.lang.String, java.lang.String, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.Stat");
    }

    public final Stat copy(String str, String str2, List<StatText> list) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(str2, "scheme");
        return new Stat(str, str2, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.statDetails, (java.lang.Object) r3.statDetails) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.Stat
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.discover.model.Stat r3 = (com.p683ss.android.ugc.aweme.discover.model.Stat) r3
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.scheme
            java.lang.String r1 = r3.scheme
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<com.ss.android.ugc.aweme.discover.model.StatText> r0 = r2.statDetails
            java.util.List<com.ss.android.ugc.aweme.discover.model.StatText> r3 = r3.statDetails
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.Stat.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.scheme;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<StatText> list = this.statDetails;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stat(name=");
        sb.append(this.name);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(", statDetails=");
        sb.append(this.statDetails);
        sb.append(")");
        return sb.toString();
    }

    public final void setName(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.name = str;
    }

    public final void setScheme(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.scheme = str;
    }

    public Stat(String str, String str2, List<StatText> list) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(str2, "scheme");
        this.name = str;
        this.scheme = str2;
        this.statDetails = list;
    }
}
