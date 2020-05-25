package com.p683ss.android.ugc.aweme.common.p1595g;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.g.e */
public final class C26888e {

    /* renamed from: a */
    private static final List<C26889a> f70741a = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.common.g.e$a */
    public interface C26889a {
        /* renamed from: a */
        <T> T mo54841a(Context context, Class<T> cls);
    }

    /* renamed from: a */
    public static void m65001a(C26889a aVar) {
        f70741a.add(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m65000a(android.content.Context r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0031
            android.content.Context r1 = r4.getApplicationContext()
            if (r1 == 0) goto L_0x0031
            if (r5 == 0) goto L_0x0031
            boolean r2 = r5.isInterface()
            if (r2 != 0) goto L_0x0012
            goto L_0x0031
        L_0x0012:
            java.lang.Class<com.ss.android.ugc.aweme.port.internal.o> r2 = com.p683ss.android.ugc.aweme.port.internal.C39666o.class
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0031
            java.util.Map<java.lang.Class, java.lang.Object> r2 = com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23372a.f62383a
            java.lang.Object r2 = r2.get(r5)
            if (r2 == 0) goto L_0x0026
            boolean r3 = r2 instanceof com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23376ad
            if (r3 != 0) goto L_0x0032
        L_0x0026:
            com.ss.android.ugc.aweme.base.a.a.ad r2 = new com.ss.android.ugc.aweme.base.a.a.ad
            r2.<init>(r1)
            java.util.Map<java.lang.Class, java.lang.Object> r1 = com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23372a.f62383a
            r1.put(r5, r2)
            goto L_0x0032
        L_0x0031:
            r2 = r0
        L_0x0032:
            if (r2 == 0) goto L_0x0035
            return r2
        L_0x0035:
            java.util.List<com.ss.android.ugc.aweme.common.g.e$a> r1 = f70741a
            java.util.Iterator r1 = r1.iterator()
        L_0x003b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.common.g.e$a r2 = (com.p683ss.android.ugc.aweme.common.p1595g.C26888e.C26889a) r2
            java.lang.Object r2 = r2.mo54841a(r4, r5)
            if (r2 == 0) goto L_0x003b
            return r2
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.p1595g.C26888e.m65000a(android.content.Context, java.lang.Class):java.lang.Object");
    }
}
