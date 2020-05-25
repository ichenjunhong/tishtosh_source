package com.bytedance.android.livesdk.gift.panel;

import android.app.Activity;
import com.bytedance.android.livesdk.gift.panel.widget.GiftConfigurablePanelTabWidget;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7565d;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelTabWidget;
import com.bytedance.ies.sdk.widgets.Widget;

/* renamed from: com.bytedance.android.livesdk.gift.panel.ah */
final class C7534ah {
    /* renamed from: a */
    static Widget m15538a(C7565d dVar, int i, Activity activity) {
        if (dVar == C7565d.GUEST) {
            return null;
        }
        switch (i) {
            case 0:
                return new GiftPanelTabWidget();
            case 1:
                return new GiftConfigurablePanelTabWidget(activity);
            default:
                return null;
        }
    }
}
