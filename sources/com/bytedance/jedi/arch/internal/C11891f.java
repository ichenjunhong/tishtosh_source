package com.bytedance.jedi.arch.internal;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p069b.C1691d;
import p064c.p065a.p090h.C2150a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.internal.f */
public final class C11891f extends C1675ac {

    /* renamed from: b */
    private final Handler f31498b;

    /* renamed from: c */
    private final boolean f31499c = false;

    /* renamed from: com.bytedance.jedi.arch.internal.f$a */
    static final class C11892a extends C1678c {

        /* renamed from: a */
        private volatile boolean f31500a;

        /* renamed from: b */
        private final Handler f31501b;

        /* renamed from: c */
        private final boolean f31502c;

        public final boolean isDisposed() {
            return this.f31500a;
        }

        public final void dispose() {
            this.f31500a = true;
            this.f31501b.removeCallbacksAndMessages(this);
        }

        public C11892a(Handler handler, boolean z) {
            C52711k.m112240b(handler, "handler");
            this.f31501b = handler;
            this.f31502c = z;
        }

        /* renamed from: a */
        public final C1690c mo6132a(Runnable runnable, long j, TimeUnit timeUnit) {
            C52711k.m112240b(runnable, "rawRunnable");
            C52711k.m112240b(timeUnit, "unit");
            if (this.f31500a) {
                C1690c a = C1691d.m6003a();
                C52711k.m112236a((Object) a, "Disposables.disposed()");
                return a;
            }
            Runnable a2 = C2150a.m6489a(runnable);
            C52711k.m112236a((Object) a2, "RxJavaPlugins.onSchedule(rawRunnable)");
            boolean b = C11894g.m24248b();
            C11893b bVar = new C11893b(this.f31501b, a2, b);
            if (b) {
                bVar.run();
                return bVar;
            }
            Runnable runnable2 = bVar;
            Message obtain = Message.obtain(this.f31501b, runnable2);
            obtain.obj = this;
            if (this.f31502c) {
                C52711k.m112236a((Object) obtain, "message");
                obtain.setAsynchronous(true);
            }
            this.f31501b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f31500a) {
                return bVar;
            }
            this.f31501b.removeCallbacks(runnable2);
            C1690c a3 = C1691d.m6003a();
            C52711k.m112236a((Object) a3, "Disposables.disposed()");
            return a3;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.f$b */
    static final class C11893b implements C1690c, Runnable {

        /* renamed from: a */
        private volatile boolean f31503a;

        /* renamed from: b */
        private final Handler f31504b;

        /* renamed from: c */
        private final Runnable f31505c;

        /* renamed from: d */
        private final boolean f31506d;

        public final boolean isDisposed() {
            return this.f31503a;
        }

        public final void dispose() {
            if (!this.f31506d) {
                this.f31504b.removeCallbacks(this);
            }
            this.f31503a = true;
        }

        public final void run() {
            try {
                this.f31505c.run();
            } catch (Throwable th) {
                C2150a.m6492a(th);
            }
        }

        public C11893b(Handler handler, Runnable runnable, boolean z) {
            C52711k.m112240b(handler, "handler");
            C52711k.m112240b(runnable, "delegate");
            this.f31504b = handler;
            this.f31505c = runnable;
            this.f31506d = z;
        }
    }

    /* renamed from: a */
    public final C1678c mo6130a() {
        return new C11892a(this.f31498b, this.f31499c);
    }

    public C11891f(Handler handler, boolean z) {
        C52711k.m112240b(handler, "handler");
        this.f31498b = handler;
    }

    /* renamed from: a */
    public final C1690c mo6131a(Runnable runnable, long j, TimeUnit timeUnit) {
        C52711k.m112240b(runnable, "rawRunnable");
        C52711k.m112240b(timeUnit, "unit");
        Runnable a = C2150a.m6489a(runnable);
        C52711k.m112236a((Object) a, "RxJavaPlugins.onSchedule(rawRunnable)");
        boolean b = C11894g.m24248b();
        C11893b bVar = new C11893b(this.f31498b, a, b);
        if (b) {
            bVar.run();
            return bVar;
        }
        this.f31498b.postDelayed(bVar, timeUnit.toMillis(j));
        return bVar;
    }
}
