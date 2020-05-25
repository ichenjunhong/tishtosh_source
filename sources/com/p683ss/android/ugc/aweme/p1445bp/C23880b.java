package com.p683ss.android.ugc.aweme.p1445bp;

import com.p683ss.android.ugc.aweme.draft.C29051b;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23932a;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23934b;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23937d;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23938e;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23939f;
import com.p683ss.android.ugc.aweme.p1445bp.p1458i.p1459a.C23944a;
import com.p683ss.android.ugc.aweme.p1445bp.p1458i.p1460b.p1461a.C23948a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.b */
public final class C23880b implements C23938e {

    /* renamed from: a */
    private C23932a f63549a;

    /* renamed from: b */
    private final AtomicBoolean f63550b = new AtomicBoolean(false);

    /* renamed from: a */
    public final C23934b mo49486a() {
        C23932a aVar = this.f63549a;
        if (aVar == null) {
            C52711k.m112237a("mProxy");
        }
        return aVar.getMonitor();
    }

    /* renamed from: b */
    public final C23939f mo49488b() {
        C23932a aVar = this.f63549a;
        if (aVar == null) {
            C52711k.m112237a("mProxy");
        }
        return aVar.getWhiteListService();
    }

    /* renamed from: c */
    public final C23936c mo49489c() {
        C23932a aVar = this.f63549a;
        if (aVar == null) {
            C52711k.m112237a("mProxy");
        }
        return aVar.getFileProvider();
    }

    /* renamed from: d */
    public final C23937d mo49490d() {
        C23932a aVar = this.f63549a;
        if (aVar == null) {
            C52711k.m112237a("mProxy");
        }
        return aVar.getPersistedWhiteListManager();
    }

    /* renamed from: a */
    public final void mo49487a(C23932a aVar) {
        C52711k.m112240b(aVar, "proxy");
        if (!this.f63550b.get()) {
            this.f63550b.set(true);
            this.f63549a = aVar;
            C23932a aVar2 = this.f63549a;
            if (aVar2 == null) {
                C52711k.m112237a("mProxy");
            }
            aVar2.getPersistedWhiteListManager().mo49523a((C23944a) new C23948a());
            C39629l.m88232a().mo58573d().mo80731a((C29051b) mo49488b());
        }
    }
}
