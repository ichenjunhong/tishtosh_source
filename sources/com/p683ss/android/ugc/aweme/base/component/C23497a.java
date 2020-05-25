package com.p683ss.android.ugc.aweme.base.component;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.component.a */
public final class C23497a extends Dialog {

    /* renamed from: a */
    public C23499a f62585a;

    /* renamed from: b */
    private View f62586b;

    /* renamed from: com.ss.android.ugc.aweme.base.component.a$a */
    public static class C23499a {

        /* renamed from: a */
        public String f62588a;
    }

    public C23497a(Context context) {
        super(context, R.style.wc);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        getWindow().addFlags(67108864);
        setContentView(R.layout.ad8);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        ((TextView) findViewById(R.id.title)).setText(R.string.bz);
        View findViewById = findViewById(R.id.ik);
        this.f62586b = findViewById(R.id.csm);
        findViewById.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C23497a.this.hide();
            }
        });
        WebView webView = (WebView) findViewById(R.id.duj);
        String str = this.f62585a.f62588a;
        C18984e.m46161a(str);
        webView.loadUrl(str);
        if (VERSION.SDK_INT >= 19) {
            this.f62586b.getLayoutParams().height = C11065a.m22390a(getContext());
        }
    }
}
