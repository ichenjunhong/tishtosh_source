package p064c.p065a.p072e.p077e.p079b;

import java.util.NoSuchElementException;
import org.p2692b.C53696d;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p075c.C1748b;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.ad */
public final class C1792ad<T> extends C1680ad<T> implements C1748b<T> {

    /* renamed from: a */
    final C2149h<T> f5938a;

    /* renamed from: b */
    final T f5939b = null;

    /* renamed from: c.a.e.e.b.ad$a */
    static final class C1793a<T> implements C1690c, C2177l<T> {

        /* renamed from: a */
        final C1683ag<? super T> f5940a;

        /* renamed from: b */
        final T f5941b;

        /* renamed from: c */
        C53696d f5942c;

        /* renamed from: d */
        boolean f5943d;

        /* renamed from: e */
        T f5944e;

        public final void dispose() {
            this.f5942c.cancel();
            this.f5942c = C2122f.CANCELLED;
        }

        public final boolean isDisposed() {
            if (this.f5942c == C2122f.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            if (!this.f5943d) {
                this.f5943d = true;
                this.f5942c = C2122f.CANCELLED;
                T t = this.f5944e;
                this.f5944e = null;
                if (t == null) {
                    t = this.f5941b;
                }
                if (t != null) {
                    this.f5940a.onSuccess(t);
                } else {
                    this.f5940a.onError(new NoSuchElementException());
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f5943d) {
                C2150a.m6492a(th);
                return;
            }
            this.f5943d = true;
            this.f5942c = C2122f.CANCELLED;
            this.f5940a.onError(th);
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f5942c, dVar)) {
                this.f5942c = dVar;
                this.f5940a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f5943d) {
                if (this.f5944e != null) {
                    this.f5943d = true;
                    this.f5942c.cancel();
                    this.f5942c = C2122f.CANCELLED;
                    this.f5940a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f5944e = t;
            }
        }

        C1793a(C1683ag<? super T> agVar, T t) {
            this.f5940a = agVar;
            this.f5941b = t;
        }
    }

    public final C2149h<T> cy_() {
        return C2150a.m6483a((C2149h<T>) new C1788ab<T>(this.f5938a, this.f5939b, true));
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f5938a.mo6449a((C2177l<? super T>) new C1793a<Object>(agVar, this.f5939b));
    }

    public C1792ad(C2149h<T> hVar, T t) {
        this.f5938a = hVar;
    }
}
