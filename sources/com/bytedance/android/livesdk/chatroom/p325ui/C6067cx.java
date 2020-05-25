package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cx */
final /* synthetic */ class C6067cx implements Runnable {

    /* renamed from: a */
    private final C6049cl f16224a;

    C6067cx(C6049cl clVar) {
        this.f16224a = clVar;
    }

    public final void run() {
        C6049cl clVar = this.f16224a;
        LayoutParams layoutParams = clVar.f16185j.getLayoutParams();
        layoutParams.width = 0;
        clVar.f16185j.setLayoutParams(layoutParams);
    }
}
