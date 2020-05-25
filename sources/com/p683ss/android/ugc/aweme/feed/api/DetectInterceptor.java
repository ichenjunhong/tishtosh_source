package com.p683ss.android.ugc.aweme.feed.api;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.net.C37793m;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;

/* renamed from: com.ss.android.ugc.aweme.feed.api.DetectInterceptor */
public final class DetectInterceptor implements C12727a {
    /* renamed from: b */
    public static C12799u<?> m70729b(C12728a aVar) {
        C37793m.m84397a();
        if (aVar != null) {
            return aVar.mo23900a(aVar.mo23899a());
        }
        return null;
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m70729b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m70729b(aVar);
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
