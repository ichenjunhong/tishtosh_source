package com.bytedance.android.livesdk.gift.honor;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.model.C7514m;

/* renamed from: com.bytedance.android.livesdk.gift.honor.m */
final /* synthetic */ class C7476m implements C0199s {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20489a;

    C7476m(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget) {
        this.f20489a = liveGiftHonorLevelWidget;
    }

    public final void onChanged(Object obj) {
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = this.f20489a;
        C7514m mVar = (C7514m) obj;
        if (liveGiftHonorLevelWidget.f20443g != null) {
            liveGiftHonorLevelWidget.f20443g.post(new C7470g(liveGiftHonorLevelWidget, mVar));
        }
    }
}
