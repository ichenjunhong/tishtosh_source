package p064c.p065a.p072e.p077e.p080c;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1722f;

/* renamed from: c.a.e.e.c.l */
public final class C1881l<T> extends C1862a<T, T> {

    /* renamed from: b */
    final C1675ac f6179b;

    /* renamed from: c.a.e.e.c.l$a */
    static final class C1882a<T> extends AtomicReference<C1690c> implements C1690c, C2196q<T> {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final C1722f f6180a = new C1722f();

        /* renamed from: b */
        final C2196q<? super T> f6181b;

        public final void onComplete() {
            this.f6181b.onComplete();
        }

        public final void dispose() {
            C1718b.dispose(this);
            this.f6180a.dispose();
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            this.f6181b.onError(th);
        }

        public final void onSuccess(T t) {
            this.f6181b.onSuccess(t);
        }

        C1882a(C2196q<? super T> qVar) {
            this.f6181b = qVar;
        }
    }

    /* renamed from: c.a.e.e.c.l$b */
    static final class C1883b<T> implements Runnable {

        /* renamed from: a */
        final C2196q<? super T> f6182a;

        /* renamed from: b */
        final C2198s<T> f6183b;

        public final void run() {
            this.f6183b.mo6495b(this.f6182a);
        }

        C1883b(C2196q<? super T> qVar, C2198s<T> sVar) {
            this.f6182a = qVar;
            this.f6183b = sVar;
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        C1882a aVar = new C1882a(qVar);
        qVar.onSubscribe(aVar);
        aVar.f6180a.replace(this.f6179b.mo6139a(new C1883b(aVar, this.f6137a)));
    }

    public C1881l(C2198s<T> sVar, C1675ac acVar) {
        super(sVar);
        this.f6179b = acVar;
    }
}
