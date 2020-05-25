package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26220e;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AwesomeSplashPreloadJsonTask */
public final class AwesomeSplashPreloadJsonTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        C26217c.m63502a();
        if (C26217c.f69224b != null && !C26217c.m63505e()) {
            C26220e eVar = C26217c.f69224b;
            boolean z = false;
            if (eVar.f69249a != null) {
                z = eVar.f69249a.getBoolean("awesome_splash_preload_json", false);
            }
            if (z) {
                eVar.mo53870a();
            }
        }
    }
}
