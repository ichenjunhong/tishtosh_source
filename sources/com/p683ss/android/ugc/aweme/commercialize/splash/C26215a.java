package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.a */
final /* synthetic */ class C26215a implements OnClickListener {

    /* renamed from: a */
    private final AwesomeLiveSplashMask f69220a;

    C26215a(AwesomeLiveSplashMask awesomeLiveSplashMask) {
        this.f69220a = awesomeLiveSplashMask;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        AwesomeLiveSplashMask awesomeLiveSplashMask = this.f69220a;
        if (C26235d.m63570a(awesomeLiveSplashMask.f69213a)) {
            C31208r.m72878a(awesomeLiveSplashMask.getContext(), awesomeLiveSplashMask.f69213a);
        }
        C31208r.m72881a(awesomeLiveSplashMask.f69213a, "livesdk_topview_click", "topview");
    }
}
