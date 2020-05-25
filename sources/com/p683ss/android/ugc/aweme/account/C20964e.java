package com.p683ss.android.ugc.aweme.account;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a;

/* renamed from: com.ss.android.ugc.aweme.account.e */
public final /* synthetic */ class C20964e implements C22254a {

    /* renamed from: a */
    private final Bundle f57067a;

    public C20964e(Bundle bundle) {
        this.f57067a = bundle;
    }

    /* renamed from: a */
    public final void mo44959a(Bundle bundle) {
        Bundle bundle2 = this.f57067a;
        if (bundle == null) {
            bundle = bundle2;
        }
        Activity g = C11016e.m22312g();
        if (g != null) {
            C20854a.m53161a().userNameService().setUserNameForThirdParty(g, bundle, new C20978h(bundle));
        } else {
            C22884a.m56353a(bundle);
        }
    }
}
