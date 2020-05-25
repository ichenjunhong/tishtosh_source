package p064c.p065a.p072e.p077e.p081d;

import java.util.Collection;
import java.util.concurrent.Callable;
import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p076d.C1756a;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.j */
public final class C2000j<T, K> extends C1896a<T, T> {

    /* renamed from: b */
    final C1711f<? super T, K> f6549b;

    /* renamed from: c */
    final Callable<? extends Collection<? super K>> f6550c;

    /* renamed from: c.a.e.e.d.j$a */
    static final class C2001a<T, K> extends C1756a<T, T> {

        /* renamed from: f */
        final Collection<? super K> f6551f;

        /* renamed from: g */
        final C1711f<? super T, K> f6552g;

        public final void clear() {
            this.f6551f.clear();
            super.clear();
        }

        public final void onComplete() {
            if (!this.f5868d) {
                this.f5868d = true;
                this.f6551f.clear();
                this.f5865a.onComplete();
            }
        }

        public final T poll() throws Exception {
            T poll;
            do {
                poll = this.f5867c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f6551f.add(C1745b.m6050a(this.f6552g.apply(poll), "The keySelector returned a null key")));
            return poll;
        }

        public final int requestFusion(int i) {
            return mo6231a(i);
        }

        public final void onError(Throwable th) {
            if (this.f5868d) {
                C2150a.m6492a(th);
                return;
            }
            this.f5868d = true;
            this.f6551f.clear();
            this.f5865a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f5868d) {
                if (this.f5869e == 0) {
                    try {
                        if (this.f6551f.add(C1745b.m6050a(this.f6552g.apply(t), "The keySelector returned a null key"))) {
                            this.f5865a.onNext(t);
                        }
                    } catch (Throwable th) {
                        mo6232a(th);
                    }
                } else {
                    this.f5865a.onNext(null);
                }
            }
        }

        C2001a(C1674ab<? super T> abVar, C1711f<? super T, K> fVar, Collection<? super K> collection) {
            super(abVar);
            this.f6552g = fVar;
            this.f6551f = collection;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        try {
            this.f6202a.mo6314a(new C2001a(abVar, this.f6549b, (Collection) C1745b.m6050a(this.f6550c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C1719c.error(th, abVar);
        }
    }

    public C2000j(C2206z<T> zVar, C1711f<? super T, K> fVar, Callable<? extends Collection<? super K>> callable) {
        super(zVar);
        this.f6549b = fVar;
        this.f6550c = callable;
    }
}
