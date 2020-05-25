package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.atomic.AtomicInteger;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p086i.C2121e;

/* renamed from: c.a.e.e.b.x */
public final class C1854x<T> extends C1785a<T, T> {

    /* renamed from: c */
    final C1715j<? super Throwable> f6116c;

    /* renamed from: d */
    final long f6117d;

    /* renamed from: c.a.e.e.b.x$a */
    static final class C1855a<T> extends AtomicInteger implements C2177l<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: a */
        final C53695c<? super T> f6118a;

        /* renamed from: b */
        final C2121e f6119b;

        /* renamed from: c */
        final C53694b<? extends T> f6120c;

        /* renamed from: d */
        final C1715j<? super Throwable> f6121d;

        /* renamed from: e */
        long f6122e;

        /* renamed from: f */
        long f6123f;

        public final void onComplete() {
            this.f6118a.onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6297a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f6119b.isCancelled()) {
                    long j = this.f6123f;
                    if (j != 0) {
                        this.f6123f = 0;
                        this.f6119b.produced(j);
                    }
                    this.f6120c.mo336a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }

        public final void onSubscribe(C53696d dVar) {
            this.f6119b.setSubscription(dVar);
        }

        public final void onNext(T t) {
            this.f6123f++;
            this.f6118a.onNext(t);
        }

        public final void onError(Throwable th) {
            long j = this.f6122e;
            if (j != Long.MAX_VALUE) {
                this.f6122e = j - 1;
            }
            if (j == 0) {
                this.f6118a.onError(th);
                return;
            }
            try {
                if (!this.f6121d.mo6207a(th)) {
                    this.f6118a.onError(th);
                } else {
                    mo6297a();
                }
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6118a.onError(new C1695a(th, th2));
            }
        }

        C1855a(C53695c<? super T> cVar, long j, C1715j<? super Throwable> jVar, C2121e eVar, C53694b<? extends T> bVar) {
            this.f6118a = cVar;
            this.f6119b = eVar;
            this.f6120c = bVar;
            this.f6121d = jVar;
            this.f6122e = j;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        C2121e eVar = new C2121e(false);
        cVar.onSubscribe(eVar);
        C1855a aVar = new C1855a(cVar, this.f6117d, this.f6116c, eVar, this.f5924a);
        aVar.mo6297a();
    }

    public C1854x(C2149h<T> hVar, long j, C1715j<? super Throwable> jVar) {
        super(hVar);
        this.f6116c = jVar;
        this.f6117d = j;
    }
}
