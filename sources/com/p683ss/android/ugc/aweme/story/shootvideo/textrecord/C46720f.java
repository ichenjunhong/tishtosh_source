package com.p683ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.f */
public final class C46720f {
    @C17952c(mo34828a = "keyword")

    /* renamed from: a */
    public final String f117850a;
    @C17952c(mo34828a = "lang")

    /* renamed from: b */
    public final String f117851b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f117851b, (java.lang.Object) r3.f117851b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46720f
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.f r3 = (com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46720f) r3
            java.lang.String r0 = r2.f117850a
            java.lang.String r1 = r3.f117850a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f117851b
            java.lang.String r3 = r3.f117851b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46720f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f117850a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f117851b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextWikiAnchor(keyword=");
        sb.append(this.f117850a);
        sb.append(", lang=");
        sb.append(this.f117851b);
        sb.append(")");
        return sb.toString();
    }

    public C46720f(String str, String str2) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "lang");
        this.f117850a = str;
        this.f117851b = str2;
    }
}
