package com.p902d.p903a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.d.a.b */
public final class C13452b<T> extends C13454c<T> {

    /* renamed from: a */
    static final C13453a[] f35038a = new C13453a[0];

    /* renamed from: b */
    final AtomicReference<C13453a<T>[]> f35039b = new AtomicReference<>(f35038a);

    /* renamed from: com.d.a.b$a */
    static final class C13453a<T> extends AtomicBoolean implements C1690c {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final C1674ab<? super T> f35040a;

        /* renamed from: b */
        final C13452b<T> f35041b;

        public final boolean isDisposed() {
            return get();
        }

        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f35041b.mo25153a(this);
            }
        }

        C13453a(C1674ab<? super T> abVar, C13452b<T> bVar) {
            this.f35040a = abVar;
            this.f35041b = bVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25153a(C13453a<T> aVar) {
        C13453a<T>[] aVarArr;
        C13453a[] aVarArr2;
        do {
            aVarArr = (C13453a[]) this.f35039b.get();
            if (aVarArr != f35038a) {
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
                        aVarArr2 = f35038a;
                    } else {
                        C13453a[] aVarArr3 = new C13453a[(length - 1)];
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
        } while (!this.f35039b.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C13453a[] aVarArr;
        C13453a[] aVarArr2;
        C13453a aVar = new C13453a(abVar, this);
        abVar.onSubscribe(aVar);
        do {
            aVarArr = (C13453a[]) this.f35039b.get();
            int length = aVarArr.length;
            aVarArr2 = new C13453a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35039b.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            mo25153a(aVar);
        }
    }

    public final void accept(T t) {
        C13453a[] aVarArr;
        if (t != null) {
            for (C13453a aVar : (C13453a[]) this.f35039b.get()) {
                if (!aVar.get()) {
                    aVar.f35040a.onNext(t);
                }
            }
            return;
        }
        throw new NullPointerException("value == null");
    }
}
