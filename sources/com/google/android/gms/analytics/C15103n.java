package com.google.android.gms.analytics;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.analytics.n */
final class C15103n extends FutureTask<T> {

    /* renamed from: a */
    private final /* synthetic */ C15099a f38982a;

    C15103n(C15099a aVar, Runnable runnable, Object obj) {
        this.f38982a = aVar;
        super(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        UncaughtExceptionHandler uncaughtExceptionHandler = C15098l.this.f38975d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
