package p064c.p065a.p072e.p077e.p082e;

import org.p2692b.C53695c;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.C2149h;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p086i.C2118b;

/* renamed from: c.a.e.e.e.q */
public final class C2061q<T> extends C2149h<T> {

    /* renamed from: a */
    final C1685ai<? extends T> f6712a;

    /* renamed from: c.a.e.e.e.q$a */
    static final class C2062a<T> extends C2118b<T> implements C1683ag<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: a */
        C1690c f6713a;

        public final void cancel() {
            super.cancel();
            this.f6713a.dispose();
        }

        C2062a(C53695c<? super T> cVar) {
            super(cVar);
        }

        public final void onSuccess(T t) {
            complete(t);
        }

        public final void onError(Throwable th) {
            this.f6871e.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6713a, cVar)) {
                this.f6713a = cVar;
                this.f6871e.onSubscribe(this);
            }
        }
    }

    public C2061q(C1685ai<? extends T> aiVar) {
        this.f6712a = aiVar;
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f6712a.mo6159b(new C2062a(cVar));
    }
}
