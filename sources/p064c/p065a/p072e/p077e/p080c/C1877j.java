package p064c.p065a.p072e.p077e.p080c;

import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.e.c.j */
public final class C1877j<T> extends C1862a<T, T> {

    /* renamed from: b */
    final C1711f<? super Throwable, ? extends T> f6166b;

    /* renamed from: c.a.e.e.c.j$a */
    static final class C1878a<T> implements C1690c, C2196q<T> {

        /* renamed from: a */
        final C2196q<? super T> f6167a;

        /* renamed from: b */
        final C1711f<? super Throwable, ? extends T> f6168b;

        /* renamed from: c */
        C1690c f6169c;

        public final void dispose() {
            this.f6169c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6169c.isDisposed();
        }

        public final void onComplete() {
            this.f6167a.onComplete();
        }

        public final void onSuccess(T t) {
            this.f6167a.onSuccess(t);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6169c, cVar)) {
                this.f6169c = cVar;
                this.f6167a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            try {
                this.f6167a.onSuccess(C1745b.m6050a(this.f6168b.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6167a.onError(new C1695a(th, th2));
            }
        }

        C1878a(C2196q<? super T> qVar, C1711f<? super Throwable, ? extends T> fVar) {
            this.f6167a = qVar;
            this.f6168b = fVar;
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        this.f6137a.mo6495b(new C1878a(qVar, this.f6166b));
    }

    public C1877j(C2198s<T> sVar, C1711f<? super Throwable, ? extends T> fVar) {
        super(sVar);
        this.f6166b = fVar;
    }
}
