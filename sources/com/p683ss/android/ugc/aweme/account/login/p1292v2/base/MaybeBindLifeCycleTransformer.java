package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import org.p2692b.C53694b;
import p064c.p065a.C1663a;
import p064c.p065a.C2193n;
import p064c.p065a.C2198s;
import p064c.p065a.C2199t;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p080c.C1884m;
import p064c.p065a.p072e.p077e.p081d.C1950aw;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p094l.C2178a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer */
public final class MaybeBindLifeCycleTransformer<T> implements C0183j, C2199t<T, T> {

    /* renamed from: a */
    public static final C21826a f59105a = new C21826a(null);

    /* renamed from: b */
    private final C2178a<Integer> f59106b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer$a */
    public static final class C21826a {
        private C21826a() {
        }

        public /* synthetic */ C21826a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer$b */
    static final class C21827b<T> implements C1715j<Integer> {

        /* renamed from: a */
        public static final C21827b f59107a = new C21827b();

        C21827b() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            Integer num = (Integer) obj;
            C52711k.m112240b(num, "it");
            if (num.intValue() == 1) {
                return true;
            }
            return false;
        }
    }

    public MaybeBindLifeCycleTransformer() {
        C2178a<Integer> l = C2178a.m6527l();
        C52711k.m112236a((Object) l, "BehaviorSubject.create<Int>()");
        this.f59106b = l;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void disposeRequest() {
        this.f59106b.onNext(Integer.valueOf(1));
    }

    /* renamed from: a */
    public final C2198s<T> mo6499a(C2193n<T> nVar) {
        C52711k.m112240b(nVar, "upstream");
        C2178a<Integer> aVar = this.f59106b;
        C1715j jVar = C21827b.f59107a;
        C1745b.m6050a(jVar, "predicate is null");
        C53694b a = C2150a.m6486a((C2201v<T>) new C1950aw<T>(aVar, jVar)).mo6508a(C1663a.MISSING);
        C1745b.m6050a(a, "other is null");
        C2193n a2 = C2150a.m6484a((C2193n<T>) new C1884m<T>(nVar, a));
        C52711k.m112236a((Object) a2, "upstream.takeUntil(\n    …rategy.MISSING)\n        )");
        return a2;
    }
}
