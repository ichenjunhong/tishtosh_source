package com.bytedance.retrofit2.p834d.p835a;

import com.bytedance.retrofit2.C12799u;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.retrofit2.d.a.a */
final class C12731a<T> extends C2201v<T> {

    /* renamed from: a */
    private final C2201v<C12799u<T>> f33358a;

    /* renamed from: com.bytedance.retrofit2.d.a.a$a */
    static class C12732a<R> implements C1674ab<C12799u<R>> {

        /* renamed from: a */
        private final C1674ab<? super R> f33359a;

        /* renamed from: b */
        private boolean f33360b;

        public final void onComplete() {
            if (!this.f33360b) {
                this.f33359a.onComplete();
            }
        }

        C12732a(C1674ab<? super R> abVar) {
            this.f33359a = abVar;
        }

        public final void onSubscribe(C1690c cVar) {
            this.f33359a.onSubscribe(cVar);
        }

        public final void onError(Throwable th) {
            if (!this.f33360b) {
                this.f33359a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C2150a.m6492a((Throwable) assertionError);
        }

        public final /* synthetic */ void onNext(Object obj) {
            C12799u uVar = (C12799u) obj;
            if (uVar.mo23960c()) {
                this.f33359a.onNext(uVar.f33552b);
                return;
            }
            this.f33360b = true;
            C12737d dVar = new C12737d(uVar);
            try {
                this.f33359a.onError(dVar);
            } catch (Throwable th) {
                C1700b.m6017b(th);
                C2150a.m6492a((Throwable) new C1695a(dVar, th));
            }
        }
    }

    C12731a(C2201v<C12799u<T>> vVar) {
        this.f33358a = vVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f33358a.mo6314a((C1674ab<? super T>) new C12732a<Object>(abVar));
    }
}
