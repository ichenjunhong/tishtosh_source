package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.et */
final /* synthetic */ class C5526et implements C1710e {

    /* renamed from: a */
    private final C5511eg f14571a;

    C5526et(C5511eg egVar) {
        this.f14571a = egVar;
    }

    public final void accept(Object obj) {
        C5511eg egVar = this.f14571a;
        C4177d dVar = (C4177d) obj;
        egVar.f14544c = false;
        if (egVar.f14555n != null) {
            egVar.f14555n.mo11429b(egVar.f14554m);
            egVar.f14554m = 0;
        }
    }
}
