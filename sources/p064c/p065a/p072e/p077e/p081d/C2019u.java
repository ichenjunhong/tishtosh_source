package p064c.p065a.p072e.p077e.p081d;

import java.util.ArrayDeque;
import java.util.Queue;
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
import p064c.p065a.p072e.p075c.C1754h;
import p064c.p065a.p072e.p075c.C1755i;
import p064c.p065a.p072e.p083f.C2071b;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p072e.p087j.C2126c;
import p064c.p065a.p072e.p087j.C2131h;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.u */
public final class C2019u<T, U> extends C1896a<T, U> {

    /* renamed from: b */
    final C1711f<? super T, ? extends C2206z<? extends U>> f6604b;

    /* renamed from: c */
    final boolean f6605c;

    /* renamed from: d */
    final int f6606d;

    /* renamed from: e */
    final int f6607e;

    /* renamed from: c.a.e.e.d.u$a */
    static final class C2020a<T, U> extends AtomicReference<C1690c> implements C1674ab<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a */
        final long f6608a;

        /* renamed from: b */
        final C2021b<T, U> f6609b;

        /* renamed from: c */
        volatile boolean f6610c;

        /* renamed from: d */
        volatile C1755i<U> f6611d;

        /* renamed from: e */
        int f6612e;

        /* renamed from: a */
        public final void mo6354a() {
            C1718b.dispose(this);
        }

        public final void onComplete() {
            this.f6610c = true;
            this.f6609b.mo6355a();
        }

