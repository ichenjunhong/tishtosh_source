package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.C2149h;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1701c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p084g.C2107s;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;

/* renamed from: c.a.e.e.b.n */
public final class C1830n extends C2149h<Long> {

    /* renamed from: a */
    final C1675ac f6046a;

    /* renamed from: c */
    final long f6047c;

    /* renamed from: d */
    final long f6048d;

    /* renamed from: e */
    final TimeUnit f6049e;

    /* renamed from: c.a.e.e.b.n$a */
    static final class C1831a extends AtomicLong implements Runnable, C53696d {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final C53695c<? super Long> f6050a;

        /* renamed from: b */
        long f6051b;

        /* renamed from: c */
        final AtomicReference<C1690c> f6052c = new AtomicReference<>();

        public final void cancel() {
            C1718b.dispose(this.f6052c);
        }

        public final void run() {
            if (this.f6052c.get() != C1718b.DISPOSED) {
                if (get() != 0) {
                    C53695c<? super Long> cVar = this.f6050a;
                    long j = this.f6051b;
                    this.f6051b = j + 1;
                    cVar.onNext(Long.valueOf(j));
                    C2127d.m6416b(this, 1);
                    return;
                }
                C53695c<? super Long> cVar2 = this.f6050a;
                StringBuilder sb = new StringBuilder("Can't deliver value ");
                sb.append(this.f6051b);
                sb.append(" due to lack of requests");
                cVar2.onError(new C1701c(sb.toString()));
                C1718b.dispose(this.f6052c);
            }
        }

        /* renamed from: a */
        public final void mo6289a(C1690c cVar) {
            C1718b.setOnce(this.f6052c, cVar);
        }

        C1831a(C53695c<? super Long> cVar) {
            this.f6050a = cVar;
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                C2127d.m6415a((AtomicLong) this, j);
            }
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super Long> cVar) {
        C1831a aVar = new C1831a(cVar);
        cVar.onSubscribe(aVar);
        C1675ac acVar = this.f6046a;
        if (acVar instanceof C2107s) {
            C1678c a = acVar.mo6130a();
            aVar.mo6289a(a);
            a.mo6145a(aVar, this.f6047c, this.f6048d, this.f6049e);
            return;
        }
        aVar.mo6289a(acVar.mo6140a(aVar, this.f6047c, this.f6048d, this.f6049e));
    }

    public C1830n(long j, long j2, TimeUnit timeUnit, C1675ac acVar) {
        this.f6047c = j;
        this.f6048d = j2;
        this.f6049e = timeUnit;
        this.f6046a = acVar;
    }
}
