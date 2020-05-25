package com.p683ss.android.ugc.aweme.crossplatform.preload;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27300c;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.preload.a */
public final class C27278a {

    /* renamed from: a */
    public static Map<String, Integer> f71959a = new LinkedHashMap();

    /* renamed from: b */
    public static final C27278a f71960b = new C27278a();

    /* renamed from: c */
    private static Map<String, C27300c> f71961c = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.preload.a$a */
    public interface C27279a {
        /* renamed from: a */
        C27300c mo55653a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.preload.a$b */
    public enum C27280b {
        FAILED,
        H5,
        RN
    }

    private C27278a() {
    }

    /* renamed from: a */
    public static C27300c m65729a(String str) {
        C52711k.m112240b(str, "url");
        return (C27300c) f71961c.get(str);
    }

    /* renamed from: a */
    public static boolean m65731a(CrossPlatformWebView crossPlatformWebView) {
        C52711k.m112240b(crossPlatformWebView, "view");
        if (!(crossPlatformWebView instanceof C27300c) || !((C27300c) crossPlatformWebView).getMFromPreload()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m65732b(String str) {
        C52711k.m112240b(str, "url");
        f71961c.put(str, null);
        f71959a.remove(str);
    }

    /* renamed from: a */
    public static C27280b m65728a(String str, String str2, C27279a aVar) {
        C52711k.m112240b(str, "baseUrl");
        C52711k.m112240b(str2, "loadUrl");
        C52711k.m112240b(aVar, "factory");
        if (((C27300c) f71961c.get(str)) != null) {
            return C27280b.FAILED;
        }
        C27300c a = aVar.mo55653a(str);
        f71961c.put(str, a);
        a.mo55679a(str2, false, false);
        if (a.getMLoadRnSuccess()) {
            return C27280b.RN;
        }
        return C27280b.H5;
    }

    /* renamed from: a */
    public static boolean m65730a(ViewGroup viewGroup, CrossPlatformWebView crossPlatformWebView, CrossPlatformWebView crossPlatformWebView2) {
        ViewGroup viewGroup2 = null;
        crossPlatformWebView.mo55690g(null);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) == crossPlatformWebView) {
                viewGroup.removeViewAt(i);
                ViewParent parent = crossPlatformWebView2.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup2 = parent;
                }
                ViewGroup viewGroup3 = viewGroup2;
                if (viewGroup3 != null) {
                    viewGroup3.removeView(crossPlatformWebView2);
                }
                crossPlatformWebView2.setLayoutParams(crossPlatformWebView.getLayoutParams());
                viewGroup.addView(crossPlatformWebView2, i);
                return true;
            }
        }
        return false;
    }
}
