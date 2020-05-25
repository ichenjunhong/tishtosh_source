package com.google.android.gms.p1033b;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.q */
final class C15192q<TResult> implements C15198w<TResult> {

    /* renamed from: a */
    final Object f39221a = new Object();

    /* renamed from: b */
    private final Executor f39222b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C15175c<TResult> f39223c;

    public C15192q(Executor executor, C15175c<TResult> cVar) {
        this.f39222b = executor;
        this.f39223c = cVar;
    }

    /* renamed from: a */
    public final void mo28008a(C15179g<TResult> gVar) {
        synchronized (this.f39221a) {
            if (this.f39223c != null) {
                this.f39222b.execute(new C15193r(this, gVar));
            }
        }
    }
}
