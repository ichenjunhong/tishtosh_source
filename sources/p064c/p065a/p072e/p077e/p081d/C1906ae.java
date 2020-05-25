package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C1687b;
import p064c.p065a.C1705d;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p075c.C1749c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.ae */
public final class C1906ae<T> extends C1687b implements C1749c<T> {

    /* renamed from: a */
    final C2206z<T> f6231a;

    /* renamed from: c.a.e.e.d.ae$a */
    static final class C1907a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1705d f6232a;

        /* renamed from: b */
        C1690c f6233b;

        public final void onNext(T t) {
        }

        public final void dispose() {
            this.f6233b.dispose();
        }

        public final boolean isDisposed() {
            return this.f6233b.isDisposed();
        }

        public final void onComplete() {
            this.f6232a.onComplete();
        }

        C1907a(C1705d dVar) {
            this.f6232a = dVar;
        }

        public final void onError(Throwable th) {
            this.f6232a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            this.f6233b = cVar;
            this.f6232a.onSubscribe(this);
        }
    }

    public final C2201v<T> cz_() {
        return C2150a.m6486a((C2201v<T>) new C1904ad<T>(this.f6231a));
    }

    public C1906ae(C2206z<T> zVar) {
        this.f6231a = zVar;
    }

    /* renamed from: b */
    public final void mo6178b(C1705d dVar) {
        this.f6231a.mo6314a(new C1907a(dVar));
    }
}
