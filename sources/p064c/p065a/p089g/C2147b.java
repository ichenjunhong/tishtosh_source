package p064c.p065a.p089g;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p087j.C2129f;

/* renamed from: c.a.g.b */
public abstract class C2147b<T> implements C1674ab<T>, C1690c {

    /* renamed from: c */
    final AtomicReference<C1690c> f6903c = new AtomicReference<>();

    public final void dispose() {
        C1718b.dispose(this.f6903c);
    }

    public final boolean isDisposed() {
        if (this.f6903c.get() == C1718b.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onSubscribe(C1690c cVar) {
        C2129f.m6421a(this.f6903c, cVar, getClass());
    }
}
