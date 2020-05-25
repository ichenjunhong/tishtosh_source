package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.C2193n;
import p064c.p065a.C2196q;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p075c.C1748b;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.ac */
public final class C1790ac<T> extends C2193n<T> implements C1748b<T> {

    /* renamed from: a */
    final C2149h<T> f5933a;

    /* renamed from: c.a.e.e.b.ac$a */
    static final class C1791a<T> implements C1690c, C2177l<T> {

        /* renamed from: a */
        final C2196q<? super T> f5934a;

        /* renamed from: b */
        C53696d f5935b;

        /* renamed from: c */
        boolean f5936c;

        /* renamed from: d */
        T f5937d;

        public final void dispose() {
            this.f5935b.cancel();
            this.f5935b = C2122f.CANCELLED;
        }

        public final boolean isDisposed() {
            if (this.f5935b == C2122f.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            if (!this.f5936c) {
                this.f5936c = true;
                this.f5935b = C2122f.CANCELLED;
                T t = this.f5937d;
                this.f5937d = null;
                if (t == null) {
                    this.f5934a.onComplete();
                } else {
                    this.f5934a.onSuccess(t);
                }
            }
        }

        C1791a(C2196q<? super T> qVar) {
            this.f5934a = qVar;
        }

        public final void onError(Throwable th) {
            if (this.f5936c) {
                C2150a.m6492a(th);
                return;
            }
            this.f5936c = true;
            this.f5935b = C2122f.CANCELLED;
            this.f5934a.onError(th);
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f5935b, dVar)) {
                this.f5935b = dVar;
                this.f5934a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f5936c) {
                if (this.f5937d != null) {
                    this.f5936c = true;
                    this.f5935b.cancel();
                    this.f5935b = C2122f.CANCELLED;
                    this.f5934a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f5937d = t;
            }
        }
    }

    public final C2149h<T> cy_() {
        return C2150a.m6483a((C2149h<T>) new C1788ab<T>(this.f5933a, null, false));
    }

    public C1790ac(C2149h<T> hVar) {
        this.f5933a = hVar;
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        this.f5933a.mo6449a((C2177l<? super T>) new C1791a<Object>(qVar));
    }
}
