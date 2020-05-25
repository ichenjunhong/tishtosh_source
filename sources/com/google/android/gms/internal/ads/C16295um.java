package com.google.android.gms.internal.ads;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.internal.ads.um */
final class C16295um implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ UncaughtExceptionHandler f45689a;

    /* renamed from: b */
    private final /* synthetic */ C16293uk f45690b;

    C16295um(C16293uk ukVar, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f45690b = ukVar;
        this.f45689a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f45690b.mo31421a(thread, th);
            if (this.f45689a != null) {
                this.f45689a.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.f45689a != null) {
                this.f45689a.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
