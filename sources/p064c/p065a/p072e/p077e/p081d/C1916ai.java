package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p072e.p075c.C1753g;
import p064c.p065a.p072e.p077e.p081d.C1941as.C1942a;

/* renamed from: c.a.e.e.d.ai */
public final class C1916ai<T> extends C2201v<T> implements C1753g<T> {

    /* renamed from: a */
    private final T f6252a;

    public final T call() {
        return this.f6252a;
    }

    public C1916ai(T t) {
        this.f6252a = t;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1942a aVar = new C1942a(abVar, this.f6252a);
        abVar.onSubscribe(aVar);
        aVar.run();
    }
}
