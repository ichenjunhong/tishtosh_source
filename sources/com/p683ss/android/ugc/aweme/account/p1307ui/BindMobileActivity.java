package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.account.login.sms.C21464e;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BindMobileActivity */
public class BindMobileActivity extends BaseBindMobileActivity {

    /* renamed from: q */
    C21464e f59810q;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        if (this.f59810q != null) {
            this.f59810q.mo45649c();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onCreate", true);
        this.f59810q = new C21464e(this);
        this.f59810q.mo45648b();
        this.f59810q.mo45647a();
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onCreate", false);
    }
}
