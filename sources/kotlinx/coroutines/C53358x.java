package kotlinx.coroutines;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.x */
public final class C53358x extends RuntimeException {
    public C53358x(String str, Throwable th) {
        C52711k.m112240b(str, "message");
        C52711k.m112240b(th, "cause");
        super(str, th);
    }
}
