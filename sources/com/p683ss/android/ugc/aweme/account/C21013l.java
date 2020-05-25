package com.p683ss.android.ugc.aweme.account;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import com.p683ss.android.ugc.aweme.account.utils.experiments.BindPhoneAfterThirdPartyLogin;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.account.l */
public final /* synthetic */ class C21013l implements C22254a {

    /* renamed from: a */
    private final Bundle f57138a;

    public C21013l(Bundle bundle) {
        this.f57138a = bundle;
    }

    /* renamed from: a */
    public final void mo44959a(Bundle bundle) {
        Bundle bundle2 = this.f57138a;
        if (bundle == null) {
            bundle = bundle2;
        }
        Activity g = C11016e.m22312g();
        User curUser = C20854a.m53167g().getCurUser();
        if ("mobile".equalsIgnoreCase(bundle.getString("platform")) || curUser == null || g == null || curUser.isPhoneBinded() || !C10181b.m20511a().mo18172a(BindPhoneAfterThirdPartyLogin.class, true, "m_bind_phone_after_third_party_login", 31744, false) || C47915gg.m103651b()) {
            C22884a.m56353a(bundle);
            return;
        }
        C26890h.m65011a("phone_bundling_click", C23089d.m56640a().mo47829a("enter_from", "log_in").f61491a);
        C20854a.m53165e().keepCallback().bindMobile(g, "third_party_login", null, new C22120q(bundle));
    }
}
