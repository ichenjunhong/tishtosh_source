package com.p683ss.android.ugc.aweme.p1807im;

import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35450e;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.m */
public final class C33203m implements C41683a {
    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return false;
    }

    /* renamed from: a */
    public final void mo47082a(C41686c cVar) {
        C52711k.m112240b(cVar, "settings");
        IIMService d = C33194e.m76279d();
        if (d != null) {
            C35450e relationService = d.getRelationService();
            if (relationService != null) {
                boolean z = true;
                if (cVar.f105474Q != 1) {
                    z = false;
                }
                relationService.mo72373a(z);
            }
        }
    }
}
