package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0199s;
import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.effect.ao */
final /* synthetic */ class C29113ao implements C0199s {

    /* renamed from: a */
    private final C29094ad f76341a;

    C29113ao(C29094ad adVar) {
        this.f76341a = adVar;
    }

    public final void onChanged(Object obj) {
        C29094ad adVar = this.f76341a;
        Long l = (Long) obj;
        if (adVar.f76268D && l != null) {
            long a = adVar.f76314u.mo58928a(l.longValue());
            adVar.f76297d.setValue(C53030y.m112773a(a));
            adVar.f76272H.f76421a = a;
            adVar.f76272H.f76422b = l.longValue();
            adVar.mo58942a(l.intValue(), true);
        }
    }
}
