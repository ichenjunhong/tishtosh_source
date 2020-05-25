package com.p683ss.android.account.token;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.account.token.AuthTokenInterceptor */
public class AuthTokenInterceptor implements C12727a {
    /* renamed from: b */
    public static C12799u m44749b(C12728a aVar) throws Exception {
        C12686c a = aVar.mo23899a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a.f33322c);
        C18503c.m44775a(a.f33321b, (List<C12685b>) arrayList);
        C12799u a2 = aVar.mo23900a(a.mo23858b().mo23863a((List<C12685b>) arrayList).mo23864a());
        C18503c.m44777b(a.f33321b, a2.mo23959b());
        return a2;
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m44749b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m44749b(aVar);
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
