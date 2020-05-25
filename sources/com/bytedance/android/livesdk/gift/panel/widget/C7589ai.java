package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.ai */
final /* synthetic */ class C7589ai implements C0199s {

    /* renamed from: a */
    private final GiftPanelVigoRechargeWidget f20922a;

    C7589ai(GiftPanelVigoRechargeWidget giftPanelVigoRechargeWidget) {
        this.f20922a = giftPanelVigoRechargeWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelVigoRechargeWidget giftPanelVigoRechargeWidget = this.f20922a;
        int i = 0;
        boolean z = ((C7525b) obj) != null;
        ViewGroup viewGroup = giftPanelVigoRechargeWidget.containerView;
        if (z) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }
}
