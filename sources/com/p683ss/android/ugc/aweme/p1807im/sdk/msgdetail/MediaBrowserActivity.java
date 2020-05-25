package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.BaseContainerActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.C34707b.C34709b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity */
public final class MediaBrowserActivity extends BaseContainerActivity {

    /* renamed from: a */
    public static final C34692a f89369a = new C34692a(null);

    /* renamed from: b */
    private C34693a f89370b;

    /* renamed from: c */
    private C34707b f89371c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity$a */
    public static final class C34692a {
        private C34692a() {
        }

        public /* synthetic */ C34692a(C52707g gVar) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public final void onBackPressed() {
        C34693a aVar = this.f89370b;
        if (aVar == null) {
            C52711k.m112237a("fragment");
        }
        aVar.mo72758k();
    }

    public final void onDestroy() {
        super.onDestroy();
        C34709b bVar = C34707b.f89404f;
        C34709b.m78702a(null);
    }

    /* renamed from: a */
    public final void mo71919a() {
        Bundle bundle;
        C34707b bVar = new C34707b();
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getBundleExtra("MediaBrowserParam");
        } else {
            bundle = null;
        }
        this.f89371c = bVar.mo72763b(bundle);
    }

    /* renamed from: b */
    public final Fragment mo71920b() {
        this.f89370b = new C34693a();
        C34693a aVar = this.f89370b;
        if (aVar == null) {
            C52711k.m112237a("fragment");
        }
        C34707b bVar = this.f89371c;
        if (bVar == null) {
            C52711k.m112237a("param");
        }
        aVar.setArguments(bVar.mo72762a(new Bundle()));
        C34693a aVar2 = this.f89370b;
        if (aVar2 == null) {
            C52711k.m112237a("fragment");
        }
        return aVar2;
    }
}
