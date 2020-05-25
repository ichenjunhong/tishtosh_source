package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.g */
final /* synthetic */ class C7265g implements C0199s {

    /* renamed from: a */
    private final LiveGiftFirstChargeWidget f19756a;

    C7265g(LiveGiftFirstChargeWidget liveGiftFirstChargeWidget) {
        this.f19756a = liveGiftFirstChargeWidget;
    }

    public final void onChanged(Object obj) {
        LiveGiftFirstChargeWidget liveGiftFirstChargeWidget = this.f19756a;
        C7290b bVar = (C7290b) obj;
        if (bVar != null && bVar.f19863m) {
            liveGiftFirstChargeWidget.mo13497a();
        }
    }
}
