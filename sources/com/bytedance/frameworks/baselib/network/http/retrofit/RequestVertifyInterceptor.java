package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9896b;
import com.bytedance.retrofit2.C12796s;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12686c.C12687a;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;

public final class RequestVertifyInterceptor implements C12727a {
    /* renamed from: a */
    private C12686c m19886a(C12686c cVar) {
        if (cVar != null && !cVar.f33326g) {
            return m19887b(cVar);
        }
        return cVar;
    }

    /* renamed from: b */
    private static C12686c m19887b(C12686c cVar) {
        try {
            String str = cVar.f33321b;
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            boolean z = cVar.f33328i;
            Object[] objArr = {cVar.mo23857a()};
            C9896b bVar = C9894e.f26960e;
            if (bVar != null) {
                str = bVar.mo17820a(str, z, objArr);
            }
            if (cVar.f33332m != null) {
                cVar.f33332m.f33489v = SystemClock.uptimeMillis() - valueOf.longValue();
            }
            C12687a b = cVar.mo23858b();
            b.mo23861a(str);
            return b.mo23864a();
        } catch (Throwable unused) {
            return cVar;
        }
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return mo17859b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = mo17859b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }

    /* renamed from: b */
    public final C12799u mo17859b(C12728a aVar) throws Exception {
        C12796s b = aVar.mo23901b();
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        C12686c a = m19886a(aVar.mo23899a());
        if (b != null) {
            b.f33485r.put("RequestVerifyInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
        }
        return aVar.mo23900a(a);
    }
}
