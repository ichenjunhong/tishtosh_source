package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew.C5534b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fd */
final /* synthetic */ class C5542fd implements C1710e {

    /* renamed from: a */
    private final C5529ew f14598a;

    C5542fd(C5529ew ewVar) {
        this.f14598a = ewVar;
    }

    public final void accept(Object obj) {
        C5529ew ewVar = this.f14598a;
        C4177d dVar = (C4177d) obj;
        ewVar.f14577d = false;
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        ((C5534b) ewVar.mo8518c()).mo11086c();
    }
}
