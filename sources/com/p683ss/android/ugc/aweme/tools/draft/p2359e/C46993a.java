package com.p683ss.android.ugc.aweme.tools.draft.p2359e;

import com.p683ss.android.ugc.aweme.draft.C29051b;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.port.internal.C39653c;
import com.p683ss.android.ugc.aweme.tools.draft.C47017s;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.e.a */
public final class C46993a implements C39653c {

    /* renamed from: a */
    private final List<C29051b> f118701a = new ArrayList();

    /* renamed from: a */
    public final int mo80729a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo80733b() {
        return 3;
    }

    /* renamed from: c */
    public final List<C29059c> mo80735c() {
        List<C29059c> b = C47017s.m102091a().mo94307b();
        C52711k.m112236a((Object) b, "DraftDBHelper.getInstance().queryList()");
        return b;
    }

    /* renamed from: a */
    public final long mo80730a(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        return C47017s.m102091a().mo94309c(cVar);
    }

    /* renamed from: b */
    public final int mo80734b(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        return C47017s.m102091a().mo94305b(cVar);
    }

    /* renamed from: a */
    public final void mo80731a(C29051b bVar) {
        C52711k.m112240b(bVar, "listener");
        if (!this.f118701a.contains(bVar)) {
            this.f118701a.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo80732a(C29059c cVar, boolean z) {
        C52711k.m112240b(cVar, "draft");
        for (C29051b a : this.f118701a) {
            a.mo49538a(cVar, z);
        }
    }
}
