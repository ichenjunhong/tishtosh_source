package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p279af.C4563ad;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bt */
final /* synthetic */ class C5998bt implements OnClickListener {

    /* renamed from: a */
    private final C5994bp f15908a;

    C5998bt(C5994bp bpVar) {
        this.f15908a = bpVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5994bp bpVar = this.f15908a;
        dialogInterface.dismiss();
        bpVar.f15897a.mo11444k();
        bpVar.mo11991d();
        C4563ad.m10956a(bpVar.f15898b, "shutdown_connection", "guest_cancel", false);
    }
}
