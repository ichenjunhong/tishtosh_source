package p064c.p065a.p072e.p077e.p079b;

import java.util.NoSuchElementException;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p072e.p086i.C2118b;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.ab */
public final class C1788ab<T> extends C1785a<T, T> {

    /* renamed from: c */
    final T f5927c;

    /* renamed from: d */
    final boolean f5928d;

    /* renamed from: c.a.e.e.b.ab$a */
    static final class C1789a<T> extends C2118b<T> implements C2177l<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* renamed from: a */
        final T f5929a;

        /* renamed from: b */
        final boolean f5930b;

        /* renamed from: c */
        C53696d f5931c;

        /* renamed from: d */
        boolean f5932d;

        public final void cancel() {
            super.cancel();
            this.f5931c.cancel();
        }

        public final void onComplete() {
            if (!this.f5932d) {
                this.f5932d = true;
                T t = this.f6872f;
                this.f6872f = null;
                if (t == null) {
                    t = this.f5929a;
                }
                if (t != null) {
                    complete(t);
                } else if (this.f5930b) {
                    this.f6871e.onError(new NoSuchElementException());
                } else {
                    this.f6871e.onComplete();
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f5932d) {
                C2150a.m6492a(th);
                return;
            }
            this.f5932d = true;
            this.f6871e.onError(th);
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f5931c, dVar)) {
                this.f5931c = dVar;
                this.f6871e.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f5932d) {
                if (this.f6872f != null) {
                    this.f5932d = true;
                    this.f5931c.cancel();
                    this.f6871e.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f6872f = t;
            }
        }

        C1789a(C53695c<? super T> cVar, T t, boolean z) {
            super(cVar);
            this.f5929a = t;
            this.f5930b = z;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f5924a.mo6449a((C2177l<? super T>) new C1789a<Object>(cVar, this.f5927c, this.f5928d));
    }

    public C1788ab(C2149h<T> hVar, T t, boolean z) {
        super(hVar);
        this.f5927c = t;
        this.f5928d = z;
    }
}
