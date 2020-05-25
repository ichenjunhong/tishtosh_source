package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53334w;
import kotlinx.coroutines.p2678a.C53191a;
import p2628d.C52775l;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: kotlinx.coroutines.ag */
public enum C53201ag {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    public final <T> void invoke(C52671b<? super C52625c<? super T>, ? extends Object> bVar, C52625c<? super T> cVar) {
        C52628e context;
        Object a;
        C52711k.m112240b(bVar, "block");
        C52711k.m112240b(cVar, "completion");
        switch (C53202ah.f131775a[ordinal()]) {
            case 1:
                C52711k.m112240b(bVar, "receiver$0");
                C52711k.m112240b(cVar, "completion");
                try {
                    C53223at.m113062a(C52601b.m112154a(C52601b.m112155a(bVar, cVar)), C52860x.f131107a);
                    break;
                } catch (Throwable th) {
                    cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th)));
                    return;
                }
            case 2:
                C52711k.m112240b(bVar, "$this$startCoroutine");
                C52711k.m112240b(cVar, "completion");
                C52601b.m112154a(C52601b.m112155a(bVar, cVar)).resumeWith(C52848o.m114620constructorimpl(C52860x.f131107a));
                return;
            case 3:
                C52711k.m112240b(bVar, "receiver$0");
                C52711k.m112240b(cVar, "completion");
                C52625c a2 = C52620h.m112170a(cVar);
                try {
                    context = cVar.getContext();
                    a = C53334w.m113370a(context, null);
                    Object invoke = ((C52671b) C52731z.m112265b(bVar, 1)).invoke(a2);
                    C53334w.m113371b(context, a);
                    if (invoke != C52601b.m112157a()) {
                        a2.resumeWith(C52848o.m114620constructorimpl(invoke));
                    }
                    return;
                } catch (Throwable th2) {
                    a2.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th2)));
                    break;
                }
            case 4:
                return;
            default:
                throw new C52775l();
        }
    }

    public final <R, T> void invoke(C52682m<? super R, ? super C52625c<? super T>, ? extends Object> mVar, R r, C52625c<? super T> cVar) {
        C52628e context;
        Object a;
        C52711k.m112240b(mVar, "block");
        C52711k.m112240b(cVar, "completion");
        switch (C53202ah.f131776b[ordinal()]) {
            case 1:
                C53191a.m113016a(mVar, r, cVar);
                return;
            case 2:
                C52711k.m112240b(mVar, "$this$startCoroutine");
                C52711k.m112240b(cVar, "completion");
                C52601b.m112154a(C52601b.m112156a(mVar, r, cVar)).resumeWith(C52848o.m114620constructorimpl(C52860x.f131107a));
                return;
            case 3:
                C52711k.m112240b(mVar, "receiver$0");
                C52711k.m112240b(cVar, "completion");
                C52625c a2 = C52620h.m112170a(cVar);
                try {
                    context = cVar.getContext();
                    a = C53334w.m113370a(context, null);
                    Object invoke = ((C52682m) C52731z.m112265b(mVar, 2)).invoke(r, a2);
                    C53334w.m113371b(context, a);
                    if (invoke != C52601b.m112157a()) {
                        a2.resumeWith(C52848o.m114620constructorimpl(invoke));
                    }
                    return;
                } catch (Throwable th) {
                    a2.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th)));
                    return;
                }
            case 4:
                return;
            default:
                throw new C52775l();
        }
    }
}
