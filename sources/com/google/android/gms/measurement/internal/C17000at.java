package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.at */
public final class C17000at extends C17029bv {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final AtomicLong f47935j = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: a */
    volatile boolean f47936a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C17004ax f47937b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C17004ax f47938c;

    /* renamed from: d */
    private final PriorityBlockingQueue<C17003aw<?>> f47939d = new PriorityBlockingQueue<>();

    /* renamed from: e */
    private final BlockingQueue<C17003aw<?>> f47940e = new LinkedBlockingQueue();

    /* renamed from: f */
    private final UncaughtExceptionHandler f47941f = new C17002av(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: g */
    private final UncaughtExceptionHandler f47942g = new C17002av(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Object f47943h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Semaphore f47944i = new Semaphore(2);

    C17000at(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32871d() {
        return false;
    }

    /* renamed from: c */
    public final void mo32840c() {
        if (Thread.currentThread() != this.f47937b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: b */
    public final void mo32838b() {
        if (Thread.currentThread() != this.f47938c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: f */
    public final boolean mo32915f() {
        return Thread.currentThread() == this.f47937b;
    }

    /* renamed from: a */
    public final <V> Future<V> mo32911a(Callable<V> callable) throws IllegalStateException {
        mo32980w();
        C15464q.m32123a(callable);
        C17003aw awVar = new C17003aw(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f47937b) {
            if (!this.f47939d.isEmpty()) {
                mo32854q().f48448e.mo33376a("Callable skipped the worker queue.");
            }
            awVar.run();
        } else {
            m41230a(awVar);
        }
        return awVar;
    }

    /* renamed from: b */
    public final <V> Future<V> mo32913b(Callable<V> callable) throws IllegalStateException {
        mo32980w();
        C15464q.m32123a(callable);
        C17003aw awVar = new C17003aw(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f47937b) {
            awVar.run();
        } else {
            m41230a(awVar);
        }
        return awVar;
    }

    /* renamed from: a */
    public final void mo32912a(Runnable runnable) throws IllegalStateException {
        mo32980w();
        C15464q.m32123a(runnable);
        m41230a(new C17003aw<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: a */
    private final void m41230a(C17003aw<?> awVar) {
        synchronized (this.f47943h) {
            this.f47939d.add(awVar);
            if (this.f47937b == null) {
                this.f47937b = new C17004ax(this, "Measurement Worker", this.f47939d);
                this.f47937b.setUncaughtExceptionHandler(this.f47941f);
                this.f47937b.start();
            } else {
                this.f47937b.mo32919a();
            }
        }
    }

    /* renamed from: b */
    public final void mo32914b(Runnable runnable) throws IllegalStateException {
        mo32980w();
        C15464q.m32123a(runnable);
        C17003aw awVar = new C17003aw(this, runnable, false, "Task exception on network thread");
        synchronized (this.f47943h) {
            this.f47940e.add(awVar);
            if (this.f47938c == null) {
                this.f47938c = new C17004ax(this, "Measurement Network", this.f47940e);
                this.f47938c.setUncaughtExceptionHandler(this.f47942g);
                this.f47938c.start();
            } else {
                this.f47938c.mo32919a();
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }
}
