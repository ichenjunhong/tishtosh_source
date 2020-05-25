package com.p683ss.android.ugc.aweme.forward.view;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity */
public class ForwardDetailActivity extends FeedDetailActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra("forward_id"))) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onCreate", false);
            return;
        }
        this.f84524a = getIntent().getStringExtra("refer");
        if (bundle == null) {
            C32456b bVar = new C32456b();
            bVar.setArguments(getIntent().getExtras());
            getSupportFragmentManager().mo2225a().mo2176a(R.id.agw, bVar, "OriginDetail").mo2189b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onCreate", false);
    }
}
