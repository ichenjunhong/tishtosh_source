package com.p683ss.android.ugc.trill.main.shortcut;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.MainActivity;

/* renamed from: com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity */
public class ShortcutTrendingActivity extends MainActivity {
    boolean isFirstOpenFlag = true;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void jumpProxy() {
        if (this.isFirstOpenFlag) {
            this.isFirstOpenFlag = false;
            this.mDataCenter.mo48228a("proformToTab", (Object) "DISCOVER");
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onResume", true);
        super.onResume();
        jumpProxy();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onCreate", true);
        super.onCreate(bundle);
        C26890h.m65011a("shortcut_click", C23089d.m56640a().mo47829a("type", "trending").f61491a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onCreate", false);
    }
}
