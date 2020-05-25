package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ce */
final class C17039ce implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f48081a;

    /* renamed from: b */
    private final /* synthetic */ C17038cd f48082b;

    public final void run() {
        synchronized (this.f48081a) {
            try {
                this.f48081a.set(Boolean.valueOf(this.f48082b.mo32856s().mo33278c(this.f48082b.mo32843f().mo33353v(), C17122h.f48353Q)));
                this.f48081a.notify();
            } catch (Throwable th) {
                this.f48081a.notify();
                throw th;
            }
        }
    }
}
