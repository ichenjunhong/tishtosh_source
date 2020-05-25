package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.o */
final /* synthetic */ class C7609o implements C0199s {

    /* renamed from: a */
    private final GiftPanelDoodleWidget f20946a;

    C7609o(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f20946a = giftPanelDoodleWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f20946a;
        Boolean bool = (Boolean) obj;
        giftPanelDoodleWidget.f20831e.setTextColor(giftPanelDoodleWidget.context.getResources().getColor(R.color.a_j));
    }
}
