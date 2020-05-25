package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bg */
final /* synthetic */ class C5983bg implements OnClickListener {

    /* renamed from: a */
    private final C5977ba f15863a;

    C5983bg(C5977ba baVar) {
        this.f15863a = baVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5977ba baVar = this.f15863a;
        dialogInterface.dismiss();
        baVar.mo11964a((int) R.string.ejj);
        baVar.f15841a.mo11383p();
        C4563ad.m10956a(baVar.f15843c, "shutdown_connection", "connection", true);
    }
}
