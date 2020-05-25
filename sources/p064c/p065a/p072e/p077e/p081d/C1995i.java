package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.TimeUnit;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p089g.C2148c;

/* renamed from: c.a.e.e.d.i */
public final class C1995i<T> extends C1896a<T, T> {

    /* renamed from: b */
    final long f6534b;

    /* renamed from: c */
    final TimeUnit f6535c;

    /* renamed from: d */
    final C1675ac f6536d;

    /* renamed from: e */
    final boolean f6537e;

    /* renamed from: c.a.e.e.d.i$a */
    static final class C1996a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6538a;

        /* renamed from: b */
        final long f6539b;

        /* renamed from: c */
        final TimeUnit f6540c;

        /* renamed from: d */
        final C1678c f6541d;

        /* renamed from: e */
        final boolean f6542e;

        /* renamed from: f */
        C1690c f6543f;

        /* renamed from: c.a.e.e.d.i$a$a */
        final class C1997a implements Runnable {
            public final void run() {
                try {
                    C1996a.this.f6538a.onComplete();
                } finally {
                    C1996a.this.f6541d.dispose();
                }
            }

            C1997a() {
            }
        }

        /* renamed from: c.a.e.e.d.i$a$b */
        final class C1998b implements Runnable {

            /* renamed from: b */
            private final Throwable f6546b;

            public final void run() {
                try {
                    C1996a.this.f6538a.onError(this.f6546b);
                } finally {
                    C1996a.this.f6541d.dispose();
                }
            }

            C1998b(Throwable th) {
                this.f6546b = th;
            }
        }

        /* renamed from: c.a.e.e.d.i$a$c */
        final class C1999c implements Runnable {

            /* renamed from: b */
            private final T f6548b;

            public final void run() {
                C1996a.this.f6538a.onNext(this.f6548b);
            }

            C1999c(T t) {
                this.f6548b = t;
            }
        }

        public final boolean isDisposed() {
            return this.f6541d.isDisposed();
        }

        public final void dispose() {
            this.f6543f.dispose();
            this.f6541d.dispose();
        }

        public final void onComplete() {
            this.f6541d.mo6132a(new C1997a(), this.f6539b, this.f6540c);
        }

        public final void onNext(T t) {
            this.f6541d.mo6132a(new C1999c(t), this.f6539b, this.f6540c);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6543f, cVar)) {
                this.f6543f = cVar;
                this.f6538a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            long j;
            C1678c cVar = this.f6541d;
            C1998b bVar = new C1998b(th);
            if (this.f6542e) {
                j = this.f6539b;
            } else {
                j = 0;
            }
            cVar.mo6132a(bVar, j, this.f6540c);
        }

        C1996a(C1674ab<? super T> abVar, long j, TimeUnit timeUnit, C1678c cVar, boolean z) {
            this.f6538a = abVar;
            this.f6539b = j;
            this.f6540c = timeUnit;
            this.f6541d = cVar;
            this.f6542e = z;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1674ab<? super T> abVar2;
        if (this.f6537e) {
            abVar2 = abVar;
        } else {
            abVar2 = new C2148c<>(abVar);
        }
        C1678c a = this.f6536d.mo6130a();
        C2206z zVar = this.f6202a;
        C1996a aVar = new C1996a(abVar2, this.f6534b, this.f6535c, a, this.f6537e);
        zVar.mo6314a(aVar);
    }

    public C1995i(C2206z<T> zVar, long j, TimeUnit timeUnit, C1675ac acVar, boolean z) {
        super(zVar);
        this.f6534b = j;
        this.f6535c = timeUnit;
        this.f6536d = acVar;
        this.f6537e = z;
    }
}
