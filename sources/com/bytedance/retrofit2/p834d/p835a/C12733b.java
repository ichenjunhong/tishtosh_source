package com.bytedance.retrofit2.p834d.p835a;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.retrofit2.d.a.b */
final class C12733b<T> extends C2201v<C12799u<T>> {

    /* renamed from: a */
    private final C12690b<T> f33361a;

    /* renamed from: com.bytedance.retrofit2.d.a.b$a */
    static final class C12734a<T> implements C1690c, C12743e<T> {

        /* renamed from: a */
        boolean f33362a;

        /* renamed from: b */
        private final C12690b<?> f33363b;

        /* renamed from: c */
        private final C1674ab<? super C12799u<T>> f33364c;

        public final void dispose() {
            this.f33363b.cancel();
        }

        public final boolean isDisposed() {
            return this.f33363b.isCanceled();
        }

        C12734a(C12690b<?> bVar, C1674ab<? super C12799u<T>> abVar) {
            this.f33363b = bVar;
            this.f33364c = abVar;
        }

        /* renamed from: a */
        public final void mo19943a(C12690b<T> bVar, Throwable th) {
            if (!bVar.isCanceled()) {
                try {
                    this.f33364c.onError(th);
                } catch (Throwable th2) {
                    C1700b.m6017b(th2);
                    C2150a.m6492a((Throwable) new C1695a(th, th2));
                }
            }
        }

        /* renamed from: a */
        public final void mo19942a(C12690b<T> bVar, C12799u<T> uVar) {
            if (!bVar.isCanceled()) {
                try {
                    this.f33364c.onNext(uVar);
                    if (!bVar.isCanceled()) {
                        this.f33362a = true;
                        this.f33364c.onComplete();
                    }
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    C2150a.m6492a((Throwable) new C1695a(th, th));
                }
            }
        }
    }

    C12733b(C12690b<T> bVar) {
        this.f33361a = bVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super C12799u<T>> abVar) {
        C12690b clone = this.f33361a.clone();
        C12734a aVar = new C12734a(clone, abVar);
        abVar.onSubscribe(aVar);
        clone.enqueue(aVar);
    }
}
