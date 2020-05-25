package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.LeakTestActivity */
public final class LeakTestActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final List<Activity> f105703a = new ArrayList();

    /* renamed from: b */
    public static final C41764a f105704b = new C41764a(null);

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.LeakTestActivity$a */
    public static final class C41764a {
        private C41764a() {
        }

        public /* synthetic */ C41764a(C52707g gVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onCreate", true);
        f105703a.add(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.c3);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onCreate", false);
    }
}
