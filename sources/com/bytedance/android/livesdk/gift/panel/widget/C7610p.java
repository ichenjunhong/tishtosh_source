package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdkapi.host.C8794c;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.p */
final /* synthetic */ class C7610p implements C0199s {

    /* renamed from: a */
    private final GiftPanelDoodleWidget f20947a;

    C7610p(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f20947a = giftPanelDoodleWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f20947a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (giftPanelDoodleWidget.f20833g != null) {
            C7490a aVar = (C7490a) giftPanelDoodleWidget.f20833g.f20785r.getValue();
            int i = 8;
            if (aVar == null || !aVar.mo13906c() || !((C8794c) C4116c.m10249a(C8794c.class)).mo15493a(aVar.mo13918o())) {
                giftPanelDoodleWidget.f20827a.setVisibility(8);
            } else {
                View view = giftPanelDoodleWidget.f20827a;
                if (!booleanValue) {
                    i = 0;
                }
                view.setVisibility(i);
            }
        }
    }
}
