package com.p683ss.android.ugc.aweme.feed.api;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;

/* renamed from: com.ss.android.ugc.aweme.feed.api.ComplianceEncryptCheckInterceptor */
public final class ComplianceEncryptCheckInterceptor implements C12727a {
    /* JADX INFO: used method not loaded: d.m.y.b(java.lang.CharSequence, java.lang.CharSequence, boolean, int, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (p2628d.p2650m.C52830p.m112456b((java.lang.CharSequence) r3, (java.lang.CharSequence) "cmpl_enc", false, 2, (java.lang.Object) null) == true) goto L_0x004f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.retrofit2.C12799u<?> m70727b(com.bytedance.retrofit2.p833c.C12727a.C12728a r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x000a
            com.bytedance.retrofit2.a.c r1 = r7.mo23899a()     // Catch:{ Throwable -> 0x0008 }
            goto L_0x000b
        L_0x0008:
            r7 = move-exception
            goto L_0x0057
        L_0x000a:
            r1 = r0
        L_0x000b:
            r2 = 1
            if (r1 == 0) goto L_0x0020
            java.lang.String r3 = r1.f33321b     // Catch:{ Throwable -> 0x0008 }
            if (r3 == 0) goto L_0x0020
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Throwable -> 0x0008 }
            java.lang.String r4 = "cmpl_enc"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x0008 }
            r5 = 0
            r6 = 2
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r3, r4, r5, r6, r0)     // Catch:{ Throwable -> 0x0008 }
            if (r3 == r2) goto L_0x004f
        L_0x0020:
            android.app.Activity r3 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()     // Catch:{ Throwable -> 0x0008 }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ Throwable -> 0x0008 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0008 }
            java.lang.String r5 = "Missing Compliance Encrypt param! "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0008 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r5 = r1.f33321b     // Catch:{ Throwable -> 0x0008 }
            goto L_0x0033
        L_0x0032:
            r5 = r0
        L_0x0033:
            r4.append(r5)     // Catch:{ Throwable -> 0x0008 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0008 }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x0008 }
            android.widget.Toast r2 = android.widget.Toast.makeText(r3, r4, r2)     // Catch:{ Throwable -> 0x0008 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0008 }
            r4 = 25
            if (r3 != r4) goto L_0x004c
            r3 = r2
            android.widget.Toast r3 = (android.widget.Toast) r3     // Catch:{ Throwable -> 0x0008 }
            com.p683ss.android.ugc.aweme.utils.C47905fy.m103630a(r3)     // Catch:{ Throwable -> 0x0008 }
        L_0x004c:
            r2.show()     // Catch:{ Throwable -> 0x0008 }
        L_0x004f:
            if (r7 == 0) goto L_0x0056
            com.bytedance.retrofit2.u r7 = r7.mo23900a(r1)     // Catch:{ Throwable -> 0x0008 }
            return r7
        L_0x0056:
            return r0
        L_0x0057:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.api.ComplianceEncryptCheckInterceptor.m70727b(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.u");
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m70727b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m70727b(aVar);
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
