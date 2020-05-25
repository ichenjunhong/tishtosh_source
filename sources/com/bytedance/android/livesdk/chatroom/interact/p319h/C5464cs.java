package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4629a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cs */
final /* synthetic */ class C5464cs implements C1710e {

    /* renamed from: a */
    private final C5453cj f14471a;

    C5464cs(C5453cj cjVar) {
        this.f14471a = cjVar;
    }

    public final void accept(Object obj) {
        C5453cj cjVar = this.f14471a;
        C4177d dVar = (C4177d) obj;
        cjVar.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.FINISH_SUCCEED);
        cjVar.mo11349e();
    }
}
