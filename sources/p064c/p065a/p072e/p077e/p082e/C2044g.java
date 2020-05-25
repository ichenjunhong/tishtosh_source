package p064c.p065a.p072e.p077e.p082e;

import java.util.concurrent.Callable;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p069b.C1691d;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.e.g */
public final class C2044g<T> extends C1680ad<T> {

    /* renamed from: a */
    final Callable<? extends T> f6678a;

    public C2044g(Callable<? extends T> callable) {
        this.f6678a = callable;
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        C1690c a = C1691d.m6005a(C1723a.f5843b);
        agVar.onSubscribe(a);
        if (!a.isDisposed()) {
            try {
                Object a2 = C1745b.m6050a(this.f6678a.call(), "The callable returned a null value");
                if (!a.isDisposed()) {
                    agVar.onSuccess(a2);
                }
            } catch (Throwable th) {
                C1700b.m6017b(th);
                if (!a.isDisposed()) {
                    agVar.onError(th);
                } else {
                    C2150a.m6492a(th);
                }
            }
        }
    }
}
