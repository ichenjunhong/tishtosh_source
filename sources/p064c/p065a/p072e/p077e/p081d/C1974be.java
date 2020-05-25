package p064c.p065a.p072e.p077e.p081d;

import java.util.Collection;
import java.util.concurrent.Callable;
import p064c.p065a.C1674ab;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1723a.C1725b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p075c.C1749c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.be */
public final class C1974be<T, U extends Collection<? super T>> extends C1680ad<U> implements C1749c<U> {

    /* renamed from: a */
    final C2206z<T> f6430a;

    /* renamed from: b */
    final Callable<U> f6431b;

    /* renamed from: c.a.e.e.d.be$a */
    static final class C1975a<T, U extends Collection<? super T>> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1683ag<? super U> f6432a;

        /* renamed from: b */
        U f6433b;

        /* renamed from: c */
        C1690c f6434c;

        public final void dispose() {
            this.f6434c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6434c.isDisposed();
        }

        public final void onComplete() {
            U u = this.f6433b;
            this.f6433b = null;
            this.f6432a.onSuccess(u);
        }

        public final void onNext(T t) {
            this.f6433b.add(t);
        }

        public final void onError(Throwable th) {
            this.f6433b = null;
            this.f6432a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6434c, cVar)) {
                this.f6434c = cVar;
                this.f6432a.onSubscribe(this);
            }
        }

        C1975a(C1683ag<? super U> agVar, U u) {
            this.f6432a = agVar;
            this.f6433b = u;
        }
    }

    public final C2201v<U> cz_() {
        return C2150a.m6486a((C2201v<T>) new C1972bd<T>(this.f6430a, this.f6431b));
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super U> agVar) {
        try {
            this.f6430a.mo6314a(new C1975a(agVar, (Collection) C1745b.m6050a(this.f6431b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C1719c.error(th, agVar);
        }
    }

    public C1974be(C2206z<T> zVar, int i) {
        this.f6430a = zVar;
        this.f6431b = new C1725b(i);
    }
}
