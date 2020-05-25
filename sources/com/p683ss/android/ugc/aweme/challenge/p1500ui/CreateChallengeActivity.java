package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity */
public class CreateChallengeActivity extends AmeSSActivity {

    /* renamed from: a */
    private CreateChallengeDialogFragment f65110a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bks);
        C0654k supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2224a("create_challenge");
        if (a == null) {
            this.f65110a = new CreateChallengeDialogFragment();
            Bundle bundle2 = new Bundle(1);
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 1);
            this.f65110a.setArguments(bundle2);
            this.f65110a.show(supportFragmentManager, "create_challenge");
        } else if (a != null) {
            this.f65110a = (CreateChallengeDialogFragment) a;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onCreate", false);
    }
}
