package com.p683ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.sdk.p1207a.C19719c;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.BaseActivity;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.main.service.C36679a;
import com.p683ss.android.ugc.aweme.main.service.C36704y;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.BaseThirdPartyWapAuthActivity */
public abstract class BaseThirdPartyWapAuthActivity extends BaseActivity {

    /* renamed from: l */
    WebView f57293l;

    /* renamed from: m */
    ProgressBar f57294m;

    /* renamed from: n */
    Handler f57295n;

    /* renamed from: o */
    Runnable f57296o;

    /* renamed from: p */
    View f57297p;

    /* renamed from: q */
    CheckBox f57298q;

    /* renamed from: r */
    C19719c f57299r;

    /* renamed from: s */
    private TextView f57300s;

    /* renamed from: t */
    private boolean f57301t;

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.BaseThirdPartyWapAuthActivity$a */
    class C21069a extends WebChromeClient {
        C21069a() {
        }

        public final void onProgressChanged(WebView webView, int i) {
            BaseThirdPartyWapAuthActivity baseThirdPartyWapAuthActivity = BaseThirdPartyWapAuthActivity.this;
            baseThirdPartyWapAuthActivity.f57294m.setProgress(i);
            baseThirdPartyWapAuthActivity.f57295n.removeCallbacks(baseThirdPartyWapAuthActivity.f57296o);
            if (baseThirdPartyWapAuthActivity.f57294m.getVisibility() != 0) {
                baseThirdPartyWapAuthActivity.f57294m.startAnimation(AnimationUtils.loadAnimation(baseThirdPartyWapAuthActivity, 17432576));
                baseThirdPartyWapAuthActivity.f57294m.setVisibility(0);
            }
            if (i >= 100) {
                BaseThirdPartyWapAuthActivity.this.mo45125c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo45123a(WebView webView);

    public final int ag_() {
        return R.layout.b0j;
    }

    /* renamed from: c */
    public final void mo45125c() {
        this.f57295n.removeCallbacks(this.f57296o);
        this.f57295n.postDelayed(this.f57296o, 500);
    }

    public void onDestroy() {
        ((C36704y) C23826bi.m58450a(C36704y.class)).mo47868a(this.f57293l);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        ((C36704y) C23826bi.m58450a(C36704y.class)).mo47867a(this, this.f57293l);
    }

    public final void ah_() {
        String str;
        super.ah_();
        this.f57295n = new Handler();
        this.f57296o = new Runnable() {
            public final void run() {
                BaseThirdPartyWapAuthActivity baseThirdPartyWapAuthActivity = BaseThirdPartyWapAuthActivity.this;
                if (baseThirdPartyWapAuthActivity.f57294m.getVisibility() == 0) {
                    baseThirdPartyWapAuthActivity.f57294m.startAnimation(AnimationUtils.loadAnimation(baseThirdPartyWapAuthActivity, 17432577));
                    baseThirdPartyWapAuthActivity.f57294m.setVisibility(8);
                }
            }
        };
        Intent intent = getIntent();
        String dataString = intent.getDataString();
        this.f57301t = intent.getBooleanExtra("KEY_EXTRA_IS_AUTH_ONLY", false);
        if (dataString == null || !dataString.startsWith(WebKitApi.SCHEME_HTTP)) {
            finish();
            return;
        }
        this.f57164h.setText(R.string.dn1);
        try {
            str = Uri.parse(dataString).getQueryParameter("platform");
            if (str != null) {
                try {
                    C19719c a = C19719c.m48215a(str);
                    if (a != null) {
                        this.f57164h.setText(a.f54306o);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            str = null;
        }
        if (str != null) {
            C19719c[] cVarArr = C19719c.f54293b;
            int length = cVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C19719c cVar = cVarArr[i];
                if (cVar.f54304m.equals(str)) {
                    this.f57299r = cVar;
                    break;
                }
                i++;
            }
        }
        this.f57300s = (TextView) findViewById(R.id.crg);
        this.f57297p = findViewById(R.id.crc);
        this.f57298q = (CheckBox) findViewById(R.id.crd);
        this.f57294m = (ProgressBar) findViewById(R.id.crf);
        CookieManager.getInstance().setAcceptCookie(true);
        this.f57293l = (WebView) findViewById(R.id.crh);
        WebSettings settings = this.f57293l.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setSupportMultipleWindows(false);
        settings.setBuiltInZoomControls(true);
        mo45123a(this.f57293l);
        this.f57293l.setWebChromeClient(new C21069a());
        ((C36679a) C23826bi.m58450a(C36679a.class)).mo47862a(dataString, this.f57293l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo45124a(String str) {
        boolean z;
        if (this.f57301t) {
            if (TextUtils.isEmpty(str) || !str.contains("auth/login_success") || !str.contains("code=") || !str.contains("state=")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("code");
                    String queryParameter2 = parse.getQueryParameter("state");
                    Intent intent = new Intent();
                    intent.putExtra("h5_auth_code", queryParameter);
                    intent.putExtra("h5_auth_state", queryParameter2);
                    if (this.f57299r != null) {
                        intent.putExtra("platform", this.f57299r.f54304m);
                    }
                    setResult(-1, intent);
                    finish();
                } catch (Exception unused) {
                    setResult(0);
                    finish();
                }
                return true;
            }
        }
        if (!str.startsWith(C23057c.f61424b)) {
            return false;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("callback", str);
        if (this.f57299r != null) {
            intent2.putExtra("platform", this.f57299r.f54304m);
        }
        setResult(-1, intent2);
        finish();
        return true;
    }
}
