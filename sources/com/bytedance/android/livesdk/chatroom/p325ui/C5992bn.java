package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bn */
final /* synthetic */ class C5992bn implements OnClickListener {

    /* renamed from: a */
    private final C5988bj f15895a;

    C5992bn(C5988bj bjVar) {
        this.f15895a = bjVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5988bj bjVar = this.f15895a;
        dialogInterface.dismiss();
        bjVar.mo11981a((int) R.string.ejj);
        bjVar.f15879a.mo11420e();
        C4563ad.m10956a(bjVar.f15881c, "shutdown_connection", "connection", true);
    }
}
