package com.p683ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.SecUidInterceptorTTNet */
public class SecUidInterceptorTTNet implements C12727a {
    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m84382b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m84382b(aVar);
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
    public static C12799u m84382b(C12728a aVar) throws Exception {
        String[] strArr;
        C12686c a = aVar.mo23899a();
        C53673t f = C53673t.m114180f(a.f33321b);
        if (f != null) {
            C47865ew.m103536a().mo95081a(f);
            C53674a j = f.mo111624j();
            for (String str : C47865ew.f120428b) {
                String c = f.mo111612c(str);
                StringBuilder sb = new StringBuilder("sec_");
                sb.append(str);
                if (TextUtils.isEmpty(f.mo111612c(sb.toString()))) {
                    String c2 = C47865ew.m103536a().mo95083c(c);
                    if (!TextUtils.isEmpty(c2)) {
                        if (C47865ew.m103536a().mo95082b(f.toString())) {
                            j.mo111638g(str);
                        }
                        StringBuilder sb2 = new StringBuilder("sec_");
                        sb2.append(str);
                        j.mo111634c(sb2.toString(), c2);
                    }
                }
            }
            if (C47865ew.m103536a().f120439e) {
                j.mo111634c("compile_mode", C47865ew.f120427a);
            }
            a = a.mo23858b().mo23861a(j.mo111632b().toString()).mo23864a();
        }
        return aVar.mo23900a(a);
    }
}
