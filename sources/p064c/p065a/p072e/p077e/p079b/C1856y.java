package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53694b;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p086i.C2119c;
import p064c.p065a.p091i.C2152a;
import p064c.p065a.p091i.C2156d;
import p064c.p065a.p095m.C2192b;

/* renamed from: c.a.e.e.b.y */
public final class C1856y<T> extends C1785a<T, T> {

    /* renamed from: c */
    final C1711f<? super C2149h<Throwable>, ? extends C53694b<?>> f6124c;

    /* renamed from: c.a.e.e.b.y$a */
    static final class C1857a<T> extends C1853c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public final void onComplete() {
            this.f6114c.cancel();
            this.f6112a.onComplete();
        }

        public final void onError(Throwable th) {
            mo6296a(th);
        }

        C1857a(C53695c<? super T> cVar, C2152a<Throwable> aVar, C53696d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        C2192b bVar = new C2192b(cVar);
        C2152a f = C2156d.m6507a(8).mo6458f();
        try {
            C53694b bVar2 = (C53694b) C1745b.m6050a(this.f6124c.apply(f), "handler returned a null Publisher");
            C1852b bVar3 = new C1852b(this.f5924a);
            C1857a aVar = new C1857a(bVar, f, bVar3);
            bVar3.f6111d = aVar;
            cVar.onSubscribe(aVar);
            bVar2.mo336a(bVar3);
            bVar3.onNext(Integer.valueOf(0));
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C2119c.error(th, cVar);
        }
    }

    public C1856y(C2149h<T> hVar, C1711f<? super C2149h<Throwable>, ? extends C53694b<?>> fVar) {
        super(hVar);
        this.f6124c = fVar;
    }
}
