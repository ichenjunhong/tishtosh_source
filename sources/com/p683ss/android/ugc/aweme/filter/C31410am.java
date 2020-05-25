package com.p683ss.android.ugc.aweme.filter;

import com.bytedance.keva.Keva;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.filter.am */
public final class C31410am implements C31409al {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f82246a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31410am.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C31411a f82247b = new C31411a(null);

    /* renamed from: c */
    private final C52668f f82248c = C52732g.m112285a(C31412b.f82249a);

    /* renamed from: com.ss.android.ugc.aweme.filter.am$a */
    public static final class C31411a {
        private C31411a() {
        }

        public /* synthetic */ C31411a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.am$b */
    static final class C31412b extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C31412b f82249a = new C31412b();

        C31412b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepo("filter_intensity");
        }
    }

    /* renamed from: a */
    private final Keva m73196a() {
        return (Keva) this.f82248c.getValue();
    }

    /* renamed from: b */
    public final int mo64310b(String str, int i) {
        C52711k.m112240b(str, "key");
        return m73196a().getInt(str, -1);
    }

    /* renamed from: a */
    public final void mo64309a(String str, int i) {
        C52711k.m112240b(str, "key");
        m73196a().storeInt(str, i);
    }
}
