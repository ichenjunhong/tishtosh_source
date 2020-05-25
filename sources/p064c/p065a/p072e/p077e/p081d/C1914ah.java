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

/* renamed from: c.a.e.e.d.ah */
public final class C1914ah extends C2201v<Long> {

    /* renamed from: a */
    final C1675ac f6243a;

    /* renamed from: b */
    final long f6244b;

    /* renamed from: c */
    final long f6245c;

    /* renamed from: d */
    final long f6246d;

    /* renamed from: e */
    final long f6247e;

    /* renamed from: f */
    final TimeUnit f6248f;

    /* renamed from: c.a.e.e.d.ah$a */
    static final class C1915a extends AtomicReference<C1690c> implements C1690c, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* renamed from: a */
        final C1674ab<? super Long> f6249a;

        /* renamed from: b */
        final long f6250b;

        /* renamed from: c */
        long f6251c;

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
                long j = this.f6251c;
                this.f6249a.onNext(Long.valueOf(j));
                if (j == this.f6250b) {
                    C1718b.dispose(this);
                    this.f6249a.onComplete();
                    return;
                }
                this.f6251c = j + 1;
            }
        }

        /* renamed from: a */
        public final void mo6317a(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        C1915a(C1674ab<? super Long> abVar, long j, long j2) {
            this.f6249a = abVar;
            this.f6251c = j;
            this.f6250b = j2;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super Long> abVar) {
        C1915a aVar = new C1915a(abVar, this.f6244b, this.f6245c);
        abVar.onSubscribe(aVar);
        C1675ac acVar = this.f6243a;
        if (acVar instanceof C2107s) {
            C1678c a = acVar.mo6130a();
            aVar.mo6317a(a);
            a.mo6145a(aVar, this.f6246d, this.f6247e, this.f6248f);
            return;
        }
        aVar.mo6317a(acVar.mo6140a(aVar, this.f6246d, this.f6247e, this.f6248f));
    }

    public C1914ah(long j, long j2, long j3, long j4, TimeUnit timeUnit, C1675ac acVar) {
        this.f6246d = j3;
        this.f6247e = j4;
        this.f6248f = timeUnit;
        this.f6243a = acVar;
        this.f6244b = j;
        this.f6245c = j2;
    }
}
