package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy.C5474b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.dd */
final /* synthetic */ class C5480dd implements C1710e {

    /* renamed from: a */
    private final C5470cy f14511a;

    C5480dd(C5470cy cyVar) {
        this.f14511a = cyVar;
    }

    public final void accept(Object obj) {
        C5470cy cyVar = this.f14511a;
        Throwable th = (Throwable) obj;
        cyVar.mo11751c(th);
        cyVar.f14486d = false;
        C4639e.m11122a().mo10414a(Integer.valueOf(0));
        ((C5474b) cyVar.mo8518c()).mo11403e(th);
    }
}
