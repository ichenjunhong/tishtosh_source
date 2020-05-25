package com.p683ss.android.ugc.aweme.live;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8680c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.sdk.p1207a.C19717a;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.live.LiveBroadcastActivity */
public class LiveBroadcastActivity extends BaseLiveSdkActivity {

    /* renamed from: a */
    C8680c f92245a = new C8680c() {
        /* renamed from: a */
        public final void mo15138a(BroadcastReceiver broadcastReceiver) {
            LiveBroadcastActivity.this.unregisterReceiver(broadcastReceiver);
        }

        /* renamed from: a */
        public final void mo15139a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            LiveBroadcastActivity.this.registerReceiver(broadcastReceiver, intentFilter);
        }
    };

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        this.f92245a = null;
        super.onDestroy();
        Live.getService().mo15052e().mo13795b(hashCode());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @C53771m
    public void onEvent(C19717a aVar) {
        if (Live.getService() != null) {
            Live.getService().mo15054g().mo15021b();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", true);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.bl4);
        if (getWindow() != null) {
            getWindow().addFlags(128);
        }
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = getIntent().getExtras();
        }
        Live.getService().mo15052e().mo13794a(hashCode(), this);
        C0679r a = getSupportFragmentManager().mo2225a();
        a.mo2175a((int) R.id.ajf, Live.getService().mo15025a(this.f92245a, bundle2));
        a.mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", false);
    }
}
