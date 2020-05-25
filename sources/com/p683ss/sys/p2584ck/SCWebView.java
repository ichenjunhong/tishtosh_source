package com.p683ss.sys.p2584ck;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.webkit.JsPromptResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.C2240a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6072db;
import com.example.p906a.C13482c;
import com.p683ss.sys.p2584ck.p2585a.C51430e.C51431a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ck.SCWebView */
public class SCWebView extends WebView {

    /* renamed from: a */
    Context f128571a;

    /* renamed from: b */
    private int f128572b;

    /* renamed from: c */
    private int f128573c;

    /* renamed from: d */
    private float[] f128574d = {4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f};

    /* renamed from: e */
    private List<JSONObject> f128575e = new ArrayList();

    /* renamed from: f */
    private List<JSONObject> f128576f = new ArrayList();

    /* renamed from: com.ss.sys.ck.SCWebView$a */
    public class C51419a extends WebChromeClient {

        /* renamed from: b */
        private SCWebView f128578b;

        C51419a(SCWebView sCWebView) {
            this.f128578b = sCWebView;
        }

        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!str2.equals(C51438b.f128619a)) {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
            jsPromptResult.confirm();
            new C51431a(str3).start();
            return true;
        }
    }

    /* renamed from: com.ss.sys.ck.SCWebView$b */
    public class C51420b extends WebViewClient {

        /* renamed from: b */
        private SCWebView f128580b;

        C51420b(SCWebView sCWebView) {
            this.f128580b = sCWebView;
        }

        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
        }

        public final void onLoadResource(WebView webView, String str) {
            this.f128580b.mo102155a("onLoadResource", str != null ? str : "");
            super.onLoadResource(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            this.f128580b.mo102155a("onPageStarted", str != null ? str : "");
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f128580b.mo102155a("onPageStarted", str != null ? str : "");
            super.onPageStarted(webView, str, bitmap);
            SCCheckListener listener = SCCheckUtils.getInstance().getListener();
            if (listener != null) {
                listener.dialogOnReady();
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            SCWebView sCWebView = this.f128580b;
            String str3 = "onReceivedError";
            String str4 = "URL:%s DES:%s ERR:%d";
            Object[] objArr = new Object[3];
            if (str2 == null) {
                str2 = "";
            }
            objArr[0] = str2;
            if (str == null) {
                str = "";
            }
            objArr[1] = str;
            objArr[2] = Integer.valueOf(i);
            sCWebView.mo102155a(str3, C2240a.m6772a(str4, objArr));
            SCCheckListener listener = SCCheckUtils.getInstance().getListener();
            if (listener != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                listener.dialogOnError(sb.toString());
            }
            SCCheckUtils.getInstance().netWorkError();
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            try {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            } catch (Throwable unused) {
            }
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C13482c.m27234a(webView, renderProcessGoneDetail);
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            try {
                if (VERSION.SDK_INT >= 21 && !webResourceRequest.isForMainFrame() && webResourceRequest.getUrl().getPath().endsWith("/favicon.ico")) {
                    return new WebResourceResponse("image/png", null, null);
                }
            } catch (Exception unused) {
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (str.toLowerCase().contains("/favicon.ico")) {
                try {
                    return new WebResourceResponse("image/png", null, null);
                } catch (Exception unused) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            }
            if (!str.startsWith("jsbridge://")) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            C51442c.m110622a(webView, str);
            return true;
        }
    }

    public SCWebView(Context context) {
        super(context);
        this.f128571a = context;
        mo102154a();
        m110587b();
    }

    public SCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f128571a = context;
        mo102154a();
        m110587b();
    }

    public SCWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f128571a = context;
        mo102154a();
        m110587b();
    }

    /* renamed from: a */
    private void m110586a(int i, MotionEvent motionEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ac", i);
            jSONObject.put("dn", motionEvent.getDevice().getName());
            jSONObject.put(C6072db.f16229a, motionEvent.getDeviceId());
            jSONObject.put("lc", C2240a.m6772a("%s_%s", new Object[]{Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())}));
            this.f128575e.add(jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m110587b() {
        setLayoutParams(new LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public final void mo102154a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setCacheMode(2);
        settings.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        setOverScrollMode(2);
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        onResume();
        setWebChromeClient(new C51419a(this));
        setWebViewClient(C13482c.m27232a(new C51420b(this)));
        clearCache(true);
        clearHistory();
    }

    /* renamed from: a */
    public final void mo102155a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", str);
            jSONObject.put("time", Calendar.getInstance().getTimeInMillis());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", str2);
            jSONObject.put("detailinfos", jSONObject2);
            this.f128576f.add(jSONObject);
        } catch (Throwable unused) {
        }
    }

    public JSONArray getActionList() {
        if (this.f128576f.size() > 50) {
            this.f128576f = this.f128576f.subList(0, 50);
        }
        return new JSONArray(this.f128576f);
    }

    public JSONArray getMotionList() {
        if (this.f128575e.size() > 50) {
            this.f128575e = this.f128575e.subList(0, 50);
        }
        return new JSONArray(this.f128575e);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != 0) {
            this.f128572b = getMeasuredWidth();
        }
        if (getMeasuredHeight() != 0) {
            this.f128573c = getMeasuredHeight();
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        switch (action) {
            case 0:
            case 1:
            case 2:
                m110586a(action, motionEvent);
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
