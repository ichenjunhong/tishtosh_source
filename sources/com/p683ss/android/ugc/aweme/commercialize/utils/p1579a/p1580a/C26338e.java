package com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.e */
public final class C26338e extends C26333a {
    /* renamed from: a */
    public final boolean mo54084a() {
        if (TextUtils.isEmpty(m63767e())) {
            return false;
        }
        return C36949e.m83168d(m63767e());
    }

    /* renamed from: e */
    private final String m63767e() {
        if (!TextUtils.isEmpty(mo54083d().f69473d.f69497a)) {
            return mo54083d().f69473d.f69497a;
        }
        return mo54083d().f69472c.f69499a;
    }

    /* renamed from: b */
    public final boolean mo54085b() {
        C36983a b = C36983a.m83185b();
        C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
        IMiniAppService a = b.mo76294a();
        if (a == null || !a.openMiniApp(mo54082c(), m63767e(), new C36960b())) {
            return false;
        }
        return true;
    }
}
