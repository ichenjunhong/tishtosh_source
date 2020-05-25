package p2628d;

import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.i */
public class C52739i {
    /* renamed from: a */
    public static final <T> C52668f<T> m112285a(C52670a<? extends T> aVar) {
        C52711k.m112240b(aVar, "initializer");
        return new C52854r<>(aVar, null, 2, null);
    }

    /* renamed from: a */
    public static final <T> C52668f<T> m112286a(C52757k kVar, C52670a<? extends T> aVar) {
        C52711k.m112240b(kVar, "mode");
        C52711k.m112240b(aVar, "initializer");
        switch (C52736h.f130987a[kVar.ordinal()]) {
            case 1:
                return new C52854r<>(aVar, null, 2, null);
            case 2:
                return new C52852q<>(aVar);
            case 3:
                return new C52861y<>(aVar);
            default:
                throw new C52775l();
        }
    }
}
