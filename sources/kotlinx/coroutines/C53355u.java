package kotlinx.coroutines;

import p2628d.C52848o;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.u */
public final class C53355u {
    /* renamed from: a */
    public static final <T> Object m113421a(Object obj) {
        if (C52848o.m114626isSuccessimpl(obj)) {
            return obj;
        }
        Throwable r1 = C52848o.m114623exceptionOrNullimpl(obj);
        if (r1 == null) {
            C52711k.m112234a();
        }
        return new C53354t(r1);
    }
}
