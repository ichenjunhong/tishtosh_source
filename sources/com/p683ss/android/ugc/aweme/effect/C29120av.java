package com.p683ss.android.ugc.aweme.effect;

import com.p683ss.android.vesdk.C50711k;
import dmt.p2652av.video.C53026u;

/* renamed from: com.ss.android.ugc.aweme.effect.av */
final /* synthetic */ class C29120av implements C50711k {

    /* renamed from: a */
    private final C29094ad f76348a;

    C29120av(C29094ad adVar) {
        this.f76348a = adVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C29094ad adVar = this.f76348a;
        if (i == 4098) {
            C53026u uVar = (C53026u) adVar.f76296c.getValue();
            if (!adVar.f76268D) {
                return;
            }
            if (uVar == null || uVar.f131492f != 0) {
                adVar.f76300g.post(new C29124az(adVar));
            }
        }
    }
}
