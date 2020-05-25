package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.account.model.C22053a;

/* renamed from: com.ss.android.ugc.aweme.account.ui.l */
final /* synthetic */ class C22246l implements C0199s {

    /* renamed from: a */
    private final TModifyMobileActivity f60017a;

    C22246l(TModifyMobileActivity tModifyMobileActivity) {
        this.f60017a = tModifyMobileActivity;
    }

    public final void onChanged(Object obj) {
        TModifyMobileActivity tModifyMobileActivity = this.f60017a;
        C22053a aVar = (C22053a) obj;
        if (aVar == null || !aVar.f59553a) {
            tModifyMobileActivity.onBackPressed();
        } else {
            tModifyMobileActivity.finish();
        }
    }
}
