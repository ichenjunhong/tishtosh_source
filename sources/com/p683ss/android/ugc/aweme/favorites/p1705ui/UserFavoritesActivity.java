package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.utils.C47875fa;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity */
public class UserFavoritesActivity extends AmeSlideSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C47875fa.m103568a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", true);
        super.onCreate(bundle);
        requestDisableOptimizeViewHierarchy();
        setContentView((int) R.layout.bu2);
        C0654k supportFragmentManager = getSupportFragmentManager();
        C0679r a = supportFragmentManager.mo2225a();
        Fragment a2 = supportFragmentManager.mo2224a("user_favorites_fragment_tag");
        if (a2 == null) {
            a2 = new C29744m();
        }
        a2.setUserVisibleHint(true);
        a.mo2192b(R.id.yw, a2, "user_favorites_fragment_tag");
        a.mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", false);
    }
}
