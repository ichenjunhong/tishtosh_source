package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C8889a;
import com.bytedance.android.monitor.webview.C8892c;
import com.bytedance.android.monitor.webview.C8892c.C8893a;
import com.bytedance.android.monitor.webview.C8894d;
import com.bytedance.android.monitor.webview.C8896f;
import com.bytedance.android.monitor.webview.C8902j;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.p1330a.C22477a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b.C22498c;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b.C22499d;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b.C22500e;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b.C22503h;
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
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.af.a.j */
public final class C22515j extends C22488af implements C22524n {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f60644d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22515j.class), "container", "getContainer()Landroid/webkit/WebView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22515j.class), "blankMonitor", "getBlankMonitor()Lcom/ss/android/ugc/aweme/hybrid/monitor/h5/H5BlankScreenMonitor;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22515j.class), "monitorHelper", "getMonitorHelper()Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitorHelper;"))};

    /* renamed from: i */
    private final List<String> f60645i = new ArrayList();

    /* renamed from: j */
    private final C52668f f60646j = C52732g.m112286a(C52757k.NONE, new C22517b(this));

    /* renamed from: k */
    private final C52668f f60647k = C52732g.m112286a(C52757k.NONE, new C22516a(this));

    /* renamed from: l */
    private final C52668f f60648l = C52732g.m112286a(C52757k.NONE, new C22518c(this));

    /* renamed from: m */
    private boolean f60649m;

    /* renamed from: n */
    private List<String> f60650n = C52575l.m112097a();

    /* renamed from: o */
    private boolean f60651o = true;

    /* renamed from: p */
    private long f60652p;

    /* renamed from: q */
    private long f60653q;

    /* renamed from: r */
    private final Map<Uri, Long> f60654r = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.af.a.j$a */
    static final class C22516a extends C52712l implements C52670a<C22477a> {

        /* renamed from: a */
        final /* synthetic */ C22515j f60655a;

        C22516a(C22515j jVar) {
            this.f60655a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C22526p g = this.f60655a.mo46825g();
            List list = null;
            if (g == null || !g.mo46876d()) {
                return null;
            }
            WebView c = this.f60655a.mo46864c();
            C22526p g2 = this.f60655a.mo46825g();
            if (g2 != null) {
                list = g2.mo46877e();
            }
            return new C22477a(c, list, this.f60655a.mo46826h(), this.f60655a.mo46825g());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.af.a.j$b */
    static final class C22517b extends C52712l implements C52670a<WebView> {

        /* renamed from: a */
        final /* synthetic */ C22515j f60656a;

        C22517b(C22515j jVar) {
            this.f60656a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = (View) this.f60656a.f60597g.mo46846a(View.class);
            View view2 = null;
            if (view != null) {
                if (!(view instanceof WebView)) {
                    view = null;
                }
                if (view != null) {
                    if (view != null) {
                        view2 = (WebView) view;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.webkit.WebView");
                    }
                }
            }
            return (WebView) view2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.af.a.j$c */
    static final class C22518c extends C52712l implements C52670a<C8892c> {

        /* renamed from: a */
        final /* synthetic */ C22515j f60657a;

        /* renamed from: com.ss.android.ugc.aweme.af.a.j$c$a */
        static final /* synthetic */ class C22519a extends C52710j implements C52687r<String, Integer, JSONObject, JSONObject, C52860x> {
            C22519a(C22515j jVar) {
                super(4, jVar);
            }

            public final String getName() {
                return "monitorStatusAndDuration";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(C22515j.class);
            }

            public final String getSignature() {
                return "monitorStatusAndDuration(Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;Lorg/json/JSONObject;)V";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
                ((C22515j) this.receiver).mo46821a((String) obj, (Integer) obj2, (JSONObject) obj3, (JSONObject) obj4);
                return C52860x.f131107a;
            }
        }

        C22518c(C22515j jVar) {
            this.f60657a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String str;
            C8892c b = C8902j.m17571b();
            C8893a a = b.mo15894a();
            a.mo15915b("HybridMonitor");
            a.mo15917d("douyin");
            a.mo15911a((C8894d) C8896f.m17517a());
            a.mo15913a(b.mo15909d(this.f60657a.mo46864c()));
            a.mo15910a((C8889a) new C22520k(new C22519a(this.f60657a)));
            if (this.f60657a.f60538b) {
                a.mo15912a(true);
                C22526p g = this.f60657a.mo46825g();
                if (g != null) {
                    str = g.mo46875c();
                } else {
                    str = null;
                }
                a.mo15916c(str);
            }
            if (this.f60657a.mo46864c() == null) {
                b.mo15908c(a);
            } else {
                b.mo15902a(a);
            }
            return b;
        }
    }

    /* renamed from: l */
    private final C22477a m55605l() {
        return (C22477a) this.f60647k.getValue();
    }

    /* renamed from: m */
    private C8892c m55606m() {
        return (C8892c) this.f60648l.getValue();
    }

    /* renamed from: n */
    private List<String> m55607n() {
        return this.f60650n;
    }

    /* renamed from: c */
    public final WebView mo46864c() {
        return (WebView) this.f60646j.getValue();
    }

    /* renamed from: a */
    public final void mo46783a(String str, boolean z) {
        C52711k.m112240b(str, "id");
        super.mo46783a(str, z);
        this.f60651o = true;
        this.f60652p = System.currentTimeMillis();
        C22477a l = m55605l();
        if (l != null) {
            l.mo46803h(bg_().mo46880b());
        }
        C22477a l2 = m55605l();
        if (l2 != null) {
            l2.mo46791a(bg_().mo46880b());
        }
        m55606m().mo15907c(mo46864c());
        C22532u bg_ = bg_();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        C22488af.m55575a(this, "hybrid_app_monitor_load_url_event", bg_, jSONObject, null, null, 24, null);
        m55603a(bg_().f60664a, "load_url");
    }

    /* renamed from: a */
    public final void mo46855a(C22493b bVar, C22505c cVar) {
        C52711k.m112240b(bVar, "request");
        String str = "hybrid_app_monitor_fetch_api_error";
        C22532u j = mo46828j();
        JSONObject jSONObject = new JSONObject();
        C22507e.m55596a(jSONObject, bVar.getFormatData());
        if (cVar == null) {
            jSONObject.put("error_type", "success");
        } else {
            C22507e.m55596a(jSONObject, cVar.getFormatData());
        }
        C22488af.m55575a(this, str, j, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    public final void mo46856a(String str) {
        String str2 = "should_intercept_request";
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                if (m55603a(parse, str2)) {
                    parse = null;
                }
                if (parse != null) {
                    m55604b(parse, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo46853a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46790a(webResourceRequest, webResourceResponse);
        }
        String str = "hybrid_app_monitor_h5_received_error";
        C22532u bg_ = bg_();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_http_error");
        if (webResourceResponse != null) {
            jSONObject.put("received_status_code", String.valueOf(webResourceResponse.getStatusCode()));
        }
        if (webResourceRequest != null) {
            Uri url = webResourceRequest.getUrl();
            if (url != null) {
                jSONObject.put("failing_url", url.toString());
            }
        }
        C22488af.m55575a(this, str, bg_, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    public final void mo46858a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C52711k.m112240b(str, "serviceName");
        C52711k.m112240b(str2, "triggerFrom");
        C22532u bg_ = bg_();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("trigger", str2);
        if (jSONObject != null) {
            C22507e.m55596a(jSONObject4, jSONObject);
        }
        mo46820a(str, bg_, jSONObject4, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public final void mo46857a(String str, String str2, String str3, long j) {
        String str4 = "hybrid_app_monitor_h5_download";
        C22532u bg_ = bg_();
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("download_url", str);
        }
        if (str2 != null) {
            jSONObject.put("content_disposition", str2);
        }
        if (str3 != null) {
            jSONObject.put("mime_type", str3);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("content_length", j);
        C22488af.m55575a(this, str4, bg_, jSONObject, jSONObject2, null, 16, null);
    }

    /* renamed from: a */
    public final void mo46821a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4 = jSONObject2;
        super.mo46821a(str, num, jSONObject, jSONObject2);
        if (!C52711k.m112239a((Object) "ttdouyin_webview_timing_monitor_custom_service", (Object) str) && jSONObject4 != null) {
            try {
                String optString = jSONObject4.optString("navigation_id");
                String optString2 = jSONObject4.optString("ev_type");
                if (optString2 != null) {
                    Double d = null;
                    switch (optString2.hashCode()) {
                        case -1077756671:
                            if (optString2.equals("memory")) {
                                C22532u j = mo46828j();
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("navigation_id", optString);
                                C22488af.m55575a(this, "hybrid_app_monitor_js_memory", j, jSONObject5, jSONObject4.optJSONObject("event"), null, 16, null);
                                break;
                            }
                            break;
                        case -270976012:
                            if (optString2.equals("performance_interval")) {
                                JSONObject optJSONObject = jSONObject4.optJSONObject("event");
                                if (optJSONObject != null) {
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("navigation");
                                    if (optJSONObject2 != null) {
                                        Iterator keys = optJSONObject2.keys();
                                        if (keys != null) {
                                            while (keys.hasNext()) {
                                                String str2 = (String) keys.next();
                                                Double valueOf = Double.valueOf(optJSONObject2.optDouble(str2, ProfileUiInitOptimizeEnterThreshold.DEFAULT));
                                                if (!(valueOf.doubleValue() > ProfileUiInitOptimizeEnterThreshold.DEFAULT && !this.f60645i.contains(str2))) {
                                                    valueOf = null;
                                                }
                                                if (valueOf != null) {
                                                    valueOf.doubleValue();
                                                    List<String> list = this.f60645i;
                                                    C52711k.m112236a((Object) str2, "eventKey");
                                                    list.add(str2);
                                                    String str3 = "hybrid_app_monitor_h5_timeline_event";
                                                    C22532u j2 = mo46828j();
                                                    JSONObject jSONObject6 = new JSONObject();
                                                    jSONObject6.put("trigger", str2);
                                                    jSONObject6.put("navigation_id", optString);
                                                    C22500e eVar = C22500e.f60621a;
                                                    C22498c cVar = C22498c.H5_TIMING;
                                                    C52711k.m112240b(str2, "curTrigger");
                                                    C52711k.m112240b(optJSONObject2, "metrics");
                                                    C52711k.m112240b(cVar, "type");
                                                    C22503h a = C22500e.m55592a(cVar);
                                                    if (a != null) {
                                                        C22499d a2 = a.mo46843a(str2, optJSONObject2);
                                                        if (a2 != null) {
                                                            jSONObject3 = new JSONObject();
                                                            jSONObject3.put(a2.f60619a, a2.f60620b);
                                                            C22488af.m55575a(this, str3, j2, jSONObject6, jSONObject3, null, 16, null);
                                                        }
                                                    }
                                                    jSONObject3 = null;
                                                    C22488af.m55575a(this, str3, j2, jSONObject6, jSONObject3, null, 16, null);
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
                                JSONObject optJSONObject3 = jSONObject4.optJSONObject("event");
                                if (optJSONObject3 != null) {
                                    d = Double.valueOf(optJSONObject3.optDouble("fps"));
                                }
                                C22532u j3 = mo46828j();
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("navigation_id", optString);
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("fps", d);
                                C22488af.m55575a(this, "hybrid_app_monitor_js_fps", j3, jSONObject7, jSONObject8, null, 16, null);
                                break;
                            }
                            break;
                        case 1669986551:
                            if (optString2.equals("static_error")) {
                                JSONObject optJSONObject4 = jSONObject4.optJSONObject("event");
                                String str4 = "hybrid_app_monitor_load_resource_error";
                                C22532u j4 = mo46828j();
                                JSONObject jSONObject9 = new JSONObject();
                                jSONObject9.put("navigation_id", optString);
                                if (optJSONObject4 != null) {
                                    Uri parse = Uri.parse(optJSONObject4.optString("st_url"));
                                    C52711k.m112236a((Object) parse, "Uri.parse(it.optString(\"st_url\"))");
                                    C22534w wVar = new C22534w(parse, "resource_", null, 4, null);
                                    C22507e.m55596a(jSONObject9, wVar.getFormatData());
                                }
                                C22488af.m55575a(this, str4, j4, jSONObject9, null, null, 24, null);
                                break;
                            }
                            break;
                        case 1837434847:
                            if (optString2.equals("static_performance")) {
                                JSONObject optJSONObject5 = jSONObject4.optJSONObject("event");
                                if (optJSONObject5 != null) {
                                    JSONArray optJSONArray = optJSONObject5.optJSONArray("resources");
                                    if (optJSONArray != null) {
                                        int length = optJSONArray.length();
                                        for (int i = 0; i < length; i++) {
                                            JSONObject optJSONObject6 = optJSONArray.optJSONObject(i);
                                            if (optJSONObject6 != null) {
                                                String optString3 = optJSONObject6.optString(LeakCanaryFileProvider.f132049i);
                                                C22532u j5 = mo46828j();
                                                JSONObject jSONObject10 = new JSONObject();
                                                jSONObject10.put("trigger", "on_load");
                                                jSONObject10.put("navigation_id", optString);
                                                Uri parse2 = Uri.parse(optString3);
                                                C52711k.m112236a((Object) parse2, "Uri.parse(url)");
                                                C22534w wVar2 = new C22534w(parse2, "resource_", null, 4, null);
                                                C22507e.m55596a(jSONObject10, wVar2.getFormatData());
                                                C22488af.m55575a(this, "hybrid_app_monitor_load_resource_event", j5, jSONObject10, C22500e.f60621a.mo46842a(optJSONObject6, C22498c.H5_RESOURCE_TIMING), null, 16, null);
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

    /* renamed from: a */
    public final void mo46820a(String str, C22532u uVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(uVar, "identifier");
        try {
            m55602a(uVar, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            mo46819a(e, uVar.mo46880b(), "h5");
        }
    }

    /* renamed from: d */
    public final void mo46866d() {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46795c();
        }
    }

    /* renamed from: b */
    public final void mo46784b() {
        super.mo46784b();
        C8892c m = m55606m();
        m.mo15903a(m.mo15909d(mo46864c()));
    }

    /* renamed from: a */
    public final void mo46860a(boolean z) {
        this.f60649m = z;
    }

    /* renamed from: a */
    public final void mo46859a(List<String> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f60650n = list;
    }

    /* renamed from: a */
    public final void mo46851a(View view) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46799e();
        }
    }

    /* renamed from: e */
    public final void mo46868e(String str) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46802g(str);
        }
    }

    /* renamed from: f */
    public final void mo46869f(String str) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46800e(str);
        }
    }

    /* renamed from: c */
    public final void mo46865c(String str) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46798d(str);
        }
    }

    /* renamed from: d */
    public final void mo46867d(String str) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46801f(str);
        }
    }

    /* renamed from: b */
    public final void mo46862b(View view) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46797d();
            C22488af.m55575a(this, "hybrid_app_monitor_h5_blank_screen", mo46828j(), l.mo46785a(), l.mo46793b(), null, 16, null);
        }
    }

    /* renamed from: b */
    public final void mo46863b(String str) {
        String str2 = "should_override_url_loading";
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                if (m55603a(parse, str2)) {
                    parse = null;
                }
                if (parse != null) {
                    m55604b(parse, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo46849a(Uri uri) {
        boolean z;
        C22515j jVar;
        Uri uri2 = uri;
        C52711k.m112240b(uri2, "uri");
        boolean z2 = false;
        if (C52711k.m112239a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C52711k.m112239a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (!z) {
            uri2 = null;
        }
        if (uri2 != null) {
            C22535x j = mo46828j();
            C52711k.m112240b(uri2, "value");
            j.f60668c = uri2;
            C22534w wVar = new C22534w(j.f60668c, "page_", null, 4, null);
            j.f60667b = wVar;
            C22477a l = m55605l();
            if (l != null) {
                l.mo46794b(mo46828j().f60667b.mo46880b());
            }
            m55606m().mo15895a(mo46864c());
            long currentTimeMillis = System.currentTimeMillis();
            this.f60654r.put(uri2, Long.valueOf(currentTimeMillis));
            if (!this.f60651o) {
                jVar = this;
            } else {
                jVar = null;
            }
            C22515j jVar2 = jVar;
            if (jVar2 != null) {
                String str = "hybrid_app_monitor_load_url_event";
                C22532u bg_ = jVar2.bg_();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trigger", "navigation_start");
                jSONObject2.put("is_first_screen", "navigation");
                JSONObject jSONObject3 = new JSONObject();
                if (jVar2.f60653q > 0 && jVar2.f60652p > 0) {
                    z2 = true;
                }
                if (z2) {
                    jSONObject = jSONObject3;
                }
                if (jSONObject != null) {
                    jSONObject.put("first_screen_page_load_interval", jVar2.f60653q - jVar2.f60652p);
                }
                jSONObject3.put("event_ts", currentTimeMillis);
                C22488af.m55575a(jVar2, str, bg_, jSONObject2, jSONObject3, null, 16, null);
            }
        }
    }

    /* renamed from: b */
    public final void mo46861b(Uri uri) {
        boolean z;
        String str;
        boolean z2;
        JSONObject jSONObject;
        Uri uri2 = uri;
        C52711k.m112240b(uri2, "uri");
        boolean z3 = true;
        if (C52711k.m112239a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C52711k.m112239a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject2 = null;
        if (!z) {
            uri2 = null;
        }
        if (uri2 != null) {
            Long l = (Long) this.f60654r.remove(uri2);
            if (l != null) {
                long longValue = l.longValue();
                C22477a l2 = m55605l();
                if (l2 != null) {
                    l2.mo46796c(mo46828j().f60667b.mo46880b());
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f60651o) {
                    longValue = this.f60652p;
                }
                if (this.f60651o) {
                    this.f60653q = currentTimeMillis;
                }
                String str2 = "hybrid_app_monitor_load_url_event";
                C22532u bg_ = bg_();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("trigger", "on_load");
                String str3 = "is_first_screen";
                if (this.f60651o) {
                    str = "first_screen";
                } else {
                    str = "navigation";
                }
                jSONObject3.put(str3, str);
                JSONObject jSONObject4 = new JSONObject();
                if (currentTimeMillis <= 0 || longValue <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    jSONObject = jSONObject4;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject.put("page_load_interval", currentTimeMillis - longValue);
                }
                if (this.f60653q <= 0 || this.f60652p <= 0) {
                    z3 = false;
                }
                if (z3) {
                    jSONObject2 = jSONObject4;
                }
                if (jSONObject2 != null) {
                    jSONObject2.put("first_screen_page_load_interval", this.f60653q - this.f60652p);
                }
                jSONObject4.put("event_ts", currentTimeMillis);
                C22488af.m55575a(this, str2, bg_, jSONObject3, jSONObject4, null, 16, null);
                this.f60651o = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo46850a(SslError sslError) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46788a(sslError);
        }
        String str = "hybrid_app_monitor_h5_received_error";
        C22532u bg_ = bg_();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_ssl_error");
        if (sslError != null) {
            jSONObject.put("received_primary_error", String.valueOf(sslError.getPrimaryError()));
            jSONObject.put("failing_url", sslError.getUrl());
        }
        C22488af.m55575a(this, str, bg_, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    public final void mo46854a(WebView webView, int i) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46786a(i);
        }
        m55606m().mo15896a(webView, i);
    }

    /* renamed from: a */
    public final void mo46848a(int i, String str) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46787a(i, str);
        }
        String str2 = "hybrid_app_monitor_h5_received_error";
        C22532u bg_ = bg_();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_error");
        jSONObject.put("received_error_code", String.valueOf(i));
        if (str != null) {
            jSONObject.put("failing_url", str);
        }
        C22488af.m55575a(this, str2, bg_, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    private final boolean m55603a(Uri uri, String str) {
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
                    C22532u j = mo46828j();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trigger", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("resource_url", String.valueOf(uri));
                    C22488af.m55575a(this, "hybrid_app_monitor_file_schema_event", j, jSONObject, jSONObject2, null, 16, null);
                    return true;
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m55604b(android.net.Uri r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = r14.getScheme()
            r1 = 0
            if (r0 == 0) goto L_0x00b7
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "Locale.getDefault()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            if (r0 == 0) goto L_0x00af
            java.lang.String r2 = r0.toLowerCase(r2)
            java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r3 = "http"
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            r4 = 1
            if (r3 != 0) goto L_0x002f
            java.lang.String r3 = "https"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            if (r2 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r2 = 0
            goto L_0x0030
        L_0x002f:
            r2 = 1
        L_0x0030:
            r3 = 0
            if (r2 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            if (r0 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.af.a.w r0 = new com.ss.android.ugc.aweme.af.a.w
            java.lang.String r7 = "resource_"
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r0
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r2 = r13.f60649m
            if (r2 == 0) goto L_0x0049
            r2 = r13
            goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            com.ss.android.ugc.aweme.af.a.j r2 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22515j) r2
            if (r2 == 0) goto L_0x00ae
            java.util.List r5 = r13.m55607n()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x005a
        L_0x0058:
            r1 = 1
            goto L_0x0085
        L_0x005a:
            java.util.List r5 = r13.m55607n()
            java.util.Iterator r5 = r5.iterator()
        L_0x0062:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0085
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r14.getHost()
            if (r7 == 0) goto L_0x0062
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r9 = 2
            boolean r6 = p2628d.p2650m.C52830p.m112456b(r8, r6, r1, r9, r3)
            if (r6 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r7 = r3
        L_0x0082:
            if (r7 == 0) goto L_0x0062
            goto L_0x0058
        L_0x0085:
            if (r1 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r2 = r3
        L_0x0089:
            if (r2 == 0) goto L_0x00ae
            java.lang.String r6 = "hybrid_app_monitor_resource_load_event"
            com.ss.android.ugc.aweme.af.a.x r14 = r13.mo46828j()
            r7 = r14
            com.ss.android.ugc.aweme.af.a.u r7 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22532u) r7
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r14 = "trigger"
            r8.put(r14, r15)
            org.json.JSONObject r14 = r0.getFormatData()
            com.p683ss.android.ugc.aweme.p1328af.p1329a.C22507e.m55596a(r8, r14)
            r9 = 0
            r10 = 0
            r11 = 24
            r12 = 0
            r5 = r13
            com.p683ss.android.ugc.aweme.p1328af.p1329a.C22488af.m55575a(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x00ae:
            return r4
        L_0x00af:
            d.u r14 = new d.u
            java.lang.String r15 = "null cannot be cast to non-null type java.lang.String"
            r14.<init>(r15)
            throw r14
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1328af.p1329a.C22515j.m55604b(android.net.Uri, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo46852a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C22477a l = m55605l();
        if (l != null) {
            l.mo46789a(webResourceRequest, webResourceError);
        }
        String str = "hybrid_app_monitor_h5_received_error";
        C22532u bg_ = bg_();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_error");
        if (webResourceError != null) {
            jSONObject.put("received_error_code", String.valueOf(webResourceError.getErrorCode()));
            jSONObject.put("received_error_desc", webResourceError.getDescription());
        }
        if (webResourceRequest != null) {
            Uri url = webResourceRequest.getUrl();
            if (url != null) {
                jSONObject.put("failing_url", url.toString());
            }
        }
        C22488af.m55575a(this, str, bg_, jSONObject, null, null, 24, null);
    }

    public C22515j(Uri uri, C22509g gVar, Map<String, String> map) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(gVar, "providerFactory");
        C52711k.m112240b(map, "customCategories");
        super(uri, gVar, map);
    }

    /* renamed from: a */
    private final void m55602a(C22532u uVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        C8892c m = m55606m();
        WebView c = mo46864c();
        String b = uVar.mo46880b();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("type", "h5");
        String str3 = "is_fallback";
        if (mo46827i() == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put(str3, str2);
        C22533v i = mo46827i();
        if (i != null) {
            String e = i.mo46823e();
            if (e != null) {
                jSONObject.put("fallback_reason", e);
            }
            String f = i.mo46824f();
            if (f != null) {
                jSONObject.put("fallback_message", f);
            }
        }
        C22507e.m55596a(jSONObject, uVar.getFormatData());
        C22534w k = mo46829k();
        if (k != null) {
            C22507e.m55596a(jSONObject, k.getFormatData());
        }
        String jSONObject4 = jSONObject.toString();
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            C22507e.m55596a(jSONObject5, jSONObject2);
        }
        String jSONObject6 = jSONObject5.toString();
        JSONObject jSONObject7 = new JSONObject();
        if (jSONObject3 != null) {
            C22507e.m55596a(jSONObject7, jSONObject3);
        }
        m.mo15900a(c, b, str, jSONObject4, jSONObject6, jSONObject7.toString(), "0");
        m55606m().mo15904b(mo46864c());
    }
}
