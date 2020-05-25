package com.p683ss.android.ugc.aweme.account;

import android.os.Bundle;
import android.os.Handler;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a;

/* renamed from: com.ss.android.ugc.aweme.account.m */
final /* synthetic */ class C22051m implements C22254a {

    /* renamed from: a */
    private final Bundle f59547a;

    C22051m(Bundle bundle) {
        this.f59547a = bundle;
    }

    /* renamed from: a */
    public final void mo44959a(Bundle bundle) {
        Bundle bundle2 = this.f59547a;
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle.getBoolean("need_restart", false)) {
            new Handler().postDelayed(new C22099p(bundle), 500);
        } else {
            C22884a.m56353a(bundle);
        }
    }
}
