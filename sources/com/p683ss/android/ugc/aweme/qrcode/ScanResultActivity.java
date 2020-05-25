package com.p683ss.android.ugc.aweme.qrcode;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.ScanResultActivity */
public class ScanResultActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dy);
        String stringExtra = getIntent().getStringExtra("extra_scan_result");
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.dfa);
        ((TextTitleBar) findViewById(R.id.d10)).setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                ScanResultActivity.this.finish();
            }
        });
        dmtTextView.setText(stringExtra);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onCreate", false);
    }
}
