package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy.C5474b;
import com.bytedance.android.livesdk.chatroom.model.C5689a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.dp */
final /* synthetic */ class C5492dp implements C1710e {

    /* renamed from: a */
    private final C5470cy f14524a;

    C5492dp(C5470cy cyVar) {
        this.f14524a = cyVar;
    }

    public final void accept(Object obj) {
        C5470cy cyVar = this.f14524a;
        C5689a aVar = (C5689a) ((C4177d) obj).data;
        cyVar.f14485c = false;
        if (cyVar.mo8518c() != null) {
            C4638d.m11114a().mo10420b(aVar.f14916b, aVar.f14915a);
            C4638d.m11114a().f12666i = aVar.f14918d;
            C4639e.m11122a().mo10414a(Integer.valueOf(1));
            C4639e.m11122a().f12681m = 1;
            ((C5474b) cyVar.mo8518c()).mo11402e();
        }
    }
}
