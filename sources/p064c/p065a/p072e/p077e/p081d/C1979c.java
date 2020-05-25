package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p072e.p087j.C2126c;

/* renamed from: c.a.e.e.d.c */
public final class C1979c<T, R> extends C2201v<R> {

    /* renamed from: a */
    final C2206z<? extends T>[] f6451a;

    /* renamed from: b */
    final Iterable<? extends C2206z<? extends T>> f6452b = null;

    /* renamed from: c */
    final C1711f<? super Object[], ? extends R> f6453c;

    /* renamed from: d */
    final int f6454d;

    /* renamed from: e */
    final boolean f6455e;

    /* renamed from: c.a.e.e.d.c$a */
    static final class C1980a<T, R> extends AtomicReference<C1690c> implements C1674ab<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* renamed from: a */
        final C1981b<T, R> f6456a;

        /* renamed from: b */
        final int f6457b;

        /* renamed from: a */
        public final void mo6343a() {
            C1718b.dispose(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
            if (r4 == r2.length) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r1 == false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
            r0.mo6344a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
            r0.mo6346b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onComplete() {
            /*
                r5 = this;
                c.a.e.e.d.c$b<T, R> r0 = r5.f6456a
                int r1 = r5.f6457b
                monitor-enter(r0)
                java.lang.Object[] r2 = r0.f6461d     // Catch:{ all -> 0x0029 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                return
            L_0x000b:
                r1 = r2[r1]     // Catch:{ all -> 0x0029 }
                r3 = 1
                if (r1 != 0) goto L_0x0012
                r1 = 1
                goto L_0x0013
            L_0x0012:
                r1 = 0
            L_0x0013:
                if (r1 != 0) goto L_0x001d
                int r4 = r0.f6468k     // Catch:{ all -> 0x0029 }
                int r4 = r4 + r3
                r0.f6468k = r4     // Catch:{ all -> 0x0029 }
                int r2 = r2.length     // Catch:{ all -> 0x0029 }
                if (r4 != r2) goto L_0x001f
            L_0x001d:
                r0.f6465h = r3     // Catch:{ all -> 0x0029 }
            L_0x001f:
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                if (r1 == 0) goto L_0x0025
                r0.mo6344a()
            L_0x0025:
                r0.mo6346b()
                return
            L_0x0029:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C1979c.C1980a.onComplete():void");
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        public final void onNext(T t) {
            this.f6456a.mo6345a(this.f6457b, t);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            if (r3 == r5.length) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onError(java.lang.Throwable r5) {
            /*
                r4 = this;
                c.a.e.e.d.c$b<T, R> r0 = r4.f6456a
                int r1 = r4.f6457b
                c.a.e.j.c r2 = r0.f6466i
                boolean r2 = r2.addThrowable(r5)
                if (r2 == 0) goto L_0x003a
                boolean r5 = r0.f6463f
                r2 = 1
                if (r5 == 0) goto L_0x0030
                monitor-enter(r0)
                java.lang.Object[] r5 = r0.f6461d     // Catch:{ all -> 0x002d }
                if (r5 != 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0018:
                r1 = r5[r1]     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x001e
                r1 = 1
                goto L_0x001f
            L_0x001e:
                r1 = 0
            L_0x001f:
                if (r1 != 0) goto L_0x0029
                int r3 = r0.f6468k     // Catch:{ all -> 0x002d }
                int r3 = r3 + r2
                r0.f6468k = r3     // Catch:{ all -> 0x002d }
                int r5 = r5.length     // Catch:{ all -> 0x002d }
                if (r3 != r5) goto L_0x002b
            L_0x0029:
                r0.f6465h = r2     // Catch:{ all -> 0x002d }
            L_0x002b:
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            L_0x0030:
                r1 = 1
            L_0x0031:
                if (r1 == 0) goto L_0x0036
                r0.mo6344a()
            L_0x0036:
                r0.mo6346b()
                return
            L_0x003a:
                p064c.p065a.p090h.C2150a.m6492a(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C1979c.C1980a.onError(java.lang.Throwable):void");
        }

        C1980a(C1981b<T, R> bVar, int i) {
            this.f6456a = bVar;
            this.f6457b = i;
        }
    }

    /* renamed from: c.a.e.e.d.c$b */
    static final class C1981b<T, R> extends AtomicInteger implements C1690c {
        private static final long serialVersionUID = 8567835998786448817L;

        /* renamed from: a */
        final C1674ab<? super R> f6458a;

        /* renamed from: b */
        final C1711f<? super Object[], ? extends R> f6459b;

        /* renamed from: c */
        final C1980a<T, R>[] f6460c;

        /* renamed from: d */
        Object[] f6461d;

        /* renamed from: e */
        final C2072c<Object[]> f6462e;

        /* renamed from: f */
        final boolean f6463f;

        /* renamed from: g */
        volatile boolean f6464g;

        /* renamed from: h */
        volatile boolean f6465h;

        /* renamed from: i */
        final C2126c f6466i = new C2126c();

        /* renamed from: j */
        int f6467j;

        /* renamed from: k */
        int f6468k;

        public final boolean isDisposed() {
            return this.f6464g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6344a() {
            for (C1980a<T, R> a : this.f6460c) {
                a.mo6343a();
            }
        }

        public final void dispose() {
            if (!this.f6464g) {
                this.f6464g = true;
                mo6344a();
                if (getAndIncrement() == 0) {
                    m6266a(this.f6462e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6346b() {
            boolean z;
            if (getAndIncrement() == 0) {
                C2072c<Object[]> cVar = this.f6462e;
                C1674ab<? super R> abVar = this.f6458a;
                boolean z2 = this.f6463f;
                int i = 1;
                while (!this.f6464g) {
                    if (z2 || this.f6466i.get() == null) {
                        boolean z3 = this.f6465h;
                        Object[] objArr = (Object[]) cVar.poll();
                        if (objArr == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z3 && z) {
                            m6266a(cVar);
                            Throwable terminate = this.f6466i.terminate();
                            if (terminate == null) {
                                abVar.onComplete();
                                return;
                            } else {
                                abVar.onError(terminate);
                                return;
                            }
                        } else if (!z) {
                            try {
                                abVar.onNext(C1745b.m6050a(this.f6459b.apply(objArr), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                C1700b.m6017b(th);
                                this.f6466i.addThrowable(th);
                                mo6344a();
                                m6266a(cVar);
                                abVar.onError(this.f6466i.terminate());
                                return;
                            }
                        } else {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        mo6344a();
                        m6266a(cVar);
                        abVar.onError(this.f6466i.terminate());
                        return;
                    }
                }
                m6266a(cVar);
            }
        }

        /* renamed from: a */
        private void m6266a(C2072c<?> cVar) {
            synchronized (this) {
                this.f6461d = null;
            }
            cVar.clear();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            mo6346b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo6345a(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f6461d     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.f6467j     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.f6467j = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                c.a.e.f.c<java.lang.Object[]> r4 = r3.f6462e     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.offer(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.mo6346b()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C1979c.C1981b.mo6345a(int, java.lang.Object):void");
        }

        C1981b(C1674ab<? super R> abVar, C1711f<? super Object[], ? extends R> fVar, int i, int i2, boolean z) {
            this.f6458a = abVar;
            this.f6459b = fVar;
            this.f6463f = z;
            this.f6461d = new Object[i];
            C1980a<T, R>[] aVarArr = new C1980a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new C1980a<>(this, i3);
            }
            this.f6460c = aVarArr;
            this.f6462e = new C2072c<>(i2);
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super R> abVar) {
        int i;
        C2206z<? extends T>[] zVarArr = this.f6451a;
        if (zVarArr == null) {
            C2201v[] vVarArr = new C2201v[8];
            C2206z<? extends T>[] zVarArr2 = vVarArr;
            int i2 = 0;
            for (C2206z<? extends T> zVar : this.f6452b) {
                if (i2 == zVarArr2.length) {
                    C2206z<? extends T>[] zVarArr3 = new C2206z[((i2 >> 2) + i2)];
                    System.arraycopy(zVarArr2, 0, zVarArr3, 0, i2);
                    zVarArr2 = zVarArr3;
                }
                int i3 = i2 + 1;
                zVarArr2[i2] = zVar;
                i2 = i3;
            }
            i = i2;
            zVarArr = zVarArr2;
        } else {
            i = zVarArr.length;
        }
        if (i == 0) {
            C1719c.complete(abVar);
            return;
        }
        C1981b bVar = new C1981b(abVar, this.f6453c, i, this.f6454d, this.f6455e);
        C1980a<T, R>[] aVarArr = bVar.f6460c;
        int length = aVarArr.length;
        bVar.f6458a.onSubscribe(bVar);
        for (int i4 = 0; i4 < length && !bVar.f6465h && !bVar.f6464g; i4++) {
            zVarArr[i4].mo6314a(aVarArr[i4]);
        }
    }

    public C1979c(C2206z<? extends T>[] zVarArr, Iterable<? extends C2206z<? extends T>> iterable, C1711f<? super Object[], ? extends R> fVar, int i, boolean z) {
        this.f6451a = zVarArr;
        this.f6453c = fVar;
        this.f6454d = i;
        this.f6455e = false;
    }
}
