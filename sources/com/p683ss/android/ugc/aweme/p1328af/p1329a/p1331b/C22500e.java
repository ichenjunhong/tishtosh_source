package com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52775l;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.af.a.b.e */
public final class C22500e {

    /* renamed from: a */
    public static final C22500e f60621a = new C22500e();

    /* renamed from: b */
    private static final List<C22497b> f60622b = C52575l.m112101c(new C22497b("PageStartTime", "StartLoadTime", "rn_load_interval"), new C22497b("StartLoadTime", "FirstDrawTime", "first_draw_interval"), new C22497b("FirstDrawTime", "FirstScreenTime", "first_screen_interval"), new C22497b("FirstDrawTime", "PageFinishTime", "page_finish_interval"));

    /* renamed from: c */
    private static final List<C22497b> f60623c = C52575l.m112101c(new C22497b("redirectStart", "redirectEnd", "redirect_interval"), new C22497b("fetchStart", "domainLookupStart", "app_cache_interval"), new C22497b("domainLookupStart", "domainLookupEnd", "dns_interval"), new C22497b("connectStart", "connectEnd", "tcp_interval"), new C22497b("requestStart", "responseStart", "request_interval"), new C22497b("responseStart", "responseEnd", "response_interval"), new C22497b("domLoading", "domInteractive", "dom_load_interval"), new C22497b("domContentLoadedEventStart", "domContentLoadedEventEnd", "dom_content_loaded_interval"), new C22497b("domContentLoadedEventEnd", "domComplete", "dom_complete_interval"));

    /* renamed from: d */
    private static final List<C22497b> f60624d = C52575l.m112101c(new C22497b("redirectStart", "redirectEnd", "redirect_interval"), new C22497b("fetchStart", "domainLookupStart", "app_cache_interval"), new C22497b("domainLookupStart", "domainLookupEnd", "dns_interval"), new C22497b("connectStart", "connectEnd", "tcp_interval"), new C22497b("requestStart", "responseStart", "request_interval"), new C22497b("responseStart", "responseEnd", "response_interval"));

    /* renamed from: e */
    private static final C22503h f60625e = new C22503h(f60622b);

    /* renamed from: f */
    private static final C22503h f60626f = new C22503h(f60623c);

    /* renamed from: g */
    private static final C22503h f60627g = new C22503h(f60624d);

    private C22500e() {
    }

    /* renamed from: a */
    public static C22503h m55592a(C22498c cVar) {
        switch (C22501f.f60628a[cVar.ordinal()]) {
            case 1:
                return f60625e;
            case 2:
                return f60626f;
            case 3:
                return f60627g;
            default:
                throw new C52775l();
        }
    }

    /* renamed from: a */
    public final JSONObject mo46842a(JSONObject jSONObject, C22498c cVar) {
        boolean z;
        C52711k.m112240b(jSONObject, "metrics");
        C52711k.m112240b(cVar, "type");
        C22503h a = m55592a(cVar);
        if (a == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = jSONObject.keys();
        C52711k.m112236a((Object) keys, "metrics.keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Long valueOf = Long.valueOf(jSONObject.optLong(str));
            if (valueOf.longValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.longValue();
                C52711k.m112236a((Object) str, "trigger");
                C22499d a2 = a.mo46843a(str, jSONObject);
                if (a2 != null) {
                    jSONObject2.put(a2.f60619a, a2.f60620b);
                }
            }
        }
        return jSONObject2;
    }
}
