package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C8889a;
import com.bytedance.android.monitor.webview.C8892c;
import com.bytedance.android.monitor.webview.C8892c.C8893a;
import com.bytedance.android.monitor.webview.C8894d;
import com.bytedance.android.monitor.webview.C8896f;
import com.bytedance.android.monitor.webview.C8902j;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
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

/* renamed from: com.ss.android.ugc.aweme.af.a.z */
public final class C22538z extends C22488af implements C22528r {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f60673d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22538z.class), "monitorHelper", "getMonitorHelper()Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitorHelper;"))};

    /* renamed from: i */
    private final C52668f f60674i = C52732g.m112286a(C52757k.NONE, new C22539a(this));

    /* renamed from: j */
    private String f60675j;

    /* renamed from: k */
    private long f60676k;

    /* renamed from: l */
    private long f60677l;

    /* renamed from: m */
    private long f60678m;

    /* renamed from: n */
    private long f60679n;

    /* renamed from: o */
    private long f60680o;

    /* renamed from: p */
    private long f60681p;

    /* renamed from: q */
    private long f60682q;

    /* renamed from: r */
    private long f60683r;

    /* renamed from: com.ss.android.ugc.aweme.af.a.z$a */
    static final class C22539a extends C52712l implements C52670a<C8892c> {

        /* renamed from: a */
        final /* synthetic */ C22538z f60684a;

        /* renamed from: com.ss.android.ugc.aweme.af.a.z$a$a */
        static final /* synthetic */ class C22540a extends C52710j implements C52687r<String, Integer, JSONObject, JSONObject, C52860x> {
            C22540a(C22538z zVar) {
                super(4, zVar);
            }

            public final String getName() {
                return "monitorStatusAndDuration";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(C22538z.class);
            }

            public final String getSignature() {
                return "monitorStatusAndDuration(Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;Lorg/json/JSONObject;)V";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
                ((C22538z) this.receiver).mo46821a((String) obj, (Integer) obj2, (JSONObject) obj3, (JSONObject) obj4);
                return C52860x.f131107a;
            }
        }

        C22539a(C22538z zVar) {
            this.f60684a = zVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C8892c b = C8902j.m17571b();
            C8893a a = b.mo15894a();
            a.mo15915b("HybridMonitor");
            a.mo15917d("douyin");
            a.mo15911a((C8894d) C8896f.m17517a());
            a.mo15910a((C8889a) new C22481aa(new C22540a(this.f60684a)));
            b.mo15908c(a);
            return b;
        }
    }

    /* renamed from: c */
    private C8892c m55691c() {
        return (C8892c) this.f60674i.getValue();
    }

    /* renamed from: a */
    public final void mo46851a(View view) {
        this.f60677l = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46862b(android.view.View r13) {
        /*
            r12 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r12.f60683r = r0
            com.ss.android.ugc.aweme.af.a.p r0 = r12.mo46825g()
            r1 = 0
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.mo46876d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0038
            r0.booleanValue()
            long r0 = java.lang.System.currentTimeMillis()
            boolean r13 = com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b.C22495a.m55590a(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            goto L_0x0039
        L_0x0038:
            r13 = r1
        L_0x0039:
            java.lang.String r3 = "hybrid_app_monitor_rn_blank_screen"
            com.ss.android.ugc.aweme.af.a.x r0 = r12.mo46828j()
            r4 = r0
            com.ss.android.ugc.aweme.af.a.u r4 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22532u) r4
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            if (r13 == 0) goto L_0x0056
            boolean r13 = r13.booleanValue()
            java.lang.String r0 = "isBlank"
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r5.put(r0, r13)
        L_0x0056:
            java.lang.String r13 = "pageFinish"
            long r6 = r12.f60682q
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0063
            java.lang.String r0 = "true"
            goto L_0x0065
        L_0x0063:
            java.lang.String r0 = "false"
        L_0x0065:
            r5.put(r13, r0)
            java.lang.String r13 = "trigger"
            long r6 = r12.f60682q
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0073
            java.lang.String r0 = "page_finish"
            goto L_0x00b7
        L_0x0073:
            java.lang.String r0 = r12.f60675j
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = r12.f60675j
            if (r0 != 0) goto L_0x00b7
            p2628d.p2639f.p2641b.C52711k.m112234a()
            goto L_0x00b7
        L_0x007f:
            long r6 = r12.f60681p
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            java.lang.String r0 = "prepare_rn_end"
            goto L_0x00b7
        L_0x0088:
            long r6 = r12.f60680o
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            java.lang.String r0 = "prepare_rn_start"
            goto L_0x00b7
        L_0x0091:
            long r6 = r12.f60679n
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x009a
            java.lang.String r0 = "dynamic_update_end"
            goto L_0x00b7
        L_0x009a:
            long r6 = r12.f60678m
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a3
            java.lang.String r0 = "dynamic_update_start"
            goto L_0x00b7
        L_0x00a3:
            long r6 = r12.f60676k
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ac
            java.lang.String r0 = "load_url"
            goto L_0x00b7
        L_0x00ac:
            long r6 = r12.f60677l
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b5
            java.lang.String r0 = "attach_window"
            goto L_0x00b7
        L_0x00b5:
            java.lang.String r0 = "none"
        L_0x00b7:
            r5.put(r13, r0)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            if (r1 == 0) goto L_0x00cc
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            java.lang.String r13 = "detectDuration"
            r6.put(r13, r0)
        L_0x00cc:
            java.lang.String r13 = "loadUrlToAttachedWindow"
            long r0 = r12.f60677l
            long r10 = r12.f60676k
            long r0 = r0 - r10
            r6.put(r13, r0)
            long r0 = r12.f60682q
            int r13 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x00e6
            java.lang.String r13 = "loadUrlToPageFinish"
            long r0 = r12.f60682q
            long r7 = r12.f60676k
            long r0 = r0 - r7
            r6.put(r13, r0)
        L_0x00e6:
            java.lang.String r13 = "attachedWindowToDetachWindow"
            long r0 = r12.f60683r
            long r7 = r12.f60677l
            long r0 = r0 - r7
            r6.put(r13, r0)
            java.lang.String r13 = "loadUrlToDetachWindow"
            long r0 = r12.f60683r
            long r7 = r12.f60676k
            long r0 = r0 - r7
            r6.put(r13, r0)
            r7 = 0
            r8 = 16
            r9 = 0
            r2 = r12
            com.p683ss.android.ugc.aweme.p1328af.p1329a.C22488af.m55575a(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1328af.p1329a.C22538z.mo46862b(android.view.View):void");
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
    public final void mo46783a(String str, boolean z) {
        C52711k.m112240b(str, "id");
        super.mo46783a(str, z);
        this.f60676k = System.currentTimeMillis();
        C22532u bg_ = bg_();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        C22488af.m55575a(this, "hybrid_app_monitor_load_url_event", bg_, jSONObject, null, null, 24, null);
    }

    public C22538z(Uri uri, C22509g gVar, Map<String, String> map) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(gVar, "providerFactory");
        C52711k.m112240b(map, "customCategories");
        super(uri, gVar, map);
    }

    /* renamed from: a */
    public final void mo46820a(String str, C22532u uVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(uVar, "identifier");
        try {
            m55690a(uVar, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            mo46819a(e, uVar.mo46880b(), "rn");
        }
    }

    /* renamed from: a */
    private final void m55690a(C22532u uVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        C8892c c = m55691c();
        String b = uVar.mo46880b();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("type", "rn");
        String str3 = "is_fallback";
        if (mo46827i() == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put(str3, str2);
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
        c.mo15900a(null, b, str, jSONObject4, jSONObject6, jSONObject7.toString(), "0");
        m55691c().mo15904b((WebView) null);
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
}
