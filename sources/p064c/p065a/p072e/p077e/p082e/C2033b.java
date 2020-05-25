package p064c.p065a.p072e.p077e.p082e;

import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.e.b */
public final class C2033b<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1685ai<T> f6654a;

    /* renamed from: b */
    final C1710e<? super T> f6655b;

    /* renamed from: c.a.e.e.e.b$a */
    static final class C2034a<T> implements C1683ag<T>, C1690c {

        /* renamed from: a */
        final C1683ag<? super T> f6656a;

        /* renamed from: b */
        final C1710e<? super T> f6657b;

        /* renamed from: c */
        C1690c f6658c;

        public final void dispose() {
            this.f6658c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6658c.isDisposed();
        }

        public final void onError(Throwable th) {
            this.f6656a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6658c, cVar)) {
                this.f6658c = cVar;
                this.f6656a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.f6656a.onSuccess(t);
            try {
                this.f6657b.accept(t);
            } catch (Throwable th) {
                C1700b.m6017b(th);
                C2150a.m6492a(th);
            }
        }

        C2034a(C1683ag<? super T> agVar, C1710e<? super T> eVar) {
            this.f6656a = agVar;
            this.f6657b = eVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6654a.mo6159b(new C2034a(agVar, this.f6655b));
    }

    public C2033b(C1685ai<T> aiVar, C1710e<? super T> eVar) {
        this.f6654a = aiVar;
        this.f6655b = eVar;
    }
}
