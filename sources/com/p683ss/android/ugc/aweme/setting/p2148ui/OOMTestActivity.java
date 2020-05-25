package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.liko.p772b.C12269a.C12270a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.OOMTestActivity */
public final class OOMTestActivity extends AppCompatActivity {
    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.OOMTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.OOMTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.OOMTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.OOMTestActivity", "onCreate", true);
        super.onCreate(bundle);
        while (true) {
            new ArrayList().add(new C12270a());
        }
    }
}
