package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.Callable;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.e.d.s */
public final class C2016s<T> extends C2201v<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f6601a;

    public C2016s(Callable<? extends Throwable> callable) {
        this.f6601a = callable;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        try {
            th = (Throwable) C1745b.m6050a(this.f6601a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C1700b.m6017b(th);
        }
        C1719c.error(th, abVar);
    }
}
