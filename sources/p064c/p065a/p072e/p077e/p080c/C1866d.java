package p064c.p065a.p072e.p077e.p080c;

import java.util.concurrent.atomic.AtomicInteger;
import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.c.d */
public final class C1866d<T> extends C1862a<T, T> {

    /* renamed from: b */
    final C1706a f6143b;

    /* renamed from: c.a.e.e.c.d$a */
    static final class C1867a<T> extends AtomicInteger implements C1690c, C2196q<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final C2196q<? super T> f6144a;

        /* renamed from: b */
        final C1706a f6145b;

        /* renamed from: c */
        C1690c f6146c;

        public final boolean isDisposed() {
            return this.f6146c.isDisposed();
        }

        public final void dispose() {
            this.f6146c.dispose();
            m6180a();
        }

        public final void onComplete() {
            this.f6144a.onComplete();
            m6180a();
        }

        /* renamed from: a */
        private void m6180a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f6145b.mo6199a();
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    C2150a.m6492a(th);
                }
            }
        }

        public final void onError(Throwable th) {
            this.f6144a.onError(th);
            m6180a();
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6146c, cVar)) {
                this.f6146c = cVar;
                this.f6144a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.f6144a.onSuccess(t);
            m6180a();
        }

        C1867a(C2196q<? super T> qVar, C1706a aVar) {
            this.f6144a = qVar;
            this.f6145b = aVar;
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        this.f6137a.mo6495b(new C1867a(qVar, this.f6143b));
    }

    public C1866d(C2198s<T> sVar, C1706a aVar) {
        super(sVar);
        this.f6143b = aVar;
    }
}
