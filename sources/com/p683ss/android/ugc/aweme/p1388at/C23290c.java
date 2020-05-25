package com.p683ss.android.ugc.aweme.p1388at;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.at.c */
public final class C23290c implements Serializable {
    @C17952c(mo34828a = "photo_path")

    /* renamed from: a */
    private final String f62275a;
    @C17952c(mo34828a = "algorithm")

    /* renamed from: b */
    private final String f62276b;
    @C17952c(mo34828a = "filePath")

    /* renamed from: c */
    private final String f62277c;
    @C17952c(mo34828a = "jsonParams")

    /* renamed from: d */
    private final String f62278d;

    public static /* synthetic */ C23290c copy$default(C23290c cVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f62275a;
        }
        if ((i & 2) != 0) {
            str2 = cVar.f62276b;
        }
        if ((i & 4) != 0) {
            str3 = cVar.f62277c;
        }
        if ((i & 8) != 0) {
            str4 = cVar.f62278d;
        }
        return cVar.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f62275a;
    }

    public final String component2() {
        return this.f62276b;
    }

    public final String component3() {
        return this.f62277c;
    }

    public final String component4() {
        return this.f62278d;
    }

    public final C23290c copy(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "photonPath");
        C52711k.m112240b(str2, "algorithm");
        C52711k.m112240b(str3, "filePath");
        C52711k.m112240b(str4, "jsonParams");
        return new C23290c(str, str2, str3, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f62278d, (java.lang.Object) r3.f62278d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1388at.C23290c
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.at.c r3 = (com.p683ss.android.ugc.aweme.p1388at.C23290c) r3
            java.lang.String r0 = r2.f62275a
            java.lang.String r1 = r3.f62275a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f62276b
            java.lang.String r1 = r3.f62276b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f62277c
            java.lang.String r1 = r3.f62277c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f62278d
            java.lang.String r3 = r3.f62278d
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1388at.C23290c.equals(java.lang.Object):boolean");
    }

    public final String getAlgorithm() {
        return this.f62276b;
    }

    public final String getFilePath() {
        return this.f62277c;
    }

    public final String getJsonParams() {
        return this.f62278d;
    }

    public final String getPhotonPath() {
        return this.f62275a;
    }

    public final int hashCode() {
        String str = this.f62275a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f62276b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f62277c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f62278d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MvNetFileBean(photonPath=");
        sb.append(this.f62275a);
        sb.append(", algorithm=");
        sb.append(this.f62276b);
        sb.append(", filePath=");
        sb.append(this.f62277c);
        sb.append(", jsonParams=");
        sb.append(this.f62278d);
        sb.append(")");
        return sb.toString();
    }

    public C23290c(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "photonPath");
        C52711k.m112240b(str2, "algorithm");
        C52711k.m112240b(str3, "filePath");
        C52711k.m112240b(str4, "jsonParams");
        this.f62275a = str;
        this.f62276b = str2;
        this.f62277c = str3;
        this.f62278d = str4;
    }
}
