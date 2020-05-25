package com.p683ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import cat.ereza.customactivityoncrash.C2207a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.p766a.C12194h;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.activity.CustomErrorActivity */
public class CustomErrorActivity extends Activity {

    /* renamed from: a */
    TextView f62483a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onCreate", true);
        super.onCreate(bundle);
        C12194h.m24639a(getApplicationContext());
        setContentView(R.layout.au);
        this.f62483a = (TextView) findViewById(R.id.ab8);
        String a = C2207a.m6675a(getIntent());
        String stringExtra = getIntent().getStringExtra("cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS");
        TextView textView = this.f62483a;
        StringBuilder sb = new StringBuilder();
        if (a.contains("android.view.InflateException: You must specifiy a valid layout reference") && a.contains("com.by.inflate_lib.AndInflater")) {
            sb.append("如果是5.x及以下手机装debug 复现此问题，local.properties设置enableX2c=true 复制命令 ./gradlew :app:assembleDouyinCnDebug 试试? 详细@包寅\n\n");
        }
        sb.append(a);
        textView.setText(sb.toString());
        Button button = (Button) findViewById(R.id.cbu);
        Button button2 = (Button) findViewById(R.id.a0j);
        Button button3 = (Button) findViewById(R.id.b5p);
        DmtButton dmtButton = (DmtButton) findViewById(R.id.e3z);
        DmtButton dmtButton2 = (DmtButton) findViewById(R.id.es8);
        Class b = C2207a.m6684b(getIntent());
        String a2 = C23859b.m58575b().mo49460a(C11010c.m22280a(), "local_test_lark_user_email");
        if (b != null) {
            button.setText(R.string.d87);
            button.setOnClickListener(new C23425d(this, b));
        } else {
            button.setOnClickListener(new C23426e(this));
        }
        button2.setOnClickListener(new C23432k(this, a2));
        button3.setOnClickListener(new C23433l(this, a));
        dmtButton.setOnClickListener(new C23434m(this, stringExtra));
        dmtButton2.setOnClickListener(new C23435n(this, stringExtra));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onCreate", false);
    }
}
