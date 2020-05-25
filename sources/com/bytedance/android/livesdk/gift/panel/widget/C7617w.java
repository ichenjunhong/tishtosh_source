package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.w */
final /* synthetic */ class C7617w implements C0199s {

    /* renamed from: a */
    private final GiftPanelListWidget f20954a;

    C7617w(GiftPanelListWidget giftPanelListWidget) {
        this.f20954a = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelListWidget giftPanelListWidget = this.f20954a;
        C7595ao aoVar = (C7595ao) obj;
        if (giftPanelListWidget.f20859h != aoVar) {
            giftPanelListWidget.f20859h = aoVar;
            giftPanelListWidget.f20860i = 0;
            giftPanelListWidget.f20861j = 0;
            giftPanelListWidget.f20863l = null;
            if (giftPanelListWidget.f20854c != null) {
                giftPanelListWidget.f20854c.mo13554b();
            }
            if (!giftPanelListWidget.f20857f) {
                giftPanelListWidget.f20853b.mo4814b(0);
            }
            giftPanelListWidget.mo13964a(aoVar);
        }
    }
}
