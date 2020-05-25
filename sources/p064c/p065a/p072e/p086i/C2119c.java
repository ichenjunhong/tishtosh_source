package p064c.p065a.p072e.p086i;

import org.p2692b.C53695c;
import p064c.p065a.p072e.p075c.C1752f;

/* renamed from: c.a.e.i.c */
public enum C2119c implements C1752f<Object> {
    INSTANCE;

    public final void cancel() {
    }

    public final void clear() {
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Object poll() {
        return null;
    }

    public final int requestFusion(int i) {
        return i & 2;
    }

    public final String toString() {
        return "EmptySubscription";
    }

    public final void request(long j) {
        C2122f.validate(j);
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(C53695c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th, C53695c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
