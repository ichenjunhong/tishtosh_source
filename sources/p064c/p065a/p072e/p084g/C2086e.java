package p064c.p065a.p072e.p084g;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.g.e */
final class C2086e implements C1690c, Callable<Void> {

    /* renamed from: f */
    static final FutureTask<Void> f6783f = new FutureTask<>(C1723a.f5843b, null);

    /* renamed from: a */
    final Runnable f6784a;

    /* renamed from: b */
    final AtomicReference<Future<?>> f6785b = new AtomicReference<>();

    /* renamed from: c */
    final AtomicReference<Future<?>> f6786c = new AtomicReference<>();

    /* renamed from: d */
    final ExecutorService f6787d;

    /* renamed from: e */
    Thread f6788e;

    public final boolean isDisposed() {
        if (this.f6786c.get() == f6783f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void call() throws Exception {
        boolean z;
        this.f6788e = Thread.currentThread();
        try {
            this.f6784a.run();
            Future submit = this.f6787d.submit(this);
            while (true) {
                Future future = (Future) this.f6785b.get();
                if (future != f6783f) {
                    if (this.f6785b.compareAndSet(future, submit)) {
                        break;
                    }
                } else {
                    if (this.f6788e != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    submit.cancel(z);
                }
            }
            this.f6788e = null;
        } catch (Throwable th) {
            this.f6788e = null;
            C2150a.m6492a(th);
        }
        return null;
    }

    public final void dispose() {
        boolean z;
        Future future = (Future) this.f6786c.getAndSet(f6783f);
        boolean z2 = false;
        if (!(future == null || future == f6783f)) {
            if (this.f6788e != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
        Future future2 = (Future) this.f6785b.getAndSet(f6783f);
        if (future2 != null && future2 != f6783f) {
            if (this.f6788e != Thread.currentThread()) {
                z2 = true;
            }
            future2.cancel(z2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6383a(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) this.f6786c.get();
            if (future2 == f6783f) {
                if (this.f6788e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!this.f6786c.compareAndSet(future2, future));
    }

    C2086e(Runnable runnable, ExecutorService executorService) {
        this.f6784a = runnable;
        this.f6787d = executorService;
    }
}
