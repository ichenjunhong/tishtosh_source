package p064c.p065a.p072e.p076d;

import p064c.p065a.C1674ab;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.d.i */
public class C1764i<T> extends C1757b<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: a */
    protected final C1674ab<? super T> f5882a;

    /* renamed from: b */
    protected T f5883b;

    public void dispose() {
        set(4);
        this.f5883b = null;
    }

    public final void clear() {
        lazySet(32);
        this.f5883b = null;
    }

    public final boolean isDisposed() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    public final boolean tryDispose() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    public final void complete() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f5882a.onComplete();
        }
    }

    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f5883b;
        this.f5883b = null;
        lazySet(32);
        return t;
    }

    public C1764i(C1674ab<? super T> abVar) {
        this.f5882a = abVar;
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            C2150a.m6492a(th);
            return;
        }
        lazySet(2);
        this.f5882a.onError(th);
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) == 0) {
            C1674ab<? super T> abVar = this.f5882a;
            if (i == 8) {
                this.f5883b = t;
                lazySet(16);
                abVar.onNext(null);
            } else {
                lazySet(2);
                abVar.onNext(t);
            }
            if (get() != 4) {
                abVar.onComplete();
            }
        }
    }
}
