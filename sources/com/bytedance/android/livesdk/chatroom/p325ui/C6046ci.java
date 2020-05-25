package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.livesdk.chatroom.event.C5197p;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ci */
final /* synthetic */ class C6046ci implements Runnable {

    /* renamed from: a */
    private final C6025ce f16116a;

    /* renamed from: b */
    private final C5197p f16117b;

    C6046ci(C6025ce ceVar, C5197p pVar) {
        this.f16116a = ceVar;
        this.f16117b = pVar;
    }

    public final void run() {
        C6025ce ceVar = this.f16116a;
        C5197p pVar = this.f16117b;
        ceVar.mo12033a(C6042a.JUMP_TO_OTHER);
        if (ceVar.mo12066u() != null) {
            ceVar.mo12066u().mo12861a(pVar.f13908a, pVar.f13909b, pVar.f13910c, pVar.f13911d);
        }
    }
}
