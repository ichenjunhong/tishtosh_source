package p064c.p065a.p072e.p077e.p081d;

import java.util.Collection;
import java.util.concurrent.Callable;
import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.e.d.bd */
public final class C1972bd<T, U extends Collection<? super T>> extends C1896a<T, U> {

    /* renamed from: b */
    final Callable<U> f6426b;

    /* renamed from: c.a.e.e.d.bd$a */
    static final class C1973a<T, U extends Collection<? super T>> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super U> f6427a;

        /* renamed from: b */
        C1690c f6428b;

        /* renamed from: c */
        U f6429c;

        public final void dispose() {
            this.f6428b.dispose();
        }

        public final boolean isDisposed() {
            return this.f6428b.isDisposed();
        }

        public final void onComplete() {
            U u = this.f6429c;
            this.f6429c = null;
            this.f6427a.onNext(u);
            this.f6427a.onComplete();
        }

        public final void onNext(T t) {
            this.f6429c.add(t);
        }

        public final void onError(Throwable th) {
            this.f6429c = null;
            this.f6427a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6428b, cVar)) {
                this.f6428b = cVar;
                this.f6427a.onSubscribe(this);
            }
        }

        C1973a(C1674ab<? super U> abVar, U u) {
            this.f6427a = abVar;
            this.f6429c = u;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super U> abVar) {
        try {
            this.f6202a.mo6314a(new C1973a(abVar, (Collection) C1745b.m6050a(this.f6426b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C1719c.error(th, abVar);
        }
    }

    public C1972bd(C2206z<T> zVar, Callable<U> callable) {
        super(zVar);
        this.f6426b = callable;
    }
}
