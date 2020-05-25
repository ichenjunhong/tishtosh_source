package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity */
public class RecommendUserActivity extends AmeSSActivity {

    /* renamed from: a */
    public String f102572a;

    /* renamed from: b */
    private NormalTitleBar f102573b;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dr);
        Intent intent = getIntent();
        if (intent != null) {
            this.f102572a = intent.getStringExtra("enter_from");
        }
        this.f102573b = (NormalTitleBar) findViewById(R.id.d10);
        this.f102573b.setTitle((int) R.string.d4s);
        this.f102573b.setTitleColor(getResources().getColor(R.color.as0));
        this.f102573b.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: a */
            public final void mo19166a(View view) {
                RecommendUserActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo19167b(View view) {
                C26890h.m65011a("qr_code_scan_enter", C23089d.m56640a().mo47829a("enter_from", RecommendUserActivity.this.f102572a).f61491a);
                QRCodePermissionActivity.m90501a(RecommendUserActivity.this, false);
            }
        });
        C40346dr drVar = new C40346dr();
        drVar.setArguments(getIntent().getExtras());
        C0679r a = getSupportFragmentManager().mo2225a();
        a.mo2192b(R.id.ajf, drVar, "recommend_user_container");
        a.mo2195c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onCreate", false);
    }
}
