package com.p683ss.android.ugc.aweme.effect;

import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.effect.ar */
final /* synthetic */ class C29116ar implements C52671b {

    /* renamed from: a */
    private final C29094ad f76344a;

    C29116ar(C29094ad adVar) {
        this.f76344a = adVar;
    }

    public final Object invoke(Object obj) {
        C29094ad adVar = this.f76344a;
        Float f = (Float) obj;
        EffectPointModel effectPointModel = adVar.f76270F;
        long longValue = f.longValue();
        long A = (long) adVar.f76313t.mo42966A();
        if (C29164a.m68673b(effectPointModel)) {
            A += longValue * 2;
        } else if (C29164a.m68674c(effectPointModel)) {
            A = (A - longValue) + ((long) (((float) longValue) / 0.5f));
        }
        return Long.valueOf(A);
    }
}
