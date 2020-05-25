package p2666g.p2667a.p2668a;

import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p090h.C2150a;
import p2666g.C53061b;
import p2666g.C53133m;

/* renamed from: g.a.a.c */
final class C53053c<T> extends C2201v<C53133m<T>> {

    /* renamed from: a */
    private final C53061b<T> f131537a;

    /* renamed from: g.a.a.c$a */
    static final class C53054a implements C1690c {

        /* renamed from: a */
        private final C53061b<?> f131538a;

        public final void dispose() {
            this.f131538a.mo110596b();
        }

        public final boolean isDisposed() {
            return this.f131538a.mo110597c();
        }

        C53054a(C53061b<?> bVar) {
            this.f131538a = bVar;
        }
    }

    C53053c(C53061b<T> bVar) {
        this.f131537a = bVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super C53133m<T>> abVar) {
        boolean z;
        C53061b d = this.f131537a.mo110598d();
        abVar.onSubscribe(new C53054a(d));
        try {
            C53133m a = d.mo110594a();
            if (!d.mo110597c()) {
                abVar.onNext(a);
            }
            if (!d.mo110597c()) {
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
            if (!d.mo110597c()) {
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
