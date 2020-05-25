package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.main.service.C36681c;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity */
public class LoginOrRegisterActivity extends BaseLoginOrRegisterActivity {
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo45731d() {
        this.mStatusView.setVisibility(8);
        this.mFragmentContainer.setVisibility(0);
        ((C36681c) C23826bi.m58450a(C36681c.class)).mo47871a("login");
        this.f58360l = new C21615r();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.putString("enter_type", "click_login");
            this.f58360l.setArguments(extras);
        }
        mo45727a(this.f58360l, false);
    }
}
