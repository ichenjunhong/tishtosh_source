package p2666g.p2667a.p2668a;

import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p090h.C2150a;
import p2666g.C53061b;
import p2666g.C53094d;
import p2666g.C53133m;

/* renamed from: g.a.a.b */
final class C53051b<T> extends C2201v<C53133m<T>> {

    /* renamed from: a */
    private final C53061b<T> f131533a;

    /* renamed from: g.a.a.b$a */
    static final class C53052a<T> implements C1690c, C53094d<T> {

        /* renamed from: a */
        boolean f131534a;

        /* renamed from: b */
        private final C53061b<?> f131535b;

        /* renamed from: c */
        private final C1674ab<? super C53133m<T>> f131536c;

        public final void dispose() {
            this.f131535b.mo110596b();
        }

        public final boolean isDisposed() {
            return this.f131535b.mo110597c();
        }

        C53052a(C53061b<?> bVar, C1674ab<? super C53133m<T>> abVar) {
            this.f131535b = bVar;
            this.f131536c = abVar;
        }

        /* renamed from: a */
        public final void mo36429a(C53061b<T> bVar, Throwable th) {
            if (!bVar.mo110597c()) {
                try {
                    this.f131536c.onError(th);
                } catch (Throwable th2) {
                    C1700b.m6017b(th2);
                    C2150a.m6492a((Throwable) new C1695a(th, th2));
                }
            }
        }

        /* renamed from: a */
        public final void mo36428a(C53061b<T> bVar, C53133m<T> mVar) {
            if (!bVar.mo110597c()) {
                try {
                    this.f131536c.onNext(mVar);
                    if (!bVar.mo110597c()) {
                        this.f131534a = true;
                        this.f131536c.onComplete();
                    }
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    C2150a.m6492a((Throwable) new C1695a(th, th));
                }
            }
        }
    }

    C53051b(C53061b<T> bVar) {
        this.f131533a = bVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super C53133m<T>> abVar) {
        C53061b d = this.f131533a.mo110598d();
        C53052a aVar = new C53052a(d, abVar);
        abVar.onSubscribe(aVar);
        d.mo110595a(aVar);
    }
}
