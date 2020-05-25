package com.bytedance.android.livesdk.gift.panel.widget;

import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.l */
final /* synthetic */ class C7606l implements C1710e {

    /* renamed from: a */
    private final GiftPanelChargeRewardWidget f20943a;

    C7606l(GiftPanelChargeRewardWidget giftPanelChargeRewardWidget) {
        this.f20943a = giftPanelChargeRewardWidget;
    }

    public final void accept(Object obj) {
        GiftPanelChargeRewardWidget giftPanelChargeRewardWidget = this.f20943a;
        C3009i iVar = (C3009i) obj;
        if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c() && iVar != null) {
            int i = (iVar.getPayScores() > 0 ? 1 : (iVar.getPayScores() == 0 ? 0 : -1));
        }
    }
}
