package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1708c;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p076d.C1756a;

/* renamed from: c.a.e.e.d.k */
public final class C2002k<T, K> extends C1896a<T, T> {

    /* renamed from: b */
    final C1711f<? super T, K> f6553b;

    /* renamed from: c */
    final C1708c<? super K, ? super K> f6554c;

    /* renamed from: c.a.e.e.d.k$a */
    static final class C2003a<T, K> extends C1756a<T, T> {

        /* renamed from: f */
        final C1711f<? super T, K> f6555f;

        /* renamed from: g */
        final C1708c<? super K, ? super K> f6556g;

        /* renamed from: h */
        K f6557h;

        /* renamed from: i */
        boolean f6558i;

        public final T poll() throws Exception {
            while (true) {
                T poll = this.f5867c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f6555f.apply(poll);
                if (!this.f6558i) {
                    this.f6558i = true;
                    this.f6557h = apply;
                    return poll;
                } else if (!this.f6556g.mo6201a(this.f6557h, apply)) {
                    this.f6557h = apply;
                    return poll;
                } else {
                    this.f6557h = apply;
                }
            }
        }

        public final int requestFusion(int i) {
            return mo6231a(i);
        }

        public final void onNext(T t) {
            if (!this.f5868d) {
                if (this.f5869e != 0) {
                    this.f5865a.onNext(t);
                    return;
                }
                try {
                    K apply = this.f6555f.apply(t);
                    if (this.f6558i) {
                        boolean a = this.f6556g.mo6201a(this.f6557h, apply);
                        this.f6557h = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.f6558i = true;
                        this.f6557h = apply;
                    }
                    this.f5865a.onNext(t);
                } catch (Throwable th) {
                    mo6232a(th);
                }
            }
        }

        C2003a(C1674ab<? super T> abVar, C1711f<? super T, K> fVar, C1708c<? super K, ? super K> cVar) {
            super(abVar);
            this.f6555f = fVar;
            this.f6556g = cVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C2003a(abVar, this.f6553b, this.f6554c));
    }

    public C2002k(C2206z<T> zVar, C1711f<? super T, K> fVar, C1708c<? super K, ? super K> cVar) {
        super(zVar);
        this.f6553b = fVar;
        this.f6554c = cVar;
    }
}
