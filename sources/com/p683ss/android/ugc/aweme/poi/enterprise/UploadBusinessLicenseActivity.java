package com.p683ss.android.ugc.aweme.poi.enterprise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity */
public final class UploadBusinessLicenseActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    public static final C39064a f99617b = new C39064a(null);

    /* renamed from: com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity$a */
    public static final class C39064a {
        private C39064a() {
        }

        public /* synthetic */ C39064a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m86901a(Activity activity, Bundle bundle) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(bundle, "bundle");
            Intent intent = new Intent(activity, UploadBusinessLicenseActivity.class);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }
}
