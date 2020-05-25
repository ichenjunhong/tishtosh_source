package com.bytedance.android.livesdk.browser;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.example.p906a.C13482c;
import com.p683ss.android.common.util.C18920g;
import java.util.HashSet;

/* renamed from: com.bytedance.android.livesdk.browser.c */
public final class C4695c {

    /* renamed from: a */
    public static final boolean f12778a;

    /* renamed from: b */
    public static int f12779b = -1;

    /* renamed from: c */
    public static int f12780c = -1;

    /* renamed from: d */
    static Handler f12781d = null;

    /* renamed from: e */
    static final HashSet<String> f12782e;

    /* renamed from: f */
    static final HashSet<String> f12783f;

    /* renamed from: g */
    private static final boolean f12784g;

    /* renamed from: h */
    private static int f12785h = -1;

    static {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT < 16 || !C18920g.m46054c()) {
            z = false;
        } else {
            z = true;
        }
        f12784g = z;
        if (!z && (VERSION.SDK_INT != 16 || !"ZTE N5".equals(Build.MODEL))) {
            z2 = false;
        }
        f12778a = z2;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f12782e = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        f12783f = hashSet2;
    }

    /* renamed from: a */
    public static void m11181a(WebView webView) {
        if (webView != null) {
            webView.setWebChromeClient(null);
            webView.setWebViewClient(C13482c.m27232a(null));
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
                try {
                    webView.destroy();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
