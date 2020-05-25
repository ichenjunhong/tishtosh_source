package com.bytedance.android.livesdk.gift.honor;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.gift.honor.k */
final /* synthetic */ class C7474k implements C0199s {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20487a;

    C7474k(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget) {
        this.f20487a = liveGiftHonorLevelWidget;
    }

    public final void onChanged(Object obj) {
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = this.f20487a;
        Integer num = (Integer) obj;
        if (liveGiftHonorLevelWidget.f20441e.f20786s.getValue() != null || num.intValue() <= 0) {
            if (liveGiftHonorLevelWidget.f20443g != null) {
                liveGiftHonorLevelWidget.f20443g.post(new C7473j(liveGiftHonorLevelWidget));
            }
        } else if (liveGiftHonorLevelWidget.f20443g != null) {
            liveGiftHonorLevelWidget.f20443g.post(new C7472i(liveGiftHonorLevelWidget, num));
        }
    }
}
