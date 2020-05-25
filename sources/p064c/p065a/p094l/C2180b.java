package p064c.p065a.p094l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.l.b */
public final class C2180b<T> extends C2189f<T> {

    /* renamed from: a */
    static final C2181a[] f6993a = new C2181a[0];

    /* renamed from: b */
    static final C2181a[] f6994b = new C2181a[0];

    /* renamed from: c */
    final AtomicReference<C2181a<T>[]> f6995c = new AtomicReference<>(f6994b);

    /* renamed from: d */
    Throwable f6996d;

    /* renamed from: c.a.l.b$a */
    static final class C2181a<T> extends AtomicBoolean implements C1690c {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final C1674ab<? super T> f6997a;

        /* renamed from: b */
        final C2180b<T> f6998b;

        public final boolean isDisposed() {
            return get();
        }

        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f6998b.mo6472a(this);
            }
        }

        C2181a(C1674ab<? super T> abVar, C2180b<T> bVar) {
            this.f6997a = abVar;
            this.f6998b = bVar;
        }
    }

    /* renamed from: l */
    public static <T> C2180b<T> m6534l() {
        return new C2180b<>();
    }

    C2180b() {
    }

    public final void onComplete() {
        C2181a[] aVarArr;
        if (this.f6995c.get() != f6993a) {
            for (C2181a aVar : (C2181a[]) this.f6995c.getAndSet(f6993a)) {
                if (!aVar.get()) {
                    aVar.f6997a.onComplete();
                }
            }
        }
    }

    public final void onSubscribe(C1690c cVar) {
        if (this.f6995c.get() == f6993a) {
            cVar.dispose();
        }
    }

    public final void onError(Throwable th) {
        C2181a[] aVarArr;
        C1745b.m6050a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f6995c.get() == f6993a) {
            C2150a.m6492a(th);
            return;
        }
        this.f6996d = th;
        for (C2181a aVar : (C2181a[]) this.f6995c.getAndSet(f6993a)) {
            if (aVar.get()) {
                C2150a.m6492a(th);
            } else {
                aVar.f6997a.onError(th);
            }
        }
    }

    public final void onNext(T t) {
        C2181a[] aVarArr;
        C1745b.m6050a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C2181a aVar : (C2181a[]) this.f6995c.get()) {
            if (!aVar.get()) {
                aVar.f6997a.onNext(t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6472a(C2181a<T> aVar) {
        C2181a<T>[] aVarArr;
        C2181a[] aVarArr2;
        do {
            aVarArr = (C2181a[]) this.f6995c.get();
            if (aVarArr != f6993a && aVarArr != f6994b) {
                int length = aVarArr.length;
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
                        aVarArr2 = f6994b;
                    } else {
                        C2181a[] aVarArr3 = new C2181a[(length - 1)];
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
        } while (!this.f6995c.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        boolean z;
        C2181a aVar = new C2181a(abVar, this);
        abVar.onSubscribe(aVar);
        while (true) {
            C2181a[] aVarArr = (C2181a[]) this.f6995c.get();
            z = false;
            if (aVarArr != f6993a) {
                int length = aVarArr.length;
                C2181a[] aVarArr2 = new C2181a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                if (this.f6995c.compareAndSet(aVarArr, aVarArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.f6996d;
            if (th != null) {
                abVar.onError(th);
                return;
            }
            abVar.onComplete();
        } else if (aVar.isDisposed()) {
            mo6472a(aVar);
        }
    }
}
