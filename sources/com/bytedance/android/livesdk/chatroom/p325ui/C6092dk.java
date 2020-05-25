package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.core.p230g.C3922z;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dk */
final /* synthetic */ class C6092dk implements Runnable {

    /* renamed from: a */
    private final C6090di f16332a;

    C6092dk(C6090di diVar) {
        this.f16332a = diVar;
    }

    public final void run() {
        C6090di diVar = this.f16332a;
        if (diVar.f16318b) {
            int b = C3922z.m9908b();
            LayoutParams layoutParams = diVar.f16324h.getLayoutParams();
            layoutParams.width = b;
            diVar.f16324h.setLayoutParams(layoutParams);
            diVar.f16324h.requestLayout();
        }
    }
}
