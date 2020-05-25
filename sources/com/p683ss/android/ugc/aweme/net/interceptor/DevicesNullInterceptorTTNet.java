package com.p683ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet */
public class DevicesNullInterceptorTTNet implements C12727a {
    /* renamed from: b */
    public static C12799u m84376b(C12728a aVar) throws Exception {
        C12686c a = aVar.mo23899a();
        C53673t f = C53673t.m114180f(a.f33321b);
        C53674a j = f.mo111624j();
        if (TextUtils.equals("", f.mo111612c("device_id"))) {
            j.mo111638g("device_id");
            f = j.mo111632b();
        }
        return aVar.mo23900a(a.mo23858b().mo23861a(f.toString()).mo23864a());
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m84376b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m84376b(aVar);
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
