package com.p683ss.android.ugc.aweme.live;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.C0679r;
import android.view.View;
import com.bytedance.android.livesdkapi.p450h.C8752c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.p753k.C12103a;
import com.bytedance.p753k.p754a.p757c.C12115b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.LiveFeedActivity */
public class LiveFeedActivity extends BaseLiveSdkActivity implements C8752c {

    /* renamed from: a */
    TextTitleBar f92248a;

    /* renamed from: b */
    DmtLoadingLayout f92249b;

    /* renamed from: c */
    private LifecycleLog f92250c;

    /* renamed from: com.ss.android.ugc.aweme.live.LiveFeedActivity$LifecycleLog */
    static final class LifecycleLog implements GenericLifecycleObserver {

        /* renamed from: a */
        long f92253a;

        /* renamed from: b */
        long f92254b;

        LifecycleLog(C0184k kVar) {
            kVar.getLifecycle().mo324a(this);
        }

        /* renamed from: a */
        public final void mo265a(C0184k kVar, C0177a aVar) {
            switch (aVar) {
                case ON_RESUME:
                    this.f92253a = SystemClock.elapsedRealtime();
                    return;
                case ON_PAUSE:
                    this.f92254b = SystemClock.elapsedRealtime();
                    C26890h.m65011a("livesdk_live_feed_stay_time", C23089d.m56640a().mo47829a("enter_from_merge", "live_merge").mo47827a("duration", this.f92254b - this.f92253a).f61491a);
                    return;
                case ON_DESTROY:
                    kVar.getLifecycle().mo325b(this);
                    break;
            }
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C36148r.m81573a().setCustomStatusBarInLayout(this);
    }

    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            C41302w.m91042a().mo83858a((Activity) this, "aweme://main");
        }
    }

    /* renamed from: a */
    public final void mo15413a() {
        this.f92249b.setVisibility(8);
        if (Live.getService() != null && ((Boolean) Live.getService().mo15033a("live_is_load_gift_after_feed_end", Boolean.valueOf(false))).booleanValue()) {
            Live.initGiftResourceOnce();
        }
    }

    /* renamed from: a */
    public final void mo15414a(String str) {
        if (this.f92248a != null) {
            this.f92248a.setTitle((CharSequence) str);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bl5);
        this.f92249b = (DmtLoadingLayout) findViewById(R.id.a6s);
        this.f92249b.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.a04));
        this.f92249b.setVisibility(0);
        this.f92248a = (TextTitleBar) findViewById(R.id.bdo);
        this.f92248a.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                LiveFeedActivity.this.finish();
            }
        });
        C0679r a = getSupportFragmentManager().mo2225a();
        a.mo2175a((int) R.id.ajf, ((C12115b) C12103a.m24530b(C12115b.class)).mo22894a());
        a.mo2189b();
        runOnUiThread(new C36145p(this));
        this.f92250c = new LifecycleLog(this);
        if (Live.getService() != null && !((Boolean) Live.getService().mo15033a("live_is_load_gift_after_feed_end", Boolean.valueOf(false))).booleanValue()) {
            Live.initGiftResourceOnce();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m81192a(Context context, Map<String, String> map) {
        Intent intent = new Intent(context, LiveFeedActivity.class);
        if (map != null) {
            for (String str : map.keySet()) {
                intent.putExtra(str, (String) map.get(str));
            }
        }
        context.startActivity(intent);
    }
}
