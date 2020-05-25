package com.bytedance.lobby.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.lobby.C12311a;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.ss.android.ugc.trill.R;
import java.util.UUID;
import okhttp3.C53673t;

public class InstagramAuthActivity extends AppCompatActivity {

    /* renamed from: b */
    public static String f32515b;

    /* renamed from: c */
    public static String f32516c;

    /* renamed from: d */
    public static String f32517d;

    /* renamed from: e */
    public static String f32518e;

    /* renamed from: f */
    private static final boolean f32519f = C12311a.f32450a;

    /* renamed from: h */
    private static String f32520h;

    /* renamed from: a */
    public String f32521a = "";

    /* renamed from: g */
    private WebView f32522g;

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("ig_result_error_info", "Login flow cancelled by pressing back");
        setResult(-1, intent);
        super.onBackPressed();
    }

    /* renamed from: a */
    public final boolean mo23335a(String str) {
        C53673t f = C53673t.m114180f(str);
        Intent intent = new Intent();
        if (f != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(f.f133140a);
                sb.append("://");
                sb.append(f.mo111610a().getHost());
                sb.append(f.mo111610a().getPath());
                if (TextUtils.equals(sb.toString(), f32515b)) {
                    int i = -1;
                    if (!this.f32521a.equals(f.mo111612c("state"))) {
                        intent.putExtra("ig_result_error_info", "State does not match");
                        setResult(-1, intent);
                        finish();
                        return true;
                    }
                    String c = f.mo111612c("error");
                    if (!TextUtils.isEmpty(c)) {
                        String c2 = f.mo111612c("error_description");
                        StringBuilder sb2 = new StringBuilder("error = [ ");
                        sb2.append(c);
                        sb2.append(" ], desc = [ ");
                        sb2.append(c2);
                        sb2.append(" ]");
                        String sb3 = sb2.toString();
                        if (!TextUtils.equals(c2, "The user denied your request.")) {
                            i = 0;
                        }
                        intent.putExtra("ig_result_error_info", sb3);
                        setResult(i, intent);
                        finish();
                        return true;
                    }
                    intent.putExtra("ig_result_code", f.mo111612c("code"));
                    setResult(1, intent);
                    finish();
                    return true;
                }
            } catch (Exception e) {
                StringBuilder sb4 = new StringBuilder("exception: url = [");
                sb4.append(str);
                sb4.append("], message = [");
                sb4.append(e.getMessage());
                sb4.append("], stacktrace = [");
                sb4.append(Log.getStackTraceString(e));
                sb4.append("]");
                intent.putExtra("ig_result_error_info", sb4.toString());
                setResult(0, intent);
                finish();
                return true;
            }
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bw);
        this.f32522g = (WebView) findViewById(R.id.au8);
        Intent intent = getIntent();
        if (intent != null) {
            f32516c = intent.getStringExtra("client_id");
            f32520h = intent.getStringExtra("login_auth_url");
            f32515b = intent.getStringExtra("redirect_url");
            f32517d = intent.getStringExtra("response_type");
            f32518e = intent.getStringExtra("scope");
        }
        try {
            WebSettings settings = this.f32522g.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setDefaultTextEncodingName("utf-8");
            settings.setDomStorageEnabled(true);
        } catch (Exception unused) {
        }
        this.f32522g.setWebViewClient(C13482c.m27232a(new WebViewClient() {

            /* renamed from: b */
            private String f32524b;

            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return C13482c.m27234a(webView, renderProcessGoneDetail);
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (this.f32524b != null && this.f32524b.contains("www.instagram.com/challenge") && TextUtils.equals("https://www.instagram.com/", str)) {
                    C53673t f = C53673t.m114180f("https://www.instagram.com/oauth/authorize");
                    if (f != null) {
                        String tVar = f.mo111624j().mo111629a("client_id", InstagramAuthActivity.f32516c).mo111629a("redirect_uri", InstagramAuthActivity.f32515b).mo111629a("response_type", InstagramAuthActivity.f32517d).mo111629a("state", InstagramAuthActivity.this.f32521a).mo111629a("scope", InstagramAuthActivity.f32518e).mo111632b().toString();
                        this.f32524b = tVar;
                        C18984e.m46161a(tVar);
                        webView.loadUrl(tVar);
                        return false;
                    }
                }
                this.f32524b = str;
                if (InstagramAuthActivity.this.mo23335a(str) || super.shouldOverrideUrlLoading(webView, str)) {
                    return true;
                }
                return false;
            }
        }));
        CookieManager instance = CookieManager.getInstance();
        if (!TextUtils.isEmpty(instance.getCookie("https://.instagram.com"))) {
            instance.setCookie("https://.instagram.com", "sessionid=");
        }
        this.f32521a = UUID.randomUUID().toString();
        C53673t f = C53673t.m114180f(f32520h);
        if (f != null) {
            C53673t b = f.mo111624j().mo111629a("client_id", f32516c).mo111629a("redirect_uri", f32515b).mo111629a("response_type", f32517d).mo111629a("state", this.f32521a).mo111629a("scope", f32518e).mo111632b();
            WebView webView = this.f32522g;
            String tVar = b.toString();
            C18984e.m46161a(tVar);
            webView.loadUrl(tVar);
        }
    }
}
