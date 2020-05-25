package com.p683ss.android.ttplatformsdk.view;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.example.p906a.C13482c;
import com.p683ss.android.ttplatformsdk.p1223b.C20057a;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ttplatformsdk.view.TtBaseAuthorizeActivity */
public abstract class TtBaseAuthorizeActivity extends Activity {

    /* renamed from: a */
    public WebView f55139a;

    /* renamed from: b */
    ProgressBar f55140b;

    /* renamed from: c */
    public int f55141c;

    /* renamed from: d */
    protected long f55142d;

    /* renamed from: e */
    private View f55143e;

    /* renamed from: f */
    private TextView f55144f;

    /* renamed from: g */
    private TextView f55145g;

    /* renamed from: h */
    private boolean f55146h;

    /* renamed from: i */
    private boolean f55147i;

    /* renamed from: j */
    private int f55148j;

    /* renamed from: k */
    private int f55149k;

    /* renamed from: com.ss.android.ttplatformsdk.view.TtBaseAuthorizeActivity$a */
    public final class C20065a extends WebChromeClient {
        public C20065a() {
        }

        public final void onProgressChanged(WebView webView, int i) {
            TtBaseAuthorizeActivity ttBaseAuthorizeActivity = TtBaseAuthorizeActivity.this;
            if (ttBaseAuthorizeActivity.f55140b != null) {
                ttBaseAuthorizeActivity.f55140b.setProgress(i);
                ttBaseAuthorizeActivity.f55140b.setVisibility(0);
            }
            if (i >= 100) {
                TtBaseAuthorizeActivity.this.mo42126e();
            }
        }
    }

    /* renamed from: com.ss.android.ttplatformsdk.view.TtBaseAuthorizeActivity$b */
    public final class C20066b extends WebViewClient {
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C13482c.m27234a(webView, renderProcessGoneDetail);
        }

