package com.facebook.imagepipeline.p965e;

import com.facebook.p914c.p916b.C13636c;
import com.facebook.p914c.p916b.C13640d;
import com.facebook.p914c.p916b.C13643e;
import com.facebook.p914c.p916b.C13643e.C13646b;
import com.facebook.p914c.p916b.C13651i;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.imagepipeline.e.c */
public final class C13996c implements C14000g {

    /* renamed from: a */
    private C13997d f36478a;

    public C13996c(C13997d dVar) {
        this.f36478a = dVar;
    }

    /* renamed from: a */
    public final C13651i mo26179a(C13636c cVar) {
        C13636c cVar2 = cVar;
        C13640d a = this.f36478a.mo26180a(cVar2);
        ExecutorService a2 = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());
        C13646b bVar = new C13646b(cVar2.f35566f, cVar2.f35565e, cVar2.f35564d);
        C13643e eVar = new C13643e(a, cVar2.f35567g, bVar, cVar2.f35569i, cVar2.f35568h, cVar2.f35570j, cVar2.f35571k, a2, cVar2.f35572l);
        return eVar;
    }
}
