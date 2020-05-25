package p064c.p065a.p094l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.l.e */
public final class C2187e<T> extends C1680ad<T> implements C1683ag<T> {

    /* renamed from: b */
    static final C2188a[] f7016b = new C2188a[0];

    /* renamed from: c */
    static final C2188a[] f7017c = new C2188a[0];

    /* renamed from: a */
    final AtomicReference<C2188a<T>[]> f7018a = new AtomicReference<>(f7016b);

    /* renamed from: d */
    final AtomicBoolean f7019d = new AtomicBoolean();

    /* renamed from: e */
    T f7020e;

    /* renamed from: f */
    Throwable f7021f;

    /* renamed from: c.a.l.e$a */
    static final class C2188a<T> extends AtomicReference<C2187e<T>> implements C1690c {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: a */
        final C1683ag<? super T> f7022a;

        public final void dispose() {
            C2187e eVar = (C2187e) getAndSet(null);
            if (eVar != null) {
                eVar.mo6478a(this);
            }
        }

        public final boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        C2188a(C1683ag<? super T> agVar, C2187e<T> eVar) {
            this.f7022a = agVar;
            lazySet(eVar);
        }
    }

    /* renamed from: d */
    public static <T> C2187e<T> m6550d() {
        return new C2187e<>();
    }

    C2187e() {
    }

    public final void onSubscribe(C1690c cVar) {
        if (this.f7018a.get() == f7017c) {
            cVar.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6478a(C2188a<T> aVar) {
        C2188a<T>[] aVarArr;
        C2188a[] aVarArr2;
        do {
            aVarArr = (C2188a[]) this.f7018a.get();
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
                        aVarArr2 = f7016b;
                    } else {
                        C2188a[] aVarArr3 = new C2188a[(length - 1)];
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
        } while (!this.f7018a.compareAndSet(aVarArr, aVarArr2));
    }

    public final void onError(Throwable th) {
        C1745b.m6050a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f7019d.compareAndSet(false, true)) {
            this.f7021f = th;
            for (C2188a aVar : (C2188a[]) this.f7018a.getAndSet(f7017c)) {
                aVar.f7022a.onError(th);
            }
            return;
        }
        C2150a.m6492a(th);
    }

    public final void onSuccess(T t) {
        C1745b.m6050a(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f7019d.compareAndSet(false, true)) {
            this.f7020e = t;
            for (C2188a aVar : (C2188a[]) this.f7018a.getAndSet(f7017c)) {
                aVar.f7022a.onSuccess(t);
            }
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        boolean z;
        C2188a aVar = new C2188a(agVar, this);
        agVar.onSubscribe(aVar);
        while (true) {
            C2188a[] aVarArr = (C2188a[]) this.f7018a.get();
            z = false;
            if (aVarArr != f7017c) {
                int length = aVarArr.length;
                C2188a[] aVarArr2 = new C2188a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                if (this.f7018a.compareAndSet(aVarArr, aVarArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.f7021f;
            if (th != null) {
                agVar.onError(th);
                return;
            }
            agVar.onSuccess(this.f7020e);
        } else if (aVar.isDisposed()) {
            mo6478a(aVar);
        }
    }
}
