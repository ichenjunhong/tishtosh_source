package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.depend.live.C8669s;
import com.bytedance.android.livesdkapi.host.C8804h;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.p574e.C9915j;
import com.bytedance.ttnet.p883a.C13258a;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SSWebView extends WebView {
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

    public String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
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

    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
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

    private static boolean isSafeHost(String str) {
        try {
            return ((C8669s) C4116c.m10249a(C8669s.class)).mo15066a(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public void loadUrl(String str) {
        try {
            String filterUrl = filterUrl(str);
            C4959d.m11451a(this, filterUrl, requestHeader(filterUrl, null));
        } catch (Exception unused) {
        }
    }

    private String tryReplaceUrlToBoe(String str) {
        if (str == null) {
            return str;
        }
        try {
            URI create = URI.create(str);
            String host = create.getHost();
            StringBuilder sb = new StringBuilder();
            sb.append(host);
            sb.append(".boe-gateway.byted.org");
            String sb2 = sb.toString();
            if (!C9431p.m18664a(sb2)) {
                return C9915j.m19869a(create.getScheme(), sb2, create.getPort(), create.getRawPath(), create.getRawQuery(), create.getRawFragment()).toString();
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    private String filterUrl(String str) {
        boolean z;
        Context context = getContext();
        if (context != null) {
            if (C9431p.m18664a(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str = C13258a.m26660a(context).mo24855g(str);
            }
        }
        try {
            if (((IHostContext) C4116c.m10249a(IHostContext.class)).isLocalTest() && getContext().getAssets() != null && getContext().getAssets().list("") != null && Arrays.asList(getContext().getAssets().list("")).contains("ttnet_config.json")) {
                str = tryReplaceUrlToBoe(str);
            }
        } catch (Exception unused) {
        }
        syncCookie(str);
        return str;
    }

    private void syncCookie(String str) {
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        List a = ((C8804h) C4116c.m10249a(C8804h.class)).mo15570a(str);
        Uri parse = Uri.parse(str);
        String str2 = "";
        if (parse != null) {
            str2 = parse.getHost();
        }
        if (a != null && str2 != null) {
            for (int i = 0; i < a.size(); i++) {
                String[] split = ((String) a.get(i)).split(";");
                for (String replace : split) {
                    instance.setCookie(str2, replace.replace(" ", ""));
                }
            }
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (Exception unused) {
        }
    }

    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(filterUrl(str), bArr);
        } catch (Exception unused) {
        }
    }

    public void loadUrl(String str, Map<String, String> map) {
        try {
            String filterUrl = filterUrl(str);
            C4959d.m11451a(this, filterUrl, requestHeader(filterUrl, map));
        } catch (Exception unused) {
        }
    }

    private static Map<String, String> requestHeader(String str, Map<String, String> map) {
        Map<String, String> map2;
        if (isSafeHost(str)) {
            map2 = ((C8804h) C4116c.m10249a(C8804h.class)).mo15572b(str);
        } else {
            map2 = Collections.emptyMap();
        }
        if (map2 == null || map2.isEmpty()) {
            return map;
        }
        if (map == null || map.isEmpty()) {
            return map2;
        }
        HashMap hashMap = new HashMap(map);
        for (Entry entry : map2.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
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
