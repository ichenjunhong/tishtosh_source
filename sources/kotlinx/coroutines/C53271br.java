package kotlinx.coroutines;

import kotlinx.coroutines.C53263bl;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.br */
public abstract class C53271br<J extends C53263bl> extends C53357w implements C53226aw, C53258bg {

    /* renamed from: b */
    public final J f131894b;

    /* renamed from: b */
    public final boolean mo110799b() {
        return true;
    }

    public final C53281bx cD_() {
        return null;
    }

    /* renamed from: a */
    public final void mo110788a() {
        Object n;
        J j = this.f131894b;
        if (j != null) {
            C53272bs bsVar = (C53272bs) j;
            C52711k.m112240b(this, "node");
            do {
                n = bsVar.mo110883n();
                if (!(n instanceof C53271br)) {
                    if ((n instanceof C53258bg) && ((C53258bg) n).cD_() != null) {
                        mo110904c();
                    }
                    return;
                } else if (n != this) {
                    return;
                }
            } while (!C53272bs.f131895d.compareAndSet(bsVar, n, C53277bt.f131907c));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }

    public C53271br(J j) {
        C52711k.m112240b(j, "job");
        this.f131894b = j;
    }
}
