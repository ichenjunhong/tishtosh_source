package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15464q;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.aw */
final class C17003aw<V> extends FutureTask<V> implements Comparable<C17003aw> {

    /* renamed from: a */
    final boolean f47947a;

    /* renamed from: b */
    private final long f47948b = C17000at.f47935j.getAndIncrement();

    /* renamed from: c */
    private final String f47949c;

    /* renamed from: d */
    private final /* synthetic */ C17000at f47950d;

    C17003aw(C17000at atVar, Callable<V> callable, boolean z, String str) {
        this.f47950d = atVar;
        super(callable);
        C15464q.m32123a(str);
        this.f47949c = str;
        this.f47947a = z;
        if (this.f47948b == Long.MAX_VALUE) {
            atVar.mo32854q().f48445b.mo33376a("Tasks index overflow");
        }
    }

    C17003aw(C17000at atVar, Runnable runnable, boolean z, String str) {
        this.f47950d = atVar;
        super(runnable, null);
        C15464q.m32123a(str);
        this.f47949c = str;
        this.f47947a = false;
        if (this.f47948b == Long.MAX_VALUE) {
            atVar.mo32854q().f48445b.mo33376a("Tasks index overflow");
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f47950d.mo32854q().f48445b.mo33377a(this.f47949c, th);
        if (th instanceof C17001au) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C17003aw awVar = (C17003aw) obj;
        if (this.f47947a != awVar.f47947a) {
            return this.f47947a ? -1 : 1;
        }
        if (this.f47948b < awVar.f47948b) {
            return -1;
        }
        if (this.f47948b > awVar.f47948b) {
            return 1;
        }
        this.f47950d.mo32854q().f48446c.mo33377a("Two tasks share the same index. index", Long.valueOf(this.f47948b));
        return 0;
    }
}
