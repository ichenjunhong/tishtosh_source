package com.p683ss.android.ugc.aweme.dfbase;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;

/* renamed from: com.ss.android.ugc.aweme.dfbase.DFInstallBlankActivity */
public class DFInstallBlankActivity extends AmeSSActivity {

    /* renamed from: a */
    private C27562q f72375a;

    /* renamed from: b */
    private boolean f72376b;

    public void onPause() {
        super.onPause();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.dfbase.DFInstallBlankActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        if (this.f72375a != null && this.f72376b) {
            this.f72375a.mo56013e();
        }
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.dfbase.DFInstallBlankActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.dfbase.DFInstallBlankActivity", "onResume", false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        finish();
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.dfbase.DFInstallBlankActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f72375a = C27536b.m66176a().mo55975b(getIntent().getStringExtra("module_name"));
        if (this.f72375a == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.dfbase.DFInstallBlankActivity", "onCreate", false);
            return;
        }
        this.f72376b = getIntent().getBooleanExtra("is_hold_progress_dialog", false);
        if (this.f72376b) {
            this.f72375a.mo56003a((Activity) this);
        }
        if (getIntent().getBooleanExtra("is_hold_permission_dialog", false) && !this.f72375a.mo56007a((AmeSSActivity) this)) {
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.dfbase.DFInstallBlankActivity", "onCreate", false);
    }
}
