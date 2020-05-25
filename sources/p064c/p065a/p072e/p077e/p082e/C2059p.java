package p064c.p065a.p072e.p077e.p082e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.e.p */
public final class C2059p extends C1680ad<Long> {

    /* renamed from: a */
    final long f6708a;

    /* renamed from: b */
    final TimeUnit f6709b;

    /* renamed from: c */
    final C1675ac f6710c;

    /* renamed from: c.a.e.e.e.p$a */
    static final class C2060a extends AtomicReference<C1690c> implements C1690c, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* renamed from: a */
        final C1683ag<? super Long> f6711a;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void run() {
            this.f6711a.onSuccess(Long.valueOf(0));
        }

        C2060a(C1683ag<? super Long> agVar) {
            this.f6711a = agVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super Long> agVar) {
        C2060a aVar = new C2060a(agVar);
        agVar.onSubscribe(aVar);
        C1718b.replace(aVar, this.f6710c.mo6131a(aVar, this.f6708a, this.f6709b));
    }

    public C2059p(long j, TimeUnit timeUnit, C1675ac acVar) {
        this.f6708a = j;
        this.f6709b = timeUnit;
        this.f6710c = acVar;
    }
}
