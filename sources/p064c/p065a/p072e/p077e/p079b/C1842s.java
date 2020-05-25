package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.atomic.AtomicLong;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.s */
public final class C1842s<T> extends C1785a<T, T> implements C1710e<T> {

    /* renamed from: c */
    final C1710e<? super T> f6090c = this;

    /* renamed from: c.a.e.e.b.s$a */
    static final class C1843a<T> extends AtomicLong implements C2177l<T>, C53696d {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: a */
        final C53695c<? super T> f6091a;

        /* renamed from: b */
        final C1710e<? super T> f6092b;

        /* renamed from: c */
        C53696d f6093c;

        /* renamed from: d */
        boolean f6094d;

        public final void cancel() {
            this.f6093c.cancel();
        }

        public final void onComplete() {
            if (!this.f6094d) {
                this.f6094d = true;
                this.f6091a.onComplete();
            }
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                C2127d.m6415a((AtomicLong) this, j);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6094d) {
                C2150a.m6492a(th);
                return;
            }
            this.f6094d = true;
            this.f6091a.onError(th);
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f6093c, dVar)) {
                this.f6093c = dVar;
                this.f6091a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f6094d) {
                if (get() != 0) {
                    this.f6091a.onNext(t);
                    C2127d.m6416b(this, 1);
                    return;
                }
                try {
                    this.f6092b.accept(t);
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    cancel();
                    onError(th);
                }
            }
        }

        C1843a(C53695c<? super T> cVar, C1710e<? super T> eVar) {
            this.f6091a = cVar;
            this.f6092b = eVar;
        }
    }

    public final void accept(T t) {
    }

    public C1842s(C2149h<T> hVar) {
        super(hVar);
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f5924a.mo6449a((C2177l<? super T>) new C1843a<Object>(cVar, this.f6090c));
    }
}
