package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.agf;

/* renamed from: com.google.android.gms.ads.internal.ab */
final /* synthetic */ class C14941ab implements Runnable {

    /* renamed from: a */
    private final C15039z f38510a;

    /* renamed from: b */
    private final Runnable f38511b;

    C14941ab(C15039z zVar, Runnable runnable) {
        this.f38510a = zVar;
        this.f38511b = runnable;
    }

    public final void run() {
        agf.f40430a.execute(new C14942ac(this.f38510a, this.f38511b));
    }
}
