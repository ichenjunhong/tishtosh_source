package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p075c.C1750d;
import p064c.p065a.p072e.p075c.C1755i;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p072e.p087j.C2126c;
import p064c.p065a.p072e.p087j.C2130g;
import p064c.p065a.p089g.C2148c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.d */
public final class C1982d<T, U> extends C1896a<T, U> {

    /* renamed from: b */
    final C1711f<? super T, ? extends C2206z<? extends U>> f6469b;

    /* renamed from: c */
    final int f6470c;

    /* renamed from: d */
    final C2130g f6471d;

    /* renamed from: c.a.e.e.d.d$a */
    static final class C1983a<T, R> extends AtomicInteger implements C1674ab<T>, C1690c {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: a */
        final C1674ab<? super R> f6472a;

        /* renamed from: b */
        final C1711f<? super T, ? extends C2206z<? extends R>> f6473b;

        /* renamed from: c */
        final int f6474c;

        /* renamed from: d */
        final C2126c f6475d = new C2126c();

        /* renamed from: e */
        final C1984a<R> f6476e;

        /* renamed from: f */
        final boolean f6477f;

        /* renamed from: g */
        C1755i<T> f6478g;

        /* renamed from: h */
        C1690c f6479h;

        /* renamed from: i */
        volatile boolean f6480i;

        /* renamed from: j */
        volatile boolean f6481j;

        /* renamed from: k */
        volatile boolean f6482k;

        /* renamed from: l */
        int f6483l;

        /* renamed from: c.a.e.e.d.d$a$a */
        static final class C1984a<R> extends AtomicReference<C1690c> implements C1674ab<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* renamed from: a */
            final C1674ab<? super R> f6484a;

            /* renamed from: b */
            final C1983a<?, R> f6485b;

            public final void onComplete() {
                C1983a<?, R> aVar = this.f6485b;
                aVar.f6480i = false;
                aVar.mo6347a();
            }

            public final void onSubscribe(C1690c cVar) {
                C1718b.replace(this, cVar);
            }

            public final void onNext(R r) {
                this.f6484a.onNext(r);
            }

            public final void onError(Throwable th) {
                C1983a<?, R> aVar = this.f6485b;
                if (aVar.f6475d.addThrowable(th)) {
                    if (!aVar.f6477f) {
                        aVar.f6479h.dispose();
                    }
                    aVar.f6480i = false;
                    aVar.mo6347a();
                    return;
                }
                C2150a.m6492a(th);
            }

            C1984a(C1674ab<? super R> abVar, C1983a<?, R> aVar) {
                this.f6484a = abVar;
                this.f6485b = aVar;
            }
        }

        public final boolean isDisposed() {
            return this.f6482k;
        }

        public final void onComplete() {
            this.f6481j = true;
            mo6347a();
        }

