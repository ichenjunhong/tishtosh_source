package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p076d.C1756a;

/* renamed from: c.a.e.e.d.l */
public final class C2004l<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1710e<? super T> f6559b;

    /* renamed from: c.a.e.e.d.l$a */
    static final class C2005a<T> extends C1756a<T, T> {

        /* renamed from: f */
        final C1710e<? super T> f6560f;

        public final T poll() throws Exception {
            T poll = this.f5867c.poll();
            if (poll != null) {
                this.f6560f.accept(poll);
            }
            return poll;
        }

        public final int requestFusion(int i) {
            return mo6231a(i);
        }

        public final void onNext(T t) {
            this.f5865a.onNext(t);
            if (this.f5869e == 0) {
                try {
                    this.f6560f.accept(t);
                } catch (Throwable th) {
                    mo6232a(th);
                }
            }
        }

        C2005a(C1674ab<? super T> abVar, C1710e<? super T> eVar) {
            super(abVar);
            this.f6560f = eVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C2005a(abVar, this.f6559b));
    }

    public C2004l(C2206z<T> zVar, C1710e<? super T> eVar) {
        super(zVar);
        this.f6559b = eVar;
    }
}
