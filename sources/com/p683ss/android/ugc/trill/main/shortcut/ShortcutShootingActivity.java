package com.p683ss.android.ugc.trill.main.shortcut;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;

/* renamed from: com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity */
public class ShortcutShootingActivity extends AmeActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", true);
        super.onCreate(bundle);
        C26890h.m65011a("shortcut_click", C23089d.m56640a().mo47829a("type", "shooting").f61491a);
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new AsyncServiceLoader() {
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startRecord((Context) ShortcutShootingActivity.this, ShortcutShootingActivity.this.getIntent());
                ShortcutShootingActivity.this.finish();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", false);
    }
}
