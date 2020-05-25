package com.p683ss.android.ugc.aweme.account.base.p1268a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.account.p1260a.p1261a.C20855a;
import com.p683ss.android.ugc.aweme.account.util.C22277q;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.base.a.a */
public final class C20917a extends Dialog {

    /* renamed from: a */
    public C20919a f56904a;

    /* renamed from: com.ss.android.ugc.aweme.account.base.a.a$a */
    public static class C20919a {

        /* renamed from: a */
        public String f56905a;

        /* renamed from: b */
        public String f56906b;

        /* renamed from: a */
        public final C20919a mo44875a(String str) {
            this.f56905a = str;
            return this;
        }

        /* renamed from: a */
        public final C20917a mo44876a(Context context) {
            C20917a aVar = new C20917a(context);
            aVar.f56904a = this;
            return aVar;
        }
    }

    private C20917a(Context context) {
        super(context, R.style.a3k);
    }

    /* renamed from: a */
    public static Dialog m53262a(Context context) {
        return new C20919a().mo44875a(C22277q.f60046a.mo46374a("terms-of-use")).mo44876a(context);
    }

    /* renamed from: b */
    public static Dialog m53263b(Context context) {
        return new C20919a().mo44875a(C22277q.f60046a.mo46374a("privacy-policy")).mo44876a(context);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        super.onCreate(bundle);
        if (getWindow() != null) {
            Context context = getContext();
            if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
                z = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            } else {
                z = false;
            }
            if (z || C20855a.m53171a() || C20855a.m53172a(context)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            getWindow().requestFeature(1);
        }
        try {
            setContentView(R.layout.b0e);
        } catch (NotFoundException unused) {
        }
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(-1, -1);
        }
        setCancelable(true);
        TextView textView = (TextView) findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f56904a.f56906b)) {
            textView.setText(this.f56904a.f56906b);
        } else {
            textView.setText(R.string.p7);
        }
        findViewById(R.id.ik).setOnClickListener(new C20920b(this));
        WebView webView = (WebView) findViewById(R.id.duj);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(C13482c.m27232a(new WebViewClient()));
        String str = this.f56904a.f56905a;
        C18984e.m46161a(str);
        webView.loadUrl(str);
    }
}
