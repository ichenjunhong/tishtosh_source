package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p075c.C1750d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.as */
public final class C1941as {

    /* renamed from: c.a.e.e.d.as$a */
    public static final class C1942a<T> extends AtomicInteger implements C1750d<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: a */
        final C1674ab<? super T> f6335a;

        /* renamed from: b */
        final T f6336b;

        public final void clear() {
            lazySet(3);
        }

        public final void dispose() {
            set(3);
        }

        public final boolean isDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        public final boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        public final T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f6336b;
        }

        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f6335a.onNext(this.f6336b);
                if (get() == 2) {
                    lazySet(3);
                    this.f6335a.onComplete();
                }
            }
        }

        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public C1942a(C1674ab<? super T> abVar, T t) {
            this.f6335a = abVar;
            this.f6336b = t;
        }

        public final boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* renamed from: c.a.e.e.d.as$b */
    static final class C1943b<T, R> extends C2201v<R> {

        /* renamed from: a */
        final T f6337a;

        /* renamed from: b */
        final C1711f<? super T, ? extends C2206z<? extends R>> f6338b;

        /* renamed from: a_ */
        public final void mo6311a_(C1674ab<? super R> abVar) {
            try {
                C2206z zVar = (C2206z) C1745b.m6050a(this.f6338b.apply(this.f6337a), "The mapper returned a null ObservableSource");
                if (zVar instanceof Callable) {
                    try {
                        Object call = ((Callable) zVar).call();
                        if (call == null) {
                            C1719c.complete(abVar);
                            return;
                        }
                        C1942a aVar = new C1942a(abVar, call);
                        abVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        C1719c.error(th, abVar);
                    }
                } else {
                    zVar.mo6314a(abVar);
                }
            } catch (Throwable th2) {
                C1719c.error(th2, abVar);
            }
        }

        C1943b(T t, C1711f<? super T, ? extends C2206z<? extends R>> fVar) {
            this.f6337a = t;
            this.f6338b = fVar;
        }
    }

    /* renamed from: a */
    public static <T, U> C2201v<U> m6237a(T t, C1711f<? super T, ? extends C2206z<? extends U>> fVar) {
        return C2150a.m6486a((C2201v<T>) new C1943b<T>(t, fVar));
    }

    /* renamed from: a */
    public static <T, R> boolean m6238a(C2206z<T> zVar, C1674ab<? super R> abVar, C1711f<? super T, ? extends C2206z<? extends R>> fVar) {
        if (!(zVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) zVar).call();
            if (call == null) {
                C1719c.complete(abVar);
                return true;
            }
            try {
                C2206z zVar2 = (C2206z) C1745b.m6050a(fVar.apply(call), "The mapper returned a null ObservableSource");
                if (zVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) zVar2).call();
                        if (call2 == null) {
                            C1719c.complete(abVar);
                            return true;
                        }
                        C1942a aVar = new C1942a(abVar, call2);
                        abVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        C1719c.error(th, abVar);
                        return true;
                    }
                } else {
                    zVar2.mo6314a(abVar);
                }
                return true;
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                C1719c.error(th2, abVar);
                return true;
            }
        } catch (Throwable th3) {
            C1700b.m6017b(th3);
            C1719c.error(th3, abVar);
            return true;
        }
    }
}
