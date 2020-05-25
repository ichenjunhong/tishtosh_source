package com.p683ss.android.ugc.aweme.account.agegate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.account.agegate.p1263a.C20868b;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.OperatorCompleteActivity */
public final class OperatorCompleteActivity extends AmeActivity {
    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.OperatorCompleteActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.OperatorCompleteActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.OperatorCompleteActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.OperatorCompleteActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ay5);
        C0679r a = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a, "supportFragmentManager.beginTransaction()");
        C20868b bVar = new C20868b();
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        bVar.setArguments(intent.getExtras());
        a.mo2175a((int) R.id.ajf, (Fragment) bVar);
        a.mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.OperatorCompleteActivity", "onCreate", false);
    }
}
