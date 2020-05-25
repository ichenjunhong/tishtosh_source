package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.livesdkapi.depend.live.C8671u;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ch */
final /* synthetic */ class C6045ch implements Runnable {

    /* renamed from: a */
    private final C6025ce f16115a;

    C6045ch(C6025ce ceVar) {
        this.f16115a = ceVar;
    }

    public final void run() {
        C6025ce ceVar = this.f16115a;
        if (ceVar.f16068p != null && ceVar.f16067o == C8671u.LIVE_STARTED) {
            ceVar.f16068p.mo10955c();
        }
        ceVar.mo12033a(C6042a.USER_CLOSE);
    }
}
