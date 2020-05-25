package com.google.android.gms.p1033b;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.m */
final class C15188m<TResult, TContinuationResult> implements C15174b, C15176d, C15177e<TContinuationResult>, C15198w<TResult> {

    /* renamed from: a */
    final C15172a<TResult, C15179g<TContinuationResult>> f39212a;

    /* renamed from: b */
    private final Executor f39213b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C15201z<TContinuationResult> f39214c;

    public C15188m(Executor executor, C15172a<TResult, C15179g<TContinuationResult>> aVar, C15201z<TContinuationResult> zVar) {
        this.f39213b = executor;
        this.f39212a = aVar;
        this.f39214c = zVar;
    }

    /* renamed from: a */
    public final void mo28008a(C15179g<TResult> gVar) {
        this.f39213b.execute(new C15189n(this, gVar));
    }

    /* renamed from: a */
    public final void mo27989a(TContinuationResult tcontinuationresult) {
        this.f39214c.mo28019a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo27988a(Exception exc) {
        this.f39214c.mo28018a(exc);
    }

    /* renamed from: a */
    public final void mo27987a() {
        this.f39214c.mo28022f();
    }
}
