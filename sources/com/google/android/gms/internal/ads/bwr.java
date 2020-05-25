package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C14963ax;
import org.json.JSONException;
import org.json.JSONObject;

final class bwr implements ValueCallback<String> {

    /* renamed from: a */
    private final /* synthetic */ bwq f44170a;

    bwr(bwq bwq) {
        this.f44170a = bwq;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        String str = (String) obj;
        bwo bwo = this.f44170a.f44168d;
        bwi bwi = this.f44170a.f44165a;
        WebView webView = this.f44170a.f44166b;
        boolean z = this.f44170a.f44167c;
        synchronized (bwi.f44116a) {
            bwi.f44119d--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (bwo.f44161m || TextUtils.isEmpty(webView.getTitle())) {
                    bwi.mo30803a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    bwi.mo30803a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (bwi.mo30804a()) {
                bwo.f44152d.mo30813b(bwi);
            }
        } catch (JSONException unused) {
            abv.m32792b("Json string may be malformed.");
        } catch (Throwable th) {
            abv.m32790a("Failed to get webview content.", th);
            C14963ax.m30834d().mo28588a(th, "ContentFetchTask.processWebViewContent");
        }
    }
}
