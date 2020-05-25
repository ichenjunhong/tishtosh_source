package com.p683ss.android.ugc.aweme.p1402b;

import com.p683ss.android.ugc.aweme.legoImp.inflate.C35916g;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.b.j */
public final class C23355j {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f62364a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23355j.class), "X2C_MODE", "getX2C_MODE()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23355j.class), "isX2COpen", "isX2COpen()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23355j.class), "isX2CAsyncInflateOpen", "isX2CAsyncInflateOpen()Z"))};

    /* renamed from: b */
    static final C52668f f62365b = C52732g.m112286a(C52757k.NONE, C23358c.f62371a);

    /* renamed from: c */
    public static final C23355j f62366c = new C23355j();

    /* renamed from: d */
    private static final C52668f f62367d = C52732g.m112286a(C52757k.NONE, C23356a.f62369a);

    /* renamed from: e */
    private static final C52668f f62368e = C52732g.m112286a(C52757k.NONE, C23357b.f62370a);

    /* renamed from: com.ss.android.ugc.aweme.b.j$a */
    static final class C23356a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C23356a f62369a = new C23356a();

        C23356a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C35916g.m81077a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.b.j$b */
    static final class C23357b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C23357b f62370a = new C23357b();

        C23357b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            if (C23355j.f62366c.mo48410a() == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.b.j$c */
    static final class C23358c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C23358c f62371a = new C23358c();

        C23358c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z = true;
            if (C23355j.f62366c.mo48410a() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    private C23355j() {
    }

    /* renamed from: a */
    public final int mo48410a() {
        return ((Number) f62367d.getValue()).intValue();
    }

    /* renamed from: b */
    public final boolean mo48411b() {
        return ((Boolean) f62368e.getValue()).booleanValue();
    }
}
