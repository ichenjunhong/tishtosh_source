package kotlinx.coroutines.p2678a;

import kotlinx.coroutines.C53190a;
import kotlinx.coroutines.C53277bt;
import kotlinx.coroutines.C53294cj;
import kotlinx.coroutines.C53354t;
import kotlinx.coroutines.internal.C53330s;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: kotlinx.coroutines.a.b */
public final class C53192b {
    /* renamed from: a */
    public static final <T, R> Object m113017a(C53190a<? super T> aVar, R r, C52682m<? super R, ? super C52625c<? super T>, ? extends Object> mVar) {
        Object obj;
        C52711k.m112240b(aVar, "receiver$0");
        C52711k.m112240b(mVar, "block");
        aVar.cA_();
        try {
            obj = ((C52682m) C52731z.m112265b(mVar, 2)).invoke(r, aVar);
        } catch (Throwable th) {
            obj = new C53354t(th);
        }
        if (obj == C52601b.m112157a() || !aVar.mo110878a(obj, 4)) {
            return C52601b.m112157a();
        }
        Object n = aVar.mo110883n();
        if (!(n instanceof C53354t)) {
            return C53277bt.m113248b(n);
        }
        throw C53330s.m113349a(aVar, ((C53354t) n).f131987b);
    }

    /* renamed from: b */
    public static final <T, R> Object m113018b(C53190a<? super T> aVar, R r, C52682m<? super R, ? super C52625c<? super T>, ? extends Object> mVar) {
        Object obj;
        boolean z;
        C52711k.m112240b(aVar, "receiver$0");
        C52711k.m112240b(mVar, "block");
        aVar.cA_();
        try {
            obj = ((C52682m) C52731z.m112265b(mVar, 2)).invoke(r, aVar);
        } catch (Throwable th) {
            obj = new C53354t(th);
        }
        if (obj == C52601b.m112157a() || !aVar.mo110878a(obj, 4)) {
            return C52601b.m112157a();
        }
        Object n = aVar.mo110883n();
        if (!(n instanceof C53354t)) {
            return C53277bt.m113248b(n);
        }
        C53354t tVar = (C53354t) n;
        Throwable th2 = tVar.f131987b;
        if (!(th2 instanceof C53294cj) || ((C53294cj) th2).coroutine != aVar) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            throw C53330s.m113349a(aVar, tVar.f131987b);
        } else if (!(obj instanceof C53354t)) {
            return obj;
        } else {
            throw C53330s.m113349a(aVar, ((C53354t) obj).f131987b);
        }
    }
}
