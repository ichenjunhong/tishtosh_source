package com.p683ss.android.ugc.aweme.environment;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity */
public class DialogWarningTipsActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.lo);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onCreate", false);
    }
}
