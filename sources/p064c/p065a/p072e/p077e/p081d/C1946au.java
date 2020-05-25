package p064c.p065a.p072e.p077e.p081d;

import java.util.NoSuchElementException;
import p064c.p065a.C1674ab;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.au */
public final class C1946au<T> extends C1680ad<T> {

    /* renamed from: a */
    final C2206z<? extends T> f6344a;

    /* renamed from: b */
    final T f6345b;

    /* renamed from: c.a.e.e.d.au$a */
    static final class C1947a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1683ag<? super T> f6346a;

        /* renamed from: b */
        final T f6347b;

        /* renamed from: c */
        C1690c f6348c;

        /* renamed from: d */
        T f6349d;

        /* renamed from: e */
        boolean f6350e;

        public final void dispose() {
            this.f6348c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6348c.isDisposed();
        }

        public final void onComplete() {
            if (!this.f6350e) {
                this.f6350e = true;
                T t = this.f6349d;
                this.f6349d = null;
                if (t == null) {
                    t = this.f6347b;
                }
                if (t != null) {
                    this.f6346a.onSuccess(t);
                } else {
                    this.f6346a.onError(new NoSuchElementException());
                }
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6348c, cVar)) {
                this.f6348c = cVar;
                this.f6346a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6350e) {
                C2150a.m6492a(th);
                return;
            }
            this.f6350e = true;
            this.f6346a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f6350e) {
                if (this.f6349d != null) {
                    this.f6350e = true;
                    this.f6348c.dispose();
                    this.f6346a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f6349d = t;
            }
        }

        C1947a(C1683ag<? super T> agVar, T t) {
            this.f6346a = agVar;
            this.f6347b = t;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6344a.mo6314a(new C1947a(agVar, this.f6345b));
    }

    public C1946au(C2206z<? extends T> zVar, T t) {
        this.f6344a = zVar;
        this.f6345b = t;
    }
}
