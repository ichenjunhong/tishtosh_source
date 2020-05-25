package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.login.C27965f;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity */
public final class FullScreenLoginActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C22180a f59847a = new C22180a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity$a */
    public static final class C22180a {
        private C22180a() {
        }

        public /* synthetic */ C22180a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity$b */
    public static final class C22181b implements C23505g {

        /* renamed from: a */
        final /* synthetic */ FullScreenLoginActivity f59848a;

        /* renamed from: a */
        public final void mo46279a() {
            this.f59848a.finish();
            this.f59848a.overridePendingTransition(0, 0);
        }

        C22181b(FullScreenLoginActivity fullScreenLoginActivity) {
            this.f59848a = fullScreenLoginActivity;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
            this.f59848a.finish();
            this.f59848a.overridePendingTransition(0, 0);
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        C27965f.m66721a((Activity) this, getIntent().getStringExtra("enter_from"), getIntent().getStringExtra("enter_method"), (Bundle) null, (C23505g) new C22181b(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onCreate", false);
    }
}
