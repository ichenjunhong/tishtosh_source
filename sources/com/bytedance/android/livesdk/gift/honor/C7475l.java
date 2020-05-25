package com.bytedance.android.livesdk.gift.honor;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;

/* renamed from: com.bytedance.android.livesdk.gift.honor.l */
final /* synthetic */ class C7475l implements C0199s {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20488a;

    C7475l(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget) {
        this.f20488a = liveGiftHonorLevelWidget;
    }

    public final void onChanged(Object obj) {
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = this.f20488a;
        C7525b bVar = (C7525b) obj;
        if (liveGiftHonorLevelWidget.f20443g != null) {
            liveGiftHonorLevelWidget.f20443g.post(new C7471h(liveGiftHonorLevelWidget, bVar));
        }
    }
}