        public final void onError(Throwable th) {
            if (this.f6609b.f6622h.addThrowable(th)) {
                if (!this.f6609b.f6617c) {
                    this.f6609b.mo6357c();
                }
                this.f6610c = true;
                this.f6609b.mo6355a();
                return;
            }
            C2150a.m6492a(th);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
            if (r0.getAndIncrement() == 0) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
            if (r0.decrementAndGet() == 0) goto L_0x003f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(U r4) {
            /*
                r3 = this;
                int r0 = r3.f6612e
                if (r0 != 0) goto L_0x003a
                c.a.e.e.d.u$b<T, U> r0 = r3.f6609b
                int r1 = r0.get()
                if (r1 != 0) goto L_0x0020
                r1 = 0
                r2 = 1
                boolean r1 = r0.compareAndSet(r1, r2)
                if (r1 == 0) goto L_0x0020
                c.a.ab<? super U> r1 = r0.f6615a
                r1.onNext(r4)
                int r4 = r0.decrementAndGet()
                if (r4 != 0) goto L_0x0036
                goto L_0x003f
            L_0x0020:
                c.a.e.c.i<U> r1 = r3.f6611d
                if (r1 != 0) goto L_0x002d
                c.a.e.f.c r1 = new c.a.e.f.c
                int r2 = r0.f6619e
                r1.<init>(r2)
                r3.f6611d = r1
            L_0x002d:
                r1.offer(r4)
                int r4 = r0.getAndIncrement()
                if (r4 != 0) goto L_0x0039
            L_0x0036:
                r0.mo6356b()
            L_0x0039:
                return
            L_0x003a:
                c.a.e.e.d.u$b<T, U> r4 = r3.f6609b
                r4.mo6355a()
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C2019u.C2020a.onNext(java.lang.Object):void");
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.setOnce(this, cVar) && (cVar instanceof C1750d)) {
                C1750d dVar = (C1750d) cVar;
                int requestFusion = dVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f6612e = requestFusion;
                    this.f6611d = dVar;
                    this.f6610c = true;
                    this.f6609b.mo6355a();
                } else if (requestFusion == 2) {
                    this.f6612e = requestFusion;
                    this.f6611d = dVar;
                }
            }
        }

        C2020a(C2021b<T, U> bVar, long j) {
            this.f6608a = j;
            this.f6609b = bVar;
        }
    }

    /* renamed from: c.a.e.e.d.u$b */
    static final class C2021b<T, U> extends AtomicInteger implements C1674ab<T>, C1690c {

        /* renamed from: k */
        static final C2020a<?, ?>[] f6613k = new C2020a[0];

        /* renamed from: l */
        static final C2020a<?, ?>[] f6614l = new C2020a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: a */
        final C1674ab<? super U> f6615a;

        /* renamed from: b */
        final C1711f<? super T, ? extends C2206z<? extends U>> f6616b;

        /* renamed from: c */
        final boolean f6617c;

        /* renamed from: d */
        final int f6618d;

        /* renamed from: e */
        final int f6619e;

        /* renamed from: f */
        volatile C1754h<U> f6620f;

        /* renamed from: g */
        volatile boolean f6621g;

        /* renamed from: h */
        final C2126c f6622h = new C2126c();

        /* renamed from: i */
        volatile boolean f6623i;

        /* renamed from: j */
        final AtomicReference<C2020a<?, ?>[]> f6624j;

        /* renamed from: m */
        C1690c f6625m;

        /* renamed from: n */
        long f6626n;

        /* renamed from: o */
        long f6627o;

        /* renamed from: p */
        int f6628p;

        /* renamed from: q */
        Queue<C2206z<? extends U>> f6629q;

        /* renamed from: r */
        int f6630r;

        public final boolean isDisposed() {
            return this.f6623i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6355a() {
            if (getAndIncrement() == 0) {
                mo6356b();
            }
        }

        public final void onComplete() {
            if (!this.f6621g) {
                this.f6621g = true;
                mo6355a();
            }
        }

        public final void dispose() {
            if (!this.f6623i) {
                this.f6623i = true;
                if (mo6357c()) {
                    Throwable terminate = this.f6622h.terminate();
                    if (terminate != null && terminate != C2131h.f6891a) {
                        C2150a.m6492a(terminate);
                    }
                }
            }
        }

        /* renamed from: d */
        private boolean m6304d() {
            if (this.f6623i) {
                return true;
            }
            Throwable th = (Throwable) this.f6622h.get();
            if (this.f6617c || th == null) {
                return false;
            }
            mo6357c();
            Throwable terminate = this.f6622h.terminate();
            if (terminate != C2131h.f6891a) {
                this.f6615a.onError(terminate);
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo6357c() {
            this.f6625m.dispose();
            if (((C2020a[]) this.f6624j.get()) != f6614l) {
                C2020a<?, ?>[] aVarArr = (C2020a[]) this.f6624j.getAndSet(f6614l);
                if (aVarArr != f6614l) {
                    for (C2020a<?, ?> a : aVarArr) {
                        a.mo6354a();
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6356b() {
            int i;
            int i2;
            int i3;
            C1674ab<? super U> abVar = this.f6615a;
            int i4 = 1;
            while (!m6304d()) {
                C1754h<U> hVar = this.f6620f;
                if (hVar != null) {
                    while (!m6304d()) {
                        Object poll = hVar.poll();
                        if (poll != null) {
                            abVar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.f6621g;
                C1754h<U> hVar2 = this.f6620f;
                C2020a[] aVarArr = (C2020a[]) this.f6624j.get();
                int length = aVarArr.length;
                if (this.f6618d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.f6629q.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((hVar2 == null || hVar2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.f6627o;
                        int i5 = this.f6628p;
                        if (length <= i5 || aVarArr[i5].f6608a != j) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            int i6 = i5;
                            for (int i7 = 0; i7 < length && aVarArr[i6].f6608a != j; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.f6628p = i6;
                            this.f6627o = aVarArr[i6].f6608a;
                            i5 = i6;
                        }
                        int i8 = 0;
                        i2 = 0;
                        while (i8 < length) {
                            if (!m6304d()) {
                                C2020a aVar = aVarArr[i3];
                                C1755i<U> iVar = aVar.f6611d;
                                if (iVar != null) {
                                    while (true) {
                                        try {
                                            Object poll2 = iVar.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            abVar.onNext(poll2);
                                            if (m6304d()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C1700b.m6017b(th);
                                            aVar.mo6354a();
                                            this.f6622h.addThrowable(th);
                                            if (!m6304d()) {
                                                m6303b(aVar);
                                                i2++;
                                                i3++;
                                                if (i3 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.f6610c;
                                C1755i<U> iVar2 = aVar.f6611d;
                                if (z2 && (iVar2 == null || iVar2.isEmpty())) {
                                    m6303b(aVar);
                                    if (!m6304d()) {
                                        i2++;
                                    } else {
                                        return;
                                    }
                                }
                                i3++;
                                if (i3 != length) {
                                    i8++;
                                }
                                i3 = 0;
                                i8++;
                            } else {
                                return;
                            }
                        }
                        this.f6628p = i3;
                        this.f6627o = aVarArr[i3].f6608a;
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (this.f6618d != Integer.MAX_VALUE) {
                        while (true) {
                            int i9 = i2 - 1;
                            if (i2 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                C2206z zVar = (C2206z) this.f6629q.poll();
                                if (zVar == null) {
                                    this.f6630r--;
                                } else {
                                    m6300a(zVar);
                                }
                            }
                            i2 = i9;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable terminate = this.f6622h.terminate();
                    if (terminate != C2131h.f6891a) {
                        if (terminate == null) {
                            abVar.onComplete();
                            return;
                        }
                        abVar.onError(terminate);
                    }
                    return;
                }
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6625m, cVar)) {
                this.f6625m = cVar;
                this.f6615a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6621g) {
                C2150a.m6492a(th);
            } else if (this.f6622h.addThrowable(th)) {
                this.f6621g = true;
                mo6355a();
            } else {
                C2150a.m6492a(th);
            }
        }

        /* renamed from: a */
        private boolean m6301a(C2020a<T, U> aVar) {
            C2020a<?, ?>[] aVarArr;
            C2020a[] aVarArr2;
            do {
                aVarArr = (C2020a[]) this.f6624j.get();
                if (aVarArr == f6614l) {
                    aVar.mo6354a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C2020a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f6624j.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        private void m6303b(C2020a<T, U> aVar) {
            C2020a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C2020a[]) this.f6624j.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f6613k;
                        } else {
                            C2020a[] aVarArr2 = new C2020a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            obj = aVarArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f6624j.compareAndSet(aVarArr, obj));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m6300a(p064c.p065a.C2206z<? extends U> r6) {
            /*
                r5 = this;
            L_0x0000:
                boolean r0 = r6 instanceof java.util.concurrent.Callable
                if (r0 == 0) goto L_0x0032
                java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6
                boolean r6 = r5.m6302a(r6)
                if (r6 == 0) goto L_0x0047
                int r6 = r5.f6618d
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r0) goto L_0x0047
                r6 = 0
                monitor-enter(r5)
                java.util.Queue<c.a.z<? extends U>> r0 = r5.f6629q     // Catch:{ all -> 0x002f }
                java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x002f }
                c.a.z r0 = (p064c.p065a.C2206z) r0     // Catch:{ all -> 0x002f }
                r1 = 1
                if (r0 != 0) goto L_0x0026
                int r6 = r5.f6630r     // Catch:{ all -> 0x002f }
                int r6 = r6 - r1
                r5.f6630r = r6     // Catch:{ all -> 0x002f }
                r6 = 1
            L_0x0026:
                monitor-exit(r5)     // Catch:{ all -> 0x002f }
                if (r6 == 0) goto L_0x002d
                r5.mo6355a()
                return
            L_0x002d:
                r6 = r0
                goto L_0x0000
            L_0x002f:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x002f }
                throw r6
            L_0x0032:
                c.a.e.e.d.u$a r0 = new c.a.e.e.d.u$a
                long r1 = r5.f6626n
                r3 = 1
                long r3 = r3 + r1
                r5.f6626n = r3
                r0.<init>(r5, r1)
                boolean r1 = r5.m6301a(r0)
                if (r1 == 0) goto L_0x0047
                r6.mo6314a(r0)
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C2019u.C2021b.m6300a(c.a.z):void");
        }

        public final void onNext(T t) {
            if (!this.f6621g) {
                try {
                    C2206z zVar = (C2206z) C1745b.m6050a(this.f6616b.apply(t), "The mapper returned a null ObservableSource");
                    if (this.f6618d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.f6630r == this.f6618d) {
                                this.f6629q.offer(zVar);
                                return;
                            }
                            this.f6630r++;
                        }
                    }
                    m6300a(zVar);
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    this.f6625m.dispose();
                    onError(th);
                }
            }
        }

        /* renamed from: a */
        private boolean m6302a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C1754h<U> hVar = this.f6620f;
                    if (hVar == null) {
                        if (this.f6618d == Integer.MAX_VALUE) {
                            hVar = new C2072c<>(this.f6619e);
                        } else {
                            hVar = new C2071b<>(this.f6618d);
                        }
                        this.f6620f = hVar;
                    }
                    if (!hVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f6615a.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                mo6356b();
                return true;
            } catch (Throwable th) {
                C1700b.m6017b(th);
                this.f6622h.addThrowable(th);
                mo6355a();
                return true;
            }
        }

        C2021b(C1674ab<? super U> abVar, C1711f<? super T, ? extends C2206z<? extends U>> fVar, boolean z, int i, int i2) {
            this.f6615a = abVar;
            this.f6616b = fVar;
            this.f6617c = z;
            this.f6618d = i;
            this.f6619e = i2;
            if (i != Integer.MAX_VALUE) {
                this.f6629q = new ArrayDeque(i);
            }
            this.f6624j = new AtomicReference<>(f6613k);
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super U> abVar) {
        if (!C1941as.m6238a(this.f6202a, abVar, this.f6604b)) {
            C2206z zVar = this.f6202a;
            C2021b bVar = new C2021b(abVar, this.f6604b, this.f6605c, this.f6606d, this.f6607e);
            zVar.mo6314a(bVar);
        }
    }

    public C2019u(C2206z<T> zVar, C1711f<? super T, ? extends C2206z<? extends U>> fVar, boolean z, int i, int i2) {
        super(zVar);
        this.f6604b = fVar;
        this.f6605c = z;
        this.f6606d = i;
        this.f6607e = i2;
    }
}
