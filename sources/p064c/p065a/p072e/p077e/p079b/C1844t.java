package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.atomic.AtomicLong;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1701c;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.t */
public final class C1844t<T> extends C1785a<T, T> {

    /* renamed from: c.a.e.e.b.t$a */
    static final class C1845a<T> extends AtomicLong implements C2177l<T>, C53696d {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: a */
        final C53695c<? super T> f6095a;

        /* renamed from: b */
        C53696d f6096b;

        /* renamed from: c */
        boolean f6097c;

        public final void cancel() {
            this.f6096b.cancel();
        }

        public final void onComplete() {
            if (!this.f6097c) {
                this.f6097c = true;
                this.f6095a.onComplete();
            }
        }

        C1845a(C53695c<? super T> cVar) {
            this.f6095a = cVar;
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                C2127d.m6415a((AtomicLong) this, j);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6097c) {
                C2150a.m6492a(th);
                return;
            }
            this.f6097c = true;
            this.f6095a.onError(th);
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f6096b, dVar)) {
                this.f6096b = dVar;
                this.f6095a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f6097c) {
                if (get() != 0) {
                    this.f6095a.onNext(t);
                    C2127d.m6416b(this, 1);
                    return;
                }
                onError(new C1701c("could not emit value due to lack of requests"));
            }
        }
    }

    public C1844t(C2149h<T> hVar) {
        super(hVar);
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f5924a.mo6449a((C2177l<? super T>) new C1845a<Object>(cVar));
    }
}
