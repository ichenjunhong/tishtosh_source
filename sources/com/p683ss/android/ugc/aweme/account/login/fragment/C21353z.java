package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.C23826bi;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.z */
final /* synthetic */ class C21353z implements OnClickListener {

    /* renamed from: a */
    private final C21346u f57997a;

    C21353z(C21346u uVar) {
        this.f57997a = uVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C21346u uVar = this.f57997a;
        C23826bi.m58465f().notifyFinish();
        if (uVar.getActivity() != null) {
            uVar.getActivity().finish();
        }
    }
}
