package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C1674ab;
import p064c.p065a.C2149h;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;

/* renamed from: c.a.e.e.b.k */
public final class C1825k<T> extends C2149h<T> {

    /* renamed from: a */
    private final C2201v<T> f6041a;

    /* renamed from: c.a.e.e.b.k$a */
    static final class C1826a<T> implements C1674ab<T>, C53696d {

        /* renamed from: a */
        final C53695c<? super T> f6042a;

        /* renamed from: b */
        C1690c f6043b;

        public final void request(long j) {
        }

        public final void cancel() {
            this.f6043b.dispose();
        }

        public final void onComplete() {
            this.f6042a.onComplete();
        }

        C1826a(C53695c<? super T> cVar) {
            this.f6042a = cVar;
        }

        public final void onError(Throwable th) {
            this.f6042a.onError(th);
        }

        public final void onNext(T t) {
            this.f6042a.onNext(t);
        }

        public final void onSubscribe(C1690c cVar) {
            this.f6043b = cVar;
            this.f6042a.onSubscribe(this);
        }
    }

    public C1825k(C2201v<T> vVar) {
        this.f6041a = vVar;
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f6041a.mo6314a((C1674ab<? super T>) new C1826a<Object>(cVar));
    }
}
