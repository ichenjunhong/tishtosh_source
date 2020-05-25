package com.p683ss.android.ugc.aweme.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.p683ss.android.ugc.aweme.main.dialogmanager.HomeDialogManager.C36587a;
import com.p683ss.android.ugc.aweme.utils.C47819dn.C47823a;

/* renamed from: com.ss.android.ugc.aweme.utils.dq */
public final /* synthetic */ class C47826dq implements OnDismissListener {

    /* renamed from: a */
    private final C47823a f120380a;

    public C47826dq(C47823a aVar) {
        this.f120380a = aVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47823a aVar = this.f120380a;
        if (aVar != null) {
            aVar.mo75626a();
        }
        C47819dn.f120368a = false;
        C36587a.m82462a(false);
    }
}
