package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.Callable;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p076d.C1764i;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.x */
public final class C2026x<T> extends C2201v<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f6641a;

    public final T call() throws Exception {
        return C1745b.m6050a(this.f6641a.call(), "The callable returned a null value");
    }

    public C2026x(Callable<? extends T> callable) {
        this.f6641a = callable;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1764i iVar = new C1764i(abVar);
        abVar.onSubscribe(iVar);
        if (!iVar.isDisposed()) {
            try {
                iVar.complete(C1745b.m6050a(this.f6641a.call(), "Callable returned null"));
            } catch (Throwable th) {
                C1700b.m6017b(th);
                if (!iVar.isDisposed()) {
                    abVar.onError(th);
                } else {
                    C2150a.m6492a(th);
                }
            }
        }
    }
}
