package com.bytedance.ies.p675g.p678c;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.ies.g.c.m */
public final class C10853m {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f29133a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10853m.class), "str", "getStr()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10853m.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10853m.class), "hashCode", "getHashCode()I"))};

    /* renamed from: h */
    public static final C10854a f29134h = new C10854a(null);

    /* renamed from: b */
    final C52668f f29135b = C52732g.m112285a(new C10856c(this));

    /* renamed from: c */
    public final String f29136c;

    /* renamed from: d */
    public final String f29137d;

    /* renamed from: e */
    public final SortedMap<String, String> f29138e;

    /* renamed from: f */
    public final SortedMap<String, String> f29139f;

    /* renamed from: g */
    public final SortedMap<String, String> f29140g;

    /* renamed from: i */
    private final C52668f f29141i = C52732g.m112285a(new C10857d(this));

    /* renamed from: j */
    private final C52668f f29142j = C52732g.m112285a(new C10855b(this));

    /* renamed from: com.bytedance.ies.g.c.m$a */
    public static final class C10854a {
        private C10854a() {
        }

        public /* synthetic */ C10854a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C10853m m22015a(JSONObject jSONObject) {
            SortedMap sortedMap;
            C52711k.m112240b(jSONObject, "jsonObject");
            String string = jSONObject.getString("url");
            C52711k.m112236a((Object) string, "jsonObject.getString(\"url\")");
            String string2 = jSONObject.getString("method");
            C52711k.m112236a((Object) string2, "jsonObject.getString(\"method\")");
            SortedMap a = C10862r.m22023a(jSONObject.optJSONObject("headers"));
            SortedMap a2 = C10862r.m22023a(jSONObject.optJSONObject("params"));
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                sortedMap = C10862r.m22023a(optJSONObject);
            } else {
                sortedMap = null;
            }
            C10853m mVar = new C10853m(string, string2, a, a2, sortedMap);
            return mVar;
        }
    }

    /* renamed from: com.bytedance.ies.g.c.m$b */
    static final class C10855b extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C10853m f29143a;

        C10855b(C10853m mVar) {
            this.f29143a = mVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            int hashCode = ((((((this.f29143a.f29136c.hashCode() * 31) + this.f29143a.f29137d.hashCode()) * 31) + this.f29143a.f29138e.hashCode()) * 31) + this.f29143a.f29139f.hashCode()) * 31;
            SortedMap<String, String> sortedMap = this.f29143a.f29140g;
            if (sortedMap != null) {
                i = sortedMap.hashCode();
            } else {
                i = 0;
            }
            return Integer.valueOf(hashCode + i);
        }
    }

    /* renamed from: com.bytedance.ies.g.c.m$c */
    static final class C10856c extends C52712l implements C52670a<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C10853m f29144a;

        C10856c(C10853m mVar) {
            this.f29144a = mVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new JSONObject().put("url", this.f29144a.f29136c).put("method", this.f29144a.f29137d).put("headers", C10862r.m22024a((Map<String, String>) this.f29144a.f29138e)).put("params", C10862r.m22024a((Map<String, String>) this.f29144a.f29139f)).put("data", C10862r.m22024a((Map<String, String>) this.f29144a.f29140g));
        }
    }

    /* renamed from: com.bytedance.ies.g.c.m$d */
    static final class C10857d extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C10853m f29145a;

        C10857d(C10853m mVar) {
            this.f29145a = mVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(C10862r.m22021a(this.f29145a.f29136c, this.f29145a.f29139f));
            sb.append(',');
            SortedMap<String, String> sortedMap = this.f29145a.f29140g;
            if (sortedMap == null) {
                sortedMap = new TreeMap<>();
            }
            sb.append(sortedMap);
            return sb.toString();
        }
    }

    public final int hashCode() {
        return ((Number) this.f29142j.getValue()).intValue();
    }

    public final String toString() {
        return (String) this.f29141i.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10853m)) {
            return false;
        }
        C10853m mVar = (C10853m) obj;
        if (!C52711k.m112239a((Object) this.f29136c, (Object) mVar.f29136c) || !C52711k.m112239a((Object) this.f29137d, (Object) mVar.f29137d) || !C52711k.m112239a((Object) this.f29138e, (Object) mVar.f29138e) || !C52711k.m112239a((Object) this.f29139f, (Object) mVar.f29139f) || !C52711k.m112239a((Object) this.f29140g, (Object) mVar.f29140g)) {
            return false;
        }
        return true;
    }

    public C10853m(String str, String str2, SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, SortedMap<String, String> sortedMap3) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "method");
        C52711k.m112240b(sortedMap, "headerMap");
        C52711k.m112240b(sortedMap2, "paramMap");
        this.f29136c = str;
        this.f29137d = str2;
        this.f29138e = sortedMap;
        this.f29139f = sortedMap2;
        this.f29140g = sortedMap3;
    }
}
