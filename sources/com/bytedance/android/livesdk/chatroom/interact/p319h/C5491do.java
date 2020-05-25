package com.bytedance.android.livesdk.chatroom.interact.p319h;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.do */
final /* synthetic */ class C5491do implements C1710e {

    /* renamed from: a */
    private final C5470cy f14523a;

    C5491do(C5470cy cyVar) {
        this.f14523a = cyVar;
    }

    public final void accept(Object obj) {
        C5470cy cyVar = this.f14523a;
        Throwable th = (Throwable) obj;
        cyVar.mo11751c(th);
        cyVar.f14494l = false;
        if (cyVar.f14499q != null) {
            cyVar.f14499q.mo11386a(th);
            cyVar.f14498p = 0;
        }
    }
}
