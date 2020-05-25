package com.bytedance.android.monitor.p462b;

import com.C2240a;
import com.bytedance.android.monitor.p461a.C8873d;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.monitor.b.e */
public class C8879e extends C8876b implements C8873d {

    /* renamed from: b */
    private static Map<String, String> f24187b;

    /* renamed from: c */
    private static volatile C8873d f24188c;

    /* renamed from: a */
    private String f24189a;

    private C8879e() {
    }

    /* renamed from: b */
    public static C8873d m17459b() {
        if (f24188c == null) {
            synchronized (C8879e.class) {
                if (f24188c == null) {
                    f24188c = new C8879e();
                }
            }
        }
        return f24188c;
    }

    static {
        HashMap hashMap = new HashMap();
        f24187b = hashMap;
        hashMap.put("pv", C2240a.m6772a("tt%s_webview_timing_monitor_pv_service", new Object[]{CustomActionPushReceiver.f104061f}));
        f24187b.put("overview", C2240a.m6772a("tt%s_webview_timing_monitor_overview_service", new Object[]{CustomActionPushReceiver.f104061f}));
        f24187b.put("performance", C2240a.m6772a("tt%s_webview_timing_monitor_performance_service", new Object[]{CustomActionPushReceiver.f104061f}));
        f24187b.put("resource", C2240a.m6772a("tt%s_webview_timing_monitor_resource_service", new Object[]{CustomActionPushReceiver.f104061f}));
        f24187b.put("error", C2240a.m6772a("tt%s_webview_timing_monitor_error_service", new Object[]{CustomActionPushReceiver.f104061f}));
        f24187b.put("diff", C2240a.m6772a("tt%s_webview_timing_monitor_diff_service", new Object[]{CustomActionPushReceiver.f104061f}));
        f24187b.put("custom", C2240a.m6772a("tt%s_webview_timing_monitor_custom_service", new Object[]{CustomActionPushReceiver.f104061f}));
        f24187b.put("newcustom", C2240a.m6772a("bd%s_hybrid_monitor_custom_service", new Object[]{CustomActionPushReceiver.f104061f}));
    }

    /* renamed from: b */
    public final String mo15870b(String str) {
        String str2 = (String) f24187b.get(str);
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo15869a(String str) {
        this.f24189a = str;
        f24187b.clear();
        f24187b.put("pv", C2240a.m6772a("tt%s_webview_timing_monitor_pv_service", new Object[]{this.f24189a}));
        f24187b.put("overview", C2240a.m6772a("tt%s_webview_timing_monitor_overview_service", new Object[]{this.f24189a}));
        f24187b.put("performance", C2240a.m6772a("tt%s_webview_timing_monitor_performance_service", new Object[]{this.f24189a}));
        f24187b.put("resource", C2240a.m6772a("tt%s_webview_timing_monitor_resource_service", new Object[]{this.f24189a}));
        f24187b.put("error", C2240a.m6772a("tt%s_webview_timing_monitor_error_service", new Object[]{this.f24189a}));
        f24187b.put("diff", C2240a.m6772a("tt%s_webview_timing_monitor_diff_service", new Object[]{this.f24189a}));
        f24187b.put("custom", C2240a.m6772a("tt%s_webview_timing_monitor_custom_service", new Object[]{this.f24189a}));
        f24187b.put("newcustom", C2240a.m6772a("bd%s_hybrid_monitor_custom_service", new Object[]{this.f24189a}));
    }
}
