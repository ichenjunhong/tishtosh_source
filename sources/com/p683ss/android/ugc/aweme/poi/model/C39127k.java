package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.k */
public final class C39127k implements Serializable {
    @C17952c(mo34828a = "code")
    public String code;
    @C17952c(mo34828a = "name")
    public String name;

    public C39127k() {
    }

    public static /* synthetic */ C39127k copy$default(C39127k kVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kVar.code;
        }
        if ((i & 2) != 0) {
            str2 = kVar.name;
        }
        return kVar.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final C39127k copy(String str, String str2) {
        return new C39127k(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.model.C39127k
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.model.k r3 = (com.p683ss.android.ugc.aweme.poi.model.C39127k) r3
            java.lang.String r0 = r2.code
            java.lang.String r1 = r3.code
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.name
            java.lang.String r3 = r3.name
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.C39127k.equals(java.lang.Object):boolean");
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiBackendType(code=");
        sb.append(this.code);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(")");
        return sb.toString();
    }

    public C39127k(String str, String str2) {
        this.code = str;
        this.name = str2;
    }
}
