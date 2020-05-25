package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.model.GiftOperation;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.b */
final /* synthetic */ class C7596b implements C0199s {

    /* renamed from: a */
    private final GiftConfigurablePanelTabWidget f20929a;

    C7596b(GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget) {
        this.f20929a = giftConfigurablePanelTabWidget;
    }

    public final void onChanged(Object obj) {
        this.f20929a.mo13943a((GiftOperation) obj, 1);
    }
}
