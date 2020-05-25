package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy.C5474b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.dw */
final /* synthetic */ class C5499dw implements C1710e {

    /* renamed from: a */
    private final C5470cy f14531a;

    C5499dw(C5470cy cyVar) {
        this.f14531a = cyVar;
    }

    public final void accept(Object obj) {
        C5470cy cyVar = this.f14531a;
        Throwable th = (Throwable) obj;
        cyVar.mo11751c(th);
        cyVar.f14488f = false;
        if (cyVar.f14490h) {
            ((C5474b) cyVar.mo8518c()).mo11404f();
            C4639e.m11122a().mo10424b();
            cyVar.mo11370b();
            ((C5474b) cyVar.mo8518c()).mo11404f();
            return;
        }
        ((C5474b) cyVar.mo8518c()).mo11401d(th);
    }
}
