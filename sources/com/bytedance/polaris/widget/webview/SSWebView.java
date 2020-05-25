package com.bytedance.polaris.widget.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p826d.C12650p;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import java.util.Map;

class SSWebView extends WebView {
    public boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public void goBack() {
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    public void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public String getOriginalUrl() {
        try {
            String originalUrl = super.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html")) {
                String url = super.getUrl();
                if (url != null && url.startsWith("file://")) {
                    originalUrl = url;
                }
            }
            return originalUrl;
        } catch (Exception unused) {
            return null;
        }
    }

    public SSWebView(Context context) {
        super(context);
    }

    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    public void loadUrl(String str) {
        try {
            String a = m25437a(str);
            C18984e.m46161a(a);
            super.loadUrl(a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private String m25437a(String str) {
        Context context = getContext();
        if (context == null || !C12650p.m25425c(str)) {
            return str;
        }
        return C12563i.m25221c().mo23604b(context, str);
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(m25437a(str), bArr);
        } catch (Exception unused) {
        }
    }

    public void loadUrl(String str, Map<String, String> map) {
        try {
            String a = m25437a(str);
            C18984e.m46161a(a);
            super.loadUrl(a, map);
        } catch (Exception unused) {
        }
    }

    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
