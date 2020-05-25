package com.p683ss.android.ugc.aweme.crossplatform.p1613b;

import android.net.Uri;
import com.bytedance.android.monitor.p461a.C8870b.C8871a;
import com.bytedance.android.monitor.p461a.C8872c;
import com.bytedance.android.monitor.p461a.C8873d;
import com.bytedance.android.monitor.p462b.C8878d;
import com.bytedance.android.monitor.p462b.C8879e;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.services.apm.api.C13218a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.WebViewCacheExperiment.C27229a;
import com.p683ss.android.ugc.aweme.experiment.WebViewMonitorExperiment;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22482ab;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22484ad;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22485ae;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22510h;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22530t;
import com.p683ss.android.ugc.aweme.ttwebview.C47367a;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52820l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b.c */
public final class C27131c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71575a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27131c.class), "monitorRegexList", "getMonitorRegexList()Ljava/util/List;"))};

    /* renamed from: h */
    public static final C52668f f71576h = C52732g.m112285a(C27133b.f71588a);

    /* renamed from: i */
    public static final C27132a f71577i = new C27132a(null);

    /* renamed from: b */
    public UncaughtExceptionHandler f71578b;

    /* renamed from: c */
    public String f71579c;

    /* renamed from: d */
    public final Map<String, C22521l> f71580d;

    /* renamed from: e */
    public final C52820l f71581e;

    /* renamed from: f */
    public final C22482ab f71582f;

    /* renamed from: g */
    public final C22484ad f71583g;

    /* renamed from: j */
    private final UncaughtExceptionHandler f71584j;

    /* renamed from: k */
    private final ConcurrentHashMap<String, Long> f71585k;

    /* renamed from: l */
    private final C52668f f71586l;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.c$a */
    public static final class C27132a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f71587a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27132a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/monitor/MonitorSessionManager;"))};

        private C27132a() {
        }

        /* renamed from: a */
        public static C27131c m65458a() {
            return (C27131c) C27131c.f71576h.getValue();
        }

        public /* synthetic */ C27132a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.c$b */
    static final class C27133b extends C52712l implements C52670a<C27131c> {

        /* renamed from: a */
        public static final C27133b f71588a = new C27133b();

        C27133b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27131c(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.c$c */
    static final class C27134c extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C27131c f71589a;

        C27134c(C27131c cVar) {
            this.f71589a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            HybridMonitorConfig b = C27131c.m65452b();
            if (b != null) {
                List perfMonitorRegexList = b.getPerfMonitorRegexList();
                if (perfMonitorRegexList != null) {
                    return perfMonitorRegexList;
                }
            }
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.c$d */
    public static final class C27135d implements C22482ab {
        C27135d() {
        }

        /* renamed from: a */
        public final void mo46810a(String str, JSONObject jSONObject) {
            C52711k.m112240b(str, "service");
            C52711k.m112240b(jSONObject, "data");
            C23569o.m57783b("service_monitor", str, jSONObject);
        }

        /* renamed from: a */
        private static void m65459a(JSONObject jSONObject, String str, Object obj) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public final void mo46808a(Exception exc, String str, Map<String, String> map) {
            C52711k.m112240b(exc, "e");
            C52711k.m112240b(str, "message");
            C52711k.m112240b(map, "data");
            Throwable th = exc;
            if (C13218a.m26604a() != null) {
                if (C13218a.f34488a != null) {
                    C13218a.f34488a.ensureNotReachHere(th, str, map);
                }
                return;
            }
            if (C9220a.m18316b(th)) {
                C9220a.m18309a(3, Thread.currentThread().getStackTrace(), th, str, true, false, map);
            }
        }

        /* renamed from: a */
        public final void mo46809a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            JSONObject jSONObject3;
            int i;
            if (jSONObject2 == null) {
                jSONObject3 = null;
            } else if (z) {
                jSONObject3 = jSONObject2;
            } else {
                jSONObject3 = new JSONObject();
                m65459a(jSONObject2, "tag", (Object) "ttlive_sdk");
                m65459a(jSONObject3, "aid", (Object) String.valueOf(C11010c.m22289j()));
                m65459a(jSONObject3, "extra", (Object) jSONObject2);
            }
            C27130b.f71574a.mo55447a(jSONObject2);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            C23131p.m57777a(str, i, jSONObject, jSONObject3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.c$e */
    public static final class C27136e implements C22484ad {

        /* renamed from: a */
        final /* synthetic */ C27131c f71590a;

        /* renamed from: b */
        private String f71591b = "";

        /* renamed from: c */
        private String f71592c = "";

        /* renamed from: d */
        private String f71593d = "";

        /* renamed from: e */
        private Boolean f71594e;

        /* renamed from: d */
        public final List<String> mo46817d() {
            List<String> a = C27229a.m65643a();
            C52711k.m112236a((Object) a, "WebViewCacheExperiment.E…WebViewCacheModelCompat()");
            return a;
        }

        /* renamed from: a */
        public final String mo46814a() {
            boolean z;
            if (this.f71593d.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String a = C47367a.m102734a();
                C52711k.m112236a((Object) a, "TTWebViewTask.getWebviewType()");
                this.f71593d = a;
            }
            return this.f71593d;
        }

        /* renamed from: b */
        public final boolean mo46815b() {
            if (this.f71594e == null) {
                this.f71594e = Boolean.valueOf(false);
            }
            Boolean bool = this.f71594e;
            if (bool != null) {
                return bool.booleanValue();
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
        }

        /* renamed from: c */
        public final boolean mo46816c() {
            return C10181b.m20511a().mo18172a(WebViewMonitorExperiment.class, true, "webview_monitor_enable", 31744, false);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r0 != null) goto L_0x0027;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo46818e() {
            /*
                r1 = this;
                java.lang.String r0 = r1.f71591b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                if (r0 == 0) goto L_0x0012
                java.lang.String r0 = r1.f71591b
                return r0
            L_0x0012:
                com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig r0 = com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.m65452b()
                if (r0 == 0) goto L_0x0023
                java.lang.String r0 = r0.getSlardarSdkConfig()     // Catch:{ a -> 0x001d }
                goto L_0x0021
            L_0x001d:
                java.lang.String r0 = m65463f()
            L_0x0021:
                if (r0 != 0) goto L_0x0027
            L_0x0023:
                java.lang.String r0 = m65463f()
            L_0x0027:
                r1.f71591b = r0
                java.lang.String r0 = r1.f71591b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27136e.mo46818e():java.lang.String");
        }

        /* renamed from: f */
        private static String m65463f() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("webview_is_need_monitor", true);
            jSONObject.put("webview_classes", new JSONArray());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bid", "ies");
            jSONObject.put("commonReportConfig", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("interval", 8000);
            jSONObject3.put("FPSMonitor", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("interval", 8000);
            jSONObject3.put("MemoryMonitor", jSONObject5);
            jSONObject.put("apmReportConfig", jSONObject3);
            JSONObject jSONObject6 = new JSONObject();
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("interval", 10);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("DOMContentLoaded");
            jSONObject7.put("checkPoint", jSONArray);
            jSONObject6.put("PerformanceMonitor", jSONObject7);
            jSONObject.put("performanceReportConfig", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("ignore", new JSONArray());
            jSONObject8.put("StaticErrorMonitor", jSONObject9);
            jSONObject.put("errorMsgReportConfig", jSONObject8);
            JSONObject jSONObject10 = new JSONObject();
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("slowSession", 8000);
            jSONObject11.put("sampleRate", 0.1d);
            jSONObject10.put("StaticPerformanceMonitor", jSONObject11);
            jSONObject.put("resourceTimingReportConfig", jSONObject10);
            String jSONObject12 = jSONObject.toString();
            C52711k.m112236a((Object) jSONObject12, "JSONObject().apply {\n   …\n            }.toString()");
            return jSONObject12;
        }

        C27136e(C27131c cVar) {
            this.f71590a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.c$f */
    static final class C27137f implements UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ C27131c f71595a;

        C27137f(C27131c cVar) {
            this.f71595a = cVar;
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            C52711k.m112240b(thread, "thread");
            C52711k.m112240b(th, "throwable");
            th.getCause();
            UncaughtExceptionHandler uncaughtExceptionHandler = this.f71595a.f71578b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* renamed from: a */
    public final List<String> mo55449a() {
        return (List) this.f71586l.getValue();
    }

    /* renamed from: b */
    public static HybridMonitorConfig m65452b() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            return b.getHybridMonitorConfig();
        } catch (C10174a unused) {
            return null;
        }
    }

    private C27131c() {
        this.f71584j = new C27137f(this);
        this.f71578b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this.f71584j);
        this.f71580d = new LinkedHashMap();
        this.f71585k = new ConcurrentHashMap<>();
        this.f71581e = new C52820l("Chrome/(\\d+.\\d+.\\d+.\\d+)");
        this.f71586l = C52732g.m112286a(C52757k.NONE, new C27134c(this));
        this.f71582f = new C27135d();
        this.f71583g = new C27136e(this);
    }

    public /* synthetic */ C27131c(C52707g gVar) {
        this();
    }

    /* renamed from: b */
    public final boolean mo55452b(String str) {
        C52711k.m112240b(str, "sessionId");
        if (!this.f71580d.containsKey(str)) {
            return false;
        }
        C22521l lVar = (C22521l) this.f71580d.remove(str);
        if (lVar != null) {
            lVar.mo46784b();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m65451a(Uri uri) {
        boolean z;
        C52711k.m112240b(uri, "uri");
        try {
            if (!uri.getBooleanQueryParameter("monitor_enabled", false)) {
                String uri2 = uri.toString();
                C52711k.m112236a((Object) uri2, "uri.toString()");
                Iterator it = mo55449a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (new C52820l((String) it.next()).containsMatchIn(uri2)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C22521l mo55448a(boolean z) {
        C22521l lVar = new C22521l(this.f71582f, this.f71583g);
        String uuid = UUID.randomUUID().toString();
        C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
        lVar.mo46783a(uuid, z);
        this.f71580d.put(lVar.mo46782a(), lVar);
        return lVar;
    }

    /* renamed from: a */
    public final boolean mo55451a(String str) {
        C52711k.m112240b(str, "url");
        try {
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "Uri.parse(url)");
            return m65451a(parse);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo55450a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C52711k.m112240b(str, "serviceName");
        C52711k.m112240b(str2, "triggerFrom");
        C22485ae aeVar = (C22485ae) C22485ae.f60590a.getValue();
        String valueOf = String.valueOf(C11010c.m22289j());
        C22482ab abVar = this.f71582f;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("trigger", str2);
        C52711k.m112240b(valueOf, "appId");
        C52711k.m112240b(abVar, "reporter");
        C52711k.m112240b(str, "eventName");
        try {
            C8872c b = C8878d.m17456b();
            C8871a aVar = new C8871a();
            C8873d b2 = C8879e.m17459b();
            b2.mo15869a("douyin");
            aVar.f24181b = b2;
            C22510h hVar = C22510h.f60636c;
            hVar.mo15874a(valueOf);
            hVar.f60638b = abVar;
            aVar.f24180a = hVar;
            b.mo15866a(aVar);
            C8872c b3 = C8878d.m17456b();
            String str3 = "";
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject4 = jSONObject;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObject5 = jSONObject2;
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            b3.mo15867a(str3, str, jSONObject4, jSONObject5, jSONObject3);
        } catch (Exception e) {
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("stateless", "true");
            linkedHashMap.put("eventName", str);
            abVar.mo46808a(e, "hybrid report failed", linkedHashMap);
        }
    }

    /* renamed from: a */
    public static void m65448a(C22530t tVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C52711k.m112240b(str, "serviceName");
        C52711k.m112240b(str2, "triggerFrom");
        if (tVar != null) {
            tVar.mo46858a(str, str2, jSONObject, jSONObject2, jSONObject3);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m65450a(C27131c cVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if ((i & 4) != 0) {
            jSONObject4 = null;
        } else {
            jSONObject4 = jSONObject;
        }
        if ((i & 8) != 0) {
            jSONObject5 = null;
        } else {
            jSONObject5 = jSONObject2;
        }
        cVar.mo55450a(str, str2, jSONObject4, jSONObject5, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m65449a(C27131c cVar, C22530t tVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if ((i & 8) != 0) {
            jSONObject4 = null;
        } else {
            jSONObject4 = jSONObject;
        }
        if ((i & 16) != 0) {
            jSONObject5 = null;
        } else {
            jSONObject5 = jSONObject2;
        }
        m65448a(tVar, str, str2, jSONObject4, jSONObject5, null);
    }
}
