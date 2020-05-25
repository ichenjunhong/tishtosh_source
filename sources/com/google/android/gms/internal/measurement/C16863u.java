package com.google.android.gms.internal.measurement;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.internal.measurement.u */
final class C16863u implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ C16862t f47349a;

    C16863u(C16862t tVar) {
        this.f47349a = tVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C16568bl blVar = this.f47349a.f47338e;
        if (blVar != null) {
            blVar.mo32501d("Job execution failed", th);
        }
    }
}
