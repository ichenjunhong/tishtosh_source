package p064c.p065a.p072e.p077e.p081d;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p075c.C1750d;
import p064c.p065a.p072e.p075c.C1755i;
import p064c.p065a.p072e.p076d.C1766k;
import p064c.p065a.p072e.p076d.C1767l;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p072e.p087j.C2126c;
import p064c.p065a.p072e.p087j.C2130g;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.e */
public final class C1987e<T, R> extends C1896a<T, R> {

    /* renamed from: b */
    final C1711f<? super T, ? extends C2206z<? extends R>> f6498b;

    /* renamed from: c */
    final C2130g f6499c;

    /* renamed from: d */
    final int f6500d;

    /* renamed from: e */
    final int f6501e;

    /* renamed from: c.a.e.e.d.e$a */
    static final class C1988a<T, R> extends AtomicInteger implements C1674ab<T>, C1690c, C1767l<R> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* renamed from: a */
        final C1674ab<? super R> f6502a;

        /* renamed from: b */
        final C1711f<? super T, ? extends C2206z<? extends R>> f6503b;

        /* renamed from: c */
        final int f6504c;

        /* renamed from: d */
        final int f6505d;

        /* renamed from: e */
        final C2130g f6506e;

        /* renamed from: f */
        final C2126c f6507f = new C2126c();

        /* renamed from: g */
        final ArrayDeque<C1766k<R>> f6508g = new ArrayDeque<>();

        /* renamed from: h */
        C1755i<T> f6509h;

        /* renamed from: i */
        C1690c f6510i;

        /* renamed from: j */
        volatile boolean f6511j;

        /* renamed from: k */
        int f6512k;

        /* renamed from: l */
        volatile boolean f6513l;

        /* renamed from: m */
        C1766k<R> f6514m;

        /* renamed from: n */
        int f6515n;

        public final boolean isDisposed() {
            return this.f6513l;
        }

        public final void onComplete() {
            this.f6511j = true;
            mo6247a();
        }

        /* renamed from: b */
        private void m6274b() {
            C1766k<R> kVar = this.f6514m;
            if (kVar != null) {
                kVar.dispose();
            }
            while (true) {
                C1766k kVar2 = (C1766k) this.f6508g.poll();
                if (kVar2 != null) {
                    kVar2.dispose();
                } else {
                    return;
                }
            }
        }

        public final void dispose() {
            this.f6513l = true;
            if (getAndIncrement() == 0) {
                this.f6509h.clear();
                m6274b();
            }
        }

