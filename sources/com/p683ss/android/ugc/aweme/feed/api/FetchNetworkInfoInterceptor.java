package com.p683ss.android.ugc.aweme.feed.api;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FetchNetworkInfoInterceptor */
public final class FetchNetworkInfoInterceptor implements C12727a {

    /* renamed from: a */
    public volatile boolean f78680a;

    /* renamed from: b */
    public volatile int f78681b;

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return mo60424b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = mo60424b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d A[Catch:{ Throwable -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080 A[Catch:{ Throwable -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d A[Catch:{ Throwable -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009c A[Catch:{ Throwable -> 0x000b }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.C12799u<?> mo60424b(com.bytedance.retrofit2.p833c.C12727a.C12728a r15) {
        /*
            r14 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 0
            if (r15 == 0) goto L_0x000e
            com.bytedance.retrofit2.a.c r4 = r15.mo23899a()     // Catch:{ Throwable -> 0x000b }
            goto L_0x000f
        L_0x000b:
            r4 = move-exception
            goto L_0x00bb
        L_0x000e:
            r4 = r3
        L_0x000f:
            if (r15 == 0) goto L_0x0016
            com.bytedance.retrofit2.u r5 = r15.mo23900a(r4)     // Catch:{ Throwable -> 0x000b }
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            boolean r6 = com.p683ss.android.ugc.aweme.feed.api.C30146d.m70748a(r4)     // Catch:{ Throwable -> 0x000b }
            if (r6 != 0) goto L_0x001e
            return r5
        L_0x001e:
            if (r5 == 0) goto L_0x0023
            com.bytedance.retrofit2.a.d r6 = r5.f33551a     // Catch:{ Throwable -> 0x000b }
            goto L_0x0024
        L_0x0023:
            r6 = r3
        L_0x0024:
            if (r6 == 0) goto L_0x0029
            java.lang.Object r6 = r6.f33351f     // Catch:{ Throwable -> 0x000b }
            goto L_0x002a
        L_0x0029:
            r6 = r3
        L_0x002a:
            boolean r7 = r6 instanceof com.bytedance.frameworks.baselib.network.http.C9831a     // Catch:{ Throwable -> 0x000b }
            if (r7 == 0) goto L_0x00a6
            r7 = r6
            com.bytedance.frameworks.baselib.network.http.a r7 = (com.bytedance.frameworks.baselib.network.http.C9831a) r7     // Catch:{ Throwable -> 0x000b }
            long r7 = r7.f26753c     // Catch:{ Throwable -> 0x000b }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x003a
            return r5
        L_0x003a:
            com.bytedance.frameworks.baselib.network.http.a r6 = (com.bytedance.frameworks.baselib.network.http.C9831a) r6     // Catch:{ Throwable -> 0x000b }
            java.lang.String r6 = r6.f26774x     // Catch:{ Throwable -> 0x000b }
            if (r4 == 0) goto L_0x0057
            java.lang.String r11 = r4.f33321b     // Catch:{ Throwable -> 0x000b }
            if (r11 == 0) goto L_0x0057
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Throwable -> 0x000b }
            java.lang.String r13 = "first_retry"
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch:{ Throwable -> 0x000b }
            boolean r12 = p2628d.p2650m.C52830p.m112456b(r12, r13, r2, r1, r3)     // Catch:{ Throwable -> 0x000b }
            if (r12 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r11 = r3
        L_0x0053:
            if (r11 == 0) goto L_0x0057
            r11 = 1
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            boolean r12 = r14.f78680a     // Catch:{ Throwable -> 0x000b }
            if (r12 == 0) goto L_0x0075
            if (r4 == 0) goto L_0x0075
            java.lang.String r12 = r4.f33321b     // Catch:{ Throwable -> 0x000b }
            if (r12 == 0) goto L_0x0075
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Throwable -> 0x000b }
            java.lang.String r13 = "pull_type=0"
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch:{ Throwable -> 0x000b }
            boolean r12 = p2628d.p2650m.C52830p.m112456b(r12, r13, r2, r1, r3)     // Catch:{ Throwable -> 0x000b }
            if (r12 != r0) goto L_0x0075
            r14.f78680a = r2     // Catch:{ Throwable -> 0x000b }
            r14.f78681b = r2     // Catch:{ Throwable -> 0x000b }
            int r12 = r14.f78681b     // Catch:{ Throwable -> 0x000b }
            int r11 = r11 + r12
        L_0x0075:
            com.ss.android.ugc.aweme.feed.api.l r12 = new com.ss.android.ugc.aweme.feed.api.l     // Catch:{ Throwable -> 0x000b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Throwable -> 0x000b }
            if (r4 == 0) goto L_0x0080
            java.lang.String r4 = r4.f33321b     // Catch:{ Throwable -> 0x000b }
            goto L_0x0081
        L_0x0080:
            r4 = r3
        L_0x0081:
            r12.<init>(r6, r11, r4)     // Catch:{ Throwable -> 0x000b }
            java.lang.String r4 = "value"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r4)     // Catch:{ Throwable -> 0x000b }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0096
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.ugc.aweme.feed.api.l> r4 = com.p683ss.android.ugc.aweme.feed.api.C30155m.f78706a     // Catch:{ Throwable -> 0x000b }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ Throwable -> 0x000b }
            r4.putIfAbsent(r6, r12)     // Catch:{ Throwable -> 0x000b }
        L_0x0096:
            T r4 = r5.f33552b     // Catch:{ Throwable -> 0x000b }
            boolean r6 = r4 instanceof com.p683ss.android.ugc.aweme.app.api.p1367c.C22978d     // Catch:{ Throwable -> 0x000b }
            if (r6 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.app.api.c.d r4 = (com.p683ss.android.ugc.aweme.app.api.p1367c.C22978d) r4     // Catch:{ Throwable -> 0x000b }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ Throwable -> 0x000b }
            r4.setNetworkInfoKey(r6)     // Catch:{ Throwable -> 0x000b }
            goto L_0x00ba
        L_0x00a6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x000b }
            java.lang.String r7 = "isn't BaseHttpRequestInfo:"
            r4.<init>(r7)     // Catch:{ Throwable -> 0x000b }
            r4.append(r6)     // Catch:{ Throwable -> 0x000b }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x000b }
            r6 = 4
            java.lang.String r7 = "FetchNetworkInfoInterceptor"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r6, r7, r4)     // Catch:{ Throwable -> 0x000b }
        L_0x00ba:
            return r5
        L_0x00bb:
            if (r15 == 0) goto L_0x00c2
            com.bytedance.retrofit2.a.c r15 = r15.mo23899a()
            goto L_0x00c3
        L_0x00c2:
            r15 = r3
        L_0x00c3:
            boolean r5 = com.p683ss.android.ugc.aweme.feed.api.C30146d.m70748a(r15)
            if (r5 == 0) goto L_0x00f1
            if (r15 == 0) goto L_0x00f1
            java.lang.String r15 = r15.f33321b
            if (r15 == 0) goto L_0x00f1
            r5 = r15
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r6 = "is_cold_start=1"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r5 = p2628d.p2650m.C52830p.m112456b(r5, r6, r2, r1, r3)
            if (r5 == 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r15 = r3
        L_0x00de:
            if (r15 == 0) goto L_0x00f1
            r14.f78680a = r0
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            java.lang.String r5 = "first_retry"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r15 = p2628d.p2650m.C52830p.m112456b(r15, r5, r2, r1, r3)
            if (r15 == 0) goto L_0x00ef
            r0 = 2
        L_0x00ef:
            r14.f78681b = r0
        L_0x00f1:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.api.FetchNetworkInfoInterceptor.mo60424b(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.u");
    }
}
