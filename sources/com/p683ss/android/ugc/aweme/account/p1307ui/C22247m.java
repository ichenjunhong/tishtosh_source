package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.account.model.C22053a;

/* renamed from: com.ss.android.ugc.aweme.account.ui.m */
final /* synthetic */ class C22247m implements C0199s {

    /* renamed from: a */
    private final UpdatePasswordActivity f60018a;

    C22247m(UpdatePasswordActivity updatePasswordActivity) {
        this.f60018a = updatePasswordActivity;
    }

    public final void onChanged(Object obj) {
        UpdatePasswordActivity updatePasswordActivity = this.f60018a;
        C22053a aVar = (C22053a) obj;
        if (aVar == null || !aVar.f59553a) {
            updatePasswordActivity.onBackPressed();
        } else {
            updatePasswordActivity.finish();
        }
    }
}
