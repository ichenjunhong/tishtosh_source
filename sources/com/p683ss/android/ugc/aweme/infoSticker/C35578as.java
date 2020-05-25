package com.p683ss.android.ugc.aweme.infoSticker;

import com.p683ss.android.ugc.tools.utils.KeyboardUtils;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.as */
final /* synthetic */ class C35578as implements Runnable {

    /* renamed from: a */
    private final C35574ap f91446a;

    C35578as(C35574ap apVar) {
        this.f91446a = apVar;
    }

    public final void run() {
        C35574ap apVar = this.f91446a;
        if (apVar.f91429c != null) {
            apVar.f91429c.requestFocus();
            KeyboardUtils.m108324a(apVar.f91429c, apVar.f91435i);
        }
    }
}
