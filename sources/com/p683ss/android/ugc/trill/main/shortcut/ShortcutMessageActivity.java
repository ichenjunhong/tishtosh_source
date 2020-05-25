package com.p683ss.android.ugc.trill.main.shortcut;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;

/* renamed from: com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity */
public class ShortcutMessageActivity extends MainActivity {
    boolean isFirstOpenFlag = true;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", true);
        super.onResume();
        jumpProxy();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", false);
    }

    private void jumpProxy() {
        if (this.isFirstOpenFlag) {
            this.isFirstOpenFlag = false;
            if (!MTNotificationTabMergeExperiment.m85061a() || !C20902b.m53242a().isLogin()) {
                this.mDataCenter.mo48228a("proformToTab", (Object) "NOTIFICATION");
            } else {
                C33194e.m76279d().openSessionListActivity(this);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", true);
        super.onCreate(bundle);
        C26890h.m65011a("shortcut_click", C23089d.m56640a().mo47829a("type", "message").f61491a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", false);
    }
}
