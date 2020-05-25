package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.p388k.C7713e;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.d */
final /* synthetic */ class C7292d implements C1710e {

    /* renamed from: a */
    static final C1710e f19864a = new C7292d();

    private C7292d() {
    }

    public final void accept(Object obj) {
        C7713e eVar = (C7713e) obj;
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
    }
}
