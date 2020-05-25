package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.util.Map;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52728w;

/* renamed from: com.ss.android.ugc.aweme.af.a.i */
public final class C22513i {

    /* renamed from: a */
    static final C22483ac<C22524n> f60641a = new C22483ac<>(C52728w.m112245a(C22524n.class), C22514a.f60643a);

    /* renamed from: b */
    public static final C22513i f60642b = new C22513i();

    /* renamed from: com.ss.android.ugc.aweme.af.a.i$a */
    static final class C22514a extends C52712l implements C52686q<Uri, C22509g, Map<String, ? extends String>, C22515j> {

        /* renamed from: a */
        public static final C22514a f60643a = new C22514a();

        C22514a() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            boolean z;
            Uri uri;
            Uri uri2 = (Uri) obj;
            C22509g gVar = (C22509g) obj2;
            Map map = (Map) obj3;
            C52711k.m112240b(uri2, "uri");
            C52711k.m112240b(gVar, "providerFactory");
            C52711k.m112240b(map, "customCategories");
            if (C52711k.m112239a((Object) uri2.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C52711k.m112239a((Object) uri2.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                uri = uri2;
            } else {
                uri = null;
            }
            if (uri != null) {
                return new C22515j(uri2, gVar, map);
            }
            return null;
        }
    }

    private C22513i() {
    }
}
