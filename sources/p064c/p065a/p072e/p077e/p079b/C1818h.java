package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p075c.C1747a;
import p064c.p065a.p072e.p075c.C1752f;
import p064c.p065a.p072e.p085h.C2112a;
import p064c.p065a.p072e.p085h.C2113b;

/* renamed from: c.a.e.e.b.h */
public final class C1818h<T> extends C1785a<T, T> {

    /* renamed from: c */
    final C1715j<? super T> f6006c;

    /* renamed from: c.a.e.e.b.h$a */
    static final class C1819a<T> extends C2112a<T, T> {

        /* renamed from: a */
        final C1715j<? super T> f6007a;

        public final T poll() throws Exception {
            C1752f fVar = this.f6849g;
            C1715j<? super T> jVar = this.f6007a;
            while (true) {
                T poll = fVar.poll();
                if (poll == null) {
                    return null;
                }
                if (jVar.mo6207a(poll)) {
                    return poll;
                }
                if (this.f6851i == 2) {
                    fVar.request(1);
                }
            }
        }

        public final int requestFusion(int i) {
            return mo6402a(i);
        }

        public final void onNext(T t) {
            if (!mo6227a(t)) {
                this.f6848f.request(1);
            }
        }

        /* renamed from: a */
        public final boolean mo6227a(T t) {
            if (this.f6850h) {
                return false;
            }
            if (this.f6851i != 0) {
                return this.f6847e.mo6227a(null);
            }
            try {
                if (!this.f6007a.mo6207a(t) || !this.f6847e.mo6227a(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                mo6403a(th);
                return true;
            }
        }

        C1819a(C1747a<? super T> aVar, C1715j<? super T> jVar) {
            super(aVar);
            this.f6007a = jVar;
        }
    }

    /* renamed from: c.a.e.e.b.h$b */
    static final class C1820b<T> extends C2113b<T, T> implements C1747a<T> {

        /* renamed from: a */
        final C1715j<? super T> f6008a;

        public final T poll() throws Exception {
            C1752f fVar = this.f6854g;
            C1715j<? super T> jVar = this.f6008a;
            while (true) {
                T poll = fVar.poll();
                if (poll == null) {
                    return null;
                }
                if (jVar.mo6207a(poll)) {
                    return poll;
                }
                if (this.f6856i == 2) {
                    fVar.request(1);
                }
            }
        }

        public final int requestFusion(int i) {
            return mo6404a(i);
        }

        public final void onNext(T t) {
            if (!mo6227a(t)) {
                this.f6853f.request(1);
            }
        }

        /* renamed from: a */
        public final boolean mo6227a(T t) {
            if (this.f6855h) {
                return false;
            }
            if (this.f6856i != 0) {
                this.f6852e.onNext(null);
                return true;
            }
            try {
                boolean a = this.f6008a.mo6207a(t);
                if (a) {
                    this.f6852e.onNext(t);
                }
                return a;
            } catch (Throwable th) {
                mo6405a(th);
                return true;
            }
        }

        C1820b(C53695c<? super T> cVar, C1715j<? super T> jVar) {
            super(cVar);
            this.f6008a = jVar;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        if (cVar instanceof C1747a) {
            this.f5924a.mo6449a((C2177l<? super T>) new C1819a<Object>((C1747a) cVar, this.f6006c));
        } else {
            this.f5924a.mo6449a((C2177l<? super T>) new C1820b<Object>(cVar, this.f6006c));
        }
    }

    public C1818h(C2149h<T> hVar, C1715j<? super T> jVar) {
        super(hVar);
        this.f6006c = jVar;
    }
}
