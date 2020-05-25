package com.twitter.sdk.android.core;

import p2666g.C53061b;
import p2666g.C53094d;
import p2666g.C53133m;

/* renamed from: com.twitter.sdk.android.core.b */
public abstract class C52068b<T> implements C53094d<T> {
    /* renamed from: a */
    public abstract void mo23366a(C52077i<T> iVar);

    /* renamed from: a */
    public abstract void mo23367a(C52229t tVar);

    /* renamed from: a */
    public final void mo36429a(C53061b<T> bVar, Throwable th) {
        mo23367a(new C52229t("Request Failure", th));
    }

    /* renamed from: a */
    public final void mo36428a(C53061b<T> bVar, C53133m<T> mVar) {
        if (mVar.mo110646c()) {
            mo23366a(new C52077i<>(mVar.f131636b, mVar));
        } else {
            mo23367a((C52229t) new C52219n(mVar));
        }
    }
}
