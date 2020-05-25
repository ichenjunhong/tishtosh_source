package com.p683ss.android.ugc.aweme.tutorial.p2374a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a.a */
public final class C47373a {
    @C17952c(mo34828a = "tutorial_id")

    /* renamed from: a */
    public final String f119549a;
    @C17952c(mo34828a = "cover")

    /* renamed from: b */
    public final UrlModel f119550b;
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    public final String f119551c;

    public C47373a() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f119551c, (java.lang.Object) r3.f119551c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.tutorial.p2374a.C47373a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.tutorial.a.a r3 = (com.p683ss.android.ugc.aweme.tutorial.p2374a.C47373a) r3
            java.lang.String r0 = r2.f119549a
            java.lang.String r1 = r3.f119549a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.f119550b
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.f119550b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f119551c
            java.lang.String r3 = r3.f119551c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tutorial.p2374a.C47373a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f119549a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f119550b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.f119551c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tutorial(tutorialId=");
        sb.append(this.f119549a);
        sb.append(", coverUri=");
        sb.append(this.f119550b);
        sb.append(", title=");
        sb.append(this.f119551c);
        sb.append(")");
        return sb.toString();
    }

    private C47373a(String str, UrlModel urlModel, String str2) {
        C52711k.m112240b(str, "tutorialId");
        C52711k.m112240b(str2, "title");
        this.f119549a = str;
        this.f119550b = urlModel;
        this.f119551c = str2;
    }

    private /* synthetic */ C47373a(String str, UrlModel urlModel, String str2, int i, C52707g gVar) {
        this("", null, "");
    }
}
