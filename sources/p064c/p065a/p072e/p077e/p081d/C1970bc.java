package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;

/* renamed from: c.a.e.e.d.bc */
public final class C1970bc extends C2201v<Long> {

    /* renamed from: a */
    final C1675ac f6422a;

    /* renamed from: b */
    final long f6423b;

    /* renamed from: c */
    final TimeUnit f6424c;

    /* renamed from: c.a.e.e.d.bc$a */
    static final class C1971a extends AtomicReference<C1690c> implements C1690c, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final C1674ab<? super Long> f6425a;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            if (get() == C1718b.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void run() {
            if (!isDisposed()) {
                this.f6425a.onNext(Long.valueOf(0));
                lazySet(C1719c.INSTANCE);
                this.f6425a.onComplete();
            }
        }

        C1971a(C1674ab<? super Long> abVar) {
            this.f6425a = abVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super Long> abVar) {
        C1971a aVar = new C1971a(abVar);
        abVar.onSubscribe(aVar);
        C1718b.trySet(aVar, this.f6422a.mo6131a(aVar, this.f6423b, this.f6424c));
    }

    public C1970bc(long j, TimeUnit timeUnit, C1675ac acVar) {
        this.f6423b = j;
        this.f6424c = timeUnit;
        this.f6422a = acVar;
    }
}
