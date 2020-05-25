package com.bytedance.android.livesdk.chatroom.interact.p319h;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.dm */
final /* synthetic */ class C5489dm implements C1710e {

    /* renamed from: a */
    private final C5470cy f14521a;

    C5489dm(C5470cy cyVar) {
        this.f14521a = cyVar;
    }

    public final void accept(Object obj) {
        C5470cy cyVar = this.f14521a;
        Throwable th = (Throwable) obj;
        cyVar.mo11751c(th);
        cyVar.f14493k = false;
        if (cyVar.f14499q != null) {
            cyVar.f14499q.mo11385a(cyVar.f14497o, th);
            cyVar.f14497o = 0;
        }
    }
}
