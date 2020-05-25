package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import com.bytedance.jedi.p725a.p738h.C11680e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31502a;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31567e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31592h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31490c;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.k */
public final class C31540k extends C11680e<C31502a> implements C31592h {

    /* renamed from: a */
    final C31567e f82496a;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.k$a */
    static final class C31541a<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C31540k f82497a;

        C31541a(C31540k kVar) {
            this.f82497a = kVar;
        }

        public final void subscribe(C2204x<C31502a> xVar) {
            C52711k.m112240b(xVar, "emitter");
            xVar.mo6282a(new C31502a(new C31490c(this.f82497a.f82496a.mo64425a(), C52575l.m112097a()), true));
            xVar.mo6273a();
        }
    }

    /* renamed from: b */
    public final C2201v<C31502a> mo22471b() {
        C2201v<C31502a> a = C2201v.m6601a((C2205y<T>) new C31541a<T>(this));
        C52711k.m112236a((Object) a, "Observable.create<Filter…nComplete()\n            }");
        return a;
    }

    public C31540k(C31567e eVar) {
        C52711k.m112240b(eVar, "localFilterManager");
        this.f82496a = eVar;
    }
}
