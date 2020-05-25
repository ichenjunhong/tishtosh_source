package com.bytedance.android.livesdk.gift.honor;

import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;

/* renamed from: com.bytedance.android.livesdk.gift.honor.h */
final /* synthetic */ class C7471h implements Runnable {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20482a;

    /* renamed from: b */
    private final C7525b f20483b;

    C7471h(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, C7525b bVar) {
        this.f20482a = liveGiftHonorLevelWidget;
        this.f20483b = bVar;
    }

    public final void run() {
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = this.f20482a;
        C7525b bVar = this.f20483b;
        if (bVar != null) {
            liveGiftHonorLevelWidget.mo13870a(bVar.f20673d);
        }
    }
}
