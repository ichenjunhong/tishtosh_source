package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.account.model.AccountOpeModel;

/* renamed from: com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity */
public class UpdatePasswordActivity extends BaseAccountActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).init();
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onCreate", true);
        super.onCreate(bundle);
        mo46248a(new C22248n());
        ((AccountOpeModel) C0214z.m440a((FragmentActivity) this).mo359a(AccountOpeModel.class)).f59551b.observe(this, new C22247m(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onCreate", false);
    }
}
