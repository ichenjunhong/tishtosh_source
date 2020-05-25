package com.p683ss.android.ugc.aweme.awemeservice.p1392a;

import com.p683ss.android.ugc.aweme.awemeservice.p1393b.C23321a;
import com.p683ss.android.ugc.aweme.awemeservice.p1393b.C23322b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.services.IMainService;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.Collection;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p092j.C2159a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.a */
public final class C23302a {

    /* renamed from: a */
    public static final C23309b<String> f62298a = new C23308a();

    /* renamed from: b */
    public static final C23302a f62299b = new C23302a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C23309b<String> f62300c;

    /* renamed from: com.ss.android.ugc.aweme.awemeservice.a.a$a */
    public static final class C23308a implements C23309b<String> {
        C23308a() {
        }

        /* renamed from: a */
        public final Collection<Aweme> mo48351a() {
            Collection<Aweme> a = C23302a.f62300c.mo48351a();
            C52711k.m112236a((Object) a, "cache.values()");
            return a;
        }

        /* renamed from: b */
        public final void mo48353b() {
            C23302a.f62300c.mo48353b();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Aweme mo48350a(Object obj) {
            Aweme a = C23302a.f62300c.mo48350a((String) obj);
            C52711k.m112236a((Object) a, "cache.get(key)");
            return a;
        }

        /* renamed from: b */
        public final /* synthetic */ boolean mo48354b(Object obj) {
            return C23302a.f62300c.mo48354b((String) obj);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo48352a(Object obj, Aweme aweme) {
            String str = (String) obj;
            if (aweme != null) {
                Aweme clone = aweme.clone();
                C52711k.m112236a((Object) clone, "aweme.clone()");
                C52711k.m112240b(clone, "aweme");
                C23321a aVar = C23322b.f62331a;
                String aid = clone.getAid();
                C52711k.m112236a((Object) aid, "aweme.aid");
                aVar.mo22280a(aid, clone);
            }
            C23302a.f62300c.mo48352a(str, aweme);
        }
    }

    private C23302a() {
    }

    static {
        C23309b<String> cVar;
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIMainServicebyMonsterPlugin, "ServiceManager.get().get…IMainService::class.java)");
        if (createIMainServicebyMonsterPlugin.isReplaceAwemeCache()) {
            cVar = new C23311d<>();
        } else {
            cVar = new C23310c<>();
        }
        f62300c = cVar;
        C2159a.m6512a(C23322b.m57377b()).mo6541d((C1711f<? super T, ? extends R>) C233031.f62301a).mo6522a((C1715j<? super T>) C233042.f62302a).mo6541d((C1711f<? super T, ? extends R>) C233053.f62303a).mo6514a(C2168a.m6521b()).mo6505a((C1710e<? super T>) C233064.f62304a, (C1710e<? super Throwable>) C233075.f62305a);
    }
}
