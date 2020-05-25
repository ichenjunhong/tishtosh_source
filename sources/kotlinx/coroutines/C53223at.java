package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53331t;
import kotlinx.coroutines.internal.C53332u;
import kotlinx.coroutines.internal.C53334w;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.at */
public final class C53223at {

    /* renamed from: a */
    public static final C53332u f131805a = new C53332u("UNDEFINED");

    /* renamed from: a */
    private static final void m113064a(C53224au<?> auVar) {
        C53249ba a = C53291cg.m113269a();
        if (a.mo110843f()) {
            a.mo110836a(auVar);
            return;
        }
        a.mo110837a(true);
        try {
            m113066a(auVar, auVar.mo110791d(), 3);
            do {
            } while (a.mo110842e());
            a.mo110839b(true);
        } catch (Throwable th) {
            a.mo110839b(true);
            throw th;
        }
    }

    /* renamed from: b */
    public static final <T> void m113067b(C52625c<? super T> cVar, T t) {
        C52711k.m112240b(cVar, "receiver$0");
        if (cVar instanceof C53221ar) {
            ((C53221ar) cVar).f131802d.resumeWith(C52848o.m114620constructorimpl(t));
        } else {
            cVar.resumeWith(C52848o.m114620constructorimpl(t));
        }
    }

    /* renamed from: b */
    public static final <T> void m113068b(C52625c<? super T> cVar, Throwable th) {
        C52711k.m112240b(cVar, "receiver$0");
        C52711k.m112240b(th, "exception");
        if (cVar instanceof C53221ar) {
            C52625c<T> cVar2 = ((C53221ar) cVar).f131802d;
            cVar2.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(C53331t.m113355a(th, cVar2))));
            return;
        }
        cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(C53331t.m113355a(th, cVar))));
    }

    /* renamed from: a */
    public static final <T> void m113065a(C53224au<? super T> auVar, int i) {
        C52711k.m112240b(auVar, "receiver$0");
        C52625c d = auVar.mo110791d();
        if (!C53287cc.m113263b(i) || !(d instanceof C53221ar) || C53287cc.m113260a(i) != C53287cc.m113260a(auVar.f131806e)) {
            m113066a(auVar, d, i);
            return;
        }
        C53360z zVar = ((C53221ar) d).f131801c;
        C52628e context = d.getContext();
        if (zVar.mo19709a(context)) {
            zVar.mo19708a(context, auVar);
        } else {
            m113064a(auVar);
        }
    }

    /* renamed from: a */
    public static final <T> void m113062a(C52625c<? super T> cVar, T t) {
        boolean z;
        C52628e context;
        Object a;
        C52711k.m112240b(cVar, "receiver$0");
        if (cVar instanceof C53221ar) {
            C53221ar arVar = (C53221ar) cVar;
            if (arVar.f131801c.mo19709a(arVar.getContext())) {
                arVar.f131799a = t;
                arVar.f131806e = 1;
                arVar.f131801c.mo19708a(arVar.getContext(), arVar);
                return;
            }
            C53249ba a2 = C53291cg.m113269a();
            if (a2.mo110843f()) {
                arVar.f131799a = t;
                arVar.f131806e = 1;
                a2.mo110836a((C53224au<?>) arVar);
                return;
            }
            a2.mo110837a(true);
            try {
                C53263bl blVar = (C53263bl) arVar.getContext().get(C53263bl.f131892c);
                if (blVar == null || blVar.mo110755b()) {
                    z = false;
                } else {
                    arVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(blVar.mo110866k())));
                    z = true;
                }
                if (!z) {
                    context = arVar.getContext();
                    a = C53334w.m113370a(context, arVar.f131800b);
                    arVar.f131802d.resumeWith(C52848o.m114620constructorimpl(t));
                    C53334w.m113371b(context, a);
                }
                do {
                } while (a2.mo110842e());
                a2.mo110839b(true);
            } catch (Throwable th) {
                try {
                    throw new C53220aq("Unexpected exception in unconfined event loop", th);
                } catch (Throwable th2) {
                    a2.mo110839b(true);
                    throw th2;
                }
            }
        } else {
            cVar.resumeWith(C52848o.m114620constructorimpl(t));
        }
    }

    /* renamed from: a */
    public static final <T> void m113063a(C52625c<? super T> cVar, Throwable th) {
        boolean z;
        C52628e context;
        Object a;
        C52711k.m112240b(cVar, "receiver$0");
        C52711k.m112240b(th, "exception");
        if (cVar instanceof C53221ar) {
            C53221ar arVar = (C53221ar) cVar;
            C52628e context2 = arVar.f131802d.getContext();
            C53354t tVar = new C53354t(th);
            if (arVar.f131801c.mo19709a(context2)) {
                arVar.f131799a = new C53354t(th);
                arVar.f131806e = 1;
                arVar.f131801c.mo19708a(context2, arVar);
                return;
            }
            C53249ba a2 = C53291cg.m113269a();
            if (a2.mo110843f()) {
                arVar.f131799a = tVar;
                arVar.f131806e = 1;
                a2.mo110836a((C53224au<?>) arVar);
                return;
            }
            a2.mo110837a(true);
            try {
                C53263bl blVar = (C53263bl) arVar.getContext().get(C53263bl.f131892c);
                if (blVar == null || blVar.mo110755b()) {
                    z = false;
                } else {
                    arVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(blVar.mo110866k())));
                    z = true;
                }
                if (!z) {
                    context = arVar.getContext();
                    a = C53334w.m113370a(context, arVar.f131800b);
                    C52625c<T> cVar2 = arVar.f131802d;
                    cVar2.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(C53331t.m113355a(th, cVar2))));
                    C53334w.m113371b(context, a);
                }
                do {
                } while (a2.mo110842e());
                a2.mo110839b(true);
            } catch (Throwable th2) {
                try {
                    throw new C53220aq("Unexpected exception in unconfined event loop", th2);
                } catch (Throwable th3) {
                    a2.mo110839b(true);
                    throw th3;
                }
            }
        } else {
            cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(C53331t.m113355a(th, cVar))));
        }
    }

    /* renamed from: a */
    private static <T> void m113066a(C53224au<? super T> auVar, C52625c<? super T> cVar, int i) {
        C52711k.m112240b(auVar, "receiver$0");
        C52711k.m112240b(cVar, "delegate");
        Object a = auVar.mo110790a();
        Throwable b = C53224au.m113069b(a);
        if (b != null) {
            C53287cc.m113259a(cVar, b, i);
        } else {
            C53287cc.m113258a(cVar, auVar.mo110793a(a), i);
        }
    }
}
