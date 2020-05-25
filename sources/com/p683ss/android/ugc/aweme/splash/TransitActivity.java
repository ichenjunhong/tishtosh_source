package com.p683ss.android.ugc.aweme.splash;

import android.os.Bundle;
import android.os.Handler;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.splash.TransitActivity */
public class TransitActivity extends AbsActivity {
    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onPause() {
        super.onPause();
        new Handler().postDelayed(new C45709q(this), 500);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onResume", true);
        super.onResume();
        new Handler().postDelayed(new C45708p(this), 50);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ej);
        ((DmtLoadingLayout) findViewById(R.id.bhy)).setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.mh));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onCreate", false);
    }
}
