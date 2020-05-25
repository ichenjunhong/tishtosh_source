package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.Callable;
import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p086i.C2119c;

/* renamed from: c.a.e.e.b.g */
public final class C1817g<T> extends C2149h<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f6005a;

    public C1817g(Callable<? extends Throwable> callable) {
        this.f6005a = callable;
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        try {
            th = (Throwable) C1745b.m6050a(this.f6005a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C1700b.m6017b(th);
        }
        C2119c.error(th, cVar);
    }
}
