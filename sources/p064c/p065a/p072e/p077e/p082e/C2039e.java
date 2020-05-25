package p064c.p065a.p072e.p077e.p082e;

import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1710e;

/* renamed from: c.a.e.e.e.e */
public final class C2039e<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1685ai<T> f6668a;

    /* renamed from: b */
    final C1710e<? super T> f6669b;

    /* renamed from: c.a.e.e.e.e$a */
    final class C2040a implements C1683ag<T> {

        /* renamed from: a */
        final C1683ag<? super T> f6670a;

        public final void onError(Throwable th) {
            this.f6670a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            this.f6670a.onSubscribe(cVar);
        }

        public final void onSuccess(T t) {
            try {
                C2039e.this.f6669b.accept(t);
                this.f6670a.onSuccess(t);
            } catch (Throwable th) {
                C1700b.m6017b(th);
                this.f6670a.onError(th);
            }
        }

        C2040a(C1683ag<? super T> agVar) {
            this.f6670a = agVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6668a.mo6159b(new C2040a(agVar));
    }

    public C2039e(C1685ai<T> aiVar, C1710e<? super T> eVar) {
        this.f6668a = aiVar;
        this.f6669b = eVar;
    }
}
