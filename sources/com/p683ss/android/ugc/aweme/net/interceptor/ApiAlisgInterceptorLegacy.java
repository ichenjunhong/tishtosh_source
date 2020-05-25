package com.p683ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import java.util.ArrayList;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorLegacy */
public final class ApiAlisgInterceptorLegacy implements C12727a {

    /* renamed from: a */
    public static final C37778a f96244a = new C37778a(null);

    /* renamed from: b */
    private static final ArrayList<String> f96245b = C52575l.m112103d("/service/2/app_log/", "/api/ad/v1/setting/", "/api/ad/splash/", "/aweme/v1/ttregion/test/", "/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v2/category/list/", "/aweme/v1/find/", "/aweme/v1/challenge/history/intervene/");

    /* renamed from: c */
    private static final ArrayList<String> f96246c = C52575l.m112103d("IN", "NP", "PK", "LK");

    /* renamed from: d */
    private static final ArrayList<String> f96247d = C52575l.m112103d("US", "GB", "DE", "IT", "FR", "TR", "ES", "JP", "KR", "BR", "IQ");

    /* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorLegacy$a */
    public static final class C37778a {
        private C37778a() {
        }

        public /* synthetic */ C37778a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        return C37780a.m84393a(this, aVar);
    }

    /* renamed from: b */
    public static C12799u<?> m84366b(C12728a aVar) throws Exception {
        C53674a aVar2;
        C52711k.m112240b(aVar, "chain");
        C12686c a = aVar.mo23899a();
        C52711k.m112236a((Object) a, "request");
        C53673t f = C53673t.m114180f(a.f33321b);
        if (f != null) {
            aVar2 = f.mo111624j();
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            if (C52711k.m112239a((Object) f.f133143d, (Object) "api.tiktokv.com")) {
                aVar2.mo111635d("api-h2.tiktokv.com");
            }
            a = a.mo23858b().mo23861a(aVar2.mo111632b().toString()).mo23864a();
        }
        C12799u<?> a2 = aVar.mo23900a(a);
        C52711k.m112236a((Object) a2, "chain.proceed(request)");
        return a2;
    }
}
