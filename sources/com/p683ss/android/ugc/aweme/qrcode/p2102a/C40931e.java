package com.p683ss.android.ugc.aweme.qrcode.p2102a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40922a.C40923a;
import com.p683ss.android.ugc.aweme.router.C41312z;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.e */
public final class C40931e extends C40922a {
    public C40931e(C40923a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo83412a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Activity g = C11016e.m22312g();
        if (g == null) {
            return false;
        }
        IMiniAppService a = C36983a.m83185b().mo76294a();
        C36960b a2 = new C36961a().mo76222b("scan").mo76223c("021002").mo76221a();
        if (!C36949e.m83168d(str)) {
            return false;
        }
        a.openMiniApp((Context) g, str, a2);
        C26890h.m65011a("enter_microapp", C23089d.m56640a().mo47829a("enter_from", "scan").mo47829a("enter_method", "scan_cam").mo47829a("microapp_id", C41312z.m91072b(str, "app_id")).f61491a);
        return true;
    }
}
