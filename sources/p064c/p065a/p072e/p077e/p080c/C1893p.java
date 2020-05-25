package p064c.p065a.p072e.p077e.p080c;

import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p086i.C2118b;

/* renamed from: c.a.e.e.c.p */
public final class C1893p<T> extends C2149h<T> {

    /* renamed from: a */
    final C2198s<T> f6200a;

    /* renamed from: c.a.e.e.c.p$a */
    static final class C1894a<T> extends C2118b<T> implements C2196q<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: a */
        C1690c f6201a;

        public final void onComplete() {
            this.f6871e.onComplete();
        }

        public final void cancel() {
            super.cancel();
            this.f6201a.dispose();
        }

        C1894a(C53695c<? super T> cVar) {
            super(cVar);
        }

        public final void onSuccess(T t) {
            complete(t);
        }

        public final void onError(Throwable th) {
            this.f6871e.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6201a, cVar)) {
                this.f6201a = cVar;
                this.f6871e.onSubscribe(this);
            }
        }
    }

    public C1893p(C2198s<T> sVar) {
        this.f6200a = sVar;
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f6200a.mo6495b(new C1894a(cVar));
    }
}
