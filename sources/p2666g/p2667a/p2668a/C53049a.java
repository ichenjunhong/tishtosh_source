package p2666g.p2667a.p2668a;

import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p090h.C2150a;
import p2666g.C53133m;

/* renamed from: g.a.a.a */
final class C53049a<T> extends C2201v<T> {

    /* renamed from: a */
    private final C2201v<C53133m<T>> f131530a;

    /* renamed from: g.a.a.a$a */
    static class C53050a<R> implements C1674ab<C53133m<R>> {

        /* renamed from: a */
        private final C1674ab<? super R> f131531a;

        /* renamed from: b */
        private boolean f131532b;

        public final void onComplete() {
            if (!this.f131532b) {
                this.f131531a.onComplete();
            }
        }

        C53050a(C1674ab<? super R> abVar) {
            this.f131531a = abVar;
        }

        public final void onSubscribe(C1690c cVar) {
            this.f131531a.onSubscribe(cVar);
        }

        public final void onError(Throwable th) {
            if (!this.f131532b) {
                this.f131531a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C2150a.m6492a((Throwable) assertionError);
        }

        public final /* synthetic */ void onNext(Object obj) {
            C53133m mVar = (C53133m) obj;
            if (mVar.mo110646c()) {
                this.f131531a.onNext(mVar.f131636b);
                return;
            }
            this.f131532b = true;
            C53055d dVar = new C53055d(mVar);
            try {
                this.f131531a.onError(dVar);
            } catch (Throwable th) {
                C1700b.m6017b(th);
                C2150a.m6492a((Throwable) new C1695a(dVar, th));
            }
        }
    }

    C53049a(C2201v<C53133m<T>> vVar) {
        this.f131530a = vVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f131530a.mo6314a((C1674ab<? super T>) new C53050a<Object>(abVar));
    }
}
