package p064c.p065a.p072e.p077e.p078a;

import p064c.p065a.C1687b;
import p064c.p065a.C1705d;
import p064c.p065a.C2142f;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1715j;

/* renamed from: c.a.e.e.a.f */
public final class C1781f extends C1687b {

    /* renamed from: a */
    final C2142f f5915a;

    /* renamed from: b */
    final C1715j<? super Throwable> f5916b;

    /* renamed from: c.a.e.e.a.f$a */
    final class C1782a implements C1705d {

        /* renamed from: b */
        private final C1705d f5918b;

        public final void onComplete() {
            this.f5918b.onComplete();
        }

        public final void onSubscribe(C1690c cVar) {
            this.f5918b.onSubscribe(cVar);
        }

        public final void onError(Throwable th) {
            try {
                if (C1781f.this.f5916b.mo6207a(th)) {
                    this.f5918b.onComplete();
                } else {
                    this.f5918b.onError(th);
                }
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f5918b.onError(new C1695a(th, th2));
            }
        }

        C1782a(C1705d dVar) {
            this.f5918b = dVar;
        }
    }

    /* renamed from: b */
    public final void mo6178b(C1705d dVar) {
        this.f5915a.mo6175a(new C1782a(dVar));
    }

    public C1781f(C2142f fVar, C1715j<? super Throwable> jVar) {
        this.f5915a = fVar;
        this.f5916b = jVar;
    }
}
