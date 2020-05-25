package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.d.ax */
public final class C1952ax<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1675ac f6360b;

    /* renamed from: c.a.e.e.d.ax$a */
    static final class C1953a<T> extends AtomicReference<C1690c> implements C1674ab<T>, C1690c {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: a */
        final C1674ab<? super T> f6361a;

        /* renamed from: b */
        final AtomicReference<C1690c> f6362b = new AtomicReference<>();

        public final void onComplete() {
            this.f6361a.onComplete();
        }

        public final void dispose() {
            C1718b.dispose(this.f6362b);
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void onError(Throwable th) {
            this.f6361a.onError(th);
        }

        public final void onNext(T t) {
            this.f6361a.onNext(t);
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this.f6362b, cVar);
        }

        C1953a(C1674ab<? super T> abVar) {
            this.f6361a = abVar;
        }
    }

    /* renamed from: c.a.e.e.d.ax$b */
    final class C1954b implements Runnable {

        /* renamed from: b */
        private final C1953a<T> f6364b;

        public final void run() {
            C1952ax.this.f6202a.mo6314a(this.f6364b);
        }

        C1954b(C1953a<T> aVar) {
            this.f6364b = aVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1953a aVar = new C1953a(abVar);
        abVar.onSubscribe(aVar);
        C1718b.setOnce(aVar, this.f6360b.mo6139a(new C1954b(aVar)));
    }

    public C1952ax(C2206z<T> zVar, C1675ac acVar) {
        super(zVar);
        this.f6360b = acVar;
    }
}
