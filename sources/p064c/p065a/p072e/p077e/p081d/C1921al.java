package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1722f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.al */
public final class C1921al<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1711f<? super Throwable, ? extends C2206z<? extends T>> f6269b;

    /* renamed from: c */
    final boolean f6270c;

    /* renamed from: c.a.e.e.d.al$a */
    static final class C1922a<T> implements C1674ab<T> {

        /* renamed from: a */
        final C1674ab<? super T> f6271a;

        /* renamed from: b */
        final C1711f<? super Throwable, ? extends C2206z<? extends T>> f6272b;

        /* renamed from: c */
        final boolean f6273c;

        /* renamed from: d */
        final C1722f f6274d = new C1722f();

        /* renamed from: e */
        boolean f6275e;

        /* renamed from: f */
        boolean f6276f;

        public final void onComplete() {
            if (!this.f6276f) {
                this.f6276f = true;
                this.f6275e = true;
                this.f6271a.onComplete();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            this.f6274d.replace(cVar);
        }

        public final void onNext(T t) {
            if (!this.f6276f) {
                this.f6271a.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            if (!this.f6275e) {
                this.f6275e = true;
                if (!this.f6273c || (th instanceof Exception)) {
                    try {
                        C2206z zVar = (C2206z) this.f6272b.apply(th);
                        if (zVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f6271a.onError(nullPointerException);
                            return;
                        }
                        zVar.mo6314a(this);
                    } catch (Throwable th2) {
                        C1700b.m6017b(th2);
                        this.f6271a.onError(new C1695a(th, th2));
                    }
                } else {
                    this.f6271a.onError(th);
                }
            } else if (this.f6276f) {
                C2150a.m6492a(th);
            } else {
                this.f6271a.onError(th);
            }
        }

        C1922a(C1674ab<? super T> abVar, C1711f<? super Throwable, ? extends C2206z<? extends T>> fVar, boolean z) {
            this.f6271a = abVar;
            this.f6272b = fVar;
            this.f6273c = z;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1922a aVar = new C1922a(abVar, this.f6269b, this.f6270c);
        abVar.onSubscribe(aVar.f6274d);
        this.f6202a.mo6314a(aVar);
    }

    public C1921al(C2206z<T> zVar, C1711f<? super Throwable, ? extends C2206z<? extends T>> fVar, boolean z) {
        super(zVar);
        this.f6269b = fVar;
        this.f6270c = z;
    }
}
