package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.af.a.af */
public abstract class C22488af extends C22476a implements C22533v {

    /* renamed from: e */
    static final /* synthetic */ C52767h[] f60594e = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22488af.class), "unitIdentifier", "getUnitIdentifier()Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22488af.class), "pageIdentifier", "getPageIdentifier()Lcom/ss/android/ugc/aweme/hybrid/monitor/PageIdentifier;"))};

    /* renamed from: d */
    private final C52668f f60595d = C52732g.m112286a(C52757k.NONE, new C22490b(this));

    /* renamed from: f */
    public final Uri f60596f;

    /* renamed from: g */
    public final C22509g f60597g;

    /* renamed from: h */
    public final Map<String, String> f60598h;

    /* renamed from: i */
    private final C52668f f60599i = C52732g.m112286a(C52757k.NONE, new C22489a(this));

    /* renamed from: j */
    private String f60600j;

    /* renamed from: k */
    private String f60601k;

    /* renamed from: com.ss.android.ugc.aweme.af.a.af$a */
    static final class C22489a extends C52712l implements C52670a<C22535x> {

        /* renamed from: a */
        final /* synthetic */ C22488af f60602a;

        C22489a(C22488af afVar) {
            this.f60602a = afVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C22535x(this.f60602a.f60596f, this.f60602a.f60596f, this.f60602a.f60598h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.af.a.af$b */
    static final class C22490b extends C52712l implements C52670a<C22534w> {

        /* renamed from: a */
        final /* synthetic */ C22488af f60603a;

        C22490b(C22488af afVar) {
            this.f60603a = afVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C22534w wVar = new C22534w(this.f60603a.f60596f, null, this.f60603a.f60598h, 2, null);
            return wVar;
        }
    }

    /* renamed from: a */
    public abstract void mo46820a(String str, C22532u uVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    public final C22534w bg_() {
        return (C22534w) this.f60595d.getValue();
    }

    /* renamed from: e */
    public final String mo46823e() {
        return this.f60600j;
    }

    /* renamed from: f */
    public final String mo46824f() {
        return this.f60601k;
    }

    /* renamed from: j */
    public final C22535x mo46828j() {
        return (C22535x) this.f60599i.getValue();
    }

    /* renamed from: g */
    public final C22526p mo46825g() {
        return (C22526p) this.f60597g.mo46846a(C22526p.class);
    }

    /* renamed from: h */
    public final C22525o mo46826h() {
        return (C22525o) this.f60597g.mo46846a(C22525o.class);
    }

    /* renamed from: i */
    public final C22533v mo46827i() {
        return (C22533v) this.f60597g.mo46846a(C22533v.class);
    }

    /* renamed from: k */
    public final C22534w mo46829k() {
        C22533v i = mo46827i();
        if (i == null) {
            return null;
        }
        C22534w wVar = new C22534w(i.bg_().f60664a, "original_", null, 4, null);
        return wVar;
    }

    public C22488af(Uri uri, C22509g gVar, Map<String, String> map) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(gVar, "providerFactory");
        C52711k.m112240b(map, "customCategories");
        this.f60596f = uri;
        this.f60597g = gVar;
        this.f60598h = map;
    }

    /* renamed from: a */
    public final void mo46819a(Exception exc, String str, String str2) {
        C52711k.m112240b(exc, "e");
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "type");
        C22525o h = mo46826h();
        if (h != null) {
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("url", str);
            linkedHashMap.put("type", str2);
            StringBuilder sb = new StringBuilder("hybrid ");
            sb.append(str2);
            sb.append(" report failed");
            h.mo46872a(exc, sb.toString(), linkedHashMap);
        }
    }

    /* renamed from: a */
    public void mo46821a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        C22525o h = mo46826h();
        if (h != null) {
            h.mo46873a(str, num, jSONObject, jSONObject2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m55575a(C22488af afVar, String str, C22532u uVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
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
        afVar.mo46820a(str, uVar, jSONObject4, jSONObject5, null);
    }
}
