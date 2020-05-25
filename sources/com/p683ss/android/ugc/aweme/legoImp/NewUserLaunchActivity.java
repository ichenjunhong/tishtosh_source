package com.p683ss.android.ugc.aweme.legoImp;

import android.os.SystemClock;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.NewUserLaunchActivity */
public class NewUserLaunchActivity extends AmeActivity {
    public void onPause() {
        super.onPause();
        C22574a f = C22574a.m55738f();
        String str = "feed_total";
        long uptimeMillis = SystemClock.uptimeMillis();
        f.f60700a.put(str, Long.valueOf(uptimeMillis));
        f.f60701b.put(str, Long.valueOf(uptimeMillis));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C22574a.m55738f().mo46914a();
        C22574a.m55738f().mo46919b();
        C22574a.m55738f().f60705f = true;
        if (z && !C22574a.m55738f().mo46922b("app_start_to_main_focus")) {
            C22574a.m55738f().mo46921b("app_start_to_main_focus", true);
        }
    }
}
