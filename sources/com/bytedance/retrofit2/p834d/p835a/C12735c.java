package com.bytedance.retrofit2.p834d.p835a;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12799u;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.retrofit2.d.a.c */
final class C12735c<T> extends C2201v<C12799u<T>> {

    /* renamed from: a */
    private final C12690b<T> f33365a;

    /* renamed from: com.bytedance.retrofit2.d.a.c$a */
    static final class C12736a implements C1690c {

        /* renamed from: a */
        private final C12690b<?> f33366a;

        public final void dispose() {
            this.f33366a.cancel();
        }

        public final boolean isDisposed() {
            return this.f33366a.isCanceled();
        }

        C12736a(C12690b<?> bVar) {
            this.f33366a = bVar;
        }
    }

    C12735c(C12690b<T> bVar) {
        this.f33365a = bVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super C12799u<T>> abVar) {
        boolean z;
        C12690b clone = this.f33365a.clone();
        abVar.onSubscribe(new C12736a(clone));
        try {
            C12799u execute = clone.execute();
            if (!clone.isCanceled()) {
                abVar.onNext(execute);
            }
            if (!clone.isCanceled()) {
                try {
                    abVar.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            C1700b.m6017b(th);
            if (z) {
                C2150a.m6492a(th);
                return;
            }
            if (!clone.isCanceled()) {
                try {
                    abVar.onError(th);
                } catch (Throwable th3) {
                    C1700b.m6017b(th3);
                    C2150a.m6492a((Throwable) new C1695a(th, th3));
                }
            }
        }
    }
}
