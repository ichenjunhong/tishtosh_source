package com.p683ss.android.ugc.aweme.qrcode;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity */
public class TextQRCodeActivity extends AmeSSActivity {

    /* renamed from: a */
    public String f104137a;

    /* renamed from: b */
    private View f104138b;

    /* renamed from: c */
    private TextView f104139c;

    /* renamed from: d */
    private View f104140d;

    /* renamed from: e */
    private View f104141e;

    /* renamed from: f */
    private DmtTextView f104142f;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.eg);
        this.f104141e = findViewById(R.id.ay9);
        this.f104138b = findViewById(R.id.dez);
        this.f104140d = findViewById(R.id.d8q);
        this.f104139c = (TextView) findViewById(R.id.d8j);
        this.f104138b.setVisibility(8);
        this.f104142f = (DmtTextView) findViewById(R.id.dcy);
        Intent intent = getIntent();
        if (intent != null) {
            this.f104137a = intent.getStringExtra("intent_extra_content");
        }
        this.f104139c.setText(this.f104137a);
        String str = this.f104137a;
        if (TextUtils.isEmpty(str) || !str.startsWith("aweme://webview/")) {
            z = false;
        }
        if (z || this.f104137a.contains("snssdk1128")) {
            this.f104142f.setText(getResources().getText(R.string.d_w));
        }
        this.f104140d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                ClipboardManager clipboardManager = (ClipboardManager) TextQRCodeActivity.this.getSystemService("clipboard");
                ClipData newPlainText = ClipData.newPlainText("label", TextQRCodeActivity.this.f104137a);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                C10691a.m21533a((Context) TextQRCodeActivity.this, (int) R.string.aiv).mo19066a();
            }
        });
        this.f104141e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TextQRCodeActivity.this.finish();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", false);
    }
}
