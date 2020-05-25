package p064c.p065a.p072e.p086i;

import java.util.concurrent.atomic.AtomicInteger;
import org.p2692b.C53695c;
import p064c.p065a.p072e.p075c.C1752f;

/* renamed from: c.a.e.i.d */
public final class C2120d<T> extends AtomicInteger implements C1752f<T> {
    private static final long serialVersionUID = -3830916580126663321L;

    /* renamed from: a */
    final T f6874a;

    /* renamed from: b */
    final C53695c<? super T> f6875b;

    public final int requestFusion(int i) {
        return i & 1;
    }

    public final void cancel() {
        lazySet(2);
    }

    public final void clear() {
        lazySet(1);
    }

    public final boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f6874a;
    }

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void request(long j) {
        if (C2122f.validate(j) && compareAndSet(0, 1)) {
            C53695c<? super T> cVar = this.f6875b;
            cVar.onNext(this.f6874a);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }

    public C2120d(C53695c<? super T> cVar, T t) {
        this.f6875b = cVar;
        this.f6874a = t;
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
