package kotlinx.coroutines.internal;

import kotlinx.coroutines.C53190a;
import p2628d.p2631c.C52625c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.s */
public final class C53330s {
    /* renamed from: a */
    public static final Throwable m113349a(C53190a<?> aVar, Throwable th) {
        C52711k.m112240b(aVar, "receiver$0");
        C52711k.m112240b(th, "exception");
        if (!(aVar instanceof C53329r)) {
            aVar = null;
        }
        C53329r rVar = (C53329r) aVar;
        if (rVar != null) {
            C52625c<T> cVar = rVar.f131958e;
            if (cVar != null) {
                return C53331t.m113355a(th, cVar);
            }
        }
        return th;
    }
}
