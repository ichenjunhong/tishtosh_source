package com.p683ss.android.ugc.aweme.crossplatform.p1613b;

import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.feed.C29978a;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52555ag;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b.a */
public final class C27125a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71561a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27125a.class), "appStartTimeTs", "getAppStartTimeTs()J"))};

    /* renamed from: b */
    public static final C52668f f71562b = C52732g.m112285a(C27128c.f71572a);

    /* renamed from: c */
    public static final C27127b f71563c = new C27127b(null);

    /* renamed from: d */
    private final C52668f f71564d = C52732g.m112285a(C27129d.f71573a);

    /* renamed from: e */
    private final ConcurrentHashMap<String, C27126a> f71565e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private final Set<String> f71566f = C52555ag.m112064b("rn_base_android", "fe_lynx_main_search_transfer");

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.a$a */
    public static final class C27126a {

        /* renamed from: a */
        public long f71567a = 0;

        /* renamed from: b */
        public boolean f71568b = false;

        /* renamed from: c */
        public boolean f71569c = false;

        /* renamed from: d */
        public boolean f71570d = true;

        public C27126a(long j, boolean z, boolean z2, boolean z3) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.a$b */
    public static final class C27127b {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f71571a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27127b.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/monitor/HybridChannelMonitor;"))};

        private C27127b() {
        }

        /* renamed from: a */
        public static C27125a m65446a() {
            return (C27125a) C27125a.f71562b.getValue();
        }

        public /* synthetic */ C27127b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.a$c */
    static final class C27128c extends C52712l implements C52670a<C27125a> {

        /* renamed from: a */
        public static final C27128c f71572a = new C27128c();

        C27128c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27125a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.a$d */
    static final class C27129d extends C52712l implements C52670a<Long> {

        /* renamed from: a */
        public static final C27129d f71573a = new C27129d();

        C27129d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(C29978a.f78232c);
        }
    }

    /* renamed from: a */
    private final long m65436a() {
        return ((Number) this.f71564d.getValue()).longValue();
    }

    /* renamed from: a */
    private final C27126a m65437a(String str) {
        C27126a aVar = (C27126a) this.f71565e.get(str);
        if (aVar != null) {
            return aVar;
        }
        C27126a aVar2 = new C27126a(0, false, false, true);
        this.f71565e.put(str, aVar2);
        return aVar2;
    }

    /* renamed from: b */
    private final boolean m65440b(String str) {
        List list;
        boolean z;
        C27132a.m65458a();
        HybridMonitorConfig b = C27131c.m65452b();
        if (b != null) {
            list = b.getGeckoChannelMonitorWhitelist();
        } else {
            list = null;
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f71566f.contains(str);
        }
        return list.contains(str);
    }

    /* renamed from: b */
    public final void mo55445b(long j, String str) {
        C52711k.m112240b(str, "channel");
        m65439b(str, true, (Throwable) null);
    }

    /* renamed from: a */
    public final void mo55442a(long j, String str) {
        C52711k.m112240b(str, "channel");
        m65438a(str, true, (Throwable) null);
    }

    /* renamed from: a */
    public final void mo55444a(String str, boolean z) {
        C52711k.m112240b(str, "channel");
        if (m65440b(str)) {
            m65437a(str).f71567a = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_channel", str);
            jSONObject.put("is_patch", String.valueOf(z));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cold_start_to_download_start_interval", System.currentTimeMillis() - m65436a());
            C27131c.m65450a(C27132a.m65458a(), "hybrid_monitor_gecko_event", "on_start_download", jSONObject, jSONObject2, null, 16, null);
        }
    }

    /* renamed from: b */
    public final void mo55446b(long j, String str, Throwable th) {
        C52711k.m112240b(str, "channel");
        C52711k.m112240b(th, "e");
        m65439b(str, false, th);
    }

    /* renamed from: a */
    private final void m65438a(String str, boolean z, Throwable th) {
        boolean z2;
        if (m65440b(str)) {
            m65437a(str).f71568b = z;
            C27131c a = C27132a.m65458a();
            String str2 = "hybrid_monitor_gecko_event";
            String str3 = "on_download";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_channel", str);
            jSONObject.put("success", String.valueOf(z));
            if (th != null) {
                String message = th.getMessage();
                if (message != null) {
                    jSONObject.put("exception_msg", message);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject2.put("cold_start_to_download_end_interval", currentTimeMillis - m65436a());
            Long valueOf = Long.valueOf(m65437a(str).f71567a);
            if (valueOf.longValue() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                valueOf = null;
            }
            if (valueOf != null) {
                jSONObject2.put("download_interval", currentTimeMillis - valueOf.longValue());
            }
            C27131c.m65450a(a, str2, str3, jSONObject, jSONObject2, null, 16, null);
        }
    }

    /* renamed from: b */
    private final void m65439b(String str, boolean z, Throwable th) {
        boolean z2;
        if (m65440b(str)) {
            C27131c a = C27132a.m65458a();
            String str2 = "hybrid_monitor_gecko_event";
            String str3 = "on_activate";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_channel", str);
            jSONObject.put("success", String.valueOf(z));
            if (th != null) {
                String message = th.getMessage();
                if (message != null) {
                    jSONObject.put("exception_msg", message);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject2.put("cold_start_to_activate_end_interval", currentTimeMillis - m65436a());
            Long valueOf = Long.valueOf(m65437a(str).f71567a);
            if (valueOf.longValue() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                valueOf = null;
            }
            if (valueOf != null) {
                jSONObject2.put("activate_interval", currentTimeMillis - valueOf.longValue());
            }
            C27131c.m65450a(a, str2, str3, jSONObject, jSONObject2, null, 16, null);
        }
    }

    /* renamed from: a */
    public final void mo55443a(long j, String str, Throwable th) {
        C52711k.m112240b(str, "channel");
        C52711k.m112240b(th, "e");
        m65438a(str, false, th);
    }
}
