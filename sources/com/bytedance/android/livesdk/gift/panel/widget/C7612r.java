package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.r */
final /* synthetic */ class C7612r implements OnClickListener {

    /* renamed from: a */
    private final GiftPanelDoodleWidget f20949a;

    C7612r(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f20949a = giftPanelDoodleWidget;
    }

    public final void onClick(View view) {
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f20949a;
        giftPanelDoodleWidget.f20832f.mo13339a();
        if (giftPanelDoodleWidget.f20833g != null) {
            giftPanelDoodleWidget.f20833g.f20786s.postValue(null);
        }
    }
}
