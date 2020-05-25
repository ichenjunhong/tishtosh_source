package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import java.util.Map;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52728w;

/* renamed from: com.ss.android.ugc.aweme.af.a.y */
public final class C22536y {

    /* renamed from: a */
    static final C22483ac<C22528r> f60670a = new C22483ac<>(C52728w.m112245a(C22528r.class), C22537a.f60672a);

    /* renamed from: b */
    public static final C22536y f60671b = new C22536y();

    /* renamed from: com.ss.android.ugc.aweme.af.a.y$a */
    static final class C22537a extends C52712l implements C52686q<Uri, C22509g, Map<String, ? extends String>, C22538z> {

        /* renamed from: a */
        public static final C22537a f60672a = new C22537a();

        C22537a() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            Uri uri;
            Uri uri2 = (Uri) obj;
            C22509g gVar = (C22509g) obj2;
            Map map = (Map) obj3;
            C52711k.m112240b(uri2, "uri");
            C52711k.m112240b(gVar, "providerFactory");
            C52711k.m112240b(map, "customCategories");
            if (C52711k.m112239a((Object) uri2.getScheme(), (Object) "react-native")) {
                uri = uri2;
            } else {
                uri = null;
            }
            if (uri != null) {
                return new C22538z(uri2, gVar, map);
            }
            return null;
        }
    }

    private C22536y() {
    }
}
