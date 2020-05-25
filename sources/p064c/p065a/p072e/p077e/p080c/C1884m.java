package p064c.p065a.p072e.p077e.p080c;

import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53694b;
import org.p2692b.C53696d;
import p064c.p065a.C2177l;
import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.c.m */
public final class C1884m<T, U> extends C1862a<T, T> {

    /* renamed from: b */
    final C53694b<U> f6184b;

    /* renamed from: c.a.e.e.c.m$a */
    static final class C1885a<T, U> extends AtomicReference<C1690c> implements C1690c, C2196q<T> {
        private static final long serialVersionUID = -2187421758664251153L;

        /* renamed from: a */
        final C2196q<? super T> f6185a;

        /* renamed from: b */
        final C1886a<U> f6186b = new C1886a<>(this);

        /* renamed from: c.a.e.e.c.m$a$a */
        static final class C1886a<U> extends AtomicReference<C53696d> implements C2177l<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* renamed from: a */
            final C1885a<?, U> f6187a;

            public final void onComplete() {
                this.f6187a.mo6308a();
            }

            C1886a(C1885a<?, U> aVar) {
                this.f6187a = aVar;
            }

            public final void onNext(Object obj) {
                C2122f.cancel(this);
                this.f6187a.mo6308a();
            }

            public final void onSubscribe(C53696d dVar) {
                C2122f.setOnce(this, dVar, Long.MAX_VALUE);
            }

            public final void onError(Throwable th) {
                C1885a<?, U> aVar = this.f6187a;
                if (C1718b.dispose(aVar)) {
                    aVar.f6185a.onError(th);
                } else {
                    C2150a.m6492a(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6308a() {
            if (C1718b.dispose(this)) {
                this.f6185a.onComplete();
            }
        }

        public final void dispose() {
            C1718b.dispose(this);
            C2122f.cancel(this.f6186b);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void onComplete() {
            C2122f.cancel(this.f6186b);
            if (getAndSet(C1718b.DISPOSED) != C1718b.DISPOSED) {
                this.f6185a.onComplete();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        C1885a(C2196q<? super T> qVar) {
            this.f6185a = qVar;
        }

        public final void onError(Throwable th) {
            C2122f.cancel(this.f6186b);
            if (getAndSet(C1718b.DISPOSED) != C1718b.DISPOSED) {
                this.f6185a.onError(th);
            } else {
                C2150a.m6492a(th);
            }
        }

        public final void onSuccess(T t) {
            C2122f.cancel(this.f6186b);
            if (getAndSet(C1718b.DISPOSED) != C1718b.DISPOSED) {
                this.f6185a.onSuccess(t);
            }
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        C1885a aVar = new C1885a(qVar);
        qVar.onSubscribe(aVar);
        this.f6184b.mo336a(aVar.f6186b);
        this.f6137a.mo6495b(aVar);
    }

    public C1884m(C2198s<T> sVar, C53694b<U> bVar) {
        super(sVar);
        this.f6184b = bVar;
    }
}
