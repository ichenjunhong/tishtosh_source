package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy.C5474b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.dk */
final /* synthetic */ class C5487dk implements C1710e {

    /* renamed from: a */
    private final C5470cy f14518a;

    /* renamed from: b */
    private final String f14519b;

    C5487dk(C5470cy cyVar, String str) {
        this.f14518a = cyVar;
        this.f14519b = str;
    }

    public final void accept(Object obj) {
        C5470cy cyVar = this.f14518a;
        String str = this.f14519b;
        C4177d dVar = (C4177d) obj;
        cyVar.f14493k = false;
        if (cyVar.f14499q != null) {
            ((C5474b) cyVar.mo8518c()).mo11393a(cyVar.f14497o, str);
            cyVar.f14499q.mo11384a(cyVar.f14497o);
            cyVar.f14497o = 0;
        }
    }
}
