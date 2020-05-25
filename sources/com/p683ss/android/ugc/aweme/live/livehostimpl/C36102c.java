package com.p683ss.android.ugc.aweme.live.livehostimpl;

import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.net.C37809s;
import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.c */
final /* synthetic */ class C36102c implements C52671b {

    /* renamed from: a */
    static final C52671b f92487a = new C36102c();

    private C36102c() {
    }

    public final Object invoke(Object obj) {
        EffectPlatformBuilder effectPlatformBuilder = (EffectPlatformBuilder) obj;
        effectPlatformBuilder.setRegion(C35837h.m80980e());
        effectPlatformBuilder.setOkHttpClient(C37809s.m84409a().mo77268b());
        return C52860x.f131107a;
    }
}
