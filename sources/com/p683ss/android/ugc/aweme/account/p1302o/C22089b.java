package com.p683ss.android.ugc.aweme.account.p1302o;

import com.p683ss.android.ugc.aweme.C20842a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.o.b */
public final class C22089b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59598a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22089b.class), "REGION_SERVICE", "getREGION_SERVICE()Lcom/ss/android/ugc/aweme/main/service/IRegionService;"))};

    /* renamed from: b */
    public static final C22089b f59599b = new C22089b();

    /* renamed from: c */
    private static final C52668f f59600c = C52732g.m112285a(C22090a.f59601a);

    /* renamed from: com.ss.android.ugc.aweme.account.o.b$a */
    static final class C22090a extends C52712l implements C52670a<C36699t> {

        /* renamed from: a */
        public static final C22090a f59601a = new C22090a();

        C22090a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C36699t) C20842a.m53148a(C36699t.class);
        }
    }

    private C22089b() {
    }

    /* renamed from: a */
    private final C36699t m54867a() {
        return (C36699t) f59600c.getValue();
    }

    /* renamed from: a */
    public static final void m54870a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "logType");
        C52711k.m112240b(jSONObject, "extraJson");
        jSONObject.put("carrier_region", f59599b.m54867a().mo47866c());
        C23569o.m57779a(str, jSONObject);
    }

    /* renamed from: a */
    public static final void m54868a(String str, int i, JSONObject jSONObject) {
        C52711k.m112240b(str, "serviceName");
        C52711k.m112240b(jSONObject, "extraJson");
        jSONObject.put("carrier_region", f59599b.m54867a().mo47866c());
        C23569o.m57776a(str, i, jSONObject);
    }

    /* renamed from: a */
    public static final void m54869a(String str, String str2, JSONObject jSONObject) {
        C52711k.m112240b(str, "logType");
        C52711k.m112240b(str2, "serviceName");
        C52711k.m112240b(jSONObject, "extraJson");
        jSONObject.put("carrier_region", f59599b.m54867a().mo47866c());
        C23569o.m57783b(str, str2, jSONObject);
    }
}
