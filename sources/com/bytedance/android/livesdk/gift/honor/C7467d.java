package com.bytedance.android.livesdk.gift.honor;

import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.C3014m;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.honor.d */
final /* synthetic */ class C7467d implements C1710e {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20474a;

    C7467d(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget) {
        this.f20474a = liveGiftHonorLevelWidget;
    }

    public final void accept(Object obj) {
        C3009i iVar = (C3009i) obj;
        this.f20474a.mo13871a((iVar == null || !(iVar.getUserHonor() instanceof C3014m)) ? null : (C3014m) iVar.getUserHonor(), false);
    }
}
