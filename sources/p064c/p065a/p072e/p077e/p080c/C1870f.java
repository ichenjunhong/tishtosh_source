package p064c.p065a.p072e.p077e.p080c;

import p064c.p065a.C2193n;
import p064c.p065a.C2196q;
import p064c.p065a.p069b.C1691d;
import p064c.p065a.p072e.p075c.C1753g;

/* renamed from: c.a.e.e.c.f */
public final class C1870f<T> extends C2193n<T> implements C1753g<T> {

    /* renamed from: a */
    final T f6152a;

    public final T call() {
        return this.f6152a;
    }

    public C1870f(T t) {
        this.f6152a = t;
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        qVar.onSubscribe(C1691d.m6003a());
        qVar.onSuccess(this.f6152a);
    }
}
