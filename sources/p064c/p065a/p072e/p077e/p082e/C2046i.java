package p064c.p065a.p072e.p077e.p082e;

import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.e.i */
public final class C2046i<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1685ai<? extends T> f6680a;

    /* renamed from: c.a.e.e.e.i$a */
    static final class C2047a<T> implements C1683ag<T>, C1690c {

        /* renamed from: a */
        final C1683ag<? super T> f6681a;

        /* renamed from: b */
        C1690c f6682b;

        public final void dispose() {
            this.f6682b.dispose();
        }

        public final boolean isDisposed() {
            return this.f6682b.isDisposed();
        }

        C2047a(C1683ag<? super T> agVar) {
            this.f6681a = agVar;
        }

        public final void onError(Throwable th) {
            this.f6681a.onError(th);
        }

        public final void onSuccess(T t) {
            this.f6681a.onSuccess(t);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6682b, cVar)) {
                this.f6682b = cVar;
                this.f6681a.onSubscribe(this);
            }
        }
    }

    public C2046i(C1685ai<? extends T> aiVar) {
        this.f6680a = aiVar;
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6680a.mo6159b(new C2047a(agVar));
    }
}
