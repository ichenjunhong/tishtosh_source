package com.bytedance.ies.bullet.kit.web.p650c;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.bullet.p628b.p641h.C10357d;
import com.bytedance.ies.bullet.p628b.p641h.C10358e;
import com.bytedance.ies.bullet.p628b.p641h.p642a.C10350a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.web.c.a */
public final class C10500a implements ValueCallback<String> {

    /* renamed from: a */
    static final String f27900a = "javascript:var result = {};var timing = window.performance && window.performance.timing;result.dom_ready = timing.domComplete - timing.domInteractive;";

    /* renamed from: q */
    private static long f27901q;

    /* renamed from: b */
    public C10503b f27902b = new C10503b();

    /* renamed from: c */
    public WeakReference<WebView> f27903c;

    /* renamed from: d */
    WebView f27904d;

    /* renamed from: e */
    public int f27905e;

    /* renamed from: f */
    public int f27906f;

    /* renamed from: g */
    public final Handler f27907g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private boolean f27908h;

    /* renamed from: i */
    private List<String> f27909i;

    /* renamed from: j */
    private C10357d f27910j;

    /* renamed from: k */
    private boolean f27911k;

    /* renamed from: l */
    private String f27912l;

    /* renamed from: m */
    private String f27913m;

    /* renamed from: n */
    private long f27914n;

    /* renamed from: o */
    private long f27915o;

