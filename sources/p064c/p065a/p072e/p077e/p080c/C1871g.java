package p064c.p065a.p072e.p077e.p080c;

import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.e.c.g */
public final class C1871g<T, R> extends C1862a<T, R> {

    /* renamed from: b */
    final C1711f<? super T, ? extends R> f6153b;

    /* renamed from: c.a.e.e.c.g$a */
    static final class C1872a<T, R> implements C1690c, C2196q<T> {

        /* renamed from: a */
        final C2196q<? super R> f6154a;

        /* renamed from: b */
        final C1711f<? super T, ? extends R> f6155b;

        /* renamed from: c */
        C1690c f6156c;

        public final boolean isDisposed() {
            return this.f6156c.isDisposed();
        }

        public final void onComplete() {
            this.f6154a.onComplete();
        }

        public final void dispose() {
            C1690c cVar = this.f6156c;
            this.f6156c = C1718b.DISPOSED;
            cVar.dispose();
        }

        public final void onError(Throwable th) {
            this.f6154a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6156c, cVar)) {
                this.f6156c = cVar;
                this.f6154a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            try {
                this.f6154a.onSuccess(C1745b.m6050a(this.f6155b.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                C1700b.m6017b(th);
                this.f6154a.onError(th);
            }
        }

        C1872a(C2196q<? super R> qVar, C1711f<? super T, ? extends R> fVar) {
            this.f6154a = qVar;
            this.f6155b = fVar;
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super R> qVar) {
        this.f6137a.mo6495b(new C1872a(qVar, this.f6153b));
    }

    public C1871g(C2198s<T> sVar, C1711f<? super T, ? extends R> fVar) {
        super(sVar);
        this.f6153b = fVar;
    }
}
