package com.p683ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.linkselector.LinkSelector;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiOkInterceptorTTNet */
public class ApiOkInterceptorTTNet implements C12727a {
    /* renamed from: b */
    public static C12799u m84372b(C12728a aVar) throws Exception {
        C12686c a = aVar.mo23899a();
        String str = a.f33321b;
        if (!TextUtils.isEmpty(str) && str.contains("maya/user/registered/")) {
            return aVar.mo23900a(a);
        }
        try {
            C12799u a2 = aVar.mo23900a(a);
            if (a2 == null || a2.mo23958a() != 200) {
                LinkSelector.m46790a().mo39177a(str, null);
            } else {
                LinkSelector.m46790a().mo39179b(str);
            }
            return a2;
        } catch (Exception e) {
            if (e instanceof C23459a) {
                throw e;
            }
            LinkSelector.m46790a().mo39177a(str, e);
            throw e;
        }
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m84372b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m84372b(aVar);
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
