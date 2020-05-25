package com.p683ss.android.ugc.aweme.sticker.panel.p2302a;

import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.a.f */
public final class C46090f implements C46085a {

    /* renamed from: a */
    private final int f116314a;

    /* renamed from: b */
    private final Effect f116315b;

    public C46090f(int i, Effect effect) {
        C52711k.m112240b(effect, "autoUseEffect");
        this.f116314a = i;
        this.f116315b = effect;
    }

    /* renamed from: a */
    public final boolean mo92784a(Effect effect, int i, int i2) {
        C52711k.m112240b(effect, "effect");
        if (i != this.f116314a || (!C52711k.m112239a((Object) effect.getEffectId(), (Object) this.f116315b.getParentId()) && (!C46059g.m100069a(effect) || !C52711k.m112239a((Object) effect.getEffectId(), (Object) this.f116315b.getEffectId())))) {
            return false;
        }
        return true;
    }
}
