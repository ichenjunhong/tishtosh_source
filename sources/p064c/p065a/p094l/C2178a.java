package p064c.p065a.p094l;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p087j.C2123a;
import p064c.p065a.p072e.p087j.C2123a.C2124a;
import p064c.p065a.p072e.p087j.C2131h;
import p064c.p065a.p072e.p087j.C2134j;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.l.a */
public final class C2178a<T> extends C2189f<T> {

    /* renamed from: c */
    static final C2179a[] f6975c = new C2179a[0];

    /* renamed from: d */
    static final C2179a[] f6976d = new C2179a[0];

    /* renamed from: j */
    private static final Object[] f6977j = new Object[0];

    /* renamed from: a */
    final AtomicReference<Object> f6978a;

    /* renamed from: b */
    final AtomicReference<C2179a<T>[]> f6979b;

    /* renamed from: e */
    final ReadWriteLock f6980e;

    /* renamed from: f */
    final Lock f6981f;

    /* renamed from: g */
    final Lock f6982g;

    /* renamed from: h */
    final AtomicReference<Throwable> f6983h;

    /* renamed from: i */
    long f6984i;

    /* renamed from: c.a.l.a$a */
    static final class C2179a<T> implements C1690c, C2124a<Object> {

        /* renamed from: a */
        final C1674ab<? super T> f6985a;

        /* renamed from: b */
        final C2178a<T> f6986b;

        /* renamed from: c */
        boolean f6987c;

        /* renamed from: d */
        boolean f6988d;

        /* renamed from: e */
        C2123a<Object> f6989e;

        /* renamed from: f */
        boolean f6990f;

        /* renamed from: g */
        volatile boolean f6991g;

        /* renamed from: h */
        long f6992h;

        public final boolean isDisposed() {
            return this.f6991g;
        }

