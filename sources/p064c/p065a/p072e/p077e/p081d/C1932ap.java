package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.atomic.AtomicInteger;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p073a.C1722f;

/* renamed from: c.a.e.e.d.ap */
public final class C1932ap<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1715j<? super Throwable> f6307b;

    /* renamed from: c */
    final long f6308c;

    /* renamed from: c.a.e.e.d.ap$a */
    static final class C1933a<T> extends AtomicInteger implements C1674ab<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: a */
        final C1674ab<? super T> f6309a;

        /* renamed from: b */
        final C1722f f6310b;

        /* renamed from: c */
        final C2206z<? extends T> f6311c;

        /* renamed from: d */
        final C1715j<? super Throwable> f6312d;

        /* renamed from: e */
        long f6313e;

        public final void onComplete() {
            this.f6309a.onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6325a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f6310b.isDisposed()) {
                    this.f6311c.mo6314a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }

        public final void onNext(T t) {
            this.f6309a.onNext(t);
        }

        public final void onSubscribe(C1690c cVar) {
            this.f6310b.replace(cVar);
        }

        public final void onError(Throwable th) {
            long j = this.f6313e;
            if (j != Long.MAX_VALUE) {
                this.f6313e = j - 1;
            }
            if (j == 0) {
                this.f6309a.onError(th);
                return;
            }
            try {
                if (!this.f6312d.mo6207a(th)) {
                    this.f6309a.onError(th);
                } else {
                    mo6325a();
                }
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6309a.onError(new C1695a(th, th2));
            }
        }

        C1933a(C1674ab<? super T> abVar, long j, C1715j<? super Throwable> jVar, C1722f fVar, C2206z<? extends T> zVar) {
            this.f6309a = abVar;
            this.f6310b = fVar;
            this.f6311c = zVar;
            this.f6312d = jVar;
            this.f6313e = j;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1722f fVar = new C1722f();
        abVar.onSubscribe(fVar);
        C1933a aVar = new C1933a(abVar, this.f6308c, this.f6307b, fVar, this.f6202a);
        aVar.mo6325a();
    }

    public C1932ap(C2201v<T> vVar, long j, C1715j<? super Throwable> jVar) {
        super(vVar);
        this.f6307b = jVar;
        this.f6308c = j;
    }
}
