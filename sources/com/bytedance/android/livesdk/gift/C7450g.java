package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.GiftManager.C7190a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.g */
final /* synthetic */ class C7450g implements C1710e {

    /* renamed from: a */
    private final GiftManager f20432a;

    /* renamed from: b */
    private final C7190a f20433b;

    C7450g(GiftManager giftManager, C7190a aVar) {
        this.f20432a = giftManager;
        this.f20433b = aVar;
    }

    public final void accept(Object obj) {
        this.f20432a.lambda$syncXgCoin$2$GiftManager(this.f20433b, (C4177d) obj);
    }
}
