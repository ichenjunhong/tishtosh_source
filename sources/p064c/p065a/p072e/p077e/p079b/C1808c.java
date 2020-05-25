package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p072e.p075c.C1747a;
import p064c.p065a.p072e.p075c.C1752f;
import p064c.p065a.p072e.p086i.C2117a;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.c */
public final class C1808c<T> extends C1785a<T, T> {

    /* renamed from: c */
    final C1706a f5973c;

    /* renamed from: c.a.e.e.b.c$a */
    static final class C1809a<T> extends C2117a<T> implements C1747a<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final C1747a<? super T> f5974a;

        /* renamed from: b */
        final C1706a f5975b;

        /* renamed from: c */
        C53696d f5976c;

        /* renamed from: d */
        C1752f<T> f5977d;

        /* renamed from: e */
        boolean f5978e;

        public final void clear() {
            this.f5977d.clear();
        }

        public final boolean isEmpty() {
            return this.f5977d.isEmpty();
        }

        public final void cancel() {
            this.f5976c.cancel();
            m6115a();
        }

        public final void onComplete() {
            this.f5974a.onComplete();
            m6115a();
        }

        public final T poll() throws Exception {
            T poll = this.f5977d.poll();
            if (poll == null && this.f5978e) {
                m6115a();
            }
            return poll;
        }

        /* renamed from: a */
        private void m6115a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f5975b.mo6199a();
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    C2150a.m6492a(th);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo6227a(T t) {
            return this.f5974a.mo6227a(t);
        }

        public final void onNext(T t) {
            this.f5974a.onNext(t);
        }

        public final void request(long j) {
            this.f5976c.request(j);
        }

        public final void onError(Throwable th) {
            this.f5974a.onError(th);
            m6115a();
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f5976c, dVar)) {
                this.f5976c = dVar;
                if (dVar instanceof C1752f) {
                    this.f5977d = (C1752f) dVar;
                }
                this.f5974a.onSubscribe(this);
            }
        }

        public final int requestFusion(int i) {
            C1752f<T> fVar = this.f5977d;
            if (fVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = fVar.requestFusion(i);
            if (requestFusion != 0) {
                boolean z = true;
                if (requestFusion != 1) {
                    z = false;
                }
                this.f5978e = z;
            }
            return requestFusion;
        }

        C1809a(C1747a<? super T> aVar, C1706a aVar2) {
            this.f5974a = aVar;
            this.f5975b = aVar2;
        }
    }

    /* renamed from: c.a.e.e.b.c$b */
    static final class C1810b<T> extends C2117a<T> implements C2177l<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final C53695c<? super T> f5979a;

        /* renamed from: b */
        final C1706a f5980b;

        /* renamed from: c */
        C53696d f5981c;

        /* renamed from: d */
        C1752f<T> f5982d;

        /* renamed from: e */
        boolean f5983e;

        public final void clear() {
            this.f5982d.clear();
        }

        public final boolean isEmpty() {
            return this.f5982d.isEmpty();
        }

        public final void cancel() {
            this.f5981c.cancel();
            m6117a();
        }

        public final void onComplete() {
            this.f5979a.onComplete();
            m6117a();
        }

        public final T poll() throws Exception {
            T poll = this.f5982d.poll();
            if (poll == null && this.f5983e) {
                m6117a();
            }
            return poll;
        }

        /* renamed from: a */
        private void m6117a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f5980b.mo6199a();
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    C2150a.m6492a(th);
                }
            }
        }

        public final void onNext(T t) {
            this.f5979a.onNext(t);
        }

        public final void request(long j) {
            this.f5981c.request(j);
        }

        public final void onError(Throwable th) {
            this.f5979a.onError(th);
            m6117a();
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f5981c, dVar)) {
                this.f5981c = dVar;
                if (dVar instanceof C1752f) {
                    this.f5982d = (C1752f) dVar;
                }
                this.f5979a.onSubscribe(this);
            }
        }

        public final int requestFusion(int i) {
            C1752f<T> fVar = this.f5982d;
            if (fVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = fVar.requestFusion(i);
            if (requestFusion != 0) {
                boolean z = true;
                if (requestFusion != 1) {
                    z = false;
                }
                this.f5983e = z;
            }
            return requestFusion;
        }

        C1810b(C53695c<? super T> cVar, C1706a aVar) {
            this.f5979a = cVar;
            this.f5980b = aVar;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        if (cVar instanceof C1747a) {
            this.f5924a.mo6449a((C2177l<? super T>) new C1809a<Object>((C1747a) cVar, this.f5973c));
        } else {
            this.f5924a.mo6449a((C2177l<? super T>) new C1810b<Object>(cVar, this.f5973c));
        }
    }

    public C1808c(C2149h<T> hVar, C1706a aVar) {
        super(hVar);
        this.f5973c = aVar;
    }
}
