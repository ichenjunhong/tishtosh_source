package kotlinx.coroutines;

import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52626d;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.f */
final /* synthetic */ class C53300f {
    /* renamed from: a */
    public static final <T> T m113289a(C52628e eVar, C52682m<? super C53199ae, ? super C52625c<? super T>, ? extends Object> mVar) throws InterruptedException {
        C52628e eVar2;
        C53249ba baVar;
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(mVar, "block");
        Thread currentThread = Thread.currentThread();
        if (((C52626d) eVar.get(C52626d.f130919a)) == null) {
            baVar = C53291cg.m113269a();
            eVar2 = C53359y.m113423a(C53256be.f131885a, eVar.plus(baVar));
        } else {
            baVar = C53291cg.m113270b();
            eVar2 = C53359y.m113423a(C53256be.f131885a, eVar);
        }
        C52711k.m112236a((Object) currentThread, "currentThread");
        C53284c cVar = new C53284c(eVar2, currentThread, baVar);
        cVar.mo110754a(C53201ag.DEFAULT, cVar, mVar);
        return cVar.cC_();
    }
}
