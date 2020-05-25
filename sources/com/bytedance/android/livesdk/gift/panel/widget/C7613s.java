package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.s */
final /* synthetic */ class C7613s implements OnClickListener {

    /* renamed from: a */
    private final GiftPanelDoodleWidget f20950a;

    C7613s(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f20950a = giftPanelDoodleWidget;
    }

    public final void onClick(View view) {
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f20950a;
        if (giftPanelDoodleWidget.f20833g != null) {
            giftPanelDoodleWidget.f20833g.f20786s.postValue(null);
            giftPanelDoodleWidget.f20833g.f20784q.postValue(Boolean.valueOf(true));
        }
    }
}
