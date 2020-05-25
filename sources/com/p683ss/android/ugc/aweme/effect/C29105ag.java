package com.p683ss.android.ugc.aweme.effect;

import android.text.TextUtils;
import dmt.p2652av.video.C52906ab;
import dmt.p2652av.video.C53026u;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.effect.ag */
final /* synthetic */ class C29105ag implements C0011g {

    /* renamed from: a */
    private final C29094ad f76333a;

    C29105ag(C29094ad adVar) {
        this.f76333a = adVar;
    }

    public final Object then(C0013i iVar) {
        C29094ad adVar = this.f76333a;
        if (!iVar.mo26b() || !((Boolean) iVar.mo34e()).booleanValue()) {
            adVar.f76299f.setValue(Boolean.valueOf(false));
        } else {
            adVar.f76299f.setValue(Boolean.valueOf(true));
            if (adVar.f76270F != null && TextUtils.equals("1", adVar.f76270F.getKey()) && adVar.f76268D) {
                C53026u uVar = (C53026u) adVar.f76296c.getValue();
                if (uVar != null && uVar.f131492f == 0) {
                    C53026u a = C53026u.m112765a((long) adVar.f76313t.mo43073l());
                    a.f131493g = adVar.f76314u.mo58931c();
                    adVar.f76296c.setValue(a);
                }
                adVar.mo58973m();
                C52906ab b = C52906ab.m112593b();
                adVar.f76302i.setOverlayColor(adVar.f76317x);
                adVar.f76298e.setValue(b);
                adVar.mo58972l();
            }
        }
        return null;
    }
}
