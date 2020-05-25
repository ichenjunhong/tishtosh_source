package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.TimeUnlockFragment;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23705a;
import com.p683ss.android.ugc.aweme.mobile.p1965a.C37133a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity */
public class TimeUnlockActivity extends BaseLockActivity {

    /* renamed from: b */
    public static String f60942b = "UNLOCK";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo47172a() {
        return R.layout.el;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C22731c.m56020a(this);
    }

    public void onBackPressed() {
        if (C22722h.m55984b() != null) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47174b() {
        findViewById(R.id.ajf).setBackgroundColor(getResources().getColor(R.color.a2j));
        this.f60935a = C37133a.m83365a(TimeUnlockFragment.class).mo76411a();
        this.f60935a.setArguments(getIntent().getExtras());
        C23705a b = C22722h.m55984b();
        if (b != null) {
            b.mo49136a((C0184k) this.f60935a);
        }
        mo47173a(this.f60935a);
    }
}
