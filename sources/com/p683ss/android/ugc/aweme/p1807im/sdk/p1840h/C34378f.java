package com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35450e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.h.f */
public final class C34378f implements C35450e {
    /* renamed from: a */
    public final String mo72372a() {
        C35284t a = C35284t.m79782a();
        C52711k.m112236a((Object) a, "IMSPUtils.get()");
        return a.mo73376B();
    }

    /* renamed from: a */
    public final void mo72373a(boolean z) {
        if (!C35279p.m79763a()) {
            StringBuilder sb = new StringBuilder("UserActiveStatusManager updateUserActiveStatusPrivacy: ");
            sb.append(z);
            C32458a.m75144a(sb.toString());
            C35284t.m79782a().mo73413d(z);
            if (C34886b.f89856b.mo73002a().f89875a != z) {
                C34886b.f89856b.mo73002a().f89875a = z;
            }
            C34886b.f89856b.mo73003a(false);
        }
    }
}
