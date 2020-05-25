package com.bytedance.retrofit2.p834d.p835a;

import com.bytedance.retrofit2.C12799u;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.retrofit2.d.a.f */
final class C12739f<T> extends C2201v<C12738e<T>> {

    /* renamed from: a */
    private final C2201v<C12799u<T>> f33371a;

    /* renamed from: com.bytedance.retrofit2.d.a.f$a */
    static class C12740a<R> implements C1674ab<C12799u<R>> {

        /* renamed from: a */
        private final C1674ab<? super C12738e<R>> f33372a;

        public final void onComplete() {
            this.f33372a.onComplete();
        }

        C12740a(C1674ab<? super C12738e<R>> abVar) {
            this.f33372a = abVar;
        }

        public final void onSubscribe(C1690c cVar) {
            this.f33372a.onSubscribe(cVar);
        }

        public final /* synthetic */ void onNext(Object obj) {
            C12799u uVar = (C12799u) obj;
            C1674ab<? super C12738e<R>> abVar = this.f33372a;
            if (uVar != null) {
                abVar.onNext(new C12738e(uVar, null));
                return;
            }
            throw new NullPointerException("response == null");
        }

        public final void onError(Throwable th) {
            try {
                C1674ab<? super C12738e<R>> abVar = this.f33372a;
                if (th != null) {
                    abVar.onNext(new C12738e(null, th));
                    this.f33372a.onComplete();
                    return;
                }
                throw new NullPointerException("error == null");
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                C2150a.m6492a((Throwable) new C1695a(th, th2));
            }
        }
    }

    C12739f(C2201v<C12799u<T>> vVar) {
        this.f33371a = vVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super C12738e<T>> abVar) {
        this.f33371a.mo6314a((C1674ab<? super T>) new C12740a<Object>(abVar));
    }
}
