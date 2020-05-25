package com.p683ss.android.ugc.aweme.live;

import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.live.LiveSettingActivity */
public class LiveSettingActivity extends BaseLiveSdkActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bl8);
        C0679r a = getSupportFragmentManager().mo2225a();
        a.mo2175a((int) R.id.ajf, Live.getService().mo15053f());
        a.mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onCreate", false);
    }
}
