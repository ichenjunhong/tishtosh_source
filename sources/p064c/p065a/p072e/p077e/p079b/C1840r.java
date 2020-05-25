package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.atomic.AtomicLong;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p070c.C1701c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p072e.p075c.C1754h;
import p064c.p065a.p072e.p083f.C2071b;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p072e.p086i.C2117a;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;

/* renamed from: c.a.e.e.b.r */
public final class C1840r<T> extends C1785a<T, T> {

    /* renamed from: c */
    final int f6076c;

    /* renamed from: d */
    final boolean f6077d;

    /* renamed from: e */
    final boolean f6078e;

    /* renamed from: f */
    final C1706a f6079f;

    /* renamed from: c.a.e.e.b.r$a */
    static final class C1841a<T> extends C2117a<T> implements C2177l<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: a */
        final C53695c<? super T> f6080a;

        /* renamed from: b */
        final C1754h<T> f6081b;

        /* renamed from: c */
        final boolean f6082c;

        /* renamed from: d */
        final C1706a f6083d;

        /* renamed from: e */
        C53696d f6084e;

        /* renamed from: f */
        volatile boolean f6085f;

        /* renamed from: g */
        volatile boolean f6086g;

        /* renamed from: h */
        Throwable f6087h;

        /* renamed from: i */
        final AtomicLong f6088i = new AtomicLong();

        /* renamed from: j */
        boolean f6089j;

        public final void clear() {
            this.f6081b.clear();
        }

        public final boolean isEmpty() {
            return this.f6081b.isEmpty();
        }

        public final T poll() throws Exception {
            return this.f6081b.poll();
        }

        public final void cancel() {
            if (!this.f6085f) {
                this.f6085f = true;
                this.f6084e.cancel();
                if (getAndIncrement() == 0) {
                    this.f6081b.clear();
                }
            }
        }

        public final void onComplete() {
            this.f6086g = true;
            if (this.f6089j) {
                this.f6080a.onComplete();
            } else {
                m6156a();
            }
        }

        /* renamed from: a */
        private void m6156a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C1754h<T> hVar = this.f6081b;
                C53695c<? super T> cVar = this.f6080a;
                int i = 1;
                while (!m6157a(this.f6086g, hVar.isEmpty(), cVar)) {
                    long j = this.f6088i.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.f6086g;
                        Object poll = hVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!m6157a(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !m6157a(this.f6086g, hVar.isEmpty(), cVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f6088i.addAndGet(-j2);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f6089j = true;
            return 2;
        }

        public final void onError(Throwable th) {
            this.f6087h = th;
            this.f6086g = true;
            if (this.f6089j) {
                this.f6080a.onError(th);
            } else {
                m6156a();
            }
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f6084e, dVar)) {
                this.f6084e = dVar;
                this.f6080a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void request(long j) {
            if (!this.f6089j && C2122f.validate(j)) {
                C2127d.m6415a(this.f6088i, j);
                m6156a();
            }
        }

        public final void onNext(T t) {
            if (!this.f6081b.offer(t)) {
                this.f6084e.cancel();
                C1701c cVar = new C1701c("Buffer is full");
                try {
                    this.f6083d.mo6199a();
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    cVar.initCause(th);
                }
                onError(cVar);
            } else if (this.f6089j) {
                this.f6080a.onNext(null);
            } else {
                m6156a();
            }
        }

        /* renamed from: a */
        private boolean m6157a(boolean z, boolean z2, C53695c<? super T> cVar) {
            if (this.f6085f) {
                this.f6081b.clear();
                return true;
            }
            if (z) {
                if (!this.f6082c) {
                    Throwable th = this.f6087h;
                    if (th != null) {
                        this.f6081b.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z2) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f6087h;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        C1841a(C53695c<? super T> cVar, int i, boolean z, boolean z2, C1706a aVar) {
            C1754h<T> hVar;
            this.f6080a = cVar;
            this.f6083d = aVar;
            this.f6082c = z2;
            if (z) {
                hVar = new C2072c<>(i);
            } else {
                hVar = new C2071b<>(i);
            }
            this.f6081b = hVar;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        C2149h hVar = this.f5924a;
        C1841a aVar = new C1841a(cVar, this.f6076c, this.f6077d, this.f6078e, this.f6079f);
        hVar.mo6449a((C2177l<? super T>) aVar);
    }

    public C1840r(C2149h<T> hVar, int i, boolean z, boolean z2, C1706a aVar) {
        super(hVar);
        this.f6076c = i;
        this.f6077d = z;
        this.f6078e = z2;
        this.f6079f = aVar;
    }
}
