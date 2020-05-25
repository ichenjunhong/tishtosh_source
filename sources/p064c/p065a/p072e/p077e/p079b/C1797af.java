package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C1675ac;
import p064c.p065a.C2149h;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1701c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p086i.C2122f;

/* renamed from: c.a.e.e.b.af */
public final class C1797af extends C2149h<Long> {

    /* renamed from: a */
    final C1675ac f5955a;

    /* renamed from: c */
    final long f5956c;

    /* renamed from: d */
    final TimeUnit f5957d;

    /* renamed from: c.a.e.e.b.af$a */
    static final class C1798a extends AtomicReference<C1690c> implements Runnable, C53696d {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final C53695c<? super Long> f5958a;

        /* renamed from: b */
        volatile boolean f5959b;

        public final void cancel() {
            C1718b.dispose(this);
        }

        public final void run() {
            if (get() != C1718b.DISPOSED) {
                if (this.f5959b) {
                    this.f5958a.onNext(Long.valueOf(0));
                    lazySet(C1719c.INSTANCE);
                    this.f5958a.onComplete();
                    return;
                }
                lazySet(C1719c.INSTANCE);
                this.f5958a.onError(new C1701c("Can't deliver value due to lack of requests"));
            }
        }

        C1798a(C53695c<? super Long> cVar) {
            this.f5958a = cVar;
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                this.f5959b = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super Long> cVar) {
        C1798a aVar = new C1798a(cVar);
        cVar.onSubscribe(aVar);
        C1718b.trySet(aVar, this.f5955a.mo6131a(aVar, this.f5956c, this.f5957d));
    }

    public C1797af(long j, TimeUnit timeUnit, C1675ac acVar) {
        this.f5956c = j;
        this.f5957d = timeUnit;
        this.f5955a = acVar;
    }
}
