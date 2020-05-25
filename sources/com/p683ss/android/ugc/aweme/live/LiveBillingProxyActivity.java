package com.p683ss.android.ugc.aweme.live;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.live.LiveBillingProxyActivity */
public class LiveBillingProxyActivity extends BaseLiveSdkActivity {

    /* renamed from: a */
    private LiveActivityProxy f92243a;

    /* renamed from: b */
    private C8862e f92244b;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f92244b = C8830k.m17330d();
        if (this.f92244b != null) {
            this.f92243a = this.f92244b.mo15026a((FragmentActivity) this, 21);
            getLifecycle().mo324a(this.f92243a);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f92243a.mo10029a(i, i2, intent);
        finish();
    }
}
