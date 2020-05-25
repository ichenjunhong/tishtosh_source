package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26220e;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26231b;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26237e;
import com.p683ss.android.ugc.aweme.friends.p1788b.C32564a;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings;

/* renamed from: com.ss.android.ugc.aweme.setting.h */
public final class C41609h extends C41603f {
    /* renamed from: a */
    public final void mo44361a(AwemeSettings awemeSettings) {
        super.mo44361a(awemeSettings);
        C26217c.m63502a();
        boolean z = awemeSettings.awesomeSplashFilterEnable;
        if (C26217c.f69224b != null) {
            C26220e eVar = C26217c.f69224b;
            if (eVar.f69249a != null) {
                eVar.f69249a.edit().putBoolean("awesome_splash_filter_enable", z).apply();
            }
        }
        C32564a a = C32564a.m75339a();
        a.f84793a.edit().putInt("send_sms_strategy", awemeSettings.mInviteFriendsStrategy).apply();
        C26237e.m63579b();
        boolean z2 = awemeSettings.awesomeSplashFilterEnable;
        if (C26237e.f69273b != null) {
            C26231b bVar = C26237e.f69273b;
            if (bVar.f69264a != null) {
                bVar.f69264a.storeBoolean("live_awesome_splash_filter_enable", z2);
            }
        }
    }
}
