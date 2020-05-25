package p064c.p065a.p069b;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.b.e */
abstract class C1692e<T> extends AtomicReference<T> implements C1690c {
    private static final long serialVersionUID = 6537757548749041217L;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6179a(T t);

    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                mo6179a(andSet);
            }
        }
    }

    C1692e(T t) {
        super(C1745b.m6050a(t, "value is null"));
    }
}
