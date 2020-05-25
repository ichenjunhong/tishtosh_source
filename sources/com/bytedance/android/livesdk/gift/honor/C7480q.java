package com.bytedance.android.livesdk.gift.honor;

import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdkapi.message.C8853i;

/* renamed from: com.bytedance.android.livesdk.gift.honor.q */
final /* synthetic */ class C7480q implements Runnable {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20494a;

    /* renamed from: b */
    private final C7514m f20495b;

    C7480q(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, C7514m mVar) {
        this.f20494a = liveGiftHonorLevelWidget;
        this.f20495b = mVar;
    }

    public final void run() {
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = this.f20494a;
        C7514m mVar = this.f20495b;
        if (mVar != null && mVar.f20609a != null && mVar.f20609a.f24158d != null) {
            for (C8853i iVar : mVar.f20609a.f24158d) {
                if (!(iVar == null || iVar.f24165d == null || iVar.f24165d.f24174a == null || iVar.f24165d.f24174a.getUserHonor() == null)) {
                    liveGiftHonorLevelWidget.mo13871a(iVar.f24165d.f24174a.getUserHonor(), false);
                }
            }
        }
    }
}
