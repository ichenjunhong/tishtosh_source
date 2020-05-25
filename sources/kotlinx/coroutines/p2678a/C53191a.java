package kotlinx.coroutines.p2678a;

import kotlinx.coroutines.C53223at;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.a.a */
public final class C53191a {
    /* renamed from: a */
    public static final <R, T> void m113016a(C52682m<? super R, ? super C52625c<? super T>, ? extends Object> mVar, R r, C52625c<? super T> cVar) {
        C52711k.m112240b(mVar, "receiver$0");
        C52711k.m112240b(cVar, "completion");
        try {
            C53223at.m113062a(C52601b.m112154a(C52601b.m112156a(mVar, r, cVar)), C52860x.f131107a);
        } catch (Throwable th) {
            cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th)));
        }
    }
}