    /* renamed from: p */
    private final Runnable f27916p = new Runnable() {
        public final void run() {
            WebView webView;
            if (C10500a.this.f27903c != null) {
                webView = (WebView) C10500a.this.f27903c.get();
            } else {
                webView = null;
            }
            if (webView != null) {
                if (C10500a.this.f27902b.f27930j == 100) {
                    C10500a.this.mo18636a(true);
                } else if (C10500a.this.f27902b.f27930j > C10500a.this.f27905e) {
                    C10500a.this.f27905e = C10500a.this.f27902b.f27930j;
                    C10500a.this.f27906f = 0;
                    C10500a.this.f27907g.postDelayed(this, 1000);
                } else {
                    C10500a.this.f27906f++;
                    if (C10500a.this.f27906f < 3) {
                        C10500a.this.f27907g.postDelayed(this, 1000);
                        return;
                    }
                    C10500a aVar = C10500a.this;
                    if (VERSION.SDK_INT >= 19 && aVar.f27904d != null) {
                        try {
                            aVar.f27904d.evaluateJavascript(C10500a.f27900a, null);
                            aVar.f27904d.evaluateJavascript("javascript:result", new ValueCallback<String>() {
                                public final /* synthetic */ void onReceiveValue(Object obj) {
                                    try {
                                        if (new JSONObject((String) obj).getLong("dom_ready") <= 0) {
                                            C10500a.this.f27902b.f27945y = -4;
                                            C10500a.this.f27902b.f27936p = true;
                                        }
                                        C10500a.this.mo18636a(true);
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
    public final void mo18635a(String str) {
        if (!m21116h(str)) {
            this.f27902b.f27928h = str;
            this.f27902b.f27927g = this.f27912l;
            this.f27902b.f27929i = str;
            this.f27902b.f27931k = SystemClock.uptimeMillis();
            this.f27907g.removeCallbacks(this.f27916p);
            this.f27907g.postDelayed(this.f27916p, 3000);
        }
    }

    /* renamed from: a */
    public final void mo18634a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            this.f27902b.f27945y = -2;
            this.f27902b.f27936p = webResourceRequest.isForMainFrame();
            this.f27902b.f27920B = webResourceRequest.getUrl().toString();
            this.f27902b.f27946z = Integer.valueOf(webResourceResponse != null ? webResourceResponse.getStatusCode() : 0);
            m21115g();
        }
    }

    /* renamed from: e */
    public final void mo18643e() {
        this.f27902b.f27925e = SystemClock.uptimeMillis();
    }

    /* renamed from: c */
    public final void mo18639c() {
        if (this.f27902b.f27934n == 0) {
            this.f27902b.f27934n = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: g */
    private void m21115g() {
        if (this.f27902b.f27945y != 0) {
            if (TextUtils.equals(this.f27902b.f27920B, this.f27902b.f27929i)) {
                this.f27902b.f27936p = true;
                mo18636a(true);
                return;
            }
            this.f27902b.f27940t++;
        }
    }

    /* renamed from: d */
    public final void mo18641d() {
        if (!m21116h(this.f27902b.f27928h)) {
            this.f27914n = SystemClock.uptimeMillis();
            m21111a("detailGetWebViewData", (ValueCallback<String>) this);
            this.f27902b.f27926f = SystemClock.uptimeMillis();
            this.f27907g.removeCallbacks(this.f27916p);
            boolean z = false;
            if (!this.f27908h) {
                m21112a(false, true);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (C10350a.m20924b(this.f27904d).f27786a == 1) {
                z = true;
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            this.f27902b.f27921a = z;
            this.f27902b.f27922b = uptimeMillis2;
            if (this.f27910j != null) {
                this.f27910j.mo18423a("hybrid_ttwebview_monitor", m21114f());
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo18629a() {
        boolean z;
        C10503b bVar = this.f27902b;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isBlank", Boolean.toString(bVar.f27921a));
            jSONObject.put("pageFinish", Boolean.toString(bVar.f27937q));
            jSONObject.put("mainFrameError", Boolean.toString(bVar.f27936p));
            jSONObject.put("webViewType", bVar.f27927g);
            String str = "isOfflineCache";
            if (bVar.f27942v > 0) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put(str, Boolean.toString(z));
            jSONObject.put("errUrl", bVar.f27920B);
            jSONObject.put("errType", Integer.toString(bVar.f27945y));
            jSONObject.put("errCode", Integer.toString(bVar.f27946z.intValue()));
            jSONObject.put("errMsg", bVar.f27919A);
            jSONObject.put("useCache", Boolean.toString(m21113a(bVar)));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final JSONObject mo18637b() {
        C10503b bVar = this.f27902b;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("detectDuration", bVar.f27922b);
            jSONObject.put("attachedWindowToLoadUrl", bVar.f27931k - bVar.f27925e);
            jSONObject.put("loadUrlToAttachedWindow", bVar.f27925e - bVar.f27931k);
            jSONObject.put("loadUrlToPageFinish", bVar.f27933m - bVar.f27931k);
            jSONObject.put("loadUrlToPageStart", bVar.f27932l - bVar.f27931k);
            jSONObject.put("attachedWindowToDetachWindow", bVar.f27926f - bVar.f27925e);
            jSONObject.put("pageStartToPageFinish", bVar.f27933m - bVar.f27932l);
            jSONObject.put("loadUrlToDetachWindow", bVar.f27926f - bVar.f27931k);
            jSONObject.put("loadResCount", bVar.f27938r);
            jSONObject.put("requestResCount", bVar.f27939s);
            jSONObject.put("loadResErrorCount", bVar.f27940t);
            jSONObject.put("ttNetResCount", bVar.f27941u);
            jSONObject.put("offlineResCount", bVar.f27942v);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: f */
    private JSONObject m21114f() {
        C10503b bVar = this.f27902b;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_type", "bullet");
            jSONObject.put("ttweb_isBlank", bVar.f27921a);
            jSONObject.put("ttweb_pageFinish", bVar.f27937q);
            jSONObject.put("ttweb_originalUrl", bVar.f27928h);
            jSONObject.put("ttweb_pageUrl", bVar.f27929i);
            jSONObject.put("ttweb_webviewType", bVar.f27927g);
            jSONObject.put("ttweb_mainFrameError", bVar.f27936p);
            jSONObject.put("ttweb_errUrl", bVar.f27920B);
            jSONObject.put("ttweb_errType", bVar.f27945y);
            jSONObject.put("ttweb_errCode", bVar.f27946z);
            jSONObject.put("ttweb_errMsg", bVar.f27919A);
            jSONObject.put("ttweb_useCache", m21113a(bVar));
            if (f27901q > 0) {
                jSONObject.put("ttweb_initToLoadUrl", bVar.f27931k - f27901q);
                jSONObject.put("ttweb_initToPageStart", bVar.f27932l - f27901q);
                jSONObject.put("ttweb_initToPageFinish", bVar.f27933m - f27901q);
            }
            jSONObject.put("ttweb_detectDuration", bVar.f27922b);
            jSONObject.put("ttweb_attachedWindowToLoadUrl", bVar.f27931k - bVar.f27925e);
            jSONObject.put("ttweb_loadUrlToAttachedWindow", bVar.f27925e - bVar.f27931k);
            jSONObject.put("ttweb_loadUrlToPageFinish", bVar.f27933m - bVar.f27931k);
            jSONObject.put("ttweb_loadUrlToPageStart", bVar.f27932l - bVar.f27931k);
            jSONObject.put("ttweb_attachedWindowToDetachWindow", bVar.f27926f - bVar.f27925e);
            jSONObject.put("ttweb_pageStartToPageFinish", bVar.f27933m - bVar.f27932l);
            jSONObject.put("ttweb_loadUrlToDetachWindow", bVar.f27926f - bVar.f27931k);
            jSONObject.put("ttweb_loadResCount", bVar.f27938r);
            jSONObject.put("ttweb_requestResCount", bVar.f27939s);
            jSONObject.put("ttweb_loadResErrorCount", bVar.f27940t);
            jSONObject.put("ttweb_ttNetResCount", bVar.f27941u);
            jSONObject.put("ttweb_offlineResCount", bVar.f27942v);
            jSONObject.put("ttweb_TTWebViewData", this.f27913m);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo18630a(int i) {
        this.f27902b.f27930j = i;
    }

    /* renamed from: a */
    public final void mo18636a(boolean z) {
        m21112a(true, false);
    }

    /* renamed from: d */
    public final void mo18642d(String str) {
        this.f27902b.f27938r++;
    }

    /* renamed from: f */
    public final void mo18645f(String str) {
        this.f27902b.f27942v++;
    }

    /* renamed from: i */
    private static boolean m21117i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(WebKitApi.SCHEME_HTTP) || str.startsWith(WebKitApi.SCHEME_HTTPS)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo18638b(String str) {
        this.f27902b.f27929i = str;
        if (this.f27902b.f27932l == 0) {
            this.f27902b.f27932l = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: e */
    public final void mo18644e(String str) {
        this.f27902b.f27939s++;
    }

    /* renamed from: g */
    public final void mo18646g(String str) {
        if (!m21116h(str)) {
            m21111a("detailClearWebViewData", (ValueCallback<String>) this);
            m21111a("detailEnableDomData", (ValueCallback<String>) this);
        }
    }

    /* renamed from: h */
    private static boolean m21116h(String str) {
        if (m21117i(str)) {
            return false;
        }
        if (TextUtils.equals(QuickShopBusiness.f64351b, str) || (str != null && str.length() > 9 && str.substring(0, 10).equalsIgnoreCase("javascript"))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo18640c(String str) {
        if (this.f27902b.f27933m == 0 && !m21116h(str)) {
            this.f27902b.f27929i = str;
            this.f27902b.f27933m = SystemClock.uptimeMillis();
            mo18636a(true);
        }
        this.f27907g.removeCallbacks(this.f27916p);
    }

    /* renamed from: a */
    private boolean m21113a(C10503b bVar) {
        if (this.f27909i == null || bVar == null || TextUtils.isEmpty(bVar.f27928h)) {
            return false;
        }
        for (String contains : this.f27909i) {
            if (bVar.f27928h.contains(contains)) {
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
                    this.f27913m = jSONObject.getString("detailGetWebViewData");
                    this.f27915o = SystemClock.uptimeMillis();
                }
                jSONObject.has("detailClearWebViewData");
                jSONObject.has("detailEnableDomData");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo18632a(SslError sslError) {
        if (sslError != null) {
            this.f27902b.f27945y = -3;
            this.f27902b.f27946z = Integer.valueOf(sslError.getPrimaryError());
            this.f27902b.f27920B = sslError.getUrl();
            this.f27902b.f27919A = sslError.toString();
            m21115g();
        }
    }

    /* renamed from: a */
    private void m21112a(boolean z, boolean z2) {
        if (!this.f27908h) {
            this.f27908h = true;
            if (!this.f27902b.f27936p) {
                if (z || !z2) {
                    this.f27902b.f27937q = true;
                }
            }
        }
    }

    /* renamed from: a */
    private void m21111a(String str, ValueCallback<String> valueCallback) {
        if (this.f27904d != null && VERSION.SDK_INT >= 19 && this.f27911k) {
            WebView webView = this.f27904d;
            StringBuilder sb = new StringBuilder("ttwebview:/*");
            sb.append(str);
            sb.append("*/;");
            webView.evaluateJavascript(sb.toString(), valueCallback);
        }
    }

    /* renamed from: a */
    public final void mo18631a(int i, String str) {
        if (m21117i(str)) {
            this.f27902b.f27945y = -1;
            this.f27902b.f27946z = Integer.valueOf(i);
            this.f27902b.f27920B = str;
            m21115g();
        }
    }

    /* renamed from: a */
    public final void mo18633a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri uri;
        int i;
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        if (uri != null && m21117i(uri.toString())) {
            this.f27902b.f27945y = -1;
            this.f27902b.f27936p = webResourceRequest.isForMainFrame();
            this.f27902b.f27920B = uri.toString();
            C10503b bVar = this.f27902b;
            if (webResourceError != null) {
                i = webResourceError.getErrorCode();
            } else {
                i = 0;
            }
            bVar.f27946z = Integer.valueOf(i);
            m21115g();
        }
    }

    public C10500a(WebView webView, C10357d dVar, C10358e eVar) {
        List<String> list;
        boolean z;
        String str;
        this.f27903c = new WeakReference<>(webView);
        this.f27904d = webView;
        if (eVar != null) {
            list = eVar.mo18427d();
        } else {
            list = null;
        }
        this.f27909i = list;
        this.f27910j = dVar;
        if (eVar == null || !eVar.mo18432i()) {
            z = false;
        } else {
            z = true;
        }
        this.f27911k = z;
        if (eVar != null) {
            str = eVar.mo18431h();
        } else {
            str = "";
        }
        this.f27912l = str;
    }
}
