package p064c.p065a.p072e.p073a;

import p064c.p065a.C1674ab;
import p064c.p065a.C1683ag;
import p064c.p065a.C1705d;
import p064c.p065a.C2196q;
import p064c.p065a.p072e.p075c.C1750d;

/* renamed from: c.a.e.a.c */
public enum C1719c implements C1750d<Object> {
    INSTANCE,
    NEVER;

    public final void clear() {
    }

    public final void dispose() {
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Object poll() throws Exception {
        return null;
    }

    public final int requestFusion(int i) {
        return i & 2;
    }

    public final boolean isDisposed() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(C1674ab<?> abVar) {
        abVar.onSubscribe(INSTANCE);
        abVar.onComplete();
    }

    public static void complete(C1705d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onComplete();
    }

    public static void complete(C2196q<?> qVar) {
        qVar.onSubscribe(INSTANCE);
        qVar.onComplete();
    }

    public static void error(Throwable th, C1674ab<?> abVar) {
        abVar.onSubscribe(INSTANCE);
        abVar.onError(th);
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void error(Throwable th, C1683ag<?> agVar) {
        agVar.onSubscribe(INSTANCE);
        agVar.onError(th);
    }

    public static void error(Throwable th, C1705d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onError(th);
    }

    public static void error(Throwable th, C2196q<?> qVar) {
        qVar.onSubscribe(INSTANCE);
        qVar.onError(th);
    }
}