        public final void dispose() {
            this.f6482k = true;
            this.f6479h.dispose();
            C1718b.dispose(this.f6476e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6347a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C1674ab<? super R> abVar = this.f6472a;
                C1755i<T> iVar = this.f6478g;
                C2126c cVar = this.f6475d;
                while (true) {
                    if (!this.f6480i) {
                        if (this.f6482k) {
                            iVar.clear();
                            return;
                        } else if (this.f6477f || ((Throwable) cVar.get()) == null) {
                            boolean z2 = this.f6481j;
                            try {
                                Object poll = iVar.poll();
                                if (poll == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z2 && z) {
                                    this.f6482k = true;
                                    Throwable terminate = cVar.terminate();
                                    if (terminate != null) {
                                        abVar.onError(terminate);
                                        return;
                                    } else {
                                        abVar.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        C2206z zVar = (C2206z) C1745b.m6050a(this.f6473b.apply(poll), "The mapper returned a null ObservableSource");
                                        if (zVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) zVar).call();
                                                if (call != null && !this.f6482k) {
                                                    abVar.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                C1700b.m6017b(th);
                                                cVar.addThrowable(th);
                                            }
                                        } else {
                                            this.f6480i = true;
                                            zVar.mo6314a(this.f6476e);
                                        }
                                    } catch (Throwable th2) {
                                        C1700b.m6017b(th2);
                                        this.f6482k = true;
                                        this.f6479h.dispose();
                                        iVar.clear();
                                        cVar.addThrowable(th2);
                                        abVar.onError(cVar.terminate());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C1700b.m6017b(th3);
                                this.f6482k = true;
                                this.f6479h.dispose();
                                cVar.addThrowable(th3);
                                abVar.onError(cVar.terminate());
                                return;
                            }
                        } else {
                            iVar.clear();
                            this.f6482k = true;
                            abVar.onError(cVar.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public final void onNext(T t) {
            if (this.f6483l == 0) {
                this.f6478g.offer(t);
            }
            mo6347a();
        }

        public final void onError(Throwable th) {
            if (this.f6475d.addThrowable(th)) {
                this.f6481j = true;
                mo6347a();
                return;
            }
            C2150a.m6492a(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6479h, cVar)) {
                this.f6479h = cVar;
                if (cVar instanceof C1750d) {
                    C1750d dVar = (C1750d) cVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f6483l = requestFusion;
                        this.f6478g = dVar;
                        this.f6481j = true;
                        this.f6472a.onSubscribe(this);
                        mo6347a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f6483l = requestFusion;
                        this.f6478g = dVar;
                        this.f6472a.onSubscribe(this);
                        return;
                    }
                }
                this.f6478g = new C2072c(this.f6474c);
                this.f6472a.onSubscribe(this);
            }
        }

        C1983a(C1674ab<? super R> abVar, C1711f<? super T, ? extends C2206z<? extends R>> fVar, int i, boolean z) {
            this.f6472a = abVar;
            this.f6473b = fVar;
            this.f6474c = i;
            this.f6477f = z;
            this.f6476e = new C1984a<>(abVar, this);
        }
    }

    /* renamed from: c.a.e.e.d.d$b */
    static final class C1985b<T, U> extends AtomicInteger implements C1674ab<T>, C1690c {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: a */
        final C1674ab<? super U> f6486a;

        /* renamed from: b */
        final C1711f<? super T, ? extends C2206z<? extends U>> f6487b;

        /* renamed from: c */
        final C1986a<U> f6488c;

        /* renamed from: d */
        final int f6489d;

        /* renamed from: e */
        C1755i<T> f6490e;

        /* renamed from: f */
        C1690c f6491f;

        /* renamed from: g */
        volatile boolean f6492g;

        /* renamed from: h */
        volatile boolean f6493h;

        /* renamed from: i */
        volatile boolean f6494i;

        /* renamed from: j */
        int f6495j;

        /* renamed from: c.a.e.e.d.d$b$a */
        static final class C1986a<U> extends AtomicReference<C1690c> implements C1674ab<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* renamed from: a */
            final C1674ab<? super U> f6496a;

            /* renamed from: b */
            final C1985b<?, ?> f6497b;

            public final void onComplete() {
                C1985b<?, ?> bVar = this.f6497b;
                bVar.f6492g = false;
                bVar.mo6348a();
            }

            public final void onSubscribe(C1690c cVar) {
                C1718b.replace(this, cVar);
            }

            public final void onNext(U u) {
                this.f6496a.onNext(u);
            }

            public final void onError(Throwable th) {
                this.f6497b.dispose();
                this.f6496a.onError(th);
            }

            C1986a(C1674ab<? super U> abVar, C1985b<?, ?> bVar) {
                this.f6496a = abVar;
                this.f6497b = bVar;
            }
        }

        public final boolean isDisposed() {
            return this.f6493h;
        }

        public final void onComplete() {
            if (!this.f6494i) {
                this.f6494i = true;
                mo6348a();
            }
        }

        public final void dispose() {
            this.f6493h = true;
            C1718b.dispose(this.f6488c);
            this.f6491f.dispose();
            if (getAndIncrement() == 0) {
                this.f6490e.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6348a() {
            boolean z;
            if (getAndIncrement() == 0) {
                while (!this.f6493h) {
                    if (!this.f6492g) {
                        boolean z2 = this.f6494i;
                        try {
                            Object poll = this.f6490e.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                this.f6493h = true;
                                this.f6486a.onComplete();
                                return;
                            } else if (!z) {
                                try {
                                    C2206z zVar = (C2206z) C1745b.m6050a(this.f6487b.apply(poll), "The mapper returned a null ObservableSource");
                                    this.f6492g = true;
                                    zVar.mo6314a(this.f6488c);
                                } catch (Throwable th) {
                                    C1700b.m6017b(th);
                                    dispose();
                                    this.f6490e.clear();
                                    this.f6486a.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C1700b.m6017b(th2);
                            dispose();
                            this.f6490e.clear();
                            this.f6486a.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f6490e.clear();
            }
        }

        public final void onError(Throwable th) {
            if (this.f6494i) {
                C2150a.m6492a(th);
                return;
            }
            this.f6494i = true;
            dispose();
            this.f6486a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f6494i) {
                if (this.f6495j == 0) {
                    this.f6490e.offer(t);
                }
                mo6348a();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6491f, cVar)) {
                this.f6491f = cVar;
                if (cVar instanceof C1750d) {
                    C1750d dVar = (C1750d) cVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f6495j = requestFusion;
                        this.f6490e = dVar;
                        this.f6494i = true;
                        this.f6486a.onSubscribe(this);
                        mo6348a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f6495j = requestFusion;
                        this.f6490e = dVar;
                        this.f6486a.onSubscribe(this);
                        return;
                    }
                }
                this.f6490e = new C2072c(this.f6489d);
                this.f6486a.onSubscribe(this);
            }
        }

        C1985b(C1674ab<? super U> abVar, C1711f<? super T, ? extends C2206z<? extends U>> fVar, int i) {
            this.f6486a = abVar;
            this.f6487b = fVar;
            this.f6489d = i;
            this.f6488c = new C1986a<>(abVar, this);
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super U> abVar) {
        boolean z;
        if (!C1941as.m6238a(this.f6202a, abVar, this.f6469b)) {
            if (this.f6471d == C2130g.IMMEDIATE) {
                this.f6202a.mo6314a(new C1985b(new C2148c(abVar), this.f6469b, this.f6470c));
                return;
            }
            C2206z zVar = this.f6202a;
            C1711f<? super T, ? extends C2206z<? extends U>> fVar = this.f6469b;
            int i = this.f6470c;
            if (this.f6471d == C2130g.END) {
                z = true;
            } else {
                z = false;
            }
            zVar.mo6314a(new C1983a(abVar, fVar, i, z));
        }
    }

    public C1982d(C2206z<T> zVar, C1711f<? super T, ? extends C2206z<? extends U>> fVar, int i, C2130g gVar) {
        super(zVar);
        this.f6469b = fVar;
        this.f6471d = gVar;
        this.f6470c = Math.max(8, i);
    }
}
