package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p075c.C1747a;
import p064c.p065a.p072e.p085h.C2112a;
import p064c.p065a.p072e.p085h.C2113b;

/* renamed from: c.a.e.e.b.p */
public final class C1833p<T, U> extends C1785a<T, U> {

    /* renamed from: c */
    final C1711f<? super T, ? extends U> f6054c;

    /* renamed from: c.a.e.e.b.p$a */
    static final class C1834a<T, U> extends C2112a<T, U> {

        /* renamed from: a */
        final C1711f<? super T, ? extends U> f6055a;

        public final U poll() throws Exception {
            Object poll = this.f6849g.poll();
            if (poll != null) {
                return C1745b.m6050a(this.f6055a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        public final int requestFusion(int i) {
            return mo6402a(i);
        }

        /* renamed from: a */
        public final boolean mo6227a(T t) {
            if (this.f6850h) {
                return false;
            }
            try {
                return this.f6847e.mo6227a(C1745b.m6050a(this.f6055a.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                mo6403a(th);
                return true;
            }
        }

        public final void onNext(T t) {
            if (!this.f6850h) {
                if (this.f6851i != 0) {
                    this.f6847e.onNext(null);
                    return;
                }
                try {
                    this.f6847e.onNext(C1745b.m6050a(this.f6055a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo6403a(th);
                }
            }
        }

        C1834a(C1747a<? super U> aVar, C1711f<? super T, ? extends U> fVar) {
            super(aVar);
            this.f6055a = fVar;
        }
    }

    /* renamed from: c.a.e.e.b.p$b */
    static final class C1835b<T, U> extends C2113b<T, U> {

        /* renamed from: a */
        final C1711f<? super T, ? extends U> f6056a;

        public final U poll() throws Exception {
            Object poll = this.f6854g.poll();
            if (poll != null) {
                return C1745b.m6050a(this.f6056a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        public final int requestFusion(int i) {
            return mo6404a(i);
        }

        public final void onNext(T t) {
            if (!this.f6855h) {
                if (this.f6856i != 0) {
                    this.f6852e.onNext(null);
                    return;
                }
                try {
                    this.f6852e.onNext(C1745b.m6050a(this.f6056a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo6405a(th);
                }
            }
        }

        C1835b(C53695c<? super U> cVar, C1711f<? super T, ? extends U> fVar) {
            super(cVar);
            this.f6056a = fVar;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super U> cVar) {
        if (cVar instanceof C1747a) {
            this.f5924a.mo6449a((C2177l<? super T>) new C1834a<Object>((C1747a) cVar, this.f6054c));
        } else {
            this.f5924a.mo6449a((C2177l<? super T>) new C1835b<Object>(cVar, this.f6054c));
        }
    }

    public C1833p(C2149h<T> hVar, C1711f<? super T, ? extends U> fVar) {
        super(hVar);
        this.f6054c = fVar;
    }
}
