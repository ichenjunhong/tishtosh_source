package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.d.am */
public final class C1923am<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1711f<? super Throwable, ? extends T> f6277b;

    /* renamed from: c.a.e.e.d.am$a */
    static final class C1924a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6278a;

        /* renamed from: b */
        final C1711f<? super Throwable, ? extends T> f6279b;

        /* renamed from: c */
        C1690c f6280c;

        public final void dispose() {
            this.f6280c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6280c.isDisposed();
        }

        public final void onComplete() {
            this.f6278a.onComplete();
        }

        public final void onNext(T t) {
            this.f6278a.onNext(t);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6280c, cVar)) {
                this.f6280c = cVar;
                this.f6278a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            try {
                Object apply = this.f6279b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f6278a.onError(nullPointerException);
                    return;
                }
                this.f6278a.onNext(apply);
                this.f6278a.onComplete();
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6278a.onError(new C1695a(th, th2));
            }
        }

        C1924a(C1674ab<? super T> abVar, C1711f<? super Throwable, ? extends T> fVar) {
            this.f6278a = abVar;
            this.f6279b = fVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C1924a(abVar, this.f6277b));
    }

    public C1923am(C2206z<T> zVar, C1711f<? super Throwable, ? extends T> fVar) {
        super(zVar);
        this.f6277b = fVar;
    }
}
