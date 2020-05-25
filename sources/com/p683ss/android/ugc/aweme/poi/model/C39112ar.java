package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ar */
public final class C39112ar implements Serializable {
    @C17952c(mo34828a = "schema_type")

    /* renamed from: a */
    private final Integer f99777a;
    @C17952c(mo34828a = "url")

    /* renamed from: b */
    private final String f99778b;
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    private final String f99779c;

    public static /* synthetic */ C39112ar copy$default(C39112ar arVar, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = arVar.f99777a;
        }
        if ((i & 2) != 0) {
            str = arVar.f99778b;
        }
        if ((i & 4) != 0) {
            str2 = arVar.f99779c;
        }
        return arVar.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.f99777a;
    }

    public final String component2() {
        return this.f99778b;
    }

    public final String component3() {
        return this.f99779c;
    }

    public final C39112ar copy(Integer num, String str, String str2) {
        return new C39112ar(num, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f99779c, (java.lang.Object) r3.f99779c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.model.C39112ar
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.poi.model.ar r3 = (com.p683ss.android.ugc.aweme.poi.model.C39112ar) r3
            java.lang.Integer r0 = r2.f99777a
            java.lang.Integer r1 = r3.f99777a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f99778b
            java.lang.String r1 = r3.f99778b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f99779c
            java.lang.String r3 = r3.f99779c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.C39112ar.equals(java.lang.Object):boolean");
    }

    public final Integer getSchemaType() {
        return this.f99777a;
    }

    public final String getTitle() {
        return this.f99779c;
    }

    public final String getUrl() {
        return this.f99778b;
    }

    public final int hashCode() {
        Integer num = this.f99777a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f99778b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f99779c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiSpu(schemaType=");
        sb.append(this.f99777a);
        sb.append(", url=");
        sb.append(this.f99778b);
        sb.append(", title=");
        sb.append(this.f99779c);
        sb.append(")");
        return sb.toString();
    }

    public C39112ar(Integer num, String str, String str2) {
        this.f99777a = num;
        this.f99778b = str;
        this.f99779c = str2;
    }
}
