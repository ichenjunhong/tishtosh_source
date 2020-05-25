package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.view.View;
import com.bytedance.android.livesdk.p388k.C7713e;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.topbar.b */
final /* synthetic */ class C7280b implements C1710e {

    /* renamed from: a */
    private final LiveGiftTopWidget f19816a;

    C7280b(LiveGiftTopWidget liveGiftTopWidget) {
        this.f19816a = liveGiftTopWidget;
    }

    public final void accept(Object obj) {
        LiveGiftTopWidget liveGiftTopWidget = this.f19816a;
        C7713e eVar = (C7713e) obj;
        liveGiftTopWidget.f19804f = false;
        if (liveGiftTopWidget.f19802d.getVisibility() == 0) {
            Boolean.valueOf(true);
            liveGiftTopWidget.mo13519a((View) liveGiftTopWidget.f19803e);
        }
    }
}
