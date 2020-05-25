package com.p683ss.android.ugc.aweme.music.p1978ui.p1980b;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.b.a */
public final class C37528a extends Dialog {

    /* renamed from: a */
    public C37530a f95748a;

    /* renamed from: b */
    private View f95749b;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.b.a$a */
    public static class C37530a {

        /* renamed from: a */
        public String f95751a;

        /* renamed from: b */
        public String f95752b;
    }

    public C37528a(Context context) {
        super(context, R.style.wc);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(67108864);
        getWindow().requestFeature(1);
        try {
            setContentView(R.layout.ad8);
        } catch (NotFoundException unused) {
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        TextView textView = (TextView) findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f95748a.f95752b)) {
            textView.setText(this.f95748a.f95752b);
        } else {
            textView.setText(R.string.p7);
        }
        View findViewById = findViewById(R.id.ik);
        this.f95749b = findViewById(R.id.csm);
        findViewById.setOnClickListener(new C37531b(this));
        WebView webView = (WebView) findViewById(R.id.duj);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(C13482c.m27232a(new WebViewClient() {
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return C13482c.m27234a(webView, renderProcessGoneDetail);
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri parse = Uri.parse(str);
                String lowerCase = parse.getScheme().toLowerCase();
                if (parse == null || !"market".equals(lowerCase)) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.addFlags(268435456);
                webView.getContext().startActivity(intent);
                return true;
            }
        }));
        String str = this.f95748a.f95751a;
        C18984e.m46161a(str);
        webView.loadUrl(str);
        if (VERSION.SDK_INT >= 19) {
            this.f95749b.getLayoutParams().height = C11065a.m22390a(getContext());
        }
    }
}
