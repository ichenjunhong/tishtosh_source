package com.p683ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.t */
public final class C39136t implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    private final String f99869a;
    @C17952c(mo34828a = "title")

    /* renamed from: b */
    private final String f99870b;

    public static /* synthetic */ C39136t copy$default(C39136t tVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tVar.f99869a;
        }
        if ((i & 2) != 0) {
            str2 = tVar.f99870b;
        }
        return tVar.copy(str, str2);
    }

    public final String component1() {
        return this.f99869a;
    }

    public final String component2() {
        return this.f99870b;
    }

    public final C39136t copy(String str, String str2) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "title");
        return new C39136t(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f99870b, (java.lang.Object) r3.f99870b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.model.C39136t
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.model.t r3 = (com.p683ss.android.ugc.aweme.poi.model.C39136t) r3
            java.lang.String r0 = r2.f99869a
            java.lang.String r1 = r3.f99869a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f99870b
            java.lang.String r3 = r3.f99870b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.C39136t.equals(java.lang.Object):boolean");
    }

    public final String getId() {
        return this.f99869a;
    }

    public final String getTitle() {
        return this.f99870b;
    }

    public final int hashCode() {
        String str = this.f99869a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f99870b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiCouponActivityStruct(id=");
        sb.append(this.f99869a);
        sb.append(", title=");
        sb.append(this.f99870b);
        sb.append(")");
        return sb.toString();
    }

    public final boolean isValid() {
        if (!C9431p.m18664a(this.f99869a)) {
            return true;
        }
        return false;
    }

    public C39136t(String str, String str2) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "title");
        this.f99869a = str;
        this.f99870b = str2;
    }
}
