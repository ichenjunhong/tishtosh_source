package com.google.android.gms.internal.measurement;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.internal.measurement.ac */
final class C16532ac implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f46452a;

    /* renamed from: b */
    private final /* synthetic */ C16530aa f46453b;

    C16532ac(C16530aa aaVar, ComponentName componentName) {
        this.f46453b = aaVar;
        this.f46452a = componentName;
    }

    public final void run() {
        C16867y.m40972a(this.f46453b.f46447a, this.f46452a);
    }
}
