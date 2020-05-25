package com.bytedance.ies.bullet.p628b.p633e;

import android.net.Uri;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.w */
public final class C10310w {

    /* renamed from: a */
    public final Uri f27712a;

    /* renamed from: b */
    public final C10326b f27713b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f27713b, (java.lang.Object) r3.f27713b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bytedance.ies.bullet.p628b.p633e.C10310w
            if (r0 == 0) goto L_0x001d
            com.bytedance.ies.bullet.b.e.w r3 = (com.bytedance.ies.bullet.p628b.p633e.C10310w) r3
            android.net.Uri r0 = r2.f27712a
            android.net.Uri r1 = r3.f27712a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bytedance.ies.bullet.b.g.a.b r0 = r2.f27713b
            com.bytedance.ies.bullet.b.g.a.b r3 = r3.f27713b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p628b.p633e.C10310w.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Uri uri = this.f27712a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        C10326b bVar = this.f27713b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KitProcessUnit(uri=");
        sb.append(this.f27712a);
        sb.append(", providerFactory=");
        sb.append(this.f27713b);
        sb.append(")");
        return sb.toString();
    }

    public C10310w(Uri uri, C10326b bVar) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(bVar, "providerFactory");
        this.f27712a = uri;
        this.f27713b = bVar;
    }
}
