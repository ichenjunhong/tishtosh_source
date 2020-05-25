package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p075c.C1752f;
import p064c.p065a.p072e.p075c.C1754h;
import p064c.p065a.p072e.p075c.C1755i;
import p064c.p065a.p072e.p083f.C2071b;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2126c;
import p064c.p065a.p072e.p087j.C2127d;
import p064c.p065a.p072e.p087j.C2131h;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.i */
public final class C1821i<T, U> extends C1785a<T, U> {

    /* renamed from: c */
    final C1711f<? super T, ? extends C53694b<? extends U>> f6009c;

    /* renamed from: d */
    final boolean f6010d;

    /* renamed from: e */
    final int f6011e;

    /* renamed from: f */
    final int f6012f;

    /* renamed from: c.a.e.e.b.i$a */
    static final class C1822a<T, U> extends AtomicReference<C53696d> implements C1690c, C2177l<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a */
        final long f6013a;

        /* renamed from: b */
        final C1823b<T, U> f6014b;

        /* renamed from: c */
        final int f6015c = (this.f6016d >> 2);

        /* renamed from: d */
        final int f6016d;

        /* renamed from: e */
        volatile boolean f6017e;

        /* renamed from: f */
        volatile C1755i<U> f6018f;

        /* renamed from: g */
        long f6019g;

        /* renamed from: h */
        int f6020h;

        public final void dispose() {
            C2122f.cancel(this);
        }

