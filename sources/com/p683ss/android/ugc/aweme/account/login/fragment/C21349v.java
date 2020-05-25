package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.v */
final /* synthetic */ class C21349v implements OnClickListener {

    /* renamed from: a */
    private final C21346u f57993a;

    C21349v(C21346u uVar) {
        this.f57993a = uVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C21346u uVar = this.f57993a;
        if (uVar.getActivity() != null) {
            uVar.f57984s = false;
            uVar.getActivity().finish();
            C26890h.m65011a("age_gate_eligible_popup_confirm", new C20856a().mo44776a("platform", uVar.f57983r).mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).f56798a);
        }
    }
}
