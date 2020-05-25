package com.bytedance.android.livesdk.gift.relay;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.relay.d */
final /* synthetic */ class C7637d implements C1710e {

    /* renamed from: a */
    private final C7634b f21032a;

    C7637d(C7634b bVar) {
        this.f21032a = bVar;
    }

    public final void accept(Object obj) {
        C7634b bVar = this.f21032a;
        Long l = (Long) obj;
        if (bVar.f18412j) {
            bVar.mo13995a(((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b());
        }
    }
}