        public C20066b() {
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TtBaseAuthorizeActivity.this.f55141c = 2;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean a = TtBaseAuthorizeActivity.this.mo42120a(str);
            if (!TtBaseAuthorizeActivity.this.mo42124c()) {
                TtBaseAuthorizeActivity.this.mo42127f();
            } else if (TtBaseAuthorizeActivity.this.mo42122b(str) || a) {
                return true;
            } else {
                WebView webView2 = TtBaseAuthorizeActivity.this.f55139a;
                C18984e.m46161a(str);
                webView2.loadUrl(str);
            }
            return true;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            TtBaseAuthorizeActivity.this.f55141c = 1;
        }
    }

    /* renamed from: a */
    public abstract C20057a mo42118a();

    /* renamed from: a */
    public abstract void mo42119a(int i, String str);

    /* renamed from: b */
    public abstract boolean mo42121b();

    /* renamed from: c */
    public abstract void mo42123c(String str);

    /* renamed from: c */
    public abstract boolean mo42124c();

    /* renamed from: d */
    public abstract void mo42125d();

    public void onBackPressed() {
        m49552a("", -10001);
        finish();
    }

    /* renamed from: e */
    public final void mo42126e() {
        if (this.f55140b != null && this.f55140b.getVisibility() == 0) {
            this.f55140b.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo42127f() {
        if (!this.f55147i) {
            this.f55147i = true;
            mo42126e();
            View inflate = LayoutInflater.from(this).inflate(R.layout.abk, null, false);
            inflate.findViewById(R.id.d8c).setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    TtBaseAuthorizeActivity.this.finish();
                }
            });
            new Builder(this).setCancelable(false).setView(inflate).create().show();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        String str;
        String str2;
        super.onResume();
        if (!mo42121b()) {
            if (!this.f55146h) {
                onBackPressed();
            }
            this.f55146h = false;
            return;
        }
        setContentView(R.layout.ad);
        this.f55143e = findViewById(R.id.b_e);
        this.f55144f = (TextView) findViewById(R.id.dhc);
        this.f55145g = (TextView) findViewById(R.id.dhd);
        this.f55139a = (WebView) findViewById(R.id.dul);
        this.f55140b = (ProgressBar) findViewById(R.id.c66);
        C20057a a = mo42118a();
        if (a != null) {
            if (!TextUtils.isEmpty(a.f55127e)) {
                this.f55143e.setBackgroundColor(Color.parseColor(a.f55127e));
            }
            if (!TextUtils.isEmpty(a.f55123a)) {
                this.f55144f.setText(a.f55123a);
            }
            if (!TextUtils.isEmpty(a.f55125c)) {
                this.f55144f.setTextColor(Color.parseColor(a.f55125c));
            }
            if (!TextUtils.isEmpty(a.f55124b)) {
                this.f55145g.setText(a.f55124b);
            }
            if (!TextUtils.isEmpty(a.f55126d)) {
                this.f55145g.setTextColor(Color.parseColor(a.f55126d));
            }
            this.f55139a.getSettings().setJavaScriptEnabled(true);
            this.f55139a.setWebViewClient(C13482c.m27232a(new C20066b()));
            this.f55139a.setWebChromeClient(new C20065a());
            this.f55144f.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    TtBaseAuthorizeActivity.this.onBackPressed();
                }
            });
            C20057a a2 = mo42118a();
            if (a2 != null) {
                this.f55148j = a2.f55132j;
                this.f55149k = a2.f55133k;
                CookieManager instance = CookieManager.getInstance();
                StringBuilder sb = new StringBuilder("bytedance_oauth_session_id=");
                sb.append(a2.f55128f);
                instance.setCookie("https://open.snssdk.com/", sb.toString());
                StringBuilder sb2 = new StringBuilder("bytedance_oauth_user_name=");
                sb2.append(a2.f55130h);
                instance.setCookie("https://open.snssdk.com/", sb2.toString());
                StringBuilder sb3 = new StringBuilder("bytedance_oauth_user_avatar=");
                sb3.append(a2.f55131i);
                instance.setCookie("https://open.snssdk.com/", sb3.toString());
                StringBuilder sb4 = new StringBuilder("bytedance_oauth_user_id=");
                sb4.append(a2.f55129g);
                instance.setCookie("https://open.snssdk.com/", sb4.toString());
                if (getIntent() != null) {
                    str = getIntent().getStringExtra("_tt_params_client_key");
                } else {
                    str = "";
                }
                if (getIntent() != null) {
                    str2 = getIntent().getStringExtra("_tt_params_state");
                } else {
                    str2 = "";
                }
                StringBuilder sb5 = new StringBuilder("https://open.snssdk.com/auth/auth_page/");
                sb5.append("?response_type=code");
                sb5.append("&client_key=");
                sb5.append(str);
                sb5.append("&auth_only=1");
                sb5.append("&from_sdk=1");
                sb5.append("&state=");
                sb5.append(str2);
                sb5.append("&redirect_uri=https://api.snssdk.com");
                if (!mo42124c()) {
                    mo42127f();
                    return;
                }
                WebView webView = this.f55139a;
                String sb6 = sb5.toString();
                C18984e.m46161a(sb6);
                webView.loadUrl(sb6);
                return;
            }
            throw new IllegalArgumentException("init view fail, configuration is null");
        }
        throw new IllegalArgumentException("init view fail, configuration is null");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_start_login", false);
    }

    /* renamed from: a */
    private String m49551a(int i) {
        if (i != 0) {
            if (i == 9) {
                return getString(R.string.azg);
            }
            if (i != 999) {
                return getString(R.string.azf);
            }
        }
        return "";
    }

    /* renamed from: a */
    public final boolean mo42120a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (scheme.equals("bdauth-jsbridge")) {
                if (TextUtils.equals("login", host)) {
                    return true;
                }
                if (TextUtils.equals("login_fail", host)) {
                    mo42123c(parse.getQueryParameter("error_msg"));
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo42122b(String str) {
        int i;
        if (TextUtils.isEmpty(str) || !str.startsWith("https://api.snssdk.com")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("code");
        if (TextUtils.isEmpty(queryParameter)) {
            try {
                i = Integer.parseInt(parse.getQueryParameter("errorCode"));
            } catch (Exception unused) {
                i = 999;
            }
            mo42119a(i, m49551a(i));
            return false;
        }
        m49552a(queryParameter, 0);
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f55142d = System.currentTimeMillis();
        if (bundle != null) {
            this.f55146h = bundle.getBoolean("key_is_start_login");
            return;
        }
        if (!mo42121b()) {
            this.f55146h = true;
            mo42125d();
        }
    }

    /* renamed from: a */
    private void m49552a(String str, int i) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putString("_tt_params_token", str);
        bundle.putInt("_tt_params_error_code", i);
        bundle.putString("_tt_params_error_msg", m49551a(i));
        bundle.putInt("_tt_params_version_code", this.f55148j);
        bundle.putInt("_tt_params_update_version_code", this.f55149k);
        if (getIntent() != null) {
            str2 = getIntent().getStringExtra("_tt_params_package_name");
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            Intent intent = new Intent();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".ttopenapi.TtEntryActivity");
            intent.setComponent(new ComponentName(str2, sb.toString()));
            intent.putExtras(bundle);
            intent.putExtra("start_only_for_android", true);
            startActivity(intent);
        }
    }
}