        public final boolean isDisposed() {
            if (get() == C2122f.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            this.f6017e = true;
            this.f6014b.mo6285a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6284a(long j) {
            if (this.f6020h != 1) {
                long j2 = this.f6019g + j;
                if (j2 >= ((long) this.f6015c)) {
                    this.f6019g = 0;
                    ((C53696d) get()).request(j2);
                    return;
                }
                this.f6019g = j2;
            }
        }

        public final void onError(Throwable th) {
            lazySet(C2122f.CANCELLED);
            C1823b<T, U> bVar = this.f6014b;
            if (bVar.f6030h.addThrowable(th)) {
                this.f6017e = true;
                if (!bVar.f6025c) {
                    bVar.f6034n.cancel();
                    for (C1822a dispose : (C1822a[]) bVar.f6032j.getAndSet(C1823b.f6022l)) {
                        dispose.dispose();
                    }
                }
                bVar.mo6285a();
                return;
            }
            C2150a.m6492a(th);
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.setOnce(this, dVar)) {
                if (dVar instanceof C1752f) {
                    C1752f fVar = (C1752f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f6020h = requestFusion;
                        this.f6018f = fVar;
                        this.f6017e = true;
                        this.f6014b.mo6285a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f6020h = requestFusion;
                        this.f6018f = fVar;
                    }
                }
                dVar.request((long) this.f6016d);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
            if (r0.decrementAndGet() != 0) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
            if (r0.getAndIncrement() == 0) goto L_0x0090;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(U r8) {
            /*
                r7 = this;
                int r0 = r7.f6020h
                r1 = 2
                if (r0 == r1) goto L_0x0094
                c.a.e.e.b.i$b<T, U> r0 = r7.f6014b
                int r1 = r0.get()
                if (r1 != 0) goto L_0x006c
                r1 = 0
                r2 = 1
                boolean r1 = r0.compareAndSet(r1, r2)
                if (r1 == 0) goto L_0x006c
                java.util.concurrent.atomic.AtomicLong r1 = r0.f6033m
                long r1 = r1.get()
                c.a.e.c.i<U> r3 = r7.f6018f
                r4 = 0
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x0044
                if (r3 == 0) goto L_0x002b
                boolean r4 = r3.isEmpty()
                if (r4 == 0) goto L_0x0044
            L_0x002b:
                org.b.c<? super U> r3 = r0.f6023a
                r3.onNext(r8)
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r8 == 0) goto L_0x003e
                java.util.concurrent.atomic.AtomicLong r8 = r0.f6033m
                r8.decrementAndGet()
            L_0x003e:
                r1 = 1
                r7.mo6284a(r1)
                goto L_0x0065
            L_0x0044:
                if (r3 != 0) goto L_0x0054
                c.a.e.c.i<U> r1 = r7.f6018f
                if (r1 != 0) goto L_0x0053
                c.a.e.f.b r1 = new c.a.e.f.b
                int r2 = r0.f6027e
                r1.<init>(r2)
                r7.f6018f = r1
            L_0x0053:
                r3 = r1
            L_0x0054:
                boolean r8 = r3.offer(r8)
                if (r8 != 0) goto L_0x0065
                c.a.c.c r8 = new c.a.c.c
                java.lang.String r1 = "Inner queue full?!"
                r8.<init>(r1)
                r0.onError(r8)
                goto L_0x0099
            L_0x0065:
                int r8 = r0.decrementAndGet()
                if (r8 == 0) goto L_0x0093
                goto L_0x0090
            L_0x006c:
                c.a.e.c.i<U> r1 = r7.f6018f
                if (r1 != 0) goto L_0x0079
                c.a.e.f.b r1 = new c.a.e.f.b
                int r2 = r0.f6027e
                r1.<init>(r2)
                r7.f6018f = r1
            L_0x0079:
                boolean r8 = r1.offer(r8)
                if (r8 != 0) goto L_0x008a
                c.a.c.c r8 = new c.a.c.c
                java.lang.String r1 = "Inner queue full?!"
                r8.<init>(r1)
                r0.onError(r8)
                goto L_0x0099
            L_0x008a:
                int r8 = r0.getAndIncrement()
                if (r8 != 0) goto L_0x0093
            L_0x0090:
                r0.mo6286b()
            L_0x0093:
                return
            L_0x0094:
                c.a.e.e.b.i$b<T, U> r8 = r7.f6014b
                r8.mo6285a()
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p079b.C1821i.C1822a.onNext(java.lang.Object):void");
        }

        C1822a(C1823b<T, U> bVar, long j) {
            this.f6013a = j;
            this.f6014b = bVar;
            this.f6016d = bVar.f6027e;
        }
    }

    /* renamed from: c.a.e.e.b.i$b */
    static final class C1823b<T, U> extends AtomicInteger implements C2177l<T>, C53696d {

        /* renamed from: k */
        static final C1822a<?, ?>[] f6021k = new C1822a[0];

        /* renamed from: l */
        static final C1822a<?, ?>[] f6022l = new C1822a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: a */
        final C53695c<? super U> f6023a;

        /* renamed from: b */
        final C1711f<? super T, ? extends C53694b<? extends U>> f6024b;

        /* renamed from: c */
        final boolean f6025c;

        /* renamed from: d */
        final int f6026d;

        /* renamed from: e */
        final int f6027e;

        /* renamed from: f */
        volatile C1754h<U> f6028f;

        /* renamed from: g */
        volatile boolean f6029g;

        /* renamed from: h */
        final C2126c f6030h = new C2126c();

        /* renamed from: i */
        volatile boolean f6031i;

        /* renamed from: j */
        final AtomicReference<C1822a<?, ?>[]> f6032j = new AtomicReference<>();

        /* renamed from: m */
        final AtomicLong f6033m = new AtomicLong();

        /* renamed from: n */
        C53696d f6034n;

        /* renamed from: o */
        long f6035o;

        /* renamed from: p */
        long f6036p;

        /* renamed from: q */
        int f6037q;

        /* renamed from: r */
        int f6038r;

        /* renamed from: s */
        final int f6039s;

        /* renamed from: e */
        private void m6132e() {
            C1754h<U> hVar = this.f6028f;
            if (hVar != null) {
                hVar.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6285a() {
            if (getAndIncrement() == 0) {
                mo6286b();
            }
        }

        public final void onComplete() {
            if (!this.f6029g) {
                this.f6029g = true;
                mo6285a();
            }
        }

        /* renamed from: c */
        private C1755i<U> m6130c() {
            C1754h<U> hVar = this.f6028f;
            if (hVar == null) {
                if (this.f6026d == Integer.MAX_VALUE) {
                    hVar = new C2072c<>(this.f6027e);
                } else {
                    hVar = new C2071b<>(this.f6026d);
                }
                this.f6028f = hVar;
            }
            return hVar;
        }

        /* renamed from: d */
        private boolean m6131d() {
            if (this.f6031i) {
                m6132e();
                return true;
            } else if (this.f6025c || this.f6030h.get() == null) {
                return false;
            } else {
                m6132e();
                Throwable terminate = this.f6030h.terminate();
                if (terminate != C2131h.f6891a) {
                    this.f6023a.onError(terminate);
                }
                return true;
            }
        }

        public final void cancel() {
            if (!this.f6031i) {
                this.f6031i = true;
                this.f6034n.cancel();
                if (((C1822a[]) this.f6032j.get()) != f6022l) {
                    C1822a<?, ?>[] aVarArr = (C1822a[]) this.f6032j.getAndSet(f6022l);
                    if (aVarArr != f6022l) {
                        for (C1822a<?, ?> dispose : aVarArr) {
                            dispose.dispose();
                        }
                        Throwable terminate = this.f6030h.terminate();
                        if (!(terminate == null || terminate == C2131h.f6891a)) {
                            C2150a.m6492a(terminate);
                        }
                    }
                }
                if (getAndIncrement() == 0) {
                    C1754h<U> hVar = this.f6028f;
                    if (hVar != null) {
                        hVar.clear();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6286b() {
            boolean z;
            long j;
            long j2;
            int i;
            long j3;
            boolean z2;
            C1822a[] aVarArr;
            int i2;
            int i3;
            C53695c<? super U> cVar = this.f6023a;
            int i4 = 1;
            while (!m6131d()) {
                C1754h<U> hVar = this.f6028f;
                long j4 = this.f6033m.get();
                if (j4 == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (hVar != null) {
                    j = 0;
                    while (true) {
                        long j5 = 0;
                        Object obj = null;
                        while (true) {
                            if (j4 == 0) {
                                break;
                            }
                            Object poll = hVar.poll();
                            if (!m6131d()) {
                                if (poll == null) {
                                    obj = poll;
                                    break;
                                }
                                cVar.onNext(poll);
                                j++;
                                j5++;
                                j4--;
                                obj = poll;
                            } else {
                                return;
                            }
                        }
                        if (j5 != 0) {
                            if (z) {
                                j4 = Long.MAX_VALUE;
                            } else {
                                j4 = this.f6033m.addAndGet(-j5);
                            }
                        }
                        if (j4 == 0 || obj == null) {
                            break;
                        }
                    }
                } else {
                    j = 0;
                }
                boolean z3 = this.f6029g;
                C1754h<U> hVar2 = this.f6028f;
                C1822a[] aVarArr2 = (C1822a[]) this.f6032j.get();
                int length = aVarArr2.length;
                if (!z3 || ((hVar2 != null && !hVar2.isEmpty()) || length != 0)) {
                    if (length != 0) {
                        i = i4;
                        long j6 = this.f6036p;
                        int i5 = this.f6037q;
                        if (length <= i5 || aVarArr2[i5].f6013a != j6) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            int i6 = i5;
                            for (int i7 = 0; i7 < length && aVarArr2[i6].f6013a != j6; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.f6037q = i6;
                            this.f6036p = aVarArr2[i6].f6013a;
                            i5 = i6;
                        }
                        int i8 = i5;
                        z2 = false;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length) {
                                aVarArr = aVarArr2;
                                break;
                            } else if (!m6131d()) {
                                C1822a aVar = aVarArr2[i8];
                                Object obj2 = null;
                                while (!m6131d()) {
                                    C1755i<U> iVar = aVar.f6018f;
                                    if (iVar != null) {
                                        aVarArr = aVarArr2;
                                        i2 = length;
                                        long j7 = 0;
                                        while (j2 != 0) {
                                            try {
                                                obj2 = iVar.poll();
                                                if (obj2 == null) {
                                                    break;
                                                }
                                                cVar.onNext(obj2);
                                                if (!m6131d()) {
                                                    j2--;
                                                    j7++;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                C1700b.m6017b(th2);
                                                aVar.dispose();
                                                this.f6030h.addThrowable(th2);
                                                if (!this.f6025c) {
                                                    this.f6034n.cancel();
                                                }
                                                if (!m6131d()) {
                                                    m6129b(aVar);
                                                    i9++;
                                                    i3 = i2;
                                                    z2 = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j7 != 0) {
                                            if (!z) {
                                                j2 = this.f6033m.addAndGet(-j7);
                                            } else {
                                                j2 = Long.MAX_VALUE;
                                            }
                                            aVar.mo6284a(j7);
                                        }
                                        if (!(j2 == 0 || obj2 == null)) {
                                            aVarArr2 = aVarArr;
                                            length = i2;
                                        }
                                    } else {
                                        aVarArr = aVarArr2;
                                        i2 = length;
                                    }
                                    boolean z4 = aVar.f6017e;
                                    C1755i<U> iVar2 = aVar.f6018f;
                                    if (z4 && (iVar2 == null || iVar2.isEmpty())) {
                                        m6129b(aVar);
                                        if (!m6131d()) {
                                            j++;
                                            z2 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j2 == 0) {
                                        break;
                                    }
                                    int i10 = i8 + 1;
                                    i3 = i2;
                                    if (i10 == i3) {
                                        i8 = 0;
                                    } else {
                                        i8 = i10;
                                    }
                                    i9++;
                                    length = i3;
                                    aVarArr2 = aVarArr;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.f6037q = i8;
                        this.f6036p = aVarArr[i8].f6013a;
                        j3 = j;
                    } else {
                        i = i4;
                        j3 = j;
                        z2 = false;
                    }
                    if (j3 != 0 && !this.f6031i) {
                        this.f6034n.request(j3);
                    }
                    if (!z2) {
                        i4 = addAndGet(-i);
                        if (i4 == 0) {
                            return;
                        }
                    } else {
                        i4 = i;
                    }
                } else {
                    Throwable terminate = this.f6030h.terminate();
                    if (terminate != C2131h.f6891a) {
                        if (terminate == null) {
                            cVar.onComplete();
                            return;
                        }
                        cVar.onError(terminate);
                    }
                    return;
                }
            }
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                C2127d.m6415a(this.f6033m, j);
                mo6285a();
            }
        }

        public final void onError(Throwable th) {
            if (this.f6029g) {
                C2150a.m6492a(th);
            } else if (this.f6030h.addThrowable(th)) {
                this.f6029g = true;
                mo6285a();
            } else {
                C2150a.m6492a(th);
            }
        }

        /* renamed from: a */
        private boolean m6128a(C1822a<T, U> aVar) {
            C1822a<?, ?>[] aVarArr;
            C1822a[] aVarArr2;
            do {
                aVarArr = (C1822a[]) this.f6032j.get();
                if (aVarArr == f6022l) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C1822a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f6032j.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        private void m6129b(C1822a<T, U> aVar) {
            C1822a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C1822a[]) this.f6032j.get();
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
                            obj = f6021k;
                        } else {
                            C1822a[] aVarArr2 = new C1822a[(length - 1)];
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
            } while (!this.f6032j.compareAndSet(aVarArr, obj));
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f6034n, dVar)) {
                this.f6034n = dVar;
                this.f6023a.onSubscribe(this);
                if (!this.f6031i) {
                    if (this.f6026d == Integer.MAX_VALUE) {
                        dVar.request(Long.MAX_VALUE);
                        return;
                    }
                    dVar.request((long) this.f6026d);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
            if (decrementAndGet() != 0) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
            if (getAndIncrement() == 0) goto L_0x00ae;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r10) {
            /*
                r9 = this;
                boolean r0 = r9.f6029g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                c.a.d.f<? super T, ? extends org.b.b<? extends U>> r0 = r9.f6024b     // Catch:{ Throwable -> 0x00f1 }
                java.lang.Object r10 = r0.apply(r10)     // Catch:{ Throwable -> 0x00f1 }
                java.lang.String r0 = "The mapper returned a null Publisher"
                java.lang.Object r10 = p064c.p065a.p072e.p074b.C1745b.m6050a(r10, r0)     // Catch:{ Throwable -> 0x00f1 }
                org.b.b r10 = (org.p2692b.C53694b) r10     // Catch:{ Throwable -> 0x00f1 }
                boolean r0 = r10 instanceof java.util.concurrent.Callable
                if (r0 == 0) goto L_0x00db
                java.util.concurrent.Callable r10 = (java.util.concurrent.Callable) r10     // Catch:{ Throwable -> 0x00ce }
                java.lang.Object r10 = r10.call()     // Catch:{ Throwable -> 0x00ce }
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = 1
                r2 = 0
                if (r10 == 0) goto L_0x00b2
                int r3 = r9.get()
                if (r3 != 0) goto L_0x0093
                boolean r3 = r9.compareAndSet(r2, r1)
                if (r3 == 0) goto L_0x0093
                java.util.concurrent.atomic.AtomicLong r3 = r9.f6033m
                long r3 = r3.get()
                c.a.e.c.h<U> r5 = r9.f6028f
                r6 = 0
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x0075
                if (r5 == 0) goto L_0x0046
                boolean r6 = r5.isEmpty()
                if (r6 == 0) goto L_0x0075
            L_0x0046:
                org.b.c<? super U> r5 = r9.f6023a
                r5.onNext(r10)
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 == 0) goto L_0x0059
                java.util.concurrent.atomic.AtomicLong r10 = r9.f6033m
                r10.decrementAndGet()
            L_0x0059:
                int r10 = r9.f6026d
                if (r10 == r0) goto L_0x008c
                boolean r10 = r9.f6031i
                if (r10 != 0) goto L_0x008c
                int r10 = r9.f6038r
                int r10 = r10 + r1
                r9.f6038r = r10
                int r0 = r9.f6039s
                if (r10 != r0) goto L_0x008c
                r9.f6038r = r2
                org.b.d r10 = r9.f6034n
                int r0 = r9.f6039s
                long r0 = (long) r0
                r10.request(r0)
                goto L_0x008c
            L_0x0075:
                if (r5 != 0) goto L_0x007b
                c.a.e.c.i r5 = r9.m6130c()
            L_0x007b:
                boolean r10 = r5.offer(r10)
                if (r10 != 0) goto L_0x008c
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "Scalar queue full?!"
                r10.<init>(r0)
                r9.onError(r10)
                goto L_0x00cd
            L_0x008c:
                int r10 = r9.decrementAndGet()
                if (r10 == 0) goto L_0x00f0
                goto L_0x00ae
            L_0x0093:
                c.a.e.c.i r0 = r9.m6130c()
                boolean r10 = r0.offer(r10)
                if (r10 != 0) goto L_0x00a8
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "Scalar queue full?!"
                r10.<init>(r0)
                r9.onError(r10)
                goto L_0x00cd
            L_0x00a8:
                int r10 = r9.getAndIncrement()
                if (r10 != 0) goto L_0x00f0
            L_0x00ae:
                r9.mo6286b()
                goto L_0x00f0
            L_0x00b2:
                int r10 = r9.f6026d
                if (r10 == r0) goto L_0x00cd
                boolean r10 = r9.f6031i
                if (r10 != 0) goto L_0x00cd
                int r10 = r9.f6038r
                int r10 = r10 + r1
                r9.f6038r = r10
                int r0 = r9.f6039s
                if (r10 != r0) goto L_0x00cd
                r9.f6038r = r2
                org.b.d r10 = r9.f6034n
                int r0 = r9.f6039s
                long r0 = (long) r0
                r10.request(r0)
            L_0x00cd:
                return
            L_0x00ce:
                r10 = move-exception
                p064c.p065a.p070c.C1700b.m6017b(r10)
                c.a.e.j.c r0 = r9.f6030h
                r0.addThrowable(r10)
                r9.mo6285a()
                return
            L_0x00db:
                c.a.e.e.b.i$a r0 = new c.a.e.e.b.i$a
                long r1 = r9.f6035o
                r3 = 1
                long r3 = r3 + r1
                r9.f6035o = r3
                r0.<init>(r9, r1)
                boolean r1 = r9.m6128a(r0)
                if (r1 == 0) goto L_0x00f0
                r10.mo336a(r0)
            L_0x00f0:
                return
            L_0x00f1:
                r10 = move-exception
                p064c.p065a.p070c.C1700b.m6017b(r10)
                org.b.d r0 = r9.f6034n
                r0.cancel()
                r9.onError(r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p079b.C1821i.C1823b.onNext(java.lang.Object):void");
        }

        C1823b(C53695c<? super U> cVar, C1711f<? super T, ? extends C53694b<? extends U>> fVar, boolean z, int i, int i2) {
            this.f6023a = cVar;
            this.f6024b = fVar;
            this.f6025c = z;
            this.f6026d = i;
            this.f6027e = i2;
            this.f6039s = Math.max(1, i >> 1);
            this.f6032j.lazySet(f6021k);
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super U> cVar) {
        if (!C1786aa.m6080a(this.f5924a, cVar, this.f6009c)) {
            C2149h hVar = this.f5924a;
            C1823b bVar = new C1823b(cVar, this.f6009c, this.f6010d, this.f6011e, this.f6012f);
            hVar.mo6449a((C2177l<? super T>) bVar);
        }
    }

    public C1821i(C2149h<T> hVar, C1711f<? super T, ? extends C53694b<? extends U>> fVar, boolean z, int i, int i2) {
        super(hVar);
        this.f6009c = fVar;
        this.f6010d = z;
        this.f6011e = i;
        this.f6012f = i2;
    }
}
