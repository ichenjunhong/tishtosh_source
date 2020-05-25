package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p076d.C1756a;

/* renamed from: c.a.e.e.d.aj */
public final class C1917aj<T, U> extends C1896a<T, U> {

    /* renamed from: b */
    final C1711f<? super T, ? extends U> f6253b;

    /* renamed from: c.a.e.e.d.aj$a */
    static final class C1918a<T, U> extends C1756a<T, U> {

        /* renamed from: f */
        final C1711f<? super T, ? extends U> f6254f;

        public final U poll() throws Exception {
            Object poll = this.f5867c.poll();
            if (poll != null) {
                return C1745b.m6050a(this.f6254f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        public final int requestFusion(int i) {
            return mo6231a(i);
        }

        public final void onNext(T t) {
            if (!this.f5868d) {
                if (this.f5869e != 0) {
                    this.f5865a.onNext(null);
                    return;
                }
                try {
                    this.f5865a.onNext(C1745b.m6050a(this.f6254f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo6232a(th);
                }
            }
        }

        C1918a(C1674ab<? super U> abVar, C1711f<? super T, ? extends U> fVar) {
            super(abVar);
            this.f6254f = fVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super U> abVar) {
        this.f6202a.mo6314a(new C1918a(abVar, this.f6253b));
    }

    public C1917aj(C2206z<T> zVar, C1711f<? super T, ? extends U> fVar) {
        super(zVar);
        this.f6253b = fVar;
    }
}
