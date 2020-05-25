package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.n */
final /* synthetic */ class C6216n implements OnClickListener {

    /* renamed from: a */
    private final Runnable f16690a;

    C6216n(Runnable runnable) {
        this.f16690a = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Runnable runnable = this.f16690a;
        dialogInterface.dismiss();
        runnable.run();
    }
}
