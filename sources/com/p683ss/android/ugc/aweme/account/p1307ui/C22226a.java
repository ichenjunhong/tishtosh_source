package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.account.model.C22053a;

/* renamed from: com.ss.android.ugc.aweme.account.ui.a */
final /* synthetic */ class C22226a implements C0199s {

    /* renamed from: a */
    private final BaseBindMobileActivity f59980a;

    C22226a(BaseBindMobileActivity baseBindMobileActivity) {
        this.f59980a = baseBindMobileActivity;
    }

    public final void onChanged(Object obj) {
        BaseBindMobileActivity baseBindMobileActivity = this.f59980a;
        C22053a aVar = (C22053a) obj;
        if (aVar == null || !aVar.f59553a) {
            baseBindMobileActivity.onBackPressed();
        } else {
            baseBindMobileActivity.finish();
        }
    }
}
