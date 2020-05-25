package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.account.model.C22053a;

/* renamed from: com.ss.android.ugc.aweme.account.ui.o */
final /* synthetic */ class C22250o implements C0199s {

    /* renamed from: a */
    private final VerificationActivity f60022a;

    C22250o(VerificationActivity verificationActivity) {
        this.f60022a = verificationActivity;
    }

    public final void onChanged(Object obj) {
        VerificationActivity verificationActivity = this.f60022a;
        C22053a aVar = (C22053a) obj;
        if (aVar == null || !aVar.f59553a) {
            verificationActivity.onBackPressed();
        } else {
            verificationActivity.finish();
        }
    }
}
