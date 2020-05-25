package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.feedback.SubmitFeedbackActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.I18nSubmitFeedbackActivity */
public class I18nSubmitFeedbackActivity extends SubmitFeedbackActivity {
    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.b3q;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSubmitFeedbackActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSubmitFeedbackActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSubmitFeedbackActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSubmitFeedbackActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSubmitFeedbackActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.wo).statusBarDarkFont(true).init();
    }

    /* renamed from: c */
    public final void mo64150c() {
        super.mo64150c();
        this.f62462n.setText(R.string.cc4);
        this.f62461m.setBackgroundResource(R.drawable.dhm);
        this.f62461m.setBackgroundColor(getResources().getColor(R.color.a8w));
    }
}
