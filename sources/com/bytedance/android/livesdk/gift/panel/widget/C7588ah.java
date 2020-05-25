package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.GiftManager;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.ah */
final /* synthetic */ class C7588ah implements C0199s {

    /* renamed from: a */
    private final GiftPanelTabWidget f20921a;

    C7588ah(GiftPanelTabWidget giftPanelTabWidget) {
        this.f20921a = giftPanelTabWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelTabWidget giftPanelTabWidget = this.f20921a;
        long longValue = ((Long) obj).longValue();
        giftPanelTabWidget.f20891b.setVisibility(GiftManager.inst().findGiftById(longValue) != null ? 0 : 8);
        giftPanelTabWidget.f20892c = longValue;
    }
}
