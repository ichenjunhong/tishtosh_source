package com.bytedance.android.livesdk.chatroom.interact.p319h;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.eu */
final /* synthetic */ class C5527eu implements C1710e {

    /* renamed from: a */
    private final C5511eg f14572a;

    C5527eu(C5511eg egVar) {
        this.f14572a = egVar;
    }

    public final void accept(Object obj) {
        C5511eg egVar = this.f14572a;
        Throwable th = (Throwable) obj;
        egVar.mo11751c(th);
        egVar.f14544c = false;
        if (egVar.f14555n != null) {
            egVar.f14555n.mo11427a(th);
            egVar.f14554m = 0;
        }
    }
}
