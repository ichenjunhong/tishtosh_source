package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.common.utility.C9414h;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.q */
final /* synthetic */ class C7611q implements OnClickListener {

    /* renamed from: a */
    private final GiftPanelDoodleWidget f20948a;

    C7611q(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f20948a = giftPanelDoodleWidget;
    }

    public final void onClick(View view) {
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f20948a;
        if (giftPanelDoodleWidget.f20832f.mo13342c()) {
            giftPanelDoodleWidget.f20832f.mo13341b();
            if (giftPanelDoodleWidget.f20833g != null) {
                if (C9414h.m18630a(giftPanelDoodleWidget.f20832f.getMoveActions())) {
                    giftPanelDoodleWidget.f20833g.f20786s.postValue(null);
                } else {
                    giftPanelDoodleWidget.f20833g.f20786s.postValue(new C7525b(giftPanelDoodleWidget.f20832f.getMoveActions(), giftPanelDoodleWidget.f20832f.getWidth(), giftPanelDoodleWidget.f20832f.getHeight(), giftPanelDoodleWidget.f20832f.getTotalCostDiamondCount()));
                }
            }
        }
    }
}
