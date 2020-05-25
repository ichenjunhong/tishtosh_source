package p064c.p065a.p089g;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1705d;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p087j.C2129f;

/* renamed from: c.a.g.a */
public abstract class C2146a implements C1690c, C1705d {

    /* renamed from: b */
    final AtomicReference<C1690c> f6902b = new AtomicReference<>();

    public final void dispose() {
        C1718b.dispose(this.f6902b);
    }

    public final boolean isDisposed() {
        if (this.f6902b.get() == C1718b.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onSubscribe(C1690c cVar) {
        C2129f.m6421a(this.f6902b, cVar, getClass());
    }
}
