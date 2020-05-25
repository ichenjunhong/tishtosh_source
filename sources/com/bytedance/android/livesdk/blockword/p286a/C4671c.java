package com.bytedance.android.livesdk.blockword.p286a;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.blockword.a.c */
public final class C4671c {
    @C17952c(mo34828a = "word")

    /* renamed from: a */
    public final List<C4669a> f12739a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f12739a, (java.lang.Object) ((com.bytedance.android.livesdk.blockword.p286a.C4671c) r2).f12739a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.android.livesdk.blockword.p286a.C4671c
            if (r0 == 0) goto L_0x0013
            com.bytedance.android.livesdk.blockword.a.c r2 = (com.bytedance.android.livesdk.blockword.p286a.C4671c) r2
            java.util.List<com.bytedance.android.livesdk.blockword.a.a> r0 = r1.f12739a
            java.util.List<com.bytedance.android.livesdk.blockword.a.a> r2 = r2.f12739a
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.blockword.p286a.C4671c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C4669a> list = this.f12739a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockWordGetResponse(words=");
        sb.append(this.f12739a);
        sb.append(")");
        return sb.toString();
    }
}
