package p064c.p065a.p072e.p077e.p082e;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.e.l */
public final class C2051l<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1685ai<T> f6688a;

    /* renamed from: b */
    final C1675ac f6689b;

    /* renamed from: c.a.e.e.e.l$a */
    static final class C2052a<T> extends AtomicReference<C1690c> implements C1683ag<T>, C1690c, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* renamed from: a */
        final C1683ag<? super T> f6690a;

        /* renamed from: b */
        final C1675ac f6691b;

        /* renamed from: c */
        T f6692c;

        /* renamed from: d */
        Throwable f6693d;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void run() {
            Throwable th = this.f6693d;
            if (th != null) {
                this.f6690a.onError(th);
            } else {
                this.f6690a.onSuccess(this.f6692c);
            }
        }

        public final void onError(Throwable th) {
            this.f6693d = th;
            C1718b.replace(this, this.f6691b.mo6139a(this));
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.setOnce(this, cVar)) {
                this.f6690a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.f6692c = t;
            C1718b.replace(this, this.f6691b.mo6139a(this));
        }

        C2052a(C1683ag<? super T> agVar, C1675ac acVar) {
            this.f6690a = agVar;
            this.f6691b = acVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6688a.mo6159b(new C2052a(agVar, this.f6689b));
    }

    public C2051l(C1685ai<T> aiVar, C1675ac acVar) {
        this.f6688a = aiVar;
        this.f6689b = acVar;
    }
}
