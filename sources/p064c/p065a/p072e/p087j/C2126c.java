package p064c.p065a.p072e.p087j;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p070c.C1695a;

/* renamed from: c.a.e.j.c */
public final class C2126c extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public final boolean isTerminated() {
        if (get() == C2131h.f6891a) {
            return true;
        }
        return false;
    }

    public final Throwable terminate() {
        Throwable th = (Throwable) get();
        if (th != C2131h.f6891a) {
            return (Throwable) getAndSet(C2131h.f6891a);
        }
        return th;
    }

    public final boolean addThrowable(Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) get();
            if (th2 == C2131h.f6891a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new C1695a(th2, th);
            }
        } while (!compareAndSet(th2, th3));
        return true;
    }
}
