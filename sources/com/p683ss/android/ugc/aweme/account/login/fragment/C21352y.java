package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.y */
final /* synthetic */ class C21352y implements OnClickListener {

    /* renamed from: a */
    private final C21346u f57996a;

    C21352y(C21346u uVar) {
        this.f57996a = uVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C21346u uVar = this.f57996a;
        if (uVar.getActivity() != null) {
            uVar.f57984s = false;
            uVar.getActivity().onBackPressed();
        }
    }
}
