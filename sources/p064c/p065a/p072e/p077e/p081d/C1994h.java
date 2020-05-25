package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.Callable;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.e.d.h */
public final class C1994h<T> extends C2201v<T> {

    /* renamed from: a */
    final Callable<? extends C2206z<? extends T>> f6533a;

    public C1994h(Callable<? extends C2206z<? extends T>> callable) {
        this.f6533a = callable;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        try {
            ((C2206z) C1745b.m6050a(this.f6533a.call(), "null ObservableSource supplied")).mo6314a(abVar);
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C1719c.error(th, abVar);
        }
    }
}
