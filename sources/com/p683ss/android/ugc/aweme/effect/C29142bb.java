package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0199s;
import dmt.p2652av.video.C53026u;
import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.effect.bb */
final /* synthetic */ class C29142bb implements C0199s {

    /* renamed from: a */
    private final C29094ad f76387a;

    C29142bb(C29094ad adVar) {
        this.f76387a = adVar;
    }

    public final void onChanged(Object obj) {
        C29094ad adVar = this.f76387a;
        C53030y yVar = (C53030y) obj;
        if (yVar != null) {
            if (yVar.f131507a == 0) {
                adVar.mo58954b();
                C53026u uVar = (C53026u) adVar.f76296c.getValue();
                if (adVar.f76310q.getVisibility() == 0) {
                    adVar.f76279O.post(adVar.f76284T);
                } else if (uVar == null || uVar.f131492f != 0 || C29207l.m68792a(uVar.f131499m)) {
                    adVar.f76265A = new C29101a();
                    adVar.f76300g.post(adVar.f76265A);
                } else {
                    adVar.f76319z = new C29102b(uVar.f131487a[0]);
                    adVar.f76300g.post(adVar.f76319z);
                }
            } else {
                adVar.mo58954b();
            }
        }
    }
}
