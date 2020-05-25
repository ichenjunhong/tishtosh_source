package com.google.android.gms.internal.ads;

import android.net.http.SslError;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p906a.C13482c;

@C16299uq
public class aob extends WebViewClient {

    /* renamed from: a */
    private static final String[] f41152a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: b */
    private static final String[] f41153b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: s */
    public aog f41154s;

    /* renamed from: a */
    public void mo29372a(aoc aoc) {
    }

    /* renamed from: b */
    public void mo29374b(aoc aoc) {
    }

    /* renamed from: c */
    public boolean mo29376c(aoc aoc) {
        return false;
    }

    /* renamed from: d */
    public WebResourceResponse mo29378d(aoc aoc) {
        return null;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            aoc aoc = new aoc(str);
            if (this.f41154s != null) {
                this.f41154s.mo29410a(aoc);
            } else {
                mo29372a(aoc);
            }
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String str2 = "Loading resource: ";
            String valueOf = String.valueOf(str);
            abv.m32494a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            mo29374b(new aoc(str));
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return mo29376c(new aoc(str));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return mo29376c(new aoc(webResourceRequest));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return mo29378d(new aoc(str));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return mo29378d(new aoc(webResourceRequest));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (i >= 0 || (-i) - 1 >= f41152a.length) {
            String.valueOf(i);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= f41153b.length) {
                String.valueOf(primaryError);
            }
            sslError.getUrl();
        }
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        webView.destroy();
        return C13482c.m27234a(webView, renderProcessGoneDetail);
    }
}
