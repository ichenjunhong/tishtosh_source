package p064c.p065a.p072e.p077e.p082e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.e.s */
public final class C2065s<T, R> extends C1680ad<R> {

    /* renamed from: a */
    final C1685ai<? extends T>[] f6716a;

    /* renamed from: b */
    final C1711f<? super Object[], ? extends R> f6717b;

    /* renamed from: c.a.e.e.e.s$a */
    final class C2066a implements C1711f<T, R> {
        C2066a() {
        }

        public final R apply(T t) throws Exception {
            return C1745b.m6050a(C2065s.this.f6717b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    /* renamed from: c.a.e.e.e.s$b */
    static final class C2067b<T, R> extends AtomicInteger implements C1690c {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: a */
        final C1683ag<? super R> f6719a;

        /* renamed from: b */
        final C1711f<? super Object[], ? extends R> f6720b;

        /* renamed from: c */
        final C2068c<T>[] f6721c;

        /* renamed from: d */
        final Object[] f6722d;

        public final boolean isDisposed() {
            if (get() <= 0) {
                return true;
            }
            return false;
        }

        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (C2068c<T> a : this.f6721c) {
                    a.mo6364a();
                }
            }
        }

        /* renamed from: a */
        private void m6335a(int i) {
            C2068c<T>[] cVarArr = this.f6721c;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].mo6364a();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].mo6364a();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6363a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                m6335a(i);
                this.f6719a.onError(th);
                return;
            }
            C2150a.m6492a(th);
        }

        C2067b(C1683ag<? super R> agVar, int i, C1711f<? super Object[], ? extends R> fVar) {
            super(i);
            this.f6719a = agVar;
            this.f6720b = fVar;
            C2068c<T>[] cVarArr = new C2068c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C2068c<>(this, i2);
            }
            this.f6721c = cVarArr;
            this.f6722d = new Object[i];
        }
    }

    /* renamed from: c.a.e.e.e.s$c */
    static final class C2068c<T> extends AtomicReference<C1690c> implements C1683ag<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: a */
        final C2067b<T, ?> f6723a;

        /* renamed from: b */
        final int f6724b;

        /* renamed from: a */
        public final void mo6364a() {
            C1718b.dispose(this);
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            this.f6723a.mo6363a(th, this.f6724b);
        }

        public final void onSuccess(T t) {
            C2067b<T, ?> bVar = this.f6723a;
            bVar.f6722d[this.f6724b] = t;
            if (bVar.decrementAndGet() == 0) {
                try {
                    bVar.f6719a.onSuccess(C1745b.m6050a(bVar.f6720b.apply(bVar.f6722d), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    bVar.f6719a.onError(th);
                }
            }
        }

        C2068c(C2067b<T, ?> bVar, int i) {
            this.f6723a = bVar;
            this.f6724b = i;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super R> agVar) {
        C1685ai<? extends T>[] aiVarArr = this.f6716a;
        int length = aiVarArr.length;
        int i = 0;
        if (length == 1) {
            aiVarArr[0].mo6159b(new C2050a(agVar, new C2066a()));
            return;
        }
        C2067b bVar = new C2067b(agVar, length, this.f6717b);
        agVar.onSubscribe(bVar);
        while (i < length && !bVar.isDisposed()) {
            C1685ai<? extends T> aiVar = aiVarArr[i];
            if (aiVar == null) {
                bVar.mo6363a(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                aiVar.mo6159b(bVar.f6721c[i]);
                i++;
            }
        }
    }

    public C2065s(C1685ai<? extends T>[] aiVarArr, C1711f<? super Object[], ? extends R> fVar) {
        this.f6716a = aiVarArr;
        this.f6717b = fVar;
    }
}
