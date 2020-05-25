package com.p683ss.android.ugc.aweme.account.agegate.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.a */
final /* synthetic */ class C20882a implements OnClickListener {

    /* renamed from: a */
    private final AgeGateActivity f56850a;

    C20882a(AgeGateActivity ageGateActivity) {
        this.f56850a = ageGateActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AgeGateActivity ageGateActivity = this.f56850a;
        ageGateActivity.onBackPressed();
        C26890h.m65011a("age_gate_eligible_popup_confirm", new C20856a().mo44776a("platform", ageGateActivity.f56832a).mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).f56798a);
    }
}
