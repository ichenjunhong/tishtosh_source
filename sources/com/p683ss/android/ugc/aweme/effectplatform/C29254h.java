package com.p683ss.android.ugc.aweme.effectplatform;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.h */
public final class C29254h implements C48641b {

    /* renamed from: a */
    private C17971f f76608a;

    /* renamed from: a */
    public static C29254h m68947a() {
        return new C29254h(C39629l.m88232a().mo58566D());
    }

    private C29254h(C17971f fVar) {
        this.f76608a = fVar;
    }

    /* renamed from: a */
    public final <T> String mo59190a(T t) throws Exception {
        if (t == null) {
            return null;
        }
        return this.f76608a.mo34889b(t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036 A[SYNTHETIC, Splitter:B:19:0x0036] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo59189a(java.io.InputStream r4, java.lang.Class<T> r5) {
        /*
            r3 = this;
            r0 = 0
            com.google.gson.c.a r1 = new com.google.gson.c.a     // Catch:{ u -> 0x001d }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ u -> 0x001d }
            r2.<init>(r4)     // Catch:{ u -> 0x001d }
            r1.<init>(r2)     // Catch:{ u -> 0x001d }
            com.google.gson.f r4 = r3.f76608a     // Catch:{ u -> 0x0018, all -> 0x0015 }
            java.lang.Object r4 = r4.mo34880a(r1, r5)     // Catch:{ u -> 0x0018, all -> 0x0015 }
            r1.close()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            return r4
        L_0x0015:
            r4 = move-exception
            r0 = r1
            goto L_0x0034
        L_0x0018:
            r4 = move-exception
            r0 = r1
            goto L_0x001e
        L_0x001b:
            r4 = move-exception
            goto L_0x0034
        L_0x001d:
            r4 = move-exception
        L_0x001e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x001b }
            java.lang.String r1 = "JsonConvertImpl convert fail : "
            r5.<init>(r1)     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x001b }
            r5.append(r1)     // Catch:{ all -> 0x001b }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x001b }
            com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r5)     // Catch:{ all -> 0x001b }
            throw r4     // Catch:{ all -> 0x001b }
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.effectplatform.C29254h.mo59189a(java.io.InputStream, java.lang.Class):java.lang.Object");
    }
}
