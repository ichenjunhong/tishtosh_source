package com.p683ss.android.ugc.aweme.commercialize.splash;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.commercialize.abtest.AwesomeSplashDelWhenBackground;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.f */
final /* synthetic */ class C26223f implements C1710e {

    /* renamed from: a */
    private final C26220e f69255a;

    C26223f(C26220e eVar) {
        this.f69255a = eVar;
    }

    public final void accept(Object obj) {
        C26220e eVar = this.f69255a;
        if (((Boolean) obj).booleanValue() && C10181b.m20511a().mo18172a(AwesomeSplashDelWhenBackground.class, true, "awesome_splash_del_when_background_enabled", 31744, false)) {
            eVar.mo53872b();
        }
    }
}
