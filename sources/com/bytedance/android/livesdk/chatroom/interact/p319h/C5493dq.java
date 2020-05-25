package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy.C5474b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.dq */
final /* synthetic */ class C5493dq implements C1710e {

    /* renamed from: a */
    private final C5470cy f14525a;

    C5493dq(C5470cy cyVar) {
        this.f14525a = cyVar;
    }

    public final void accept(Object obj) {
        C5470cy cyVar = this.f14525a;
        Throwable th = (Throwable) obj;
        cyVar.f14485c = false;
        if (cyVar.mo8518c() != null && (th instanceof Exception)) {
            ((C5474b) cyVar.mo8518c()).mo11399c(th);
        }
    }
}
