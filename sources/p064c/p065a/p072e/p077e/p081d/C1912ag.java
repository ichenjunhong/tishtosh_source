package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p084g.C2107s;

/* renamed from: c.a.e.e.d.ag */
public final class C1912ag extends C2201v<Long> {

    /* renamed from: a */
    final C1675ac f6237a;

    /* renamed from: b */
    final long f6238b;

    /* renamed from: c */
    final long f6239c;

    /* renamed from: d */
    final TimeUnit f6240d;

    /* renamed from: c.a.e.e.d.ag$a */
    static final class C1913a extends AtomicReference<C1690c> implements C1690c, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: a */
        final C1674ab<? super Long> f6241a;

        /* renamed from: b */
        long f6242b;

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
            if (get() != C1718b.DISPOSED) {
                C1674ab<? super Long> abVar = this.f6241a;
                long j = this.f6242b;
                this.f6242b = 1 + j;
                abVar.onNext(Long.valueOf(j));
            }
        }

        /* renamed from: a */
        public final void mo6315a(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        C1913a(C1674ab<? super Long> abVar) {
            this.f6241a = abVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super Long> abVar) {
        C1913a aVar = new C1913a(abVar);
        abVar.onSubscribe(aVar);
        C1675ac acVar = this.f6237a;
        if (acVar instanceof C2107s) {
            C1678c a = acVar.mo6130a();
            aVar.mo6315a(a);
            a.mo6145a(aVar, this.f6238b, this.f6239c, this.f6240d);
            return;
        }
        aVar.mo6315a(acVar.mo6140a(aVar, this.f6238b, this.f6239c, this.f6240d));
    }

    public C1912ag(long j, long j2, TimeUnit timeUnit, C1675ac acVar) {
        this.f6238b = j;
        this.f6239c = j2;
        this.f6240d = timeUnit;
        this.f6237a = acVar;
    }
}
