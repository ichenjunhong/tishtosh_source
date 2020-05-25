package com.bytedance.android.livesdk.gift.honor;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;

/* renamed from: com.bytedance.android.livesdk.gift.honor.b */
final /* synthetic */ class C7465b implements C0199s {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20472a;

    C7465b(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget) {
        this.f20472a = liveGiftHonorLevelWidget;
    }

    public final void onChanged(Object obj) {
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = this.f20472a;
        C7290b bVar = (C7290b) obj;
        if (bVar != null) {
            switch (bVar.f19851a) {
                case 1:
                    liveGiftHonorLevelWidget.mo13872a((C7491b) null);
                    break;
                case 2:
                    liveGiftHonorLevelWidget.mo13872a(bVar.f19852b);
                    break;
            }
            C7514m mVar = bVar.f19862l;
            if (liveGiftHonorLevelWidget.f20443g != null) {
                liveGiftHonorLevelWidget.f20443g.post(new C7480q(liveGiftHonorLevelWidget, mVar));
            }
        }
    }
}
