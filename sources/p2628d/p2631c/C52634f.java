package p2628d.p2631c;

import java.io.Serializable;
import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.c.f */
public final class C52634f implements C52628e, Serializable {
    public static final C52634f INSTANCE = new C52634f();
    private static final long serialVersionUID = 0;

    private C52634f() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public final <R> R fold(R r, C52682m<? super R, ? super C52631b, ? extends R> mVar) {
        C52711k.m112240b(mVar, "operation");
        return r;
    }

    public final <E extends C52631b> E get(C52633c<E> cVar) {
        C52711k.m112240b(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final C52628e plus(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        return eVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    public final C52628e minusKey(C52633c<?> cVar) {
        C52711k.m112240b(cVar, "key");
        return this;
    }
}
