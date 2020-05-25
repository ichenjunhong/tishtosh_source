package com.google.android.gms.internal.ads;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.internal.ads.ul */
final class C16294ul implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ UncaughtExceptionHandler f45687a;

    /* renamed from: b */
    private final /* synthetic */ C16293uk f45688b;

    C16294ul(C16293uk ukVar, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f45688b = ukVar;
        this.f45687a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f45688b.mo31421a(thread, th);
            if (this.f45687a != null) {
                this.f45687a.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.f45687a != null) {
                this.f45687a.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
