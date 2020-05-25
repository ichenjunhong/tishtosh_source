package com.p683ss.android.ugc.aweme.infoSticker;

import com.google.p1057b.p1058a.C17410f;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.e */
public final class C35605e implements C17410f<ProviderEffect, Effect> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33734a(Object obj) {
        return m80407a((ProviderEffect) obj);
    }

    /* renamed from: a */
    public static Effect m80407a(ProviderEffect providerEffect) {
        Effect effect = new Effect();
        effect.setEffectId(providerEffect.getId());
        effect.setName(providerEffect.getTitle());
        effect.setUnzipPath(providerEffect.getPath());
        effect.setEffectType(10);
        return effect;
    }
}
