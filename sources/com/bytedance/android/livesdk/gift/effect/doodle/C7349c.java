package com.bytedance.android.livesdk.gift.effect.doodle;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.common.utility.C9414h;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.c */
final /* synthetic */ class C7349c implements OnClickListener {

    /* renamed from: a */
    private final C7330a f20046a;

    C7349c(C7330a aVar) {
        this.f20046a = aVar;
    }

    public final void onClick(View view) {
        C7330a aVar = this.f20046a;
        if (aVar.f20004k.mo13342c()) {
            aVar.f20004k.mo13341b();
            if (C9414h.m18630a(aVar.f20004k.getMoveActions())) {
                aVar.mo13596a((C7525b) null, true);
                return;
            }
            aVar.mo13596a(new C7525b(aVar.f20004k.getMoveActions(), aVar.f20004k.getWidth(), aVar.f20004k.getHeight(), aVar.f20004k.getTotalCostDiamondCount()), false);
        }
    }
}
