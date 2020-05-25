package kotlinx.coroutines;

import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.ay */
public final class C53228ay extends C53271br<C53263bl> {

    /* renamed from: a */
    private final C53226aw f131812a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisposeOnCompletion[");
        sb.append(this.f131812a);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo110797a(Throwable th) {
        this.f131812a.mo110788a();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo110797a((Throwable) obj);
        return C52860x.f131107a;
    }

    public C53228ay(C53263bl blVar, C53226aw awVar) {
        C52711k.m112240b(blVar, "job");
        C52711k.m112240b(awVar, "handle");
        super(blVar);
        this.f131812a = awVar;
    }
}
