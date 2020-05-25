package com.p683ss.android.ugc.aweme.crossplatform.activity;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.g */
public final class C27112g {

    /* renamed from: d */
    public static final C27113a f71527d = new C27113a(null);

    /* renamed from: a */
    public final String f71528a;

    /* renamed from: b */
    public final String f71529b;

    /* renamed from: c */
    public final Integer f71530c;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.g$a */
    public static final class C27113a {
        private C27113a() {
        }

        public /* synthetic */ C27113a(C52707g gVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f71530c, (java.lang.Object) r3.f71530c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.crossplatform.activity.C27112g
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.crossplatform.activity.g r3 = (com.p683ss.android.ugc.aweme.crossplatform.activity.C27112g) r3
            java.lang.String r0 = r2.f71528a
            java.lang.String r1 = r3.f71528a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f71529b
            java.lang.String r1 = r3.f71529b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f71530c
            java.lang.Integer r3 = r3.f71530c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.activity.C27112g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f71528a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f71529b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f71530c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugUrlMessage(url=");
        sb.append(this.f71528a);
        sb.append(", message=");
        sb.append(this.f71529b);
        sb.append(", type=");
        sb.append(this.f71530c);
        sb.append(")");
        return sb.toString();
    }

    public C27112g(String str, String str2, Integer num) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "message");
        this.f71528a = str;
        this.f71529b = str2;
        this.f71530c = num;
    }

    public /* synthetic */ C27112g(String str, String str2, Integer num, int i, C52707g gVar) {
        this(str, str2, Integer.valueOf(0));
    }
}
