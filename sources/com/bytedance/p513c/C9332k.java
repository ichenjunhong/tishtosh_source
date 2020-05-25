package com.bytedance.p513c;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.example.p906a.C13482c;

/* renamed from: com.bytedance.c.k */
public final class C9332k extends WebView {

    /* renamed from: a */
    public C9314e f25542a;

    /* renamed from: b */
    public boolean f25543b;

    /* renamed from: c */
    public boolean f25544c;

    /* renamed from: d */
    WebChromeClient f25545d = new WebChromeClient() {
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }
    };

    /* renamed from: e */
    WebViewClient f25546e = new WebViewClient() {
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C13482c.m27234a(webView, renderProcessGoneDetail);
        }

        public final void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            if (!C9332k.this.f25543b && !C9332k.this.f25544c) {
                C9332k.this.f25544c = true;
                C9332k.this.f25542a.mo16918a();
            }
            super.onPageFinished(webView, str);
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

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (C9315f.m18472a()) {
                Context context = C9332k.this.getContext();
                StringBuilder sb = new StringBuilder("onReceivedSslError : ");
                sb.append(sslError);
                C9335l.m18493a(Toast.makeText(context, sb.toString(), 1));
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            C9332k.this.mo16945a();
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (C9315f.m18472a()) {
                Context context = C9332k.this.getContext();
                StringBuilder sb = new StringBuilder("onReceivedHttpError : ");
                sb.append(webResourceResponse.getStatusCode());
                C9335l.m18493a(Toast.makeText(context, sb.toString(), 1));
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            try {
                if (webResourceRequest.getUrl().toString().toLowerCase().contains("/favicon.ico")) {
                    return;
                }
            } catch (Exception unused) {
            }
            C9332k.this.mo16945a();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C9332k.this.f25543b = true;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" onReceivedError ");
            sb.append(str);
            C9332k.this.f25542a.mo16920a(i, str);
            super.onReceivedError(webView, i, str, str2);
        }
    };

    /* renamed from: f */
    private C9316g f25547f = new C9316g();

    /* renamed from: g */
    private int f25548g = 0;

    /* renamed from: a */
    public final void mo16945a() {
        if (this.f25548g < 3) {
            this.f25548g++;
            super.reload();
            return;
        }
        this.f25543b = true;
        this.f25542a.mo16920a(-1, "ssl or http error, reload but fail again");
    }

    public final void setCallback(C9314e eVar) {
        this.f25542a = eVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f25547f.mo16923a(true, motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public C9332k(Context context) {
        super(context, null);
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        new StringBuilder("webview onConfigurationChanged ").append(configuration.orientation);
        switch (configuration.orientation) {
            case 1:
                C9302d.m18453b(2);
                break;
            case 2:
                C9302d.m18453b(1);
                break;
        }
        super.onConfigurationChanged(configuration);
    }
}
