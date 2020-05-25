package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.gift.model.p379a.C7495f;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.c */
final /* synthetic */ class C7597c implements C0199s {

    /* renamed from: a */
    private final GiftConfigurablePanelTabWidget f20930a;

    C7597c(GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget) {
        this.f20930a = giftConfigurablePanelTabWidget;
    }

    public final void onChanged(Object obj) {
        GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget = this.f20930a;
        C7490a aVar = (C7490a) obj;
        if (!(aVar instanceof C7495f) || !aVar.mo13906c()) {
            if (giftConfigurablePanelTabWidget.f20742i) {
                giftConfigurablePanelTabWidget.f20742i = false;
                giftConfigurablePanelTabWidget.mo13943a(giftConfigurablePanelTabWidget.f20746m, 1);
            }
            return;
        }
        giftConfigurablePanelTabWidget.f20742i = true;
        giftConfigurablePanelTabWidget.f20743j.setVisibility(8);
        giftConfigurablePanelTabWidget.f20745l.setVisibility(8);
        giftConfigurablePanelTabWidget.f20744k.setVisibility(8);
    }
}
