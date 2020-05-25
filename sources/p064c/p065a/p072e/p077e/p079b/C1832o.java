package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.p072e.p075c.C1753g;
import p064c.p065a.p072e.p086i.C2120d;

/* renamed from: c.a.e.e.b.o */
public final class C1832o<T> extends C2149h<T> implements C1753g<T> {

    /* renamed from: a */
    private final T f6053a;

    public final T call() {
        return this.f6053a;
    }

    public C1832o(T t) {
        this.f6053a = t;
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        cVar.onSubscribe(new C2120d(cVar, this.f6053a));
    }
}
