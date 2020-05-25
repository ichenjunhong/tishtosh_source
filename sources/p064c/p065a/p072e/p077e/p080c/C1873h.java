package p064c.p065a.p072e.p077e.p080c;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.c.h */
public final class C1873h<T> extends C1862a<T, T> {

    /* renamed from: b */
    final C1675ac f6157b;

    /* renamed from: c.a.e.e.c.h$a */
    static final class C1874a<T> extends AtomicReference<C1690c> implements C1690c, C2196q<T>, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final C2196q<? super T> f6158a;

        /* renamed from: b */
        final C1675ac f6159b;

        /* renamed from: c */
        T f6160c;

        /* renamed from: d */
        Throwable f6161d;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void onComplete() {
            C1718b.replace(this, this.f6159b.mo6139a(this));
        }

        public final void run() {
            Throwable th = this.f6161d;
            if (th != null) {
                this.f6161d = null;
                this.f6158a.onError(th);
                return;
            }
            T t = this.f6160c;
            if (t != null) {
                this.f6160c = null;
                this.f6158a.onSuccess(t);
                return;
            }
            this.f6158a.onComplete();
        }

        public final void onError(Throwable th) {
            this.f6161d = th;
            C1718b.replace(this, this.f6159b.mo6139a(this));
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.setOnce(this, cVar)) {
                this.f6158a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.f6160c = t;
            C1718b.replace(this, this.f6159b.mo6139a(this));
        }

        C1874a(C2196q<? super T> qVar, C1675ac acVar) {
            this.f6158a = qVar;
            this.f6159b = acVar;
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        this.f6137a.mo6495b(new C1874a(qVar, this.f6157b));
    }

    public C1873h(C2198s<T> sVar, C1675ac acVar) {
        super(sVar);
        this.f6157b = acVar;
    }
}
