package p064c.p065a.p072e.p084g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p074b.C1723a;

/* renamed from: c.a.e.g.a */
abstract class C2073a extends AtomicReference<Future<?>> implements C1690c {

    /* renamed from: c */
    protected static final FutureTask<Void> f6744c = new FutureTask<>(C1723a.f5843b, null);

    /* renamed from: d */
    protected static final FutureTask<Void> f6745d = new FutureTask<>(C1723a.f5843b, null);
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: a */
    protected final Runnable f6746a;

    /* renamed from: b */
    protected Thread f6747b;

    public Runnable getWrappedRunnable() {
        return this.f6746a;
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        if (future == f6744c || future == f6745d) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        boolean z;
        Future future = (Future) get();
        if (future != f6744c && future != f6745d && compareAndSet(future, f6745d) && future != null) {
            if (this.f6747b != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    C2073a(Runnable runnable) {
        this.f6746a = runnable;
    }

    public final void setFuture(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) get();
            if (future2 == f6744c) {
                break;
            } else if (future2 == f6745d) {
                if (this.f6747b != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
