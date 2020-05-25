package com.bytedance.apm.ttnet;

import android.os.SystemClock;
import com.bytedance.apm.p480f.p481a.C9015b;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12686c.C12687a;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import java.util.ArrayList;
import java.util.List;

public class TTNetSampleInterceptor implements C12727a {
    /* renamed from: b */
    public static C12799u m18289b(C12728a aVar) throws Exception {
        C12686c a = aVar.mo23899a();
        if (!C9190h.m18253a(a.mo23859b("x-tt-trace-log")) || !C9015b.m17827a().f24585c || C9015b.m17827a().f24584b != 1) {
            return aVar.mo23900a(a);
        }
        ArrayList arrayList = new ArrayList(a.f33322c);
        C12687a b = a.mo23858b();
        arrayList.add(new C12685b("x-tt-trace-log", "01"));
        return aVar.mo23900a(b.mo23863a((List<C12685b>) arrayList).mo23864a());
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m18289b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m18289b(aVar);
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
