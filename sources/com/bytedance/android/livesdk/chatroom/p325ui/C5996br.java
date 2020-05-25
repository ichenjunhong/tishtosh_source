package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.br */
final /* synthetic */ class C5996br implements OnClickListener {

    /* renamed from: a */
    private final C5994bp f15906a;

    C5996br(C5994bp bpVar) {
        this.f15906a = bpVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5994bp bpVar = this.f15906a;
        dialogInterface.dismiss();
        bpVar.f15897a.mo11442i();
        bpVar.mo11991d();
    }
}
