package p064c.p065a.p072e.p077e.p081d;

import org.p2692b.C53694b;
import org.p2692b.C53696d;
import p064c.p065a.C1674ab;
import p064c.p065a.C2177l;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p086i.C2122f;

/* renamed from: c.a.e.e.d.z */
public final class C2029z<T> extends C2201v<T> {

    /* renamed from: a */
    final C53694b<? extends T> f6649a;

    /* renamed from: c.a.e.e.d.z$a */
    static final class C2030a<T> implements C1690c, C2177l<T> {

        /* renamed from: a */
        final C1674ab<? super T> f6650a;

        /* renamed from: b */
        C53696d f6651b;

        public final void onComplete() {
            this.f6650a.onComplete();
        }

        public final void dispose() {
            this.f6651b.cancel();
            this.f6651b = C2122f.CANCELLED;
        }

        public final boolean isDisposed() {
            if (this.f6651b == C2122f.CANCELLED) {
                return true;
            }
            return false;
        }

        C2030a(C1674ab<? super T> abVar) {
            this.f6650a = abVar;
        }

        public final void onError(Throwable th) {
            this.f6650a.onError(th);
        }

        public final void onNext(T t) {
            this.f6650a.onNext(t);
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f6651b, dVar)) {
                this.f6651b = dVar;
                this.f6650a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public C2029z(C53694b<? extends T> bVar) {
        this.f6649a = bVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6649a.mo336a(new C2030a(abVar));
    }
}
