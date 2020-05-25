package p064c.p065a.p072e.p077e.p080c;

import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.C2193n;
import p064c.p065a.C2196q;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.c.e */
public final class C1868e<T> extends C2193n<T> {

    /* renamed from: a */
    final C1685ai<T> f6147a;

    /* renamed from: b */
    final C1715j<? super T> f6148b;

    /* renamed from: c.a.e.e.c.e$a */
    static final class C1869a<T> implements C1683ag<T>, C1690c {

        /* renamed from: a */
        final C2196q<? super T> f6149a;

        /* renamed from: b */
        final C1715j<? super T> f6150b;

        /* renamed from: c */
        C1690c f6151c;

        public final boolean isDisposed() {
            return this.f6151c.isDisposed();
        }

        public final void dispose() {
            C1690c cVar = this.f6151c;
            this.f6151c = C1718b.DISPOSED;
            cVar.dispose();
        }

        public final void onError(Throwable th) {
            this.f6149a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6151c, cVar)) {
                this.f6151c = cVar;
                this.f6149a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            try {
                if (this.f6150b.mo6207a(t)) {
                    this.f6149a.onSuccess(t);
                } else {
                    this.f6149a.onComplete();
                }
            } catch (Throwable th) {
                C1700b.m6017b(th);
                this.f6149a.onError(th);
            }
        }

        C1869a(C2196q<? super T> qVar, C1715j<? super T> jVar) {
            this.f6149a = qVar;
            this.f6150b = jVar;
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        this.f6147a.mo6159b(new C1869a(qVar, this.f6148b));
    }

    public C1868e(C1685ai<T> aiVar, C1715j<? super T> jVar) {
        this.f6147a = aiVar;
        this.f6148b = jVar;
    }
}
