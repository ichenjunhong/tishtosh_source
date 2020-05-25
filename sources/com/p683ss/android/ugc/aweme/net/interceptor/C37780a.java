package com.p683ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.a */
final class C37780a {
    /* renamed from: a */
    static C12799u m84393a(ApiAlisgInterceptorLegacy apiAlisgInterceptorLegacy, C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return ApiAlisgInterceptorLegacy.m84366b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(apiAlisgInterceptorLegacy.getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = ApiAlisgInterceptorLegacy.m84366b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = apiAlisgInterceptorLegacy.getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }
}
