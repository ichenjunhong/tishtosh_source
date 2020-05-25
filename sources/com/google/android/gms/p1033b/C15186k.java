package com.google.android.gms.p1033b;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.k */
final class C15186k<TResult, TContinuationResult> implements C15198w<TResult> {

    /* renamed from: a */
    final C15172a<TResult, TContinuationResult> f39207a;

    /* renamed from: b */
    private final Executor f39208b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C15201z<TContinuationResult> f39209c;

    public C15186k(Executor executor, C15172a<TResult, TContinuationResult> aVar, C15201z<TContinuationResult> zVar) {
        this.f39208b = executor;
        this.f39207a = aVar;
        this.f39209c = zVar;
    }

    /* renamed from: a */
    public final void mo28008a(C15179g<TResult> gVar) {
        this.f39208b.execute(new C15187l(this, gVar));
    }
}
