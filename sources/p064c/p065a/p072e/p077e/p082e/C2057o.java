package p064c.p065a.p072e.p077e.p082e;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1722f;

/* renamed from: c.a.e.e.e.o */
public final class C2057o<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1685ai<? extends T> f6703a;

    /* renamed from: b */
    final C1675ac f6704b;

    /* renamed from: c.a.e.e.e.o$a */
    static final class C2058a<T> extends AtomicReference<C1690c> implements C1683ag<T>, C1690c, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: a */
        final C1683ag<? super T> f6705a;

        /* renamed from: b */
        final C1722f f6706b = new C1722f();

        /* renamed from: c */
        final C1685ai<? extends T> f6707c;

        public final void run() {
            this.f6707c.mo6159b(this);
        }

        public final void dispose() {
            C1718b.dispose(this);
            this.f6706b.dispose();
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            this.f6705a.onError(th);
        }

        public final void onSuccess(T t) {
            this.f6705a.onSuccess(t);
        }

        C2058a(C1683ag<? super T> agVar, C1685ai<? extends T> aiVar) {
            this.f6705a = agVar;
            this.f6707c = aiVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        C2058a aVar = new C2058a(agVar, this.f6703a);
        agVar.onSubscribe(aVar);
        aVar.f6706b.replace(this.f6704b.mo6139a(aVar));
    }

    public C2057o(C1685ai<? extends T> aiVar, C1675ac acVar) {
        this.f6703a = aiVar;
        this.f6704b = acVar;
    }
}
