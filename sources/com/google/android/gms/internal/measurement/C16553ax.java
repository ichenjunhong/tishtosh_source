package com.google.android.gms.internal.measurement;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.measurement.ax */
final class C16553ax implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16552aw f46497a;

    C16553ax(C16552aw awVar) {
        this.f46497a = awVar;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f46497a.f46494a.mo32519b().mo27845a((Runnable) this);
            return;
        }
        boolean c = this.f46497a.mo31814c();
        this.f46497a.f46495b = 0;
        if (c) {
            this.f46497a.mo31793a();
        }
    }
}
