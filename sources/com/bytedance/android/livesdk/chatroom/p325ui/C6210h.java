package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8068g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.h */
final /* synthetic */ class C6210h implements OnClickListener {

    /* renamed from: a */
    private final C5957b f16680a;

    C6210h(C5957b bVar) {
        this.f16680a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C8068g.m16014a((Context) this.f16680a.getActivity());
        dialogInterface.dismiss();
    }
}
