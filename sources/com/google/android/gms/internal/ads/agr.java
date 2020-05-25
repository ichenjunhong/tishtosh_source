package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@C16299uq
public class agr<T> implements agn<T> {

    /* renamed from: a */
    private final agl<T> f40444a = new agl<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f40445b = new AtomicInteger(0);

    public agr() {
        afp.m32827a((aga<V>) this.f40444a, (afm<? super V>) new ags<Object>(this), agf.f40431b);
    }

    /* renamed from: a */
    public final void mo28829a(agq<T> agq, ago ago) {
        afp.m32827a((aga<V>) this.f40444a, (afm<? super V>) new agt<Object>(this, agq, ago), agf.f40431b);
    }

    /* renamed from: a */
    public final void mo28830a(T t) {
        this.f40444a.mo28823b(t);
    }

    /* renamed from: d */
    public final void mo28833d() {
        this.f40444a.mo28822a(new Exception());
    }

    /* renamed from: e */
    public final int mo28834e() {
        return this.f40445b.get();
    }
}
