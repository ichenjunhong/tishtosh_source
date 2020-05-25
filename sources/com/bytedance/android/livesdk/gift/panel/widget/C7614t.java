package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.t */
final /* synthetic */ class C7614t implements C0199s {

    /* renamed from: a */
    private final GiftPanelGuestInfoWidget f20951a;

    C7614t(GiftPanelGuestInfoWidget giftPanelGuestInfoWidget) {
        this.f20951a = giftPanelGuestInfoWidget;
    }

    public final void onChanged(Object obj) {
        C7490a aVar = (C7490a) obj;
        this.f20951a.mo13959a(aVar == null || !aVar.mo13906c());
    }
}
