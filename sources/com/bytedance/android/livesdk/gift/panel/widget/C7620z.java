package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.z */
final /* synthetic */ class C7620z implements C0199s {

    /* renamed from: a */
    private final GiftPanelListWidget f20957a;

    C7620z(GiftPanelListWidget giftPanelListWidget) {
        this.f20957a = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelListWidget giftPanelListWidget = this.f20957a;
        switch ((C7595ao) obj) {
            case GIFT:
            case FANS_CLUB_GIFT:
            case HONOR_LEVEL_GIFT:
                if (giftPanelListWidget.f20869r == 0 || giftPanelListWidget.f20869r == -1) {
                    giftPanelListWidget.mo13963a(C7577a.DATA_TYPE_GIFT);
                    return;
                } else if (giftPanelListWidget.f20869r == 1) {
                    giftPanelListWidget.mo13962a(0);
                    return;
                }
                break;
            case PROP:
                if (giftPanelListWidget.f20869r != 0 && giftPanelListWidget.f20869r != -1) {
                    if (giftPanelListWidget.f20869r == 1) {
                        giftPanelListWidget.mo13962a(1);
                        break;
                    }
                } else {
                    giftPanelListWidget.mo13963a(C7577a.DATA_TYPE_PROP);
                    return;
                }
                break;
        }
    }
}
