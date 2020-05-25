package p2666g.p2667a.p2668a;

import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p090h.C2150a;
import p2666g.C53133m;

/* renamed from: g.a.a.f */
final class C53057f<T> extends C2201v<C53056e<T>> {

    /* renamed from: a */
    private final C2201v<C53133m<T>> f131541a;

    /* renamed from: g.a.a.f$a */
    static class C53058a<R> implements C1674ab<C53133m<R>> {

        /* renamed from: a */
        private final C1674ab<? super C53056e<R>> f131542a;

        public final void onComplete() {
            this.f131542a.onComplete();
        }

        C53058a(C1674ab<? super C53056e<R>> abVar) {
            this.f131542a = abVar;
        }

        public final void onSubscribe(C1690c cVar) {
            this.f131542a.onSubscribe(cVar);
        }

        public final /* synthetic */ void onNext(Object obj) {
            C53133m mVar = (C53133m) obj;
            C1674ab<? super C53056e<R>> abVar = this.f131542a;
            if (mVar != null) {
                abVar.onNext(new C53056e(mVar, null));
                return;
            }
            throw new NullPointerException("response == null");
        }

        public final void onError(Throwable th) {
            try {
                C1674ab<? super C53056e<R>> abVar = this.f131542a;
                if (th != null) {
                    abVar.onNext(new C53056e(null, th));
                    this.f131542a.onComplete();
                    return;
                }
                throw new NullPointerException("error == null");
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                C2150a.m6492a((Throwable) new C1695a(th, th2));
            }
        }
    }

    C53057f(C2201v<C53133m<T>> vVar) {
        this.f131541a = vVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super C53056e<T>> abVar) {
        this.f131541a.mo6314a((C1674ab<? super T>) new C53058a<Object>(abVar));
    }
}
