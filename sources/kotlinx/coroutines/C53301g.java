package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53329r;
import kotlinx.coroutines.internal.C53334w;
import kotlinx.coroutines.p2678a.C53191a;
import kotlinx.coroutines.p2678a.C53192b;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52626d;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52634f;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.g */
final /* synthetic */ class C53301g {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final <T> Object m113290a(C52628e eVar, C52682m<? super C53199ae, ? super C52625c<? super T>, ? extends Object> mVar, C52625c<? super T> cVar) {
        Object obj;
        boolean z;
        C52628e context = cVar.getContext();
        C52628e plus = context.plus(eVar);
        if (plus == context) {
            C53329r rVar = new C53329r(plus, cVar);
            obj = C53192b.m113017a(rVar, rVar, mVar);
        } else if (C52711k.m112239a((Object) (C52626d) plus.get(C52626d.f130919a), (Object) (C52626d) context.get(C52626d.f130919a))) {
            C53297cm cmVar = new C53297cm(plus, cVar);
            Object a = C53334w.m113370a(plus, null);
            try {
                Object a2 = C53192b.m113017a(cmVar, cmVar, mVar);
                C53334w.m113371b(plus, a);
                obj = a2;
            } catch (Throwable th) {
                C53334w.m113371b(plus, a);
                throw th;
            }
        } else {
            C53222as asVar = new C53222as(plus, cVar);
            asVar.cA_();
            C53191a.m113016a(mVar, asVar, asVar);
            while (true) {
                int i = asVar._decision;
                z = true;
                if (i == 0) {
                    if (C53222as.f131804b.compareAndSet(asVar, 0, 1)) {
                        break;
                    }
                } else if (i == 2) {
                    z = false;
                } else {
                    throw new IllegalStateException("Already suspended".toString());
                }
            }
            if (z) {
                obj = C52601b.m112157a();
            } else {
                obj = C53277bt.m113248b(asVar.mo110883n());
                if (obj instanceof C53354t) {
                    throw ((C53354t) obj).f131987b;
                }
            }
        }
        if (obj == C52601b.m112157a()) {
            C52620h.m112171b(cVar);
        }
        return obj;
    }

    /* renamed from: a */
    public static /* synthetic */ C53263bl m113291a(C53199ae aeVar, C52628e eVar, C53201ag agVar, C52682m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = C52634f.INSTANCE;
        }
        if ((i & 2) != 0) {
            agVar = C53201ag.DEFAULT;
        }
        return C53299e.m113287b(aeVar, eVar, agVar, mVar);
    }

    /* renamed from: b */
    public static /* synthetic */ C53207am m113292b(C53199ae aeVar, C52628e eVar, C53201ag agVar, C52682m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = C52634f.INSTANCE;
        }
        if ((i & 2) != 0) {
            agVar = C53201ag.DEFAULT;
        }
        return C53299e.m113285a(aeVar, eVar, agVar, mVar);
    }
}
