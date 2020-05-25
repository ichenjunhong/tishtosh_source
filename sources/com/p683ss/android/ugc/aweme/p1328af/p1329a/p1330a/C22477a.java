package com.p683ss.android.ugc.aweme.p1328af.p1329a.p1330a;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22525o;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22526p;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b.C22495a;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.af.a.a.a */
public final class C22477a implements ValueCallback<String> {

    /* renamed from: a */
    static final String f60540a = "javascript:var result = {};var timing = window.performance && window.performance.timing;result.dom_ready = timing.domComplete - timing.domInteractive;";

    /* renamed from: q */
    private static long f60541q;

    /* renamed from: b */
    public C22480b f60542b = new C22480b();

    /* renamed from: c */
    public WeakReference<WebView> f60543c;

    /* renamed from: d */
    WebView f60544d;

    /* renamed from: e */
    public int f60545e;

    /* renamed from: f */
    public int f60546f;

    /* renamed from: g */
    public final Handler f60547g = new Handler();

    /* renamed from: h */
    private boolean f60548h;

    /* renamed from: i */
    private List<String> f60549i;

    /* renamed from: j */
    private C22525o f60550j;

    /* renamed from: k */
    private boolean f60551k;

    /* renamed from: l */
    private String f60552l;

    /* renamed from: m */
    private String f60553m;

    /* renamed from: n */
    private long f60554n;

    /* renamed from: o */
    private long f60555o;