        /* renamed from: a */
        public final void mo6247a() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                C1755i<T> iVar = this.f6509h;
                ArrayDeque<C1766k<R>> arrayDeque = this.f6508g;
                C1674ab<? super R> abVar = this.f6502a;
                C2130g gVar = this.f6506e;
                int i = 1;
                while (true) {
                    int i2 = this.f6515n;
                    while (true) {
                        if (i2 == this.f6504c) {
                            break;
                        } else if (this.f6513l) {
                            iVar.clear();
                            m6274b();
                            return;
                        } else if (gVar != C2130g.IMMEDIATE || ((Throwable) this.f6507f.get()) == null) {
                            try {
                                Object poll = iVar.poll();
                                if (poll == null) {
                                    break;
                                }
                                C2206z zVar = (C2206z) C1745b.m6050a(this.f6503b.apply(poll), "The mapper returned a null ObservableSource");
                                C1766k kVar = new C1766k(this, this.f6505d);
                                arrayDeque.offer(kVar);
                                zVar.mo6314a(kVar);
                                i2++;
                            } catch (Throwable th) {
                                C1700b.m6017b(th);
                                this.f6510i.dispose();
                                iVar.clear();
                                m6274b();
                                this.f6507f.addThrowable(th);
                                abVar.onError(this.f6507f.terminate());
                                return;
                            }
                        } else {
                            iVar.clear();
                            m6274b();
                            abVar.onError(this.f6507f.terminate());
                            return;
                        }
                    }
                    this.f6515n = i2;
                    if (this.f6513l) {
                        iVar.clear();
                        m6274b();
                        return;
                    } else if (gVar != C2130g.IMMEDIATE || ((Throwable) this.f6507f.get()) == null) {
                        C1766k<R> kVar2 = this.f6514m;
                        if (kVar2 == null) {
                            if (gVar != C2130g.BOUNDARY || ((Throwable) this.f6507f.get()) == null) {
                                boolean z3 = this.f6511j;
                                C1766k<R> kVar3 = (C1766k) arrayDeque.poll();
                                if (kVar3 == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z3 || !z2) {
                                    if (!z2) {
                                        this.f6514m = kVar3;
                                    }
                                    kVar2 = kVar3;
                                } else if (((Throwable) this.f6507f.get()) != null) {
                                    iVar.clear();
                                    m6274b();
                                    abVar.onError(this.f6507f.terminate());
                                    return;
                                } else {
                                    abVar.onComplete();
                                    return;
                                }
                            } else {
                                iVar.clear();
                                m6274b();
                                abVar.onError(this.f6507f.terminate());
                                return;
                            }
                        }
                        if (kVar2 != null) {
                            C1755i queue = kVar2.queue();
                            while (!this.f6513l) {
                                boolean isDone = kVar2.isDone();
                                if (gVar != C2130g.IMMEDIATE || ((Throwable) this.f6507f.get()) == null) {
                                    try {
                                        Object poll2 = queue.poll();
                                        if (poll2 == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (isDone && z) {
                                            this.f6514m = null;
                                            this.f6515n--;
                                        } else if (!z) {
                                            abVar.onNext(poll2);
                                        }
                                    } catch (Throwable th2) {
                                        C1700b.m6017b(th2);
                                        this.f6507f.addThrowable(th2);
                                        this.f6514m = null;
                                        this.f6515n--;
                                    }
                                } else {
                                    iVar.clear();
                                    m6274b();
                                    abVar.onError(this.f6507f.terminate());
                                    return;
                                }
                            }
                            iVar.clear();
                            m6274b();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        iVar.clear();
                        m6274b();
                        abVar.onError(this.f6507f.terminate());
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo6248a(C1766k<R> kVar) {
            kVar.setDone();
            mo6247a();
        }

        public final void onNext(T t) {
            if (this.f6512k == 0) {
                this.f6509h.offer(t);
            }
            mo6247a();
        }

        public final void onError(Throwable th) {
            if (this.f6507f.addThrowable(th)) {
                this.f6511j = true;
                mo6247a();
                return;
            }
            C2150a.m6492a(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6510i, cVar)) {
                this.f6510i = cVar;
                if (cVar instanceof C1750d) {
                    C1750d dVar = (C1750d) cVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f6512k = requestFusion;
                        this.f6509h = dVar;
                        this.f6511j = true;
                        this.f6502a.onSubscribe(this);
                        mo6247a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f6512k = requestFusion;
                        this.f6509h = dVar;
                        this.f6502a.onSubscribe(this);
                        return;
                    }
                }
                this.f6509h = new C2072c(this.f6505d);
                this.f6502a.onSubscribe(this);
            }
        }

        /* renamed from: a */
        public final void mo6249a(C1766k<R> kVar, R r) {
            kVar.queue().offer(r);
            mo6247a();
        }

        /* renamed from: a */
        public final void mo6250a(C1766k<R> kVar, Throwable th) {
            if (this.f6507f.addThrowable(th)) {
                if (this.f6506e == C2130g.IMMEDIATE) {
                    this.f6510i.dispose();
                }
                kVar.setDone();
                mo6247a();
                return;
            }
            C2150a.m6492a(th);
        }

        C1988a(C1674ab<? super R> abVar, C1711f<? super T, ? extends C2206z<? extends R>> fVar, int i, int i2, C2130g gVar) {
            this.f6502a = abVar;
            this.f6503b = fVar;
            this.f6504c = i;
            this.f6505d = i2;
            this.f6506e = gVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super R> abVar) {
        C2206z zVar = this.f6202a;
        C1988a aVar = new C1988a(abVar, this.f6498b, this.f6500d, this.f6501e, this.f6499c);
        zVar.mo6314a(aVar);
    }

    public C1987e(C2206z<T> zVar, C1711f<? super T, ? extends C2206z<? extends R>> fVar, C2130g gVar, int i, int i2) {
        super(zVar);
        this.f6498b = fVar;
        this.f6499c = gVar;
        this.f6500d = i;
        this.f6501e = i2;
    }
}
