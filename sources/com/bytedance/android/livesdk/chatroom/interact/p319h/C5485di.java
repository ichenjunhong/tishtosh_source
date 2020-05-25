package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.event.C5199r;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.p269aa.C4495a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.di */
final /* synthetic */ class C5485di implements C1710e {

    /* renamed from: a */
    private final C5470cy f14516a;

    C5485di(C5470cy cyVar) {
        this.f14516a = cyVar;
    }

    public final void accept(Object obj) {
        C5470cy cyVar = this.f14516a;
        C4177d dVar = (C4177d) obj;
        cyVar.f14492j = false;
        if (cyVar.f14499q != null) {
            cyVar.f14499q.mo11390d();
        }
        C4639e.m11122a().mo10414a(Integer.valueOf(0));
        cyVar.f14500r.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(8));
        C4495a.m10823a().mo10301a((Object) new C5199r(1));
    }
}
