package com.bytedance.android.livesdk.gift.panel.widget;

import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.p356d.C7230b;
import com.bytedance.android.livesdk.gift.p357e.C7305a.C7308b;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.ac */
final /* synthetic */ class C7583ac implements C7308b {

    /* renamed from: a */
    private final GiftPanelListWidget f20916a;

    C7583ac(GiftPanelListWidget giftPanelListWidget) {
        this.f20916a = giftPanelListWidget;
    }

    /* renamed from: a */
    public final void mo13556a(C7491b bVar, boolean z) {
        GiftPanelListWidget giftPanelListWidget = this.f20916a;
        if (bVar != null && bVar.f20514b != z) {
            bVar.f20514b = z;
            C1352v a = giftPanelListWidget.mo13961a(bVar);
            if (a instanceof C7230b) {
                ((C7230b) a).mo13465a(z);
            } else {
                giftPanelListWidget.f20854c.notifyDataSetChanged();
            }
            ((Boolean) LiveSettingKeys.XT_DOODLE_GIFT_ENABLE.mo9431a()).booleanValue();
        }
    }
}