        public final void dispose() {
            if (!this.f6991g) {
                this.f6991g = true;
                this.f6986b.mo6468a(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo6420a((p064c.p065a.p072e.p087j.C2123a.C2124a<? super T>) r2);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo6470a() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f6991g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                c.a.e.j.a<java.lang.Object> r0 = r2.f6989e     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f6988d = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f6989e = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo6420a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p094l.C2178a.C2179a.mo6470a():void");
        }

        /* renamed from: a */
        public final boolean mo6207a(Object obj) {
            if (this.f6991g || C2134j.accept(obj, this.f6985a)) {
                return true;
            }
            return false;
        }

        C2179a(C1674ab<? super T> abVar, C2178a<T> aVar) {
            this.f6985a = abVar;
            this.f6986b = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f6990f = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo6471a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f6991g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f6990f
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f6991g     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f6992h     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f6988d     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                c.a.e.j.a<java.lang.Object> r5 = r3.f6989e     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                c.a.e.j.a r5 = new c.a.e.j.a     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f6989e = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo6421a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f6987c = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f6990f = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.mo6207a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p094l.C2178a.C2179a.mo6471a(java.lang.Object, long):void");
        }
    }

    /* renamed from: l */
    public static <T> C2178a<T> m6527l() {
        return new C2178a<>();
    }

    /* renamed from: m */
    public final T mo6469m() {
        Object obj = this.f6978a.get();
        if (C2134j.isComplete(obj) || C2134j.isError(obj)) {
            return null;
        }
        return C2134j.getValue(obj);
    }

    C2178a() {
        this.f6980e = new ReentrantReadWriteLock();
        this.f6981f = this.f6980e.readLock();
        this.f6982g = this.f6980e.writeLock();
        this.f6979b = new AtomicReference<>(f6975c);
        this.f6978a = new AtomicReference<>();
        this.f6983h = new AtomicReference<>();
    }

    public final void onComplete() {
        if (this.f6983h.compareAndSet(null, C2131h.f6891a)) {
            Object complete = C2134j.complete();
            for (C2179a a : m6525c(complete)) {
                a.mo6471a(complete, this.f6984i);
            }
        }
    }

    /* renamed from: a */
    public static <T> C2178a<T> m6524a(T t) {
        return new C2178a<>(t);
    }

    private C2178a(T t) {
        this();
        this.f6978a.lazySet(C1745b.m6050a(t, "defaultValue is null"));
    }

    public final void onSubscribe(C1690c cVar) {
        if (this.f6983h.get() != null) {
            cVar.dispose();
        }
    }

    /* renamed from: c */
    private C2179a<T>[] m6525c(Object obj) {
        C2179a<T>[] aVarArr = (C2179a[]) this.f6979b.getAndSet(f6976d);
        if (aVarArr != f6976d) {
            m6526d(obj);
        }
        return aVarArr;
    }

    /* renamed from: d */
    private void m6526d(Object obj) {
        this.f6982g.lock();
        this.f6984i++;
        this.f6978a.lazySet(obj);
        this.f6982g.unlock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6468a(C2179a<T> aVar) {
        C2179a<T>[] aVarArr;
        C2179a[] aVarArr2;
        do {
            aVarArr = (C2179a[]) this.f6979b.get();
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
                        aVarArr2 = f6975c;
                    } else {
                        C2179a[] aVarArr3 = new C2179a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f6979b.compareAndSet(aVarArr, aVarArr2));
    }

    public final void onError(Throwable th) {
        C1745b.m6050a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f6983h.compareAndSet(null, th)) {
            C2150a.m6492a(th);
            return;
        }
        Object error = C2134j.error(th);
        for (C2179a a : m6525c(error)) {
            a.mo6471a(error, this.f6984i);
        }
    }

    public final void onNext(T t) {
        C1745b.m6050a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f6983h.get() == null) {
            Object next = C2134j.next(t);
            m6526d(next);
            for (C2179a a : (C2179a[]) this.f6979b.get()) {
                a.mo6471a(next, this.f6984i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r8 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r0.mo6207a(r8) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        r0.mo6470a();
     */
    /* renamed from: a_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6311a_(p064c.p065a.C1674ab<? super T> r8) {
        /*
            r7 = this;
            c.a.l.a$a r0 = new c.a.l.a$a
            r0.<init>(r8, r7)
            r8.onSubscribe(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<c.a.l.a$a<T>[]> r1 = r7.f6979b
            java.lang.Object r1 = r1.get()
            c.a.l.a$a[] r1 = (p064c.p065a.p094l.C2178a.C2179a[]) r1
            c.a.l.a$a[] r2 = f6976d
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0018
            r1 = 0
            goto L_0x002b
        L_0x0018:
            int r2 = r1.length
            int r5 = r2 + 1
            c.a.l.a$a[] r5 = new p064c.p065a.p094l.C2178a.C2179a[r5]
            java.lang.System.arraycopy(r1, r4, r5, r4, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<c.a.l.a$a<T>[]> r2 = r7.f6979b
            boolean r1 = r2.compareAndSet(r1, r5)
            if (r1 == 0) goto L_0x0008
            r1 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0072
            boolean r8 = r0.f6991g
            if (r8 == 0) goto L_0x0035
            r7.mo6468a(r0)
            return
        L_0x0035:
            boolean r8 = r0.f6991g
            if (r8 != 0) goto L_0x0071
            monitor-enter(r0)
            boolean r8 = r0.f6991g     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0040
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0085
        L_0x0040:
            boolean r8 = r0.f6987c     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0046
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0085
        L_0x0046:
            c.a.l.a<T> r8 = r0.f6986b     // Catch:{ all -> 0x006e }
            java.util.concurrent.locks.Lock r1 = r8.f6981f     // Catch:{ all -> 0x006e }
            r1.lock()     // Catch:{ all -> 0x006e }
            long r5 = r8.f6984i     // Catch:{ all -> 0x006e }
            r0.f6992h = r5     // Catch:{ all -> 0x006e }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.f6978a     // Catch:{ all -> 0x006e }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x006e }
            r1.unlock()     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x005d
            r4 = 1
        L_0x005d:
            r0.f6988d = r4     // Catch:{ all -> 0x006e }
            r0.f6987c = r3     // Catch:{ all -> 0x006e }
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0071
            boolean r8 = r0.mo6207a(r8)
            if (r8 != 0) goto L_0x0071
            r0.mo6470a()
            goto L_0x0071
        L_0x006e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r8
        L_0x0071:
            return
        L_0x0072:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.f6983h
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = p064c.p065a.p072e.p087j.C2131h.f6891a
            if (r0 != r1) goto L_0x0082
            r8.onComplete()
            return
        L_0x0082:
            r8.onError(r0)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p094l.C2178a.mo6311a_(c.a.ab):void");
    }
}
