package com.bytedance.android.livesdk.gift.effect.doodle;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.f */
final /* synthetic */ class C7354f implements C1710e {

    /* renamed from: a */
    private final C7330a f20062a;

    C7354f(C7330a aVar) {
        this.f20062a = aVar;
    }

    public final void accept(Object obj) {
        Long l = (Long) obj;
        this.f20062a.mo13595a(((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b());
    }
}
