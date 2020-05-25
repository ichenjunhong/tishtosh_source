package com.p683ss.android.ugc.aweme.login.p1932ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.login.p1932ui.C36325a.C36326a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity */
public final class LogoutDialogActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C36323a f92953a = new C36323a(null);

    /* renamed from: com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity$a */
    public static final class C36323a {
        private C36323a() {
        }

        public /* synthetic */ C36323a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity$b */
    static final class C36324b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LogoutDialogActivity f92954a;

        C36324b(LogoutDialogActivity logoutDialogActivity) {
            this.f92954a = logoutDialogActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C20854a.m53162b().logout("expired_logout", "sdk_expired_logout");
            dialogInterface.dismiss();
            C36326a.m81962a().mo75220a();
            this.f92954a.finish();
            this.f92954a.overridePendingTransition(0, 0);
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.lo);
        new C10643a(this).mo18892a(getString(R.string.c1t)).mo18902b(getString(R.string.c1s)).mo18893a(getString(R.string.apf), (OnClickListener) new C36324b(this)).mo18897a().mo18882b().setCancelable(false);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", false);
    }
}
