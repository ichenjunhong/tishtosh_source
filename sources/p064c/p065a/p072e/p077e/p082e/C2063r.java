package p064c.p065a.p072e.p077e.p082e;

import p064c.p065a.C1674ab;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p076d.C1764i;

/* renamed from: c.a.e.e.e.r */
public final class C2063r<T> extends C2201v<T> {

    /* renamed from: a */
    final C1685ai<? extends T> f6714a;

    /* renamed from: c.a.e.e.e.r$a */
    static final class C2064a<T> extends C1764i<T> implements C1683ag<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: c */
        C1690c f6715c;

        public final void dispose() {
            super.dispose();
            this.f6715c.dispose();
        }

        C2064a(C1674ab<? super T> abVar) {
            super(abVar);
        }

        public final void onError(Throwable th) {
            error(th);
        }

        public final void onSuccess(T t) {
            complete(t);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6715c, cVar)) {
                this.f6715c = cVar;
                this.f5882a.onSubscribe(this);
            }
        }
    }

    public C2063r(C1685ai<? extends T> aiVar) {
        this.f6714a = aiVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6714a.mo6159b(new C2064a(abVar));
    }
}
