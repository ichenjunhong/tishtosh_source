package com.p683ss.android.ugc.trill.language;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.trill.language.view.AppLanguageListFragment;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageActivity */
public class ChooseLanguageActivity extends AmeSSActivity {

    /* renamed from: a */
    private ImmersionBar f126209a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f126209a != null) {
            this.f126209a.destroy();
        }
    }

    public void setStatusBarColor() {
        this.f126209a = ImmersionBar.with((Activity) this);
        this.f126209a.statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onCreate", true);
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.yw);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        setContentView((View) frameLayout);
        getSupportFragmentManager().mo2225a().mo2175a((int) R.id.yw, (Fragment) new AppLanguageListFragment()).mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onCreate", false);
    }
}
