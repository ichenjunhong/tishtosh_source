package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.combo.DouyinGiftCombHelper;
import com.bytedance.android.livesdk.gift.p356d.C7232c;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.v */
final /* synthetic */ class C7616v implements C0199s {

    /* renamed from: a */
    private final GiftPanelListWidget f20953a;

    C7616v(GiftPanelListWidget giftPanelListWidget) {
        this.f20953a = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelListWidget giftPanelListWidget = this.f20953a;
        if (((Boolean) obj).booleanValue()) {
            C1352v a = giftPanelListWidget.mo13961a(giftPanelListWidget.f20863l);
            if (((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo9431a()).intValue() == 1 && a != null) {
                if (giftPanelListWidget.f20855d == null) {
                    giftPanelListWidget.f20855d = new DouyinGiftCombHelper();
                }
                giftPanelListWidget.f20855d.handleComboClick((C7232c) a);
                if (giftPanelListWidget.f20856e.hasMessages(1100)) {
                    giftPanelListWidget.f20856e.removeMessages(1100);
                }
                giftPanelListWidget.f20856e.sendEmptyMessageDelayed(1100, ((long) giftPanelListWidget.f20862k) * 1000);
            }
        }
    }
}
