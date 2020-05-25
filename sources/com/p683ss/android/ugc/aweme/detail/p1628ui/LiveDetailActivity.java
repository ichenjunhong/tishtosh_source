package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.feed.C30686s;
import com.p683ss.android.ugc.aweme.live.C36173w;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity */
public class LiveDetailActivity extends DetailActivity {
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        C30686s.f80313a = -1;
    }

    static {
        C36173w.m81665a().getLiveInitService().mo74819b();
    }
}
