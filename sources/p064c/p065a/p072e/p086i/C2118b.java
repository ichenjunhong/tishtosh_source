package p064c.p065a.p072e.p086i;

import org.p2692b.C53695c;

/* renamed from: c.a.e.i.b */
public class C2118b<T> extends C2117a<T> {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: e */
    protected final C53695c<? super T> f6871e;

    /* renamed from: f */
    protected T f6872f;

    public void cancel() {
        set(4);
        this.f6872f = null;
    }

    public final void clear() {
        lazySet(32);
        this.f6872f = null;
    }

    public final boolean isCancelled() {
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

    public final boolean tryCancel() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f6872f;
        this.f6872f = null;
        return t;
    }

    public C2118b(C53695c<? super T> cVar) {
        this.f6871e = cVar;
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void request(long j) {
        if (C2122f.validate(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3)) {
                            T t = this.f6872f;
                            if (t != null) {
                                this.f6872f = null;
                                C53695c<? super T> cVar = this.f6871e;
                                cVar.onNext(t);
                                if (get() != 4) {
                                    cVar.onComplete();
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    C53695c<? super T> cVar = this.f6871e;
                    cVar.onNext(t);
                    if (get() != 4) {
                        cVar.onComplete();
                    }
                    return;
                }
                this.f6872f = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.f6872f = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f6872f = t;
        lazySet(16);
        C53695c<? super T> cVar2 = this.f6871e;
        cVar2.onNext(t);
        if (get() != 4) {
            cVar2.onComplete();
        }
    }
}
