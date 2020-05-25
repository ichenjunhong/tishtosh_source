package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditBioUrlFragment.C40131a;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity */
public final class ProfileEditBioUrlActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C40130a f102380a = new C40130a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity$a */
    public static final class C40130a {
        private C40130a() {
        }

        public /* synthetic */ C40130a(C52707g gVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public final void setStatusBarColor() {
        C40010c.f101950a.mo82030c(this);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b3p);
        String stringExtra = getIntent().getStringExtra("bio_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ProfileEditBioUrlFragment a = C40131a.m89278a(stringExtra, true, "", 0, true);
        a.setUserVisibleHint(true);
        C0654k supportFragmentManager = getSupportFragmentManager();
        C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
        a.show(supportFragmentManager, "EditBioUrl");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onCreate", false);
    }
}
