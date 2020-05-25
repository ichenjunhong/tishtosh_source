package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26231b;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26237e;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LiveAwesomeSplashPreloadJsonTask */
public final class LiveAwesomeSplashPreloadJsonTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        C26237e.m63579b();
        if (C26237e.f69273b != null && !C26237e.m63581e()) {
            C26231b bVar = C26237e.f69273b;
            boolean z = false;
            if (bVar.f69264a != null) {
                z = bVar.f69264a.getBoolean("live_awesome_splash_preload_json", false);
            }
            if (z) {
                bVar.mo53883a();
            }
        }
    }
}
