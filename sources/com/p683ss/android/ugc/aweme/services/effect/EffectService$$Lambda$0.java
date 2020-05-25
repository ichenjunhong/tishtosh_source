package com.p683ss.android.ugc.aweme.services.effect;

import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import okhttp3.C53682y;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.services.effect.EffectService$$Lambda$0 */
final /* synthetic */ class EffectService$$Lambda$0 implements C52671b {
    private final String arg$1;
    private final C53682y arg$2;

    EffectService$$Lambda$0(String str, C53682y yVar) {
        this.arg$1 = str;
        this.arg$2 = yVar;
    }

    public final Object invoke(Object obj) {
        return ((EffectPlatformBuilder) obj).setRegion(this.arg$1).setOkHttpClient(this.arg$2);
    }
}
