package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cw */
final /* synthetic */ class C6066cw implements Runnable {

    /* renamed from: a */
    private final C6049cl f16223a;

    C6066cw(C6049cl clVar) {
        this.f16223a = clVar;
    }

    public final void run() {
        C6049cl clVar = this.f16223a;
        LayoutParams layoutParams = clVar.f16183h.getLayoutParams();
        layoutParams.width = 0;
        clVar.f16183h.setLayoutParams(layoutParams);
    }
}
