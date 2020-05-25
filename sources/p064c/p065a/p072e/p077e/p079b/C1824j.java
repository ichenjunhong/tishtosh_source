package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.Callable;
import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p086i.C2118b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.j */
public final class C1824j<T> extends C2149h<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f6040a;

    public final T call() throws Exception {
        return C1745b.m6050a(this.f6040a.call(), "The callable returned a null value");
    }

    public C1824j(Callable<? extends T> callable) {
        this.f6040a = callable;
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        C2118b bVar = new C2118b(cVar);
        cVar.onSubscribe(bVar);
        try {
            bVar.complete(C1745b.m6050a(this.f6040a.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            C1700b.m6017b(th);
            if (bVar.isCancelled()) {
                C2150a.m6492a(th);
            } else {
                cVar.onError(th);
            }
        }
    }
}
