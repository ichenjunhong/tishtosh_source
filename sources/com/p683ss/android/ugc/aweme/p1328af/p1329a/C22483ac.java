package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22530t;
import java.util.Map;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52760c;

/* renamed from: com.ss.android.ugc.aweme.af.a.ac */
public final class C22483ac<T extends C22530t> {

    /* renamed from: a */
    public final C52760c<T> f60588a;

    /* renamed from: b */
    public final C52686q<Uri, C22509g, Map<String, String>, T> f60589b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f60589b, (java.lang.Object) r3.f60589b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1328af.p1329a.C22483ac
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.af.a.ac r3 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22483ac) r3
            d.k.c<T> r0 = r2.f60588a
            d.k.c<T> r1 = r3.f60588a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            d.f.a.q<android.net.Uri, com.ss.android.ugc.aweme.af.a.g, java.util.Map<java.lang.String, java.lang.String>, T> r0 = r2.f60589b
            d.f.a.q<android.net.Uri, com.ss.android.ugc.aweme.af.a.g, java.util.Map<java.lang.String, java.lang.String>, T> r3 = r3.f60589b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1328af.p1329a.C22483ac.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C52760c<T> cVar = this.f60588a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C52686q<Uri, C22509g, Map<String, String>, T> qVar = this.f60589b;
        if (qVar != null) {
            i = qVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionApi(iApi=");
        sb.append(this.f60588a);
        sb.append(", provider=");
        sb.append(this.f60589b);
        sb.append(")");
        return sb.toString();
    }

    public C22483ac(C52760c<T> cVar, C52686q<? super Uri, ? super C22509g, ? super Map<String, String>, ? extends T> qVar) {
        C52711k.m112240b(cVar, "iApi");
        C52711k.m112240b(qVar, "provider");
        this.f60588a = cVar;
        this.f60589b = qVar;
    }
}
