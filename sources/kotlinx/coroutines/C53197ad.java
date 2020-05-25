package kotlinx.coroutines;

import p2628d.p2631c.C52599a;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: kotlinx.coroutines.ad */
public final class C53197ad extends C52599a {

    /* renamed from: b */
    public static final C53198a f131772b = new C53198a(null);

    /* renamed from: a */
    public final String f131773a;

    /* renamed from: kotlinx.coroutines.ad$a */
    public static final class C53198a implements C52633c<C53197ad> {
        private C53198a() {
        }

        public /* synthetic */ C53198a(C52707g gVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f131773a, (java.lang.Object) ((kotlinx.coroutines.C53197ad) r2).f131773a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof kotlinx.coroutines.C53197ad
            if (r0 == 0) goto L_0x0013
            kotlinx.coroutines.ad r2 = (kotlinx.coroutines.C53197ad) r2
            java.lang.String r0 = r1.f131773a
            java.lang.String r2 = r2.f131773a
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53197ad.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f131773a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineName(");
        sb.append(this.f131773a);
        sb.append(')');
        return sb.toString();
    }
}
