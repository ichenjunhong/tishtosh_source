package com.p683ss.android.ugc.aweme.forward.view;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.p1382aq.C23215at;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.forward.view.OriginDetailActivity */
public class OriginDetailActivity extends FeedDetailActivity {

    /* renamed from: d */
    protected long f84527d = -1;

    /* renamed from: e */
    C32457c f84528e;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onResume", true);
        super.onResume();
        this.f84527d = System.currentTimeMillis();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onResume", false);
    }

    public void onPause() {
        super.onPause();
        if (isFinishing() && this.f84528e != null) {
            C31842e c = C31843f.m74206a().mo64954c(this.f84528e.f84530q);
            if (c != null) {
                c.f83202c.mo95018b(UnReadVideoExperiment.BROWSE_RECORD_LIST);
            }
        }
        if (this.f84527d > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f84527d;
            if (currentTimeMillis > 0) {
                C23215at atVar = (C23215at) new C23215at().mo48016b("personal_homepage").mo48015a(String.valueOf(currentTimeMillis)).mo48100j(this.f84525b);
                atVar.f61809a = C22858c.f61208d;
                atVar.mo48076e();
            }
            this.f84527d = -1;
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        Aweme aweme = (Aweme) getIntent().getSerializableExtra("forward_item");
        if (aweme == null || aweme.getForwardItem() == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onCreate", false);
            return;
        }
        this.f84524a = getIntent().getStringExtra("refer");
        this.f84525b = getIntent().getStringExtra("tab_name");
        this.f84526c = getIntent().getStringExtra("content_source");
        if (bundle == null) {
            this.f84528e = new C32457c();
            this.f84528e.setArguments(getIntent().getExtras());
            getSupportFragmentManager().mo2225a().mo2176a(R.id.agw, this.f84528e, "OriginDetail").mo2189b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onCreate", false);
    }
}
