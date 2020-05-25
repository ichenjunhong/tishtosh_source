package com.p683ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.net.C37815x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptorTTNet */
public final class ApiCheckInterceptorTTNet implements C12727a {
    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        return C37782c.m84395a(this, aVar);
    }

    /* renamed from: b */
    public static C12799u<?> m84370b(C12728a aVar) throws Exception {
        C52711k.m112240b(aVar, "chain");
        C12686c a = aVar.mo23899a();
        C37815x xVar = C37815x.f96280a;
        C52711k.m112236a((Object) a, "request");
        String str = a.f33321b;
        C52711k.m112236a((Object) str, "request.url");
        xVar.mo77270a(str);
        C12799u<?> a2 = aVar.mo23900a(a);
        C52711k.m112236a((Object) a2, "chain.proceed(request)");
        return a2;
    }
}
