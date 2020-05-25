package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p088f.C2143a;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.an */
public final class C1925an<T> extends C2143a<T> {

    /* renamed from: a */
    final C2206z<T> f6281a;

    /* renamed from: b */
    final AtomicReference<C1927b<T>> f6282b;

    /* renamed from: c */
    final C2206z<T> f6283c;

    /* renamed from: c.a.e.e.d.an$a */
    static final class C1926a<T> extends AtomicReference<Object> implements C1690c {
        private static final long serialVersionUID = -1100270633763673112L;

        /* renamed from: a */
        final C1674ab<? super T> f6284a;

        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C1927b) andSet).mo6321a(this);
            }
        }

        public final boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }

        C1926a(C1674ab<? super T> abVar) {
            this.f6284a = abVar;
        }
    }

    /* renamed from: c.a.e.e.d.an$b */
    static final class C1927b<T> implements C1674ab<T>, C1690c {

        /* renamed from: b */
        static final C1926a[] f6285b = new C1926a[0];

        /* renamed from: c */
        static final C1926a[] f6286c = new C1926a[0];

        /* renamed from: a */
        final AtomicReference<C1927b<T>> f6287a;

        /* renamed from: d */
        final AtomicReference<C1926a<T>[]> f6288d = new AtomicReference<>(f6285b);

        /* renamed from: e */
        final AtomicBoolean f6289e;

        /* renamed from: f */
        final AtomicReference<C1690c> f6290f = new AtomicReference<>();

        public final boolean isDisposed() {
            if (this.f6288d.get() == f6286c) {
                return true;
            }
            return false;
        }

        public final void dispose() {
            if (((C1926a[]) this.f6288d.getAndSet(f6286c)) != f6286c) {
                this.f6287a.compareAndSet(this, null);
                C1718b.dispose(this.f6290f);
            }
        }

        public final void onComplete() {
            this.f6287a.compareAndSet(this, null);
            for (C1926a aVar : (C1926a[]) this.f6288d.getAndSet(f6286c)) {
                aVar.f6284a.onComplete();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this.f6290f, cVar);
        }

        C1927b(AtomicReference<C1927b<T>> atomicReference) {
            this.f6287a = atomicReference;
            this.f6289e = new AtomicBoolean();
        }

        public final void onNext(T t) {
            for (C1926a aVar : (C1926a[]) this.f6288d.get()) {
                aVar.f6284a.onNext(t);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6321a(C1926a<T> aVar) {
            C1926a[] aVarArr;
            C1926a[] aVarArr2;
            do {
                aVarArr = (C1926a[]) this.f6288d.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f6285b;
                        } else {
                            C1926a[] aVarArr3 = new C1926a[(length - 1)];
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
            } while (!this.f6288d.compareAndSet(aVarArr, aVarArr2));
        }

        public final void onError(Throwable th) {
            this.f6287a.compareAndSet(this, null);
            C1926a[] aVarArr = (C1926a[]) this.f6288d.getAndSet(f6286c);
            if (aVarArr.length != 0) {
                for (C1926a aVar : aVarArr) {
                    aVar.f6284a.onError(th);
                }
                return;
            }
            C2150a.m6492a(th);
        }
    }

    /* renamed from: c.a.e.e.d.an$c */
    public static final class C1928c<T> implements C2206z<T> {

        /* renamed from: a */
        private final AtomicReference<C1927b<T>> f6291a;

        public C1928c(AtomicReference<C1927b<T>> atomicReference) {
            this.f6291a = atomicReference;
        }

        /* renamed from: a */
        public final void mo6314a(C1674ab<? super T> abVar) {
            C1927b bVar;
            boolean z;
            C1926a aVar = new C1926a(abVar);
            abVar.onSubscribe(aVar);
            while (true) {
                bVar = (C1927b) this.f6291a.get();
                if (bVar == null || bVar.isDisposed()) {
                    C1927b bVar2 = new C1927b(this.f6291a);
                    if (this.f6291a.compareAndSet(bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                while (true) {
                    C1926a[] aVarArr = (C1926a[]) bVar.f6288d.get();
                    z = false;
                    if (aVarArr != C1927b.f6286c) {
                        int length = aVarArr.length;
                        C1926a[] aVarArr2 = new C1926a[(length + 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        if (bVar.f6288d.compareAndSet(aVarArr, aVarArr2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            if (!aVar.compareAndSet(null, bVar)) {
                bVar.mo6321a(aVar);
            }
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6283c.mo6314a(abVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6320g(p064c.p065a.p071d.C1710e<? super p064c.p065a.p069b.C1690c> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<c.a.e.e.d.an$b<T>> r0 = r4.f6282b
            java.lang.Object r0 = r0.get()
            c.a.e.e.d.an$b r0 = (p064c.p065a.p072e.p077e.p081d.C1925an.C1927b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0020
        L_0x0010:
            c.a.e.e.d.an$b r1 = new c.a.e.e.d.an$b
            java.util.concurrent.atomic.AtomicReference<c.a.e.e.d.an$b<T>> r2 = r4.f6282b
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<c.a.e.e.d.an$b<T>> r2 = r4.f6282b
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f6289e
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f6289e
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r5.accept(r0)     // Catch:{ Throwable -> 0x003f }
            if (r2 == 0) goto L_0x003e
            c.a.z<T> r5 = r4.f6281a
            r5.mo6314a(r0)
        L_0x003e:
            return
        L_0x003f:
            r5 = move-exception
            p064c.p065a.p070c.C1700b.m6017b(r5)
            java.lang.RuntimeException r5 = p064c.p065a.p072e.p087j.C2131h.m6422a(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C1925an.mo6320g(c.a.d.e):void");
    }

    public C1925an(C2206z<T> zVar, C2206z<T> zVar2, AtomicReference<C1927b<T>> atomicReference) {
        this.f6283c = zVar;
        this.f6281a = zVar2;
        this.f6282b = atomicReference;
    }
}
