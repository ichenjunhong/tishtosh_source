package com.p683ss.android.ugc.aweme;

import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.aq */
public interface C23189aq {

    /* renamed from: com.ss.android.ugc.aweme.aq$a */
    public static final class C23190a {

        /* renamed from: a */
        public final String f61653a;

        /* renamed from: b */
        public final C24477c f61654b;

        /* renamed from: c */
        public final C52671b<Boolean, C52860x> f61655c;

        public C23190a() {
            this(null, null, null, 7, null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f61655c, (java.lang.Object) r3.f61655c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.C23189aq.C23190a
                if (r0 == 0) goto L_0x0027
                com.ss.android.ugc.aweme.aq$a r3 = (com.p683ss.android.ugc.aweme.C23189aq.C23190a) r3
                java.lang.String r0 = r2.f61653a
                java.lang.String r1 = r3.f61653a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0027
                com.ss.android.ugc.aweme.c r0 = r2.f61654b
                com.ss.android.ugc.aweme.c r1 = r3.f61654b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0027
                d.f.a.b<java.lang.Boolean, d.x> r0 = r2.f61655c
                d.f.a.b<java.lang.Boolean, d.x> r3 = r3.f61655c
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.C23189aq.C23190a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f61653a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C24477c cVar = this.f61654b;
            int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
            C52671b<Boolean, C52860x> bVar = this.f61655c;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountShareConfig(uri=");
            sb.append(this.f61653a);
            sb.append(", dataModel=");
            sb.append(this.f61654b);
            sb.append(", listener=");
            sb.append(this.f61655c);
            sb.append(")");
            return sb.toString();
        }

        public C23190a(String str, C24477c cVar, C52671b<? super Boolean, C52860x> bVar) {
            this.f61653a = str;
            this.f61654b = cVar;
            this.f61655c = bVar;
        }

        private /* synthetic */ C23190a(String str, C24477c cVar, C52671b bVar, int i, C52707g gVar) {
            this(null, null, null);
        }
    }

    void clearSharedAccount(C52671b<? super Boolean, C52860x> bVar);

    String getSessionKey();

    void saveSharedAccount(C23190a aVar);
}
