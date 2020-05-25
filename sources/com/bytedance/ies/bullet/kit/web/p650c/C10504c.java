package com.bytedance.ies.bullet.kit.web.p650c;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C8889a;
import com.bytedance.android.monitor.webview.C8892c;
import com.bytedance.android.monitor.webview.C8892c.C8893a;
import com.bytedance.android.monitor.webview.C8894d;
import com.bytedance.android.monitor.webview.C8896f;
import com.bytedance.android.monitor.webview.C8902j;
import com.bytedance.ies.bullet.p628b.p629a.C10238a;
import com.bytedance.ies.bullet.p628b.p629a.C10240c;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p641h.C10345a;
import com.bytedance.ies.bullet.p628b.p641h.C10358e;
import com.bytedance.ies.bullet.p628b.p641h.C10359f;
import com.bytedance.ies.bullet.p628b.p641h.C10360g;
import com.bytedance.ies.bullet.p628b.p641h.C10362i;
import com.bytedance.ies.bullet.p628b.p641h.C10365k;
import com.bytedance.ies.bullet.p628b.p641h.C10366l;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.bullet.kit.web.c.c */
public final class C10504c extends C10345a {

    /* renamed from: l */
    static final /* synthetic */ C52767h[] f27947l = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10504c.class), "timingInfoFetcher", "getTimingInfoFetcher()Lcom/bytedance/ies/bullet/core/monitor/TimingMetricFetcher;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10504c.class), "resourceTimingFetcher", "getResourceTimingFetcher()Lcom/bytedance/ies/bullet/core/monitor/TimingMetricFetcher;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10504c.class), "blankMonitor", "getBlankMonitor()Lcom/bytedance/ies/bullet/kit/web/monitor/H5BlankScreenMonitor;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10504c.class), "enablePerformanceMonitor", "getEnablePerformanceMonitor()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10504c.class), "container", "getContainer()Landroid/webkit/WebView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10504c.class), "monitorHelper", "getMonitorHelper()Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitorHelper;"))};

    /* renamed from: r */
    public static final C10505a f27948r = new C10505a(null);

    /* renamed from: m */
    final C52668f f27949m;

    /* renamed from: n */
    public boolean f27950n;

    /* renamed from: o */
    public long f27951o;

    /* renamed from: p */
    public long f27952p;

    /* renamed from: q */
    public final Map<Uri, Long> f27953q;

    /* renamed from: s */
    private final int f27954s;

    /* renamed from: t */
    private final C52668f f27955t = C52732g.m112286a(C52757k.NONE, C10512g.f27968a);

    /* renamed from: u */
    private final C52668f f27956u = C52732g.m112286a(C52757k.NONE, C10511f.f27967a);

    /* renamed from: v */
    private final C52668f f27957v = C52732g.m112286a(C52757k.NONE, new C10506b(this));

    /* renamed from: w */
    private final List<String> f27958w = new ArrayList();

    /* renamed from: x */
    private final C52668f f27959x;

    /* renamed from: y */
    private final C52668f f27960y;

    /* renamed from: com.bytedance.ies.bullet.kit.web.c.c$a */
    public static final class C10505a {
        private C10505a() {
        }

        public /* synthetic */ C10505a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.c.c$b */
    static final class C10506b extends C52712l implements C52670a<C10500a> {

        /* renamed from: a */
        final /* synthetic */ C10504c f27961a;

        C10506b(C10504c cVar) {
            this.f27961a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C10358e c = this.f27961a.mo18412c();
            if (c == null || !c.mo18426c()) {
                return null;
            }
            return new C10500a(this.f27961a.mo18653i(), this.f27961a.mo18411b(), this.f27961a.mo18412c());
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.c.c$c */
    static final class C10507c extends C52712l implements C52670a<WebView> {

        /* renamed from: a */
        final /* synthetic */ C10326b f27962a;

        C10507c(C10326b bVar) {
            this.f27962a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = (View) this.f27962a.mo18401c(View.class);
            if (view != null) {
                if (!(view instanceof WebView)) {
                    view = null;
                }
                if (view != null) {
                    if (view != null) {
                        return (WebView) view;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.webkit.WebView");
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.c.c$d */
    static final class C10508d extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C10504c f27963a;

        /* renamed from: b */
        final /* synthetic */ Uri f27964b;

        C10508d(C10504c cVar, Uri uri) {
            this.f27963a = cVar;
            this.f27964b = uri;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.f27963a.mo18410a(this.f27964b));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.c.c$e */
    static final class C10509e extends C52712l implements C52670a<C8892c> {

        /* renamed from: a */
        final /* synthetic */ C10504c f27965a;

        /* renamed from: b */
        final /* synthetic */ C10326b f27966b;

        /* renamed from: com.bytedance.ies.bullet.kit.web.c.c$e$a */
        static final /* synthetic */ class C10510a extends C52710j implements C52687r<String, Integer, JSONObject, JSONObject, C52860x> {
            C10510a(C10504c cVar) {
                super(4, cVar);
            }

            public final String getName() {
                return "monitorStatusAndDuration";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(C10504c.class);
            }

            public final String getSignature() {
                return "monitorStatusAndDuration(Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;Lorg/json/JSONObject;)V";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
                ((C10504c) this.receiver).mo18408a((String) obj, (Integer) obj2, (JSONObject) obj3, (JSONObject) obj4);
                return C52860x.f131107a;
            }
        }

        C10509e(C10504c cVar, C10326b bVar) {
            this.f27965a = cVar;
            this.f27966b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String str;
            String str2 = null;
            if (!((Boolean) this.f27965a.f27949m.getValue()).booleanValue()) {
                return null;
            }
            C8892c b = C8902j.m17571b();
            C8893a a = b.mo15894a();
            a.mo15915b("HybridMonitor");
            C10238a aVar = (C10238a) this.f27966b.mo18401c(C10238a.class);
            if (aVar != null) {
                str = aVar.f27633d;
            } else {
                str = null;
            }
            a.mo15917d(str);
            a.mo15911a((C8894d) C8896f.m17517a());
            a.mo15913a(b.mo15909d(this.f27965a.mo18653i()));
            a.mo15910a((C8889a) new C10513d(new C10510a(this.f27965a)));
            a.mo15912a(true);
            C10358e c = this.f27965a.mo18412c();
            if (c != null) {
                str2 = c.mo18425b();
            }
            a.mo15916c(str2);
            if (this.f27965a.mo18653i() == null) {
                b.mo15908c(a);
            } else {
                b.mo15902a(a);
            }
            return b;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.c.c$f */
    static final class C10511f extends C52712l implements C52670a<C10366l> {

        /* renamed from: a */
        public static final C10511f f27967a = new C10511f();

        C10511f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C10366l(C52575l.m112101c(new C10365k("redirectStart", "redirectEnd", "redirect_interval"), new C10365k("fetchStart", "domainLookupStart", "app_cache_interval"), new C10365k("domainLookupStart", "domainLookupEnd", "dns_interval"), new C10365k("connectStart", "connectEnd", "tcp_interval"), new C10365k("requestStart", "responseStart", "request_interval"), new C10365k("responseStart", "responseEnd", "response_interval")));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.c.c$g */
    static final class C10512g extends C52712l implements C52670a<C10366l> {

        /* renamed from: a */
        public static final C10512g f27968a = new C10512g();

        C10512g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C10366l(C52575l.m112101c(new C10365k("redirectStart", "redirectEnd", "redirect_interval"), new C10365k("fetchStart", "domainLookupStart", "app_cache_interval"), new C10365k("domainLookupStart", "domainLookupEnd", "dns_interval"), new C10365k("connectStart", "connectEnd", "tcp_interval"), new C10365k("requestStart", "responseStart", "request_interval"), new C10365k("responseStart", "responseEnd", "response_interval"), new C10365k("domLoading", "domInteractive", "dom_load_interval"), new C10365k("domContentLoadedEventStart", "domContentLoadedEventEnd", "dom_content_loaded_interval"), new C10365k("domContentLoadedEventEnd", "domComplete", "dom_complete_interval")));
        }
    }

    /* renamed from: a */
    public final int mo18406a() {
        return this.f27954s;
    }

    /* renamed from: h */
    public final C10500a mo18652h() {
        return (C10500a) this.f27957v.getValue();
    }

    /* renamed from: i */
    public final WebView mo18653i() {
        return (WebView) this.f27959x.getValue();
    }

    /* renamed from: j */
    public final C8892c mo18654j() {
        return (C8892c) this.f27960y.getValue();
    }

    /* renamed from: g */
    public final void mo18420g() {
        super.mo18420g();
        C8892c j = mo18654j();
        if (j != null) {
            j.mo15903a(j.mo15909d(mo18653i()));
        }
    }

    /* renamed from: a */
    public final void mo18417a(View view) {
        C10500a h = mo18652h();
        if (h != null) {
            h.mo18643e();
        }
    }

    /* renamed from: b */
    public final void mo18419b(View view) {
        C10500a h = mo18652h();
        if (h != null) {
            h.mo18641d();
            C10345a.m20912a(this, "hybrid_app_monitor_h5_blank_screen", mo18415f(), h.mo18629a(), h.mo18637b(), null, 16, null);
        }
    }

    /* renamed from: a */
    public final void mo18418a(String str) {
        C52711k.m112240b(str, "id");
        super.mo18418a(str);
        this.f27950n = true;
        this.f27951o = System.currentTimeMillis();
        C10500a h = mo18652h();
        if (h != null) {
            h.mo18646g(mo18414e().mo18433b());
        }
        C10500a h2 = mo18652h();
        if (h2 != null) {
            h2.mo18635a(mo18414e().mo18433b());
        }
        C8892c j = mo18654j();
        if (j != null) {
            j.mo15907c(mo18653i());
        }
        C10359f e = mo18414e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        C10345a.m20912a(this, "hybrid_app_monitor_load_url_event", e, jSONObject, null, null, 24, null);
        mo18651a(mo18414e().f27797a, "load_url");
    }

    /* renamed from: a */
    public final boolean mo18651a(Uri uri, String str) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            Locale locale = Locale.getDefault();
            C52711k.m112236a((Object) locale, "Locale.getDefault()");
            if (scheme != null) {
                String lowerCase = scheme.toLowerCase(locale);
                C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!C52711k.m112239a((Object) lowerCase, (Object) "file")) {
                    scheme = null;
                }
                if (scheme != null) {
                    C10359f f = mo18415f();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trigger", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("resource_url", String.valueOf(uri));
                    C10345a.m20912a(this, "hybrid_app_monitor_file_schema_event", f, jSONObject, jSONObject2, null, 16, null);
                    return true;
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    public C10504c(Uri uri, C10326b bVar, String str, String str2) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(bVar, "providerFactory");
        C52711k.m112240b(str, "bid");
        C52711k.m112240b(str2, "pid");
        super(uri, bVar, str, str2);
        this.f27949m = C52732g.m112286a(C52757k.NONE, new C10508d(this, uri));
        this.f27959x = C52732g.m112286a(C52757k.NONE, new C10507c(bVar));
        this.f27960y = C52732g.m112286a(C52757k.NONE, new C10509e(this, bVar));
        this.f27950n = true;
        this.f27953q = new LinkedHashMap();
    }

    /* renamed from: a */
    public final void mo18408a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        String str2 = str;
        JSONObject jSONObject3 = jSONObject2;
        super.mo18408a(str, num, jSONObject, jSONObject2);
        Double d = null;
        if ((str2 == null || !C52830p.m112413c(str2, "webview_timing_monitor_custom_service", false, 2, null)) && jSONObject3 != null) {
            try {
                String optString = jSONObject3.optString("navigation_id");
                String optString2 = jSONObject3.optString("ev_type");
                if (optString2 != null) {
                    switch (optString2.hashCode()) {
                        case -1077756671:
                            if (optString2.equals("memory")) {
                                C10359f f = mo18415f();
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("navigation_id", optString);
                                C10345a.m20912a(this, "hybrid_app_monitor_js_memory", f, jSONObject4, jSONObject3.optJSONObject("event"), null, 16, null);
                                break;
                            }
                            break;
                        case -270976012:
                            if (optString2.equals("performance_interval")) {
                                JSONObject optJSONObject = jSONObject3.optJSONObject("event");
                                if (optJSONObject != null) {
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("navigation");
                                    if (optJSONObject2 != null) {
                                        Iterator keys = optJSONObject2.keys();
                                        if (keys != null) {
                                            while (keys.hasNext()) {
                                                String str3 = (String) keys.next();
                                                Double valueOf = Double.valueOf(optJSONObject2.optDouble(str3, ProfileUiInitOptimizeEnterThreshold.DEFAULT));
                                                if (valueOf.doubleValue() <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.f27958w.contains(str3)) {
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                                if (!z) {
                                                    valueOf = null;
                                                }
                                                if (valueOf != null) {
                                                    valueOf.doubleValue();
                                                    List<String> list = this.f27958w;
                                                    C52711k.m112236a((Object) str3, "eventKey");
                                                    list.add(str3);
                                                    C10359f f2 = mo18415f();
                                                    JSONObject jSONObject5 = new JSONObject();
                                                    jSONObject5.put("trigger", str3);
                                                    jSONObject5.put("navigation_id", optString);
                                                    JSONObject a = C10362i.m20948a(str3, optJSONObject2, (C10366l) this.f27955t.getValue());
                                                    C10345a.m20912a(this, "hybrid_app_monitor_h5_timeline_event", f2, jSONObject5, a, null, 16, null);
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 101609:
                            if (optString2.equals("fps")) {
                                JSONObject optJSONObject3 = jSONObject3.optJSONObject("event");
                                if (optJSONObject3 != null) {
                                    d = Double.valueOf(optJSONObject3.optDouble("fps"));
                                }
                                C10359f f3 = mo18415f();
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("navigation_id", optString);
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("fps", d);
                                C10345a.m20912a(this, "hybrid_app_monitor_js_fps", f3, jSONObject6, jSONObject7, null, 16, null);
                                break;
                            }
                            break;
                        case 1669986551:
                            if (optString2.equals("static_error")) {
                                JSONObject optJSONObject4 = jSONObject3.optJSONObject("event");
                                String str4 = "hybrid_app_monitor_load_resource_error";
                                C10359f f4 = mo18415f();
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("navigation_id", optString);
                                if (optJSONObject4 != null) {
                                    Uri parse = Uri.parse(optJSONObject4.optString("st_url"));
                                    C52711k.m112236a((Object) parse, "Uri.parse(it.optString(\"st_url\"))");
                                    C10240c.m20716a(jSONObject8, new C10360g(parse, "resource").mo18402a());
                                }
                                C10345a.m20912a(this, str4, f4, jSONObject8, null, null, 24, null);
                                break;
                            }
                            break;
                        case 1837434847:
                            if (optString2.equals("static_performance")) {
                                JSONObject optJSONObject5 = jSONObject3.optJSONObject("event");
                                if (optJSONObject5 != null) {
                                    JSONArray optJSONArray = optJSONObject5.optJSONArray("resources");
                                    if (optJSONArray != null) {
                                        int length = optJSONArray.length();
                                        for (int i = 0; i < length; i++) {
                                            JSONObject optJSONObject6 = optJSONArray.optJSONObject(i);
                                            if (optJSONObject6 != null) {
                                                String optString3 = optJSONObject6.optString(LeakCanaryFileProvider.f132049i);
                                                C10359f f5 = mo18415f();
                                                JSONObject jSONObject9 = new JSONObject();
                                                jSONObject9.put("trigger", "on_load_resource");
                                                jSONObject9.put("navigation_id", optString);
                                                Uri parse2 = Uri.parse(optString3);
                                                C52711k.m112236a((Object) parse2, "Uri.parse(url)");
                                                C10240c.m20716a(jSONObject9, new C10360g(parse2, "resource").mo18402a());
                                                C10345a.m20912a(this, "hybrid_app_monitor_load_resource_event", f5, jSONObject9, C10362i.m20949a(optJSONObject6, (C10366l) this.f27956u.getValue()), null, 16, null);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
