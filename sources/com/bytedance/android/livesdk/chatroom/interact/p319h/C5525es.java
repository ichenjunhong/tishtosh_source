package com.bytedance.android.livesdk.chatroom.interact.p319h;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.es */
final /* synthetic */ class C5525es implements C1710e {

    /* renamed from: a */
    private final C5511eg f14570a;

    C5525es(C5511eg egVar) {
        this.f14570a = egVar;
    }

    public final void accept(Object obj) {
        C5511eg egVar = this.f14570a;
        Throwable th = (Throwable) obj;
        egVar.mo11751c(th);
        egVar.f14543b = false;
        if (egVar.f14555n != null) {
            egVar.f14555n.mo11426a(egVar.f14553l, th);
            egVar.f14553l = 0;
        }
    }
}