    /* renamed from: p */
    private final Runnable f60556p = new Runnable() {
        public final void run() {
            WebView webView;
            if (C22477a.this.f60543c != null) {
                webView = (WebView) C22477a.this.f60543c.get();
            } else {
                webView = null;
            }
            if (webView != null) {
                if (C22477a.this.f60542b.f60570j == 100) {
                    C22477a.this.mo46792a(true);
                } else if (C22477a.this.f60542b.f60570j > C22477a.this.f60545e) {
                    C22477a.this.f60545e = C22477a.this.f60542b.f60570j;
                    C22477a.this.f60546f = 0;
                    C22477a.this.f60547g.postDelayed(this, 1000);
                } else {
                    C22477a.this.f60546f++;
                    if (C22477a.this.f60546f < 3) {
                        C22477a.this.f60547g.postDelayed(this, 1000);
                        return;
                    }
                    C22477a aVar = C22477a.this;
                    if (VERSION.SDK_INT >= 19 && aVar.f60544d != null) {
                        try {
                            aVar.f60544d.evaluateJavascript(C22477a.f60540a, null);
                            aVar.f60544d.evaluateJavascript("javascript:result", new ValueCallback<String>() {
                                public final /* synthetic */ void onReceiveValue(Object obj) {
                                    try {
                                        if (new JSONObject((String) obj).getLong("dom_ready") <= 0) {
                                            C22477a.this.f60542b.f60585y = -4;
                                            C22477a.this.f60542b.f60576p = true;
                                        }
                                        C22477a.this.mo46792a(true);
                                    } catch (JSONException unused) {
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo46791a(String str) {
        if (!m55545i(str)) {
            this.f60542b.f60568h = str;
            this.f60542b.f60567g = this.f60552l;
            this.f60542b.f60569i = str;
            this.f60542b.f60571k = SystemClock.uptimeMillis();
            this.f60547g.removeCallbacks(this.f60556p);
            this.f60547g.postDelayed(this.f60556p, 3000);
        }
    }

    /* renamed from: a */
    public final void mo46790a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            this.f60542b.f60585y = -2;
            this.f60542b.f60576p = webResourceRequest.isForMainFrame();
            this.f60542b.f60560B = webResourceRequest.getUrl().toString();
            this.f60542b.f60586z = Integer.valueOf(webResourceResponse != null ? webResourceResponse.getStatusCode() : 0);
            m55544h();
        }
    }

    /* renamed from: f */
    public static void m55542f() {
        f60541q = SystemClock.uptimeMillis();
    }

    /* renamed from: e */
    public final void mo46799e() {
        this.f60542b.f60565e = SystemClock.uptimeMillis();
    }

    /* renamed from: c */
    public final void mo46795c() {
        if (this.f60542b.f60574n == 0) {
            this.f60542b.f60574n = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: h */
    private void m55544h() {
        if (this.f60542b.f60585y != 0) {
            if (TextUtils.equals(this.f60542b.f60560B, this.f60542b.f60569i)) {
                this.f60542b.f60576p = true;
                mo46792a(true);
                return;
            }
            this.f60542b.f60580t++;
        }
    }

    /* renamed from: d */
    public final void mo46797d() {
        if (!m55545i(this.f60542b.f60568h)) {
            this.f60554n = SystemClock.uptimeMillis();
            m55539a("detailGetWebViewData", (ValueCallback<String>) this);
            this.f60542b.f60566f = SystemClock.uptimeMillis();
            this.f60547g.removeCallbacks(this.f60556p);
            boolean z = false;
            if (!this.f60548h) {
                m55540a(false, true);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (C22495a.m55591b(this.f60544d).f60612a == 1) {
                z = true;
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            this.f60542b.f60561a = z;
            this.f60542b.f60562b = uptimeMillis2;
            if (this.f60550j != null) {
                this.f60550j.mo46874a("hybrid_ttwebview_monitor", m55543g());
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo46785a() {
        boolean z;
        C22480b bVar = this.f60542b;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isBlank", Boolean.toString(bVar.f60561a));
            jSONObject.put("pageFinish", Boolean.toString(bVar.f60577q));
            jSONObject.put("mainFrameError", Boolean.toString(bVar.f60576p));
            jSONObject.put("webViewType", bVar.f60567g);
            String str = "isOfflineCache";
            if (bVar.f60582v > 0) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put(str, Boolean.toString(z));
            jSONObject.put("errUrl", bVar.f60560B);
            jSONObject.put("errType", Integer.toString(bVar.f60585y));
            jSONObject.put("errCode", Integer.toString(bVar.f60586z.intValue()));
            jSONObject.put("errMsg", bVar.f60559A);
            jSONObject.put("useCache", Boolean.toString(m55541a(bVar)));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final JSONObject mo46793b() {
        C22480b bVar = this.f60542b;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("detectDuration", bVar.f60562b);
            jSONObject.put("attachedWindowToLoadUrl", bVar.f60571k - bVar.f60565e);
            jSONObject.put("loadUrlToAttachedWindow", bVar.f60565e - bVar.f60571k);
            jSONObject.put("loadUrlToPageFinish", bVar.f60573m - bVar.f60571k);
            jSONObject.put("loadUrlToPageStart", bVar.f60572l - bVar.f60571k);
            jSONObject.put("attachedWindowToDetachWindow", bVar.f60566f - bVar.f60565e);
            jSONObject.put("pageStartToPageFinish", bVar.f60573m - bVar.f60572l);
            jSONObject.put("loadUrlToDetachWindow", bVar.f60566f - bVar.f60571k);
            jSONObject.put("loadResCount", bVar.f60578r);
            jSONObject.put("requestResCount", bVar.f60579s);
            jSONObject.put("loadResErrorCount", bVar.f60580t);
            jSONObject.put("ttNetResCount", bVar.f60581u);
            jSONObject.put("offlineResCount", bVar.f60582v);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: g */
    private JSONObject m55543g() {
        C22480b bVar = this.f60542b;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ttweb_isBlank", bVar.f60561a);
            jSONObject.put("ttweb_pageFinish", bVar.f60577q);
            jSONObject.put("ttweb_originalUrl", bVar.f60568h);
            jSONObject.put("ttweb_pageUrl", bVar.f60569i);
            jSONObject.put("ttweb_webviewType", bVar.f60567g);
            jSONObject.put("ttweb_mainFrameError", bVar.f60576p);
            jSONObject.put("ttweb_errUrl", bVar.f60560B);
            jSONObject.put("ttweb_errType", bVar.f60585y);
            jSONObject.put("ttweb_errCode", bVar.f60586z);
            jSONObject.put("ttweb_errMsg", bVar.f60559A);
            jSONObject.put("ttweb_useCache", m55541a(bVar));
            if (f60541q > 0) {
                jSONObject.put("ttweb_initToLoadUrl", bVar.f60571k - f60541q);
                jSONObject.put("ttweb_initToPageStart", bVar.f60572l - f60541q);
                jSONObject.put("ttweb_initToPageFinish", bVar.f60573m - f60541q);
            }
            jSONObject.put("ttweb_detectDuration", bVar.f60562b);
            jSONObject.put("ttweb_attachedWindowToLoadUrl", bVar.f60571k - bVar.f60565e);
            jSONObject.put("ttweb_loadUrlToAttachedWindow", bVar.f60565e - bVar.f60571k);
            jSONObject.put("ttweb_loadUrlToPageFinish", bVar.f60573m - bVar.f60571k);
            jSONObject.put("ttweb_loadUrlToPageStart", bVar.f60572l - bVar.f60571k);
            jSONObject.put("ttweb_attachedWindowToDetachWindow", bVar.f60566f - bVar.f60565e);
            jSONObject.put("ttweb_pageStartToPageFinish", bVar.f60573m - bVar.f60572l);
            jSONObject.put("ttweb_loadUrlToDetachWindow", bVar.f60566f - bVar.f60571k);
            jSONObject.put("ttweb_loadResCount", bVar.f60578r);
            jSONObject.put("ttweb_requestResCount", bVar.f60579s);
            jSONObject.put("ttweb_loadResErrorCount", bVar.f60580t);
            jSONObject.put("ttweb_ttNetResCount", bVar.f60581u);
            jSONObject.put("ttweb_offlineResCount", bVar.f60582v);
            jSONObject.put("ttweb_TTWebViewData", this.f60553m);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo46786a(int i) {
        this.f60542b.f60570j = i;
    }

    /* renamed from: a */
    public final void mo46792a(boolean z) {
        m55540a(true, false);
    }

    /* renamed from: d */
    public final void mo46798d(String str) {
        this.f60542b.f60578r++;
    }

    /* renamed from: f */
    public final void mo46801f(String str) {
        this.f60542b.f60582v++;
    }

    /* renamed from: g */
    public final void mo46802g(String str) {
        this.f60542b.f60581u++;
    }

    /* renamed from: j */
    private static boolean m55546j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(WebKitApi.SCHEME_HTTP) || str.startsWith(WebKitApi.SCHEME_HTTPS)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo46794b(String str) {
        this.f60542b.f60569i = str;
        if (this.f60542b.f60572l == 0) {
            this.f60542b.f60572l = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: e */
    public final void mo46800e(String str) {
        this.f60542b.f60579s++;
    }

    /* renamed from: h */
    public final void mo46803h(String str) {
        if (!m55545i(str)) {
            m55539a("detailClearWebViewData", (ValueCallback<String>) this);
            m55539a("detailEnableDomData", (ValueCallback<String>) this);
        }
    }

    /* renamed from: i */
    private static boolean m55545i(String str) {
        if (m55546j(str)) {
            return false;
        }
        if (TextUtils.equals(QuickShopBusiness.f64351b, str) || (str != null && str.length() > 9 && str.substring(0, 10).equalsIgnoreCase("javascript"))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo46796c(String str) {
        if (this.f60542b.f60573m == 0 && !m55545i(str)) {
            this.f60542b.f60569i = str;
            this.f60542b.f60573m = SystemClock.uptimeMillis();
            mo46792a(true);
        }
        this.f60547g.removeCallbacks(this.f60556p);
    }

    /* renamed from: a */
    private boolean m55541a(C22480b bVar) {
        if (this.f60549i == null || bVar == null || TextUtils.isEmpty(bVar.f60568h)) {
            return false;
        }
        for (String contains : this.f60549i) {
            if (bVar.f60568h.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(TEVideoRecorder.FACE_BEAUTY_NULL, str) && !TextUtils.equals("{}", str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("detailGetWebViewData")) {
                    this.f60553m = jSONObject.getString("detailGetWebViewData");
                    this.f60555o = SystemClock.uptimeMillis();
                }
                jSONObject.has("detailClearWebViewData");
                jSONObject.has("detailEnableDomData");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo46788a(SslError sslError) {
        if (sslError != null) {
            this.f60542b.f60585y = -3;
            this.f60542b.f60586z = Integer.valueOf(sslError.getPrimaryError());
            this.f60542b.f60560B = sslError.getUrl();
            this.f60542b.f60559A = sslError.toString();
            m55544h();
        }
    }

    /* renamed from: a */
    private void m55540a(boolean z, boolean z2) {
        if (!this.f60548h) {
            this.f60548h = true;
            if (!this.f60542b.f60576p) {
                if (z || !z2) {
                    this.f60542b.f60577q = true;
                }
            }
        }
    }

    /* renamed from: a */
    private void m55539a(String str, ValueCallback<String> valueCallback) {
        if (this.f60544d != null && VERSION.SDK_INT >= 19 && this.f60551k) {
            WebView webView = this.f60544d;
            StringBuilder sb = new StringBuilder("ttwebview:/*");
            sb.append(str);
            sb.append("*/;");
            webView.evaluateJavascript(sb.toString(), valueCallback);
        }
    }

    /* renamed from: a */
    public final void mo46787a(int i, String str) {
        if (m55546j(str)) {
            this.f60542b.f60585y = -1;
            this.f60542b.f60586z = Integer.valueOf(i);
            this.f60542b.f60560B = str;
            m55544h();
        }
    }

    /* renamed from: a */
    public final void mo46789a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri uri;
        int i;
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        if (uri != null && m55546j(uri.toString())) {
            this.f60542b.f60585y = -1;
            this.f60542b.f60576p = webResourceRequest.isForMainFrame();
            this.f60542b.f60560B = uri.toString();
            C22480b bVar = this.f60542b;
            if (webResourceError != null) {
                i = webResourceError.getErrorCode();
            } else {
                i = 0;
            }
            bVar.f60586z = Integer.valueOf(i);
            m55544h();
        }
    }

    public C22477a(WebView webView, List<String> list, C22525o oVar, C22526p pVar) {
        boolean z;
        String str;
        this.f60543c = new WeakReference<>(webView);
        this.f60544d = webView;
        this.f60549i = list;
        this.f60550j = oVar;
        if (pVar == null || !pVar.mo46879g()) {
            z = false;
        } else {
            z = true;
        }
        this.f60551k = z;
        if (pVar != null) {
            str = pVar.mo46878f();
        } else {
            str = "";
        }
        this.f60552l = str;
    }
}
