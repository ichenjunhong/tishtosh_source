package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p083f.C2072c;

/* renamed from: c.a.e.e.d.bf */
public final class C1976bf<T, R> extends C2201v<R> {

    /* renamed from: a */
    final C2206z<? extends T>[] f6435a;

    /* renamed from: b */
    final Iterable<? extends C2206z<? extends T>> f6436b;

    /* renamed from: c */
    final C1711f<? super Object[], ? extends R> f6437c;

    /* renamed from: d */
    final int f6438d;

    /* renamed from: e */
    final boolean f6439e;

    /* renamed from: c.a.e.e.d.bf$a */
    static final class C1977a<T, R> extends AtomicInteger implements C1690c {
        private static final long serialVersionUID = 2983708048395377667L;

        /* renamed from: a */
        final C1674ab<? super R> f6440a;

        /* renamed from: b */
        final C1711f<? super Object[], ? extends R> f6441b;

        /* renamed from: c */
        final C1978b<T, R>[] f6442c;

        /* renamed from: d */
        final T[] f6443d;

        /* renamed from: e */
        final boolean f6444e;

        /* renamed from: f */
        volatile boolean f6445f;

        public final boolean isDisposed() {
            return this.f6445f;
        }

        /* renamed from: b */
        private void m6259b() {
            m6261d();
            m6260c();
        }

        /* renamed from: c */
        private void m6260c() {
            for (C1978b<T, R> a : this.f6442c) {
                a.mo6342a();
            }
        }

        /* renamed from: d */
        private void m6261d() {
            for (C1978b<T, R> bVar : this.f6442c) {
                bVar.f6447b.clear();
            }
        }

