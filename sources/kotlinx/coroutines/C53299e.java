package kotlinx.coroutines;

import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.e */
public final class C53299e {
    /* renamed from: a */
    public static final <T> T m113283a(C52628e eVar, C52682m<? super C53199ae, ? super C52625c<? super T>, ? extends Object> mVar) throws InterruptedException {
        return C53300f.m113289a(eVar, mVar);
    }

    /* renamed from: a */
    public static final <T> Object m113284a(C52628e eVar, C52682m<? super C53199ae, ? super C52625c<? super T>, ? extends Object> mVar, C52625c<? super T> cVar) {
        return C53301g.m113290a(eVar, mVar, cVar);
    }

    /* renamed from: a */
    public static final <T> C53207am<T> m113285a(C53199ae aeVar, C52628e eVar, C53201ag agVar, C52682m<? super C53199ae, ? super C52625c<? super T>, ? extends Object> mVar) {
        C53208an anVar;
        C52711k.m112240b(aeVar, "receiver$0");
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(agVar, "start");
        C52711k.m112240b(mVar, "block");
        C52628e a = C53359y.m113423a(aeVar, eVar);
        if (agVar.isLazy()) {
            anVar = new C53278bu(a, mVar);
        } else {
            anVar = new C53208an(a, true);
        }
        anVar.mo110754a(agVar, anVar, mVar);
        return anVar;
    }

    /* renamed from: b */
    public static final C53263bl m113287b(C53199ae aeVar, C52628e eVar, C53201ag agVar, C52682m<? super C53199ae, ? super C52625c<? super C52860x>, ? extends Object> mVar) {
        C53289ce ceVar;
        C52711k.m112240b(aeVar, "receiver$0");
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(agVar, "start");
        C52711k.m112240b(mVar, "block");
        C52628e a = C53359y.m113423a(aeVar, eVar);
        if (agVar.isLazy()) {
            ceVar = new C53279bv(a, mVar);
        } else {
            ceVar = new C53289ce(a, true);
        }
        ceVar.mo110754a(agVar, ceVar, mVar);
        return ceVar;
    }
}
