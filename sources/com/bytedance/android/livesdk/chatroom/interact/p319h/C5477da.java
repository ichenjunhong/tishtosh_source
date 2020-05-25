package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy.C5474b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.da */
final /* synthetic */ class C5477da implements C1710e {

    /* renamed from: a */
    private final C5470cy f14508a;

    C5477da(C5470cy cyVar) {
        this.f14508a = cyVar;
    }

    public final void accept(Object obj) {
        C5470cy cyVar = this.f14508a;
        C4177d dVar = (C4177d) obj;
        cyVar.f14487e = false;
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        C4639e.m11122a().mo10414a(Integer.valueOf(2));
        ((C5474b) cyVar.mo8518c()).mo11392a();
    }
}
