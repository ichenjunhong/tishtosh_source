package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.y */
final /* synthetic */ class C7619y implements C0199s {

    /* renamed from: a */
    private final GiftPanelListWidget f20956a;

    C7619y(GiftPanelListWidget giftPanelListWidget) {
        this.f20956a = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelListWidget giftPanelListWidget = this.f20956a;
        boolean z = ((C7525b) obj) != null;
        for (C7491b bVar : giftPanelListWidget.f20864m) {
            bVar.f20515c = z;
        }
        giftPanelListWidget.f20854c.mo13553a(giftPanelListWidget.f20864m);
    }
}
