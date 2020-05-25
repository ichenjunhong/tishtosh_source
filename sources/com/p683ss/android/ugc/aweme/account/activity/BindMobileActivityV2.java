package com.p683ss.android.ugc.aweme.account.activity;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.account.fragment.C20973c;
import com.p683ss.android.ugc.aweme.account.p1307ui.BindMobileActivity;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2 */
public class BindMobileActivityV2 extends BindMobileActivity {
    /* renamed from: a */
    public final int mo44778a() {
        return R.layout.ayb;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final Fragment mo44779b() {
        C47661ab a = C47661ab.m103163a().mo94972a("enter_from", this.f59804k).mo94969a("type", getIntent().getIntExtra("type", 2));
        if (!TextUtils.isEmpty(getIntent().getStringExtra("profile_key"))) {
            a.mo94972a("profile_key", getIntent().getStringExtra("profile_key"));
        }
        C20973c cVar = new C20973c();
        cVar.setArguments(a.f120139a);
        return cVar;
    }
}
