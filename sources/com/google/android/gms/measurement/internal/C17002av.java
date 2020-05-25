package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15464q;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.measurement.internal.av */
final class C17002av implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f47945a;

    /* renamed from: b */
    private final /* synthetic */ C17000at f47946b;

    public C17002av(C17000at atVar, String str) {
        this.f47946b = atVar;
        C15464q.m32123a(str);
        this.f47945a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f47946b.mo32854q().f48445b.mo33377a(this.f47945a, th);
    }
}
