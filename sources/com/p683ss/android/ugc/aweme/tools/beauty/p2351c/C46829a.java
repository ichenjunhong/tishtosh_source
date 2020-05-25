package com.p683ss.android.ugc.aweme.tools.beauty.p2351c;

import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.effect.p1676e.C29176a;
import com.p683ss.android.ugc.aweme.effect.p1676e.C29176a.C29188l;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29189a;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29194d;
import com.p683ss.android.ugc.aweme.filter.p1742a.C31392b;
import com.p683ss.android.ugc.aweme.tools.beauty.C46870d;
import com.p683ss.android.ugc.aweme.tools.beauty.C46871e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.a */
public final class C46829a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f118309a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46829a.class), "DOWNLOAD_SCHEDULER", "getDOWNLOAD_SCHEDULER()Lcom/ss/android/ugc/aweme/effect/persistence/PrioritySerialTaskScheduler;"))};

    /* renamed from: b */
    public static final C46829a f118310b = new C46829a();

    /* renamed from: c */
    private static final C52668f f118311c = C52732g.m112285a(C46830a.f118312a);

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.a$a */
    static final class C46830a extends C52712l implements C52670a<C29176a<C46870d, Void>> {

        /* renamed from: a */
        public static final C46830a f118312a = new C46830a();

        C46830a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C29176a aVar = new C29176a(3, new C31392b());
            aVar.f76456b = 0;
            aVar.f76458d = true;
            aVar.f76457c = true;
            aVar.f76459e = new C29194d() {
                /* renamed from: a */
                public final void mo59088a(Exception exc) {
                    C52711k.m112240b(exc, "exception");
                    C50203g.m108359a((Throwable) exc);
                }
            };
            return aVar;
        }
    }

    private C46829a() {
    }

    /* renamed from: a */
    public final C29176a<C46870d, Void> mo94072a() {
        return (C29176a) f118311c.getValue();
    }

    /* renamed from: b */
    public static boolean m101681b(ComposerBeauty composerBeauty) {
        C52711k.m112240b(composerBeauty, "beautyBean");
        if (C46871e.m101786a(composerBeauty.getEffect().getEffectId()) < 0) {
            return true;
        }
        return C46833c.m101688a(composerBeauty);
    }

    /* renamed from: a */
    public final boolean mo94074a(ComposerBeauty composerBeauty) {
        C52711k.m112240b(composerBeauty, "beautyBean");
        if (1 == mo94076c(composerBeauty)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo94076c(ComposerBeauty composerBeauty) {
        C52711k.m112240b(composerBeauty, "beautyBean");
        if (m101681b(composerBeauty)) {
            return 1;
        }
        if (mo94072a().mo59070b(new C46870d(composerBeauty, null, 2, null)) || mo94072a().mo59073c(new C46870d(composerBeauty, null, 2, null))) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo94073a(C46870d dVar, C29189a<C46870d, Void> aVar) {
        C52711k.m112240b(dVar, "beautyDownload");
        C52711k.m112240b(aVar, "callback");
        mo94072a().m68708a(dVar, aVar, null);
    }

    /* renamed from: b */
    public final void mo94075b(C46870d dVar, C29189a<C46870d, Void> aVar) {
        C52711k.m112240b(dVar, "beautyDownload");
        C29176a a = mo94072a();
        a.mo59063a((C52670a<? extends Object>) new C29188l<Object>(a, dVar, aVar));
    }
}
