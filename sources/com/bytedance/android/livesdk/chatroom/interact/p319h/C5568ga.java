package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ga */
final /* synthetic */ class C5568ga implements C1710e {

    /* renamed from: a */
    private final C5556fq f14633a;

    C5568ga(C5556fq fqVar) {
        this.f14633a = fqVar;
    }

    public final void accept(Object obj) {
        C5556fq fqVar = this.f14633a;
        C4177d dVar = (C4177d) obj;
        fqVar.mo11459a((Throwable) null);
        fqVar.f14615d = false;
        fqVar.f14614c.lambda$put$1$DataCenter("cmd_log_link", "INVITE_ANOTHER_GAME_SUCCEED");
    }
}
