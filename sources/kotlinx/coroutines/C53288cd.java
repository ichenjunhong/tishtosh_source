package kotlinx.coroutines;

import p2628d.C52848o;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.cd */
final class C53288cd extends C53271br<C53263bl> {

    /* renamed from: a */
    private final C52625c<C52860x> f131914a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResumeOnCompletion[");
        sb.append(this.f131914a);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo110797a((Throwable) obj);
        return C52860x.f131107a;
    }

    /* renamed from: a */
    public final void mo110797a(Throwable th) {
        this.f131914a.resumeWith(C52848o.m114620constructorimpl(C52860x.f131107a));
    }

    public C53288cd(C53263bl blVar, C52625c<? super C52860x> cVar) {
        C52711k.m112240b(blVar, "job");
        C52711k.m112240b(cVar, "continuation");
        super(blVar);
        this.f131914a = cVar;
    }
}
