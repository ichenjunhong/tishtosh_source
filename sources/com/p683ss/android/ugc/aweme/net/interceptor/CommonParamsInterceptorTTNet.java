package com.p683ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.CommonParamsInterceptorTTNet */
public class CommonParamsInterceptorTTNet implements C12727a {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x003d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.retrofit2.C12799u m84374b(com.bytedance.retrofit2.p833c.C12727a.C12728a r7) throws java.lang.Exception {
        /*
            com.bytedance.retrofit2.a.c r0 = r7.mo23899a()
            java.lang.String r1 = r0.f33321b
            okhttp3.t r1 = okhttp3.C53673t.m114180f(r1)
            if (r1 == 0) goto L_0x0070
            okhttp3.t$a r1 = r1.mo111624j()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 1
            com.p683ss.android.common.applog.NetUtil.putCommonParams(r2, r3)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0021:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()     // Catch:{ Throwable -> 0x003d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x003d }
            java.lang.Object r5 = r3.getValue()     // Catch:{ Throwable -> 0x003d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x003d }
            r1.mo111629a(r4, r5)     // Catch:{ Throwable -> 0x003d }
            goto L_0x0021
        L_0x003d:
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = "addQueryParameter "
            r5.<init>(r6)     // Catch:{ Exception -> 0x005a }
            java.lang.Object r3 = r3.getKey()     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x005a }
            r5.append(r3)     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x005a }
            r4.<init>(r3)     // Catch:{ Exception -> 0x005a }
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x0021
        L_0x005a:
            goto L_0x0021
        L_0x005c:
            okhttp3.t r1 = r1.mo111632b()
            java.lang.String r1 = r1.toString()
            com.bytedance.retrofit2.a.c$a r0 = r0.mo23858b()
            com.bytedance.retrofit2.a.c$a r0 = r0.mo23861a(r1)
            com.bytedance.retrofit2.a.c r0 = r0.mo23864a()
        L_0x0070:
            com.bytedance.retrofit2.u r7 = r7.mo23900a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.net.interceptor.CommonParamsInterceptorTTNet.m84374b(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.u");
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m84374b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m84374b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }
}
