package com.p683ss.android.ugc.aweme.effectplatform;

import android.content.Context;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p683ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.c */
public final class C29242c {
    /* renamed from: a */
    public static final C29252f m68868a(Context context) {
        return m68869a(context, null);
    }

    /* renamed from: a */
    public static final C29252f m68869a(Context context, C52671b<? super EffectPlatformBuilder, C52860x> bVar) {
        C52711k.m112240b(context, "context");
        IEffectPlatformFactory createIEffectPlatformFactorybyMonsterPlugin = EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(context);
        if (bVar != null) {
            bVar.invoke(effectPlatformBuilder);
        }
        return createIEffectPlatformFactorybyMonsterPlugin.create(effectPlatformBuilder);
    }
}
