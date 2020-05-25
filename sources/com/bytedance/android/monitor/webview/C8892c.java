package com.bytedance.android.monitor.webview;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.C2240a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.monitor.webview.c */
public interface C8892c {

    /* renamed from: com.bytedance.android.monitor.webview.c$a */
    public static class C8893a {

        /* renamed from: a */
        C8894d f24212a;

        /* renamed from: b */
        C8891b f24213b;

        /* renamed from: c */
        String[] f24214c;

        /* renamed from: d */
        String[] f24215d;

        /* renamed from: e */
        String f24216e;

        /* renamed from: f */
        C8889a f24217f;

        /* renamed from: g */
        String f24218g = "";

        /* renamed from: h */
        public boolean f24219h;

        /* renamed from: i */
        boolean f24220i;

        /* renamed from: j */
        boolean f24221j;

        /* renamed from: k */
        boolean f24222k;

        /* renamed from: l */
        boolean f24223l = true;

        /* renamed from: m */
        String f24224m = "";

        /* renamed from: n */
        String f24225n = "";

        /* renamed from: o */
        public String f24226o = "";

        /* renamed from: p */
        Map<String, String> f24227p = m17483e("");

        C8893a() {
        }

        /* renamed from: a */
        public final C8893a mo15910a(C8889a aVar) {
            this.f24217f = aVar;
            return this;
        }

        /* renamed from: b */
        public final C8893a mo15915b(String str) {
            this.f24216e = str;
            return this;
        }

        /* renamed from: c */
        public final C8893a mo15916c(String str) {
            this.f24218g = str;
            return this;
        }

        /* renamed from: a */
        public final C8893a mo15911a(C8894d dVar) {
            this.f24212a = dVar;
            return this;
        }

        /* renamed from: a */
        public final C8893a mo15912a(boolean z) {
            this.f24222k = true;
            return this;
        }

        /* renamed from: d */
        public final C8893a mo15917d(String str) {
            this.f24226o = str;
            if (this.f24219h) {
                this.f24226o = CustomActionPushReceiver.f104061f;
            }
            mo15914a(this.f24226o);
            return this;
        }

        /* renamed from: a */
        public final C8893a mo15913a(String... strArr) {
            this.f24215d = strArr;
            return this;
        }

        /* renamed from: a */
        public void mo15914a(String str) {
            this.f24227p.clear();
            this.f24227p.putAll(m17483e(str));
        }

        /* renamed from: e */
        private static Map<String, String> m17483e(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("pv", C2240a.m6772a("tt%s_webview_timing_monitor_pv_service", new Object[]{str}));
            hashMap.put("overview", C2240a.m6772a("tt%s_webview_timing_monitor_overview_service", new Object[]{str}));
            hashMap.put("performance", C2240a.m6772a("tt%s_webview_timing_monitor_performance_service", new Object[]{str}));
            hashMap.put("resource", C2240a.m6772a("tt%s_webview_timing_monitor_resource_service", new Object[]{str}));
            hashMap.put("error", C2240a.m6772a("tt%s_webview_timing_monitor_error_service", new Object[]{str}));
            hashMap.put("diff", C2240a.m6772a("tt%s_webview_timing_monitor_diff_service", new Object[]{str}));
            hashMap.put("custom", C2240a.m6772a("tt%s_webview_timing_monitor_custom_service", new Object[]{str}));
            return hashMap;
        }
    }

    /* renamed from: a */
    C8893a mo15894a();

    /* renamed from: a */
    void mo15895a(WebView webView);

    /* renamed from: a */
    void mo15896a(WebView webView, int i);

    /* renamed from: a */
    void mo15897a(WebView webView, String str);

    /* renamed from: a */
    void mo15898a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: a */
    void mo15899a(WebView webView, String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo15900a(WebView webView, String str, String str2, String str3, String str4, String str5, String str6);

    /* renamed from: a */
    void mo15901a(WebView webView, String str, boolean z);

    /* renamed from: a */
    void mo15902a(C8893a aVar);

    /* renamed from: a */
    void mo15903a(String str);

    /* renamed from: b */
    void mo15904b(WebView webView);

    /* renamed from: b */
    void mo15905b(WebView webView, String str, boolean z);

    /* renamed from: b */
    void mo15906b(C8893a aVar);

    /* renamed from: c */
    void mo15907c(WebView webView);

    /* renamed from: c */
    void mo15908c(C8893a aVar);

    /* renamed from: d */
    String mo15909d(WebView webView);
}
