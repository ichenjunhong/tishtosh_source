package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ab */
public final class C39096ab implements Serializable {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    private final String f99728a;
    @C17952c(mo34828a = "content_url")

    /* renamed from: b */
    private final String f99729b;

    public static /* synthetic */ C39096ab copy$default(C39096ab abVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abVar.f99728a;
        }
        if ((i & 2) != 0) {
            str2 = abVar.f99729b;
        }
        return abVar.copy(str, str2);
    }

    public final String component1() {
        return this.f99728a;
    }

    public final String component2() {
        return this.f99729b;
    }

    public final C39096ab copy(String str, String str2) {
        return new C39096ab(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f99729b, (java.lang.Object) r3.f99729b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.model.C39096ab
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.model.ab r3 = (com.p683ss.android.ugc.aweme.poi.model.C39096ab) r3
            java.lang.String r0 = r2.f99728a
            java.lang.String r1 = r3.f99728a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f99729b
            java.lang.String r3 = r3.f99729b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.C39096ab.equals(java.lang.Object):boolean");
    }

    public final String getContent() {
        return this.f99728a;
    }

    public final String getContentUrl() {
        return this.f99729b;
    }

    public final int hashCode() {
        String str = this.f99728a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f99729b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiMicroAppLink(content=");
        sb.append(this.f99728a);
        sb.append(", contentUrl=");
        sb.append(this.f99729b);
        sb.append(")");
        return sb.toString();
    }

    public C39096ab(String str, String str2) {
        this.f99728a = str;
        this.f99729b = str2;
    }
}
