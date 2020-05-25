package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity */
public class AddChallengeActivity extends AmeSSActivity {

    /* renamed from: a */
    private String f65078a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public void finish() {
        super.finish();
        superOverridePendingTransition(R.anim.m, R.anim.r);
    }

    public void onBackPressed() {
        C26894c.m65021a(this, findViewById(R.id.yw));
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bks);
        superOverridePendingTransition(R.anim.q, R.anim.m);
        findViewById(R.id.yw).setBackgroundColor(getResources().getColor(R.color.a2j));
        this.f65078a = getIntent().getStringExtra("from");
        if (this.f65078a == null) {
            this.f65078a = "";
        }
        C0679r a = getSupportFragmentManager().mo2225a();
        String str = this.f65078a;
        Bundle bundle2 = new Bundle();
        bundle2.putString("from", str);
        AddChallengeFragment addChallengeFragment = new AddChallengeFragment();
        addChallengeFragment.setArguments(bundle2);
        addChallengeFragment.setUserVisibleHint(true);
        a.mo2191b(R.id.yw, addChallengeFragment);
        a.mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onCreate", false);
    }
}
