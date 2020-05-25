package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;

/* renamed from: c.a.e.e.b.u */
public final class C1846u<T> extends C1785a<T, T> {

    /* renamed from: c.a.e.e.b.u$a */
    static final class C1847a<T> extends AtomicInteger implements C2177l<T>, C53696d {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: a */
        final C53695c<? super T> f6098a;

        /* renamed from: b */
        C53696d f6099b;

        /* renamed from: c */
        volatile boolean f6100c;

        /* renamed from: d */
        Throwable f6101d;

        /* renamed from: e */
        volatile boolean f6102e;

        /* renamed from: f */
        final AtomicLong f6103f = new AtomicLong();

        /* renamed from: g */
        final AtomicReference<T> f6104g = new AtomicReference<>();

        public final void onComplete() {
            this.f6100c = true;
            m6161a();
        }

        public final void cancel() {
            if (!this.f6102e) {
                this.f6102e = true;
                this.f6099b.cancel();
                if (getAndIncrement() == 0) {
                    this.f6104g.lazySet(null);
                }
            }
        }

        /* renamed from: a */
        private void m6161a() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                C53695c<? super T> cVar = this.f6098a;
                AtomicLong atomicLong = this.f6103f;
                AtomicReference<T> atomicReference = this.f6104g;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z3 = this.f6100c;
                        Object andSet = atomicReference.getAndSet(null);
                        if (andSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!m6162a(z3, z2, cVar, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f6100c;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (m6162a(z4, z, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C2127d.m6416b(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void onError(Throwable th) {
            this.f6101d = th;
            this.f6100c = true;
            m6161a();
        }

        public final void onNext(T t) {
            this.f6104g.lazySet(t);
            m6161a();
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                C2127d.m6415a(this.f6103f, j);
                m6161a();
            }
        }

        C1847a(C53695c<? super T> cVar) {
            this.f6098a = cVar;
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f6099b, dVar)) {
                this.f6099b = dVar;
                this.f6098a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        private boolean m6162a(boolean z, boolean z2, C53695c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.f6102e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.f6101d;
                if (th != null) {
                    atomicReference.lazySet(null);
                    cVar.onError(th);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }
    }

    public C1846u(C2149h<T> hVar) {
        super(hVar);
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f5924a.mo6449a((C2177l<? super T>) new C1847a<Object>(cVar));
    }
}
