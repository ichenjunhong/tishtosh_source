package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p075c.C1750d;
import p064c.p065a.p072e.p075c.C1755i;
import p064c.p065a.p072e.p076d.C1757b;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p072e.p084g.C2107s;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.ak */
public final class C1919ak<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1675ac f6255b;

    /* renamed from: c */
    final boolean f6256c;

    /* renamed from: d */
    final int f6257d;

    /* renamed from: c.a.e.e.d.ak$a */
    static final class C1920a<T> extends C1757b<T> implements C1674ab<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: a */
        final C1674ab<? super T> f6258a;

        /* renamed from: b */
        final C1678c f6259b;

        /* renamed from: c */
        final boolean f6260c;

        /* renamed from: d */
        final int f6261d;

        /* renamed from: e */
        C1755i<T> f6262e;

        /* renamed from: f */
        C1690c f6263f;

        /* renamed from: g */
        Throwable f6264g;

        /* renamed from: h */
        volatile boolean f6265h;

        /* renamed from: i */
        volatile boolean f6266i;

        /* renamed from: j */
        int f6267j;

        /* renamed from: k */
        boolean f6268k;

        public final boolean isDisposed() {
            return this.f6266i;
        }

        public final void clear() {
            this.f6262e.clear();
        }

        public final boolean isEmpty() {
            return this.f6262e.isEmpty();
        }

        public final T poll() throws Exception {
            return this.f6262e.poll();
        }

        /* renamed from: a */
        private void m6216a() {
            if (getAndIncrement() == 0) {
                this.f6259b.mo6144a((Runnable) this);
            }
        }

        public final void onComplete() {
            if (!this.f6265h) {
                this.f6265h = true;
                m6216a();
            }
        }

        public final void dispose() {
            if (!this.f6266i) {
                this.f6266i = true;
                this.f6263f.dispose();
                this.f6259b.dispose();
                if (getAndIncrement() == 0) {
                    this.f6262e.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
            r3 = addAndGet(-r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
            if (r3 != 0) goto L_0x0053;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                boolean r0 = r7.f6268k
                r1 = 1
                if (r0 == 0) goto L_0x004e
                r0 = 1
            L_0x0006:
                boolean r2 = r7.f6266i
                if (r2 != 0) goto L_0x004d
                boolean r2 = r7.f6265h
                java.lang.Throwable r3 = r7.f6264g
                boolean r4 = r7.f6260c
                if (r4 != 0) goto L_0x0026
                if (r2 == 0) goto L_0x0026
                if (r3 == 0) goto L_0x0026
                r7.f6266i = r1
                c.a.ab<? super T> r0 = r7.f6258a
                java.lang.Throwable r1 = r7.f6264g
                r0.onError(r1)
                c.a.ac$c r0 = r7.f6259b
                r0.dispose()
                goto L_0x0095
            L_0x0026:
                c.a.ab<? super T> r3 = r7.f6258a
                r4 = 0
                r3.onNext(r4)
                if (r2 == 0) goto L_0x0045
                r7.f6266i = r1
                java.lang.Throwable r0 = r7.f6264g
                if (r0 == 0) goto L_0x003a
                c.a.ab<? super T> r1 = r7.f6258a
                r1.onError(r0)
                goto L_0x003f
            L_0x003a:
                c.a.ab<? super T> r0 = r7.f6258a
                r0.onComplete()
            L_0x003f:
                c.a.ac$c r0 = r7.f6259b
                r0.dispose()
                goto L_0x0095
            L_0x0045:
                int r0 = -r0
                int r0 = r7.addAndGet(r0)
                if (r0 == 0) goto L_0x004d
                goto L_0x0006
            L_0x004d:
                return
            L_0x004e:
                c.a.e.c.i<T> r0 = r7.f6262e
                c.a.ab<? super T> r2 = r7.f6258a
                r3 = 1
            L_0x0053:
                boolean r4 = r7.f6265h
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.m6217a(r4, r5, r2)
                if (r4 != 0) goto L_0x0095
            L_0x005f:
                boolean r4 = r7.f6265h
                java.lang.Object r5 = r0.poll()     // Catch:{ Throwable -> 0x007e }
                if (r5 != 0) goto L_0x0069
                r6 = 1
                goto L_0x006a
            L_0x0069:
                r6 = 0
            L_0x006a:
                boolean r4 = r7.m6217a(r4, r6, r2)
                if (r4 != 0) goto L_0x0095
                if (r6 != 0) goto L_0x0076
                r2.onNext(r5)
                goto L_0x005f
            L_0x0076:
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L_0x0053
                goto L_0x0095
            L_0x007e:
                r3 = move-exception
                p064c.p065a.p070c.C1700b.m6017b(r3)
                r7.f6266i = r1
                c.a.b.c r1 = r7.f6263f
                r1.dispose()
                r0.clear()
                r2.onError(r3)
                c.a.ac$c r0 = r7.f6259b
                r0.dispose()
                return
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C1919ak.C1920a.run():void");
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f6268k = true;
            return 2;
        }

        public final void onError(Throwable th) {
            if (this.f6265h) {
                C2150a.m6492a(th);
                return;
            }
            this.f6264g = th;
            this.f6265h = true;
            m6216a();
        }

        public final void onNext(T t) {
            if (!this.f6265h) {
                if (this.f6267j != 2) {
                    this.f6262e.offer(t);
                }
                m6216a();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6263f, cVar)) {
                this.f6263f = cVar;
                if (cVar instanceof C1750d) {
                    C1750d dVar = (C1750d) cVar;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f6267j = requestFusion;
                        this.f6262e = dVar;
                        this.f6265h = true;
                        this.f6258a.onSubscribe(this);
                        m6216a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f6267j = requestFusion;
                        this.f6262e = dVar;
                        this.f6258a.onSubscribe(this);
                        return;
                    }
                }
                this.f6262e = new C2072c(this.f6261d);
                this.f6258a.onSubscribe(this);
            }
        }

        /* renamed from: a */
        private boolean m6217a(boolean z, boolean z2, C1674ab<? super T> abVar) {
            if (this.f6266i) {
                this.f6262e.clear();
                return true;
            }
            if (z) {
                Throwable th = this.f6264g;
                if (this.f6260c) {
                    if (z2) {
                        this.f6266i = true;
                        if (th != null) {
                            abVar.onError(th);
                        } else {
                            abVar.onComplete();
                        }
                        this.f6259b.dispose();
                        return true;
                    }
                } else if (th != null) {
                    this.f6266i = true;
                    this.f6262e.clear();
                    abVar.onError(th);
                    this.f6259b.dispose();
                    return true;
                } else if (z2) {
                    this.f6266i = true;
                    abVar.onComplete();
                    this.f6259b.dispose();
                    return true;
                }
            }
            return false;
        }

        C1920a(C1674ab<? super T> abVar, C1678c cVar, boolean z, int i) {
            this.f6258a = abVar;
            this.f6259b = cVar;
            this.f6260c = z;
            this.f6261d = i;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        if (this.f6255b instanceof C2107s) {
            this.f6202a.mo6314a(abVar);
            return;
        }
        this.f6202a.mo6314a(new C1920a(abVar, this.f6255b.mo6130a(), this.f6256c, this.f6257d));
    }

    public C1919ak(C2206z<T> zVar, C1675ac acVar, boolean z, int i) {
        super(zVar);
        this.f6255b = acVar;
        this.f6256c = z;
        this.f6257d = i;
    }
}
