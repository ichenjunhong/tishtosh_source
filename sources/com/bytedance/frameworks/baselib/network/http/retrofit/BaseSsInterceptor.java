package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.C9841b;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12686c.C12687a;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseSsInterceptor implements C12727a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17857a(C12686c cVar, C12799u uVar) throws Exception {
    }

    /* renamed from: a */
    private static String m19881a(String str) {
        try {
            return C9894e.m19815a(str, true);
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return mo17858b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = mo17858b(aVar);
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
    public final C12799u mo17858b(C12728a aVar) throws Exception {
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        C12686c a = aVar.mo23899a();
        try {
            URL url = new URL(a.f33321b);
            if (url.getProtocol().equals(WebKitApi.SCHEME_HTTP)) {
                C9894e.m19824a(url.getHost(), url.getPath(), false);
            }
        } catch (MalformedURLException unused) {
        }
        C12686c a2 = mo17856a(a);
        if (a2.f33332m != null) {
            a2.f33332m.f33485r.put("BaseSsInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
        }
        C12799u a3 = aVar.mo23900a(a2);
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        mo17857a(a2, a3);
        if (a2.f33332m != null) {
            a2.f33332m.f33486s.put("BaseSsInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf2.longValue()));
        }
        return a3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12686c mo17856a(C12686c cVar) {
        String str;
        if (cVar == null) {
            return cVar;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        String str2 = cVar.f33321b;
        if (cVar.f33329j instanceof C9841b) {
            str = C9894e.m19814a(str2, (C9841b) cVar.f33329j);
        } else {
            str = C9894e.m19813a(str2);
        }
        if (cVar.f33332m != null) {
            cVar.f33332m.f33487t = SystemClock.uptimeMillis() - valueOf.longValue();
        }
        if (cVar.f33321b.startsWith("https:") && str.startsWith("http:")) {
            try {
                URL url = new URL(str);
                C9894e.m19824a(url.getHost(), url.getPath(), true);
            } catch (Throwable unused) {
            }
        }
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        if (cVar.f33328i) {
            str = m19881a(str);
        }
        if (cVar.f33332m != null) {
            cVar.f33332m.f33488u = SystemClock.uptimeMillis() - valueOf2.longValue();
        }
        C12687a b = cVar.mo23858b();
        b.mo23861a(str);
        return b.mo23864a();
    }
}
