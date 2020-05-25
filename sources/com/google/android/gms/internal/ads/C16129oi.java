package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.oi */
final class C16129oi implements Callable<C16125oe> {

    /* renamed from: a */
    private final /* synthetic */ C16122ob f45363a;

    /* renamed from: b */
    private final /* synthetic */ C16128oh f45364b;

    C16129oi(C16128oh ohVar, C16122ob obVar) {
        this.f45364b = ohVar;
        this.f45363a = obVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C16125oe call() throws Exception {
        synchronized (this.f45364b.f45350c) {
            if (this.f45364b.f45351d) {
                return null;
            }
            return this.f45363a.mo31222a(this.f45364b.f45348a, this.f45364b.f45349b);
        }
    }
}
