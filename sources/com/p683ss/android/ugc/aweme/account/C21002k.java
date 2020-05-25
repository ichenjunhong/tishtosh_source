package com.p683ss.android.ugc.aweme.account;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.account.k */
final /* synthetic */ class C21002k implements C22254a {

    /* renamed from: a */
    private final Bundle f57111a;

    C21002k(Bundle bundle) {
        this.f57111a = bundle;
    }

    /* renamed from: a */
    public final void mo44959a(Bundle bundle) {
        Bundle bundle2 = this.f57111a;
        if (bundle == null) {
            bundle = bundle2;
        }
        Activity g = C11016e.m22312g();
        if (!C20854a.m53164d().keepCallback().showFTCAgeGateForCurrentUser(g, new C20967f(bundle), C23794bh.m58381G().mo47259t())) {
            if (C47915gg.m103651b()) {
                bundle.putBoolean("need_restart", true);
                AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().cancelSynthetise(g);
            }
            C22884a.m56353a(bundle);
        }
    }
}
