package com.p683ss.android.ugc.aweme.live;

import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8677a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity */
public class LiveBgBroadcastActivity extends BaseLiveSdkActivity {

    /* renamed from: a */
    private C8677a f92242a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (this.f92242a != null) {
            this.f92242a.mo8431a();
        }
        super.finish();
    }

    public void onBackPressed() {
        if (!this.f92242a.mo8441b()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Live.getService().mo15052e().mo13795b(hashCode());
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bl4);
        if (getWindow() != null) {
            getWindow().addFlags(128);
        }
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = getIntent().getExtras();
        }
        C0679r a = getSupportFragmentManager().mo2225a();
        Live.getService().mo15052e().mo13794a(hashCode(), this);
        this.f92242a = Live.getService().mo15030a(bundle2);
        a.mo2175a((int) R.id.ajf, (Fragment) this.f92242a);
        a.mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", false);
    }
}
