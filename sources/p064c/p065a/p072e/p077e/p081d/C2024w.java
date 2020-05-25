package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p076d.C1758c;

/* renamed from: c.a.e.e.d.w */
public final class C2024w<T> extends C2201v<T> {

    /* renamed from: a */
    final T[] f6635a;

    /* renamed from: c.a.e.e.d.w$a */
    static final class C2025a<T> extends C1758c<T> {

        /* renamed from: a */
        final C1674ab<? super T> f6636a;

        /* renamed from: b */
        final T[] f6637b;

        /* renamed from: c */
        int f6638c;

        /* renamed from: d */
        boolean f6639d;

        /* renamed from: e */
        volatile boolean f6640e;

        public final void dispose() {
            this.f6640e = true;
        }

        public final boolean isDisposed() {
            return this.f6640e;
        }

        public final void clear() {
            this.f6638c = this.f6637b.length;
        }

        public final boolean isEmpty() {
            if (this.f6638c == this.f6637b.length) {
                return true;
            }
            return false;
        }

        public final T poll() {
            int i = this.f6638c;
            T[] tArr = this.f6637b;
            if (i == tArr.length) {
                return null;
            }
            this.f6638c = i + 1;
            return C1745b.m6050a(tArr[i], "The array element is null");
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f6639d = true;
            return 1;
        }

        C2025a(C1674ab<? super T> abVar, T[] tArr) {
            this.f6636a = abVar;
            this.f6637b = tArr;
        }
    }

    public C2024w(T[] tArr) {
        this.f6635a = tArr;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C2025a aVar = new C2025a(abVar, this.f6635a);
        abVar.onSubscribe(aVar);
        if (!aVar.f6639d) {
            T[] tArr = aVar.f6637b;
            int length = tArr.length;
            for (int i = 0; i < length && !aVar.isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    C1674ab<? super T> abVar2 = aVar.f6636a;
                    StringBuilder sb = new StringBuilder("The ");
                    sb.append(i);
                    sb.append("th element is null");
                    abVar2.onError(new NullPointerException(sb.toString()));
                    return;
                }
                aVar.f6636a.onNext(t);
            }
            if (!aVar.isDisposed()) {
                aVar.f6636a.onComplete();
            }
        }
    }
}
