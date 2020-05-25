package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.data.C5353a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.gw */
final /* synthetic */ class C5591gw implements C1710e {

    /* renamed from: a */
    private final C5575gh f14669a;

    C5591gw(C5575gh ghVar) {
        this.f14669a = ghVar;
    }

    public final void accept(Object obj) {
        C5575gh ghVar = this.f14669a;
        C4177d dVar = (C4177d) obj;
        if (dVar.data == null || ((C5353a) dVar.data).f14259a == null || ((C5353a) dVar.data).f14259a.f23813b == null || !((C5353a) dVar.data).f14259a.f23813b.f23820g) {
            ghVar.mo11478b();
            return;
        }
        ghVar.f14644a = false;
        ghVar.mo11473a((C5353a) dVar.data);
    }
}
