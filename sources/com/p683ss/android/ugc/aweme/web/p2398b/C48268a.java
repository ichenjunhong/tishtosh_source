package com.p683ss.android.ugc.aweme.web.p2398b;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.p683ss.android.sdk.webview.C19761i.C19762a;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.web.b.a */
public abstract class C48268a implements C19762a {

    /* renamed from: d */
    public boolean f121474d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo95775a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract InputStream mo95776b(String str);

    public C48268a(boolean z) {
        this.f121474d = z;
    }

    /* renamed from: a */
    public WebResourceResponse mo41194a(String str) {
        boolean z;
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a = mo95775a();
        if (!TextUtils.isEmpty(a)) {
            z = Pattern.compile(a).matcher(str).find();
        } else {
            z = false;
        }
        if (z) {
            webResourceResponse = m104557a(mo95777c(str), "", mo95776b(str));
        }
        return webResourceResponse;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo95777c(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (str.endsWith(".jpeg") || str.endsWith(".jpg")) {
            return "image/jpeg";
        }
        if (str.endsWith(".png")) {
            return "image/png";
        }
        if (str.endsWith(".gif")) {
            return "image/gif";
        }
        if (str.endsWith(".woff")) {
            return "font/woff";
        }
        if (str.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (str.endsWith(".ttf")) {
            return "font/ttf";
        }
        return "";
    }

    /* renamed from: a */
    protected static WebResourceResponse m104557a(String str, String str2, InputStream inputStream) {
        WebResourceResponse webResourceResponse;
        if (inputStream != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (VERSION.SDK_INT < 21 || !"font/ttf".equals(str)) {
                    webResourceResponse = new WebResourceResponse(str, str2, inputStream);
                    if (VERSION.SDK_INT >= 21) {
                        webResourceResponse.setResponseHeaders(hashMap);
                    } else {
                        try {
                            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                            field.setAccessible(true);
                            field.set(webResourceResponse, hashMap);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    webResourceResponse = new WebResourceResponse(str, str2, 200, "OK", hashMap, inputStream);
                }
                return webResourceResponse;
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
