package com.p683ss.android.ugc.aweme.effect;

import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.main.C36606dx;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.effect.t */
final /* synthetic */ class C29215t implements C0011g {

    /* renamed from: a */
    private final EffectJobService f76522a;

    C29215t(EffectJobService effectJobService) {
        this.f76522a = effectJobService;
    }

    public final Object then(C0013i iVar) {
        EffectJobService effectJobService = this.f76522a;
        C36606dx dxVar = (C36606dx) C23393g.m57474a(effectJobService, C36606dx.class);
        dxVar.mo48521d(false);
        dxVar.mo48514b(System.currentTimeMillis());
        effectJobService.stopSelf();
        return null;
    }
}
