package com.p683ss.android.ugc.aweme.bullet.module.p1477ad;

import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.d */
public final class C24303d {

    /* renamed from: a */
    public static final C24303d f64458a = new C24303d();

    private C24303d() {
    }

    /* renamed from: a */
    private static void m59541a(C10326b bVar, C10290i iVar) {
        String str;
        String str2 = "ad_extra_params_error";
        C23089d a = C23089d.m56640a();
        String str3 = "contextProviderFactory#keys";
        Iterable a2 = bVar.mo18393a();
        String str4 = null;
        if (a2 != null) {
            str = a2.toString();
        } else {
            str = null;
        }
        C23089d a3 = a.mo47829a(str3, str);
        String str5 = "kitContainerApi";
        if (iVar != null) {
            str4 = iVar.toString();
        }
        C26890h.m65011a(str2, a3.mo47829a(str5, str4).f61491a);
    }

    /* renamed from: a */
    public final void mo50053a(C10326b bVar, C10290i iVar, C24302c cVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        if (cVar == null) {
            m59541a(bVar, iVar);
        }
    }
}
