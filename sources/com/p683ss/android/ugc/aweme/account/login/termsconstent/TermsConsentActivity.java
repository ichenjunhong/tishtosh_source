package com.p683ss.android.ugc.aweme.account.login.termsconstent;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21290bt;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.termsconstent.TermsConsentActivity */
public final class TermsConsentActivity extends MusAbsActivity {

    /* renamed from: a */
    public static final C21467a f58241a = new C21467a(null);

    /* renamed from: b */
    private AuthResult f58242b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.termsconstent.TermsConsentActivity$a */
    public static final class C21467a {
        private C21467a() {
        }

        public /* synthetic */ C21467a(C52707g gVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.termsconstent.TermsConsentActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.termsconstent.TermsConsentActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.termsconstent.TermsConsentActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.termsconstent.TermsConsentActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.aye);
        C21290bt btVar = new C21290bt();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("key_auth_result");
        if (parcelableExtra != null) {
            this.f58242b = (AuthResult) parcelableExtra;
            Bundle bundle2 = new Bundle();
            String str = "key_auth_result";
            AuthResult authResult = this.f58242b;
            if (authResult == null) {
                C52711k.m112237a("mAuthResult");
            }
            bundle2.putParcelable(str, authResult);
            btVar.setArguments(bundle2);
            getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ezl, (Fragment) btVar).mo2195c();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.termsconstent.TermsConsentActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.lobby.auth.AuthResult");
    }
}
