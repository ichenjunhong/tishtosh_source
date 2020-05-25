package com.p683ss.android.newmedia.p1195a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import com.example.p906a.C13482c;
import com.p683ss.android.agilelogger.p1136f.C18829j;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.newmedia.C19557h;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import java.util.HashSet;

/* renamed from: com.ss.android.newmedia.a.d */
public final class C19541d {

    /* renamed from: a */
    static Handler f53916a = null;

    /* renamed from: b */
    static final HashSet<String> f53917b;

    /* renamed from: c */
    static final HashSet<String> f53918c;

    /* renamed from: d */
    private static final boolean f53919d;

    /* renamed from: e */
    private static final boolean f53920e;

    /* renamed from: f */
    private static int f53921f = -1;

    /* renamed from: g */
    private static int f53922g = -1;

    /* renamed from: h */
    private static int f53923h = -1;

    static {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT < 16 || !C18920g.m46054c()) {
            z = false;
        } else {
            z = true;
        }
        f53919d = z;
        if (!z && (VERSION.SDK_INT != 16 || !"ZTE N5".equals(Build.MODEL))) {
            z2 = false;
        }
        f53920e = z2;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f53917b = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        f53918c = hashSet2;
    }

    /* renamed from: a */
    public static void m47826a(WebView webView) {
        if (webView != null) {
            C23131p.m56692a("webview_anr_log", "common_msg", C23088c.m56631a().mo47822a("layerType", Integer.valueOf(webView.getLayerType())).mo47824a("stackTrace", C18829j.m45923a(new Throwable())).mo47825b());
            webView.setWebChromeClient(null);
            webView.setWebViewClient(C13482c.m27232a(null));
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
                try {
                    webView.destroy();
                } catch (Throwable th) {
                    C23131p.m56692a("webview_anr_log", "destroy_exception", C23088c.m56631a().mo47824a("stacktrace", C18829j.m45923a(th)).mo47825b());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m47825a(Context context, WebView webView) {
        if (context != null && webView != null) {
            if (C23794bh.m58383I().getWebViewDestroyMode() == 0) {
                int i = f53921f;
                if (i < 0 && f53920e) {
                    i = 1;
                }
                if (i <= 0) {
                    return;
                }
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing()) {
                    try {
                        C19557h.m47858a(webView, QuickShopBusiness.f64351b);
                        if (f53923h > 0) {
                            View rootView = webView.getRootView();
                            if (rootView instanceof ViewGroup) {
                                View childAt = ((ViewGroup) rootView).getChildAt(0);
                                childAt.setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                                childAt.setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(activity);
                                imageView.setImageBitmap(createBitmap);
                                imageView.setVisibility(0);
                                ((ViewGroup) rootView).addView(imageView, new LayoutParams(-1, -1));
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
