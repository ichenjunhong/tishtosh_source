package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity */
public class SessionListActivity extends AmeActivity {

    /* renamed from: a */
    private ImTextTitleBar f89088a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bc0);
        C34004b.m77718b().setupStatusBar(this);
        this.f89088a = (ImTextTitleBar) findViewById(R.id.d10);
        this.f89088a.setOnTitlebarClickListener(new C35356a() {
            /* renamed from: c */
            public final void mo70671c() {
            }

            /* renamed from: a */
            public final void mo70669a() {
                SessionListActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo70670b() {
                SessionListActivity sessionListActivity = SessionListActivity.this;
                IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
                if (provideIMService_Monster != null) {
                    provideIMService_Monster.enterChooseContact(sessionListActivity, null, null);
                }
            }
        });
        IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
        if (provideIMService_Monster != null && bundle == null) {
            getSupportFragmentManager().mo2225a().mo2176a(R.id.agz, provideIMService_Monster.getSessionListFragment().mo72686f(), "SessionListActivity").mo2189b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onCreate", false);
    }
}
