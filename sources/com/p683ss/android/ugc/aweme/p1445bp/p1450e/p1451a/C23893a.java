package com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52555ag;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bp.e.a.a */
public final class C23893a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63562a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23893a.class), "sizeFactory", "getSizeFactory()Lcom/ss/android/ugc/aweme/storage/helper/draft/DraftSizeCalculatorFactory;"))};

    /* renamed from: b */
    private C29059c f63563b;

    /* renamed from: c */
    private final C52668f f63564c = C52732g.m112306a(new C23898b());

    /* renamed from: c */
    private final C23898b m58606c() {
        return (C23898b) this.f63564c.getValue();
    }

    /* renamed from: a */
    public final long mo49498a() {
        C29059c cVar = this.f63563b;
        if (cVar == null || !cVar.mo58793c()) {
            return 0;
        }
        m58606c();
        return C23898b.m58623a(cVar).mo49504d();
    }

    /* renamed from: b */
    public final Set<String> mo49500b() {
        C29059c cVar = this.f63563b;
        if (cVar == null) {
            return C52555ag.m112062a();
        }
        if (!cVar.mo58793c()) {
            return C52555ag.m112062a();
        }
        return C29061d.m68498c(cVar);
    }

    /* renamed from: a */
    public final void mo49499a(C29059c cVar) {
        C52711k.m112240b(cVar, "source");
        this.f63563b = cVar;
    }
}
