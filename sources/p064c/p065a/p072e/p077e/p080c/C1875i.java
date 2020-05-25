package p064c.p065a.p072e.p077e.p080c;

import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.c.i */
public final class C1875i<T> extends C1862a<T, T> {

    /* renamed from: b */
    final C1715j<? super Throwable> f6162b;

    /* renamed from: c.a.e.e.c.i$a */
    static final class C1876a<T> implements C1690c, C2196q<T> {

        /* renamed from: a */
        final C2196q<? super T> f6163a;

        /* renamed from: b */
        final C1715j<? super Throwable> f6164b;

        /* renamed from: c */
        C1690c f6165c;

        public final void dispose() {
            this.f6165c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6165c.isDisposed();
        }

        public final void onComplete() {
            this.f6163a.onComplete();
        }

        public final void onSuccess(T t) {
            this.f6163a.onSuccess(t);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6165c, cVar)) {
                this.f6165c = cVar;
                this.f6163a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            try {
                if (this.f6164b.mo6207a(th)) {
                    this.f6163a.onComplete();
                } else {
                    this.f6163a.onError(th);
                }
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6163a.onError(new C1695a(th, th2));
            }
        }

        C1876a(C2196q<? super T> qVar, C1715j<? super Throwable> jVar) {
            this.f6163a = qVar;
            this.f6164b = jVar;
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        this.f6137a.mo6495b(new C1876a(qVar, this.f6162b));
    }

    public C1875i(C2198s<T> sVar, C1715j<? super Throwable> jVar) {
        super(sVar);
        this.f6162b = jVar;
    }
}
