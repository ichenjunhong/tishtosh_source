package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.gift.model.p379a.C7495f;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.n */
final /* synthetic */ class C7608n implements C0199s {

    /* renamed from: a */
    private final GiftPanelDoodleWidget f20945a;

    C7608n(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f20945a = giftPanelDoodleWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f20945a;
        C7490a aVar = (C7490a) obj;
        if (!(aVar instanceof C7495f) || !aVar.mo13906c()) {
            giftPanelDoodleWidget.f20832f.mo13339a();
            if (giftPanelDoodleWidget.f20833g != null) {
                giftPanelDoodleWidget.f20833g.f20786s.postValue(null);
                giftPanelDoodleWidget.f20827a.setVisibility(8);
            }
            return;
        }
        giftPanelDoodleWidget.f20827a.setVisibility(0);
        C7505d r = ((C7495f) aVar).mo13921r();
        giftPanelDoodleWidget.f20832f.mo13340a(r.f20543d, r.f20545f, r.f20541b);
    }
}
