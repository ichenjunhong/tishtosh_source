package com.p683ss.android.ugc.aweme.openauthorize;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.sdk.activity.SSActivity;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity */
public class AwemeAuthorizeLoginActivity extends SSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        Bundle bundle2 = C47661ab.m103163a().mo94973a("only_login", true).f120139a;
        ArrayList stringArrayListExtra = getIntent().getStringArrayListExtra("authorize_hide_platforms");
        if (stringArrayListExtra != null) {
            bundle2.putStringArrayList("authorize_hide_platforms", stringArrayListExtra);
        }
        String stringExtra = getIntent().getStringExtra("auth_from_app");
        if (stringExtra != null) {
            bundle2.putString("auth_from_app", stringExtra);
        }
        C27965f.m66721a((Activity) this, "authorize", "", bundle2, (C23505g) new C23505g() {
            /* renamed from: a */
            public final void mo46279a() {
                AwemeAuthorizeLoginActivity.this.setResult(-1);
                AwemeAuthorizeLoginActivity.this.finish();
            }

            /* renamed from: a */
            public final void mo46280a(Bundle bundle) {
                AwemeAuthorizeLoginActivity.this.setResult(0);
                AwemeAuthorizeLoginActivity.this.finish();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", false);
    }
}
