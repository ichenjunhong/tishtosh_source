package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.h */
final /* synthetic */ class C22010h implements OnClickListener {

    /* renamed from: a */
    private final C22006f f59484a;

    C22010h(C22006f fVar) {
        this.f59484a = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C22006f fVar = this.f59484a;
        if (fVar.f59478g != null) {
            fVar.f59478g.onCancel();
        }
    }
}
