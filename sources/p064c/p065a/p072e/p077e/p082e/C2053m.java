package p064c.p065a.p072e.p077e.p082e;

import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;

/* renamed from: c.a.e.e.e.m */
public final class C2053m<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1685ai<? extends T> f6694a;

    /* renamed from: b */
    final C1711f<? super Throwable, ? extends T> f6695b;

    /* renamed from: c */
    final T f6696c = null;

    /* renamed from: c.a.e.e.e.m$a */
    final class C2054a implements C1683ag<T> {

        /* renamed from: b */
        private final C1683ag<? super T> f6698b;

        public final void onSubscribe(C1690c cVar) {
            this.f6698b.onSubscribe(cVar);
        }

        public final void onSuccess(T t) {
            this.f6698b.onSuccess(t);
        }

        public final void onError(Throwable th) {
            T t;
            if (C2053m.this.f6695b != null) {
                try {
                    t = C2053m.this.f6695b.apply(th);
                } catch (Throwable th2) {
                    C1700b.m6017b(th2);
                    this.f6698b.onError(new C1695a(th, th2));
                    return;
                }
            } else {
                t = C2053m.this.f6696c;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f6698b.onError(nullPointerException);
                return;
            }
            this.f6698b.onSuccess(t);
        }

        C2054a(C1683ag<? super T> agVar) {
            this.f6698b = agVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6694a.mo6159b(new C2054a(agVar));
    }

    public C2053m(C1685ai<? extends T> aiVar, C1711f<? super Throwable, ? extends T> fVar, T t) {
        this.f6694a = aiVar;
        this.f6695b = fVar;
    }
}
