package com.p683ss.android.ugc.aweme.services.effect;

import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import okhttp3.C53682y;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.services.effect.EffectService$$Lambda$1 */
final /* synthetic */ class EffectService$$Lambda$1 implements C52671b {
    private final EffectService arg$1;
    private final String arg$2;
    private final C53682y arg$3;

    EffectService$$Lambda$1(EffectService effectService, String str, C53682y yVar) {
        this.arg$1 = effectService;
        this.arg$2 = str;
        this.arg$3 = yVar;
    }

    public final Object invoke(Object obj) {
        return this.arg$1.lambda$createMvEffectPlatform$1$EffectService(this.arg$2, this.arg$3, (EffectPlatformBuilder) obj);
    }
}
