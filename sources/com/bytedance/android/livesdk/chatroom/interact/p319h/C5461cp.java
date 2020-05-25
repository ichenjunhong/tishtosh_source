package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4629a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5453cj.C5455a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cp */
final /* synthetic */ class C5461cp implements C1710e {

    /* renamed from: a */
    private final C5453cj f14468a;

    C5461cp(C5453cj cjVar) {
        this.f14468a = cjVar;
    }

    public final void accept(Object obj) {
        C5453cj cjVar = this.f14468a;
        cjVar.mo11751c((Throwable) obj);
        if (!(C4629a.CONNECTION_SUCCEED.compareTo((C4629a) cjVar.f14450d.get("data_link_state", C4629a.DISABLED)) <= 0)) {
            ((C5455a) cjVar.mo8518c()).mo11359c();
        }
    }
}
