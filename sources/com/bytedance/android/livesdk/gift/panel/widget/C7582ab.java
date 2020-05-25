package com.bytedance.android.livesdk.gift.panel.widget;

import com.bytedance.android.livesdk.widget.SendGiftAnimationView.C8480a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.ab */
final /* synthetic */ class C7582ab implements C1710e {

    /* renamed from: a */
    private final GiftPanelListWidget f20915a;

    C7582ab(GiftPanelListWidget giftPanelListWidget) {
        this.f20915a = giftPanelListWidget;
    }

    public final void accept(Object obj) {
        GiftPanelListWidget giftPanelListWidget = this.f20915a;
        C8480a aVar = (C8480a) obj;
        if (giftPanelListWidget.f20852a != null) {
            giftPanelListWidget.f20852a.mo13949b();
            giftPanelListWidget.f20852a.f20761H.postValue(Boolean.valueOf(true));
        }
    }
}
