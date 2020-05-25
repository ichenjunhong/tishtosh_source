package p064c.p065a.p072e.p077e.p080c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C2193n;
import p064c.p065a.C2196q;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.c.o */
public final class C1891o extends C2193n<Long> {

    /* renamed from: a */
    final long f6196a;

    /* renamed from: b */
    final TimeUnit f6197b;

    /* renamed from: c */
    final C1675ac f6198c;

    /* renamed from: c.a.e.e.c.o$a */
    static final class C1892a extends AtomicReference<C1690c> implements C1690c, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* renamed from: a */
        final C2196q<? super Long> f6199a;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void run() {
            this.f6199a.onSuccess(Long.valueOf(0));
        }

        C1892a(C2196q<? super Long> qVar) {
            this.f6199a = qVar;
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super Long> qVar) {
        C1892a aVar = new C1892a(qVar);
        qVar.onSubscribe(aVar);
        C1718b.replace(aVar, this.f6198c.mo6131a(aVar, this.f6196a, this.f6197b));
    }

    public C1891o(long j, TimeUnit timeUnit, C1675ac acVar) {
        this.f6196a = j;
        this.f6197b = timeUnit;
        this.f6198c = acVar;
    }
}
