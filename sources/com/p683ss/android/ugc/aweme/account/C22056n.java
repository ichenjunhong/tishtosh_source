package com.p683ss.android.ugc.aweme.account;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.C27987x;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;

/* renamed from: com.ss.android.ugc.aweme.account.n */
final /* synthetic */ class C22056n implements C22254a {

    /* renamed from: a */
    private final Bundle f59556a;

    C22056n(Bundle bundle) {
        this.f59556a = bundle;
    }

    /* renamed from: a */
    public final void mo44959a(Bundle bundle) {
        Bundle bundle2 = this.f59556a;
        if (bundle == null) {
            bundle = bundle2;
        }
        if (Keva.getRepo("compliance_setting").getBoolean("need_to_show_ftc_age_gate_but_no_showed", false)) {
            C23131p.m56692a("aweme_age_gate_not_show", "", C23088c.m56631a().mo47822a("platform", Integer.valueOf(C20902b.m53242a().getCurUser().getLoginPlatform())).mo47825b());
        }
        C23794bh.m58381G().mo47239a((C27987x) new C22086o(bundle), true);
    }
}