        public final void dispose() {
            if (!this.f6445f) {
                this.f6445f = true;
                m6260c();
                if (getAndIncrement() == 0) {
                    m6261d();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0061 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo6341a() {
            /*
                r16 = this;
                r1 = r16
                int r0 = r16.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                c.a.e.e.d.bf$b<T, R>[] r0 = r1.f6442c
                c.a.ab<? super R> r2 = r1.f6440a
                T[] r3 = r1.f6443d
                boolean r4 = r1.f6444e
                r6 = 1
            L_0x0012:
                int r7 = r0.length
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
            L_0x0017:
                if (r9 >= r7) goto L_0x0080
                r12 = r0[r9]
                r13 = r3[r10]
                if (r13 != 0) goto L_0x006a
                boolean r13 = r12.f6448c
                c.a.e.f.c<T> r14 = r12.f6447b
                java.lang.Object r14 = r14.poll()
                if (r14 != 0) goto L_0x002b
                r15 = 1
                goto L_0x002c
            L_0x002b:
                r15 = 0
            L_0x002c:
                boolean r5 = r1.f6445f
                if (r5 == 0) goto L_0x0035
                r16.m6259b()
            L_0x0033:
                r5 = 1
                goto L_0x005f
            L_0x0035:
                if (r13 == 0) goto L_0x005e
                if (r4 == 0) goto L_0x004a
                if (r15 == 0) goto L_0x005e
                java.lang.Throwable r5 = r12.f6449d
                r16.m6259b()
                if (r5 == 0) goto L_0x0046
                r2.onError(r5)
                goto L_0x0033
            L_0x0046:
                r2.onComplete()
                goto L_0x0033
            L_0x004a:
                java.lang.Throwable r5 = r12.f6449d
                if (r5 == 0) goto L_0x0055
                r16.m6259b()
                r2.onError(r5)
                goto L_0x0033
            L_0x0055:
                if (r15 == 0) goto L_0x005e
                r16.m6259b()
                r2.onComplete()
                goto L_0x0033
            L_0x005e:
                r5 = 0
            L_0x005f:
                if (r5 == 0) goto L_0x0062
                return
            L_0x0062:
                if (r15 != 0) goto L_0x0067
                r3[r10] = r14
                goto L_0x007b
            L_0x0067:
                int r11 = r11 + 1
                goto L_0x007b
            L_0x006a:
                boolean r5 = r12.f6448c
                if (r5 == 0) goto L_0x007b
                if (r4 != 0) goto L_0x007b
                java.lang.Throwable r5 = r12.f6449d
                if (r5 == 0) goto L_0x007b
                r16.m6259b()
                r2.onError(r5)
                return
            L_0x007b:
                int r10 = r10 + 1
                int r9 = r9 + 1
                goto L_0x0017
            L_0x0080:
                if (r11 != 0) goto L_0x00a6
                c.a.d.f<? super java.lang.Object[], ? extends R> r5 = r1.f6441b     // Catch:{ Throwable -> 0x009b }
                java.lang.Object r7 = r3.clone()     // Catch:{ Throwable -> 0x009b }
                java.lang.Object r5 = r5.apply(r7)     // Catch:{ Throwable -> 0x009b }
                java.lang.String r7 = "The zipper returned a null value"
                java.lang.Object r5 = p064c.p065a.p072e.p074b.C1745b.m6050a(r5, r7)     // Catch:{ Throwable -> 0x009b }
                r2.onNext(r5)
                r5 = 0
                java.util.Arrays.fill(r3, r5)
                goto L_0x0012
            L_0x009b:
                r0 = move-exception
                p064c.p065a.p070c.C1700b.m6017b(r0)
                r16.m6259b()
                r2.onError(r0)
                return
            L_0x00a6:
                int r5 = -r6
                int r6 = r1.addAndGet(r5)
                if (r6 != 0) goto L_0x0012
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C1976bf.C1977a.mo6341a():void");
        }

        C1977a(C1674ab<? super R> abVar, C1711f<? super Object[], ? extends R> fVar, int i, boolean z) {
            this.f6440a = abVar;
            this.f6441b = fVar;
            this.f6442c = new C1978b[i];
            this.f6443d = (Object[]) new Object[i];
            this.f6444e = z;
        }
    }

    /* renamed from: c.a.e.e.d.bf$b */
    static final class C1978b<T, R> implements C1674ab<T> {

        /* renamed from: a */
        final C1977a<T, R> f6446a;

        /* renamed from: b */
        final C2072c<T> f6447b;

        /* renamed from: c */
        volatile boolean f6448c;

        /* renamed from: d */
        Throwable f6449d;

        /* renamed from: e */
        final AtomicReference<C1690c> f6450e = new AtomicReference<>();

        /* renamed from: a */
        public final void mo6342a() {
            C1718b.dispose(this.f6450e);
        }

        public final void onComplete() {
            this.f6448c = true;
            this.f6446a.mo6341a();
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this.f6450e, cVar);
        }

        public final void onError(Throwable th) {
            this.f6449d = th;
            this.f6448c = true;
            this.f6446a.mo6341a();
        }

        public final void onNext(T t) {
            this.f6447b.offer(t);
            this.f6446a.mo6341a();
        }

        C1978b(C1977a<T, R> aVar, int i) {
            this.f6446a = aVar;
            this.f6447b = new C2072c<>(i);
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super R> abVar) {
        C2206z<? extends T>[] zVarArr;
        int i;
        C2206z<? extends T>[] zVarArr2 = this.f6435a;
        if (zVarArr2 == null) {
            C2201v[] vVarArr = new C2201v[8];
            zVarArr = vVarArr;
            i = 0;
            for (C2206z<? extends T> zVar : this.f6436b) {
                if (i == zVarArr.length) {
                    C2206z<? extends T>[] zVarArr3 = new C2206z[((i >> 2) + i)];
                    System.arraycopy(zVarArr, 0, zVarArr3, 0, i);
                    zVarArr = zVarArr3;
                }
                int i2 = i + 1;
                zVarArr[i] = zVar;
                i = i2;
            }
        } else {
            zVarArr = zVarArr2;
            i = zVarArr2.length;
        }
        if (i == 0) {
            C1719c.complete(abVar);
            return;
        }
        C1977a aVar = new C1977a(abVar, this.f6437c, i, this.f6439e);
        int i3 = this.f6438d;
        C1978b<T, R>[] bVarArr = aVar.f6442c;
        int length = bVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            bVarArr[i4] = new C1978b<>(aVar, i3);
        }
        aVar.lazySet(0);
        aVar.f6440a.onSubscribe(aVar);
        for (int i5 = 0; i5 < length && !aVar.f6445f; i5++) {
            zVarArr[i5].mo6314a(bVarArr[i5]);
        }
    }

    public C1976bf(C2206z<? extends T>[] zVarArr, Iterable<? extends C2206z<? extends T>> iterable, C1711f<? super Object[], ? extends R> fVar, int i, boolean z) {
        this.f6435a = zVarArr;
        this.f6436b = iterable;
        this.f6437c = fVar;
        this.f6438d = i;
        this.f6439e = z;
    }
}
