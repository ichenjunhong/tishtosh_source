package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.ae */
final /* synthetic */ class C7585ae implements C0199s {

    /* renamed from: a */
    private final GiftPanelTabWidget f20918a;

    C7585ae(GiftPanelTabWidget giftPanelTabWidget) {
        this.f20918a = giftPanelTabWidget;
    }

    public final void onChanged(Object obj) {
        this.f20918a.f20890a.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }
}
