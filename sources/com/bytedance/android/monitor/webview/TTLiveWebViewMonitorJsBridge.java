package com.bytedance.android.monitor.webview;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

class TTLiveWebViewMonitorJsBridge {
    public WeakReference<WebView> mWebViewRef;
    private Handler mainHanlder = new Handler(Looper.getMainLooper());

    @JavascriptInterface
    public void sendInitTimeInfo(final String str) {
        this.mainHanlder.post(new Runnable() {
            public final void run() {
                if (C8902j.m17574c().mo15938e((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C8902j.m17574c().mo15932b((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get(), str);
                }
            }
        });
    }

    public TTLiveWebViewMonitorJsBridge(WebView webView) {
        this.mWebViewRef = new WeakReference<>(webView);
    }

    @JavascriptInterface
    public void accumulate(final String str, final String str2) {
        this.mainHanlder.post(new Runnable() {
            public final void run() {
                if (C8902j.m17574c().mo15938e((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C8902j.m17574c().mo15933b((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                }
            }
        });
    }

    @JavascriptInterface
    public void average(final String str, final String str2) {
        this.mainHanlder.post(new Runnable() {
            public final void run() {
                if (C8902j.m17574c().mo15938e((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C8902j.m17574c().mo15936d((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                }
            }
        });
    }

    @JavascriptInterface
    public void cover(final String str, final String str2) {
        this.mainHanlder.post(new Runnable() {
            public final void run() {
                if (C8902j.m17574c().mo15938e((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C8902j.m17574c().mo15931a((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                }
            }
        });
    }

    @JavascriptInterface
    public void diff(final String str, final String str2) {
        this.mainHanlder.post(new Runnable() {
            public final void run() {
                if (C8902j.m17574c().mo15938e((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C8902j.m17574c().mo15937e((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                }
            }
        });
    }

    @JavascriptInterface
    public void reportDirectly(final String str, final String str2) {
        this.mainHanlder.post(new Runnable() {
            public final void run() {
                if (C8902j.m17574c().mo15938e((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C8902j.m17574c().mo15935c((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                }
            }
        });
    }

    @JavascriptInterface
    public void customReport(String str, String str2, String str3, String str4) {
        Handler handler = this.mainHanlder;
        final String str5 = str2;
        final String str6 = str;
        final String str7 = str3;
        final String str8 = str4;
        C88876 r1 = new Runnable() {
            public final void run() {
                if (C8902j.m17574c().mo15938e((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C8902j.m17571b().mo15899a((WebView) TTLiveWebViewMonitorJsBridge.this.mWebViewRef.get(), str5, str6, str7, str8);
                }
            }
        };
        handler.post(r1);
    }
}
