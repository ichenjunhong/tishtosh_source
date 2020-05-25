package p064c.p065a.p072e.p077e.p082e;

import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1710e;

/* renamed from: c.a.e.e.e.c */
public final class C2035c<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1685ai<T> f6659a;

    /* renamed from: b */
    final C1710e<? super Throwable> f6660b;

    /* renamed from: c.a.e.e.e.c$a */
    final class C2036a implements C1683ag<T> {

        /* renamed from: b */
        private final C1683ag<? super T> f6662b;

        public final void onSubscribe(C1690c cVar) {
            this.f6662b.onSubscribe(cVar);
        }

        public final void onSuccess(T t) {
            this.f6662b.onSuccess(t);
        }

        public final void onError(Throwable th) {
            try {
                C2035c.this.f6660b.accept(th);
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                th = new C1695a(th, th2);
            }
            this.f6662b.onError(th);
        }

        C2036a(C1683ag<? super T> agVar) {
            this.f6662b = agVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6659a.mo6159b(new C2036a(agVar));
    }

    public C2035c(C1685ai<T> aiVar, C1710e<? super Throwable> eVar) {
        this.f6659a = aiVar;
        this.f6660b = eVar;
    }
}
