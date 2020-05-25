package p064c.p065a.p072e.p073a;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p069b.C1690c;

/* renamed from: c.a.e.a.f */
public final class C1722f extends AtomicReference<C1690c> implements C1690c {
    private static final long serialVersionUID = -754898800686245608L;

    public C1722f() {
    }

    public final void dispose() {
        C1718b.dispose(this);
    }

    public final boolean isDisposed() {
        return C1718b.isDisposed((C1690c) get());
    }

    public C1722f(C1690c cVar) {
        lazySet(cVar);
    }

    public final boolean replace(C1690c cVar) {
        return C1718b.replace(this, cVar);
    }

    public final boolean update(C1690c cVar) {
        return C1718b.set(this, cVar);
    }
}
