package com.bytedance.ies.p675g.p678c;

import com.bytedance.ies.p675g.p678c.C10830e.C10831a;
import com.bytedance.ies.p675g.p678c.C10830e.C10832b;
import com.bytedance.ies.p675g.p678c.C10853m.C10854a;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52808d;

/* renamed from: com.bytedance.ies.g.c.k */
public final class C10843k implements C10831a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f29109a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10843k.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;"))};

    /* renamed from: j */
    public static final C10844a f29110j = new C10844a(null);

    /* renamed from: b */
    final HashSet<C10845b> f29111b;

    /* renamed from: c */
    public C10832b f29112c;

    /* renamed from: d */
    Throwable f29113d;

    /* renamed from: e */
    public int f29114e;

    /* renamed from: f */
    final C52668f f29115f;

    /* renamed from: g */
    public final C10853m f29116g;

    /* renamed from: h */
    public final long f29117h;

    /* renamed from: i */
    public final long f29118i;

    /* renamed from: com.bytedance.ies.g.c.k$a */
    public static final class C10844a {
        private C10844a() {
        }

        public /* synthetic */ C10844a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C10843k m22006a(JSONObject jSONObject) {
            C52711k.m112240b(jSONObject, "requestObject");
            JSONObject jSONObject2 = jSONObject.getJSONObject("request");
            C52711k.m112236a((Object) jSONObject2, "requestObject.getJSONObject(\"request\")");
            C10843k kVar = new C10843k(C10854a.m22015a(jSONObject2), jSONObject.getLong("timestamp"), jSONObject.getLong("expires"));
            JSONObject jSONObject3 = jSONObject.getJSONObject("response");
            C10832b bVar = new C10832b();
            bVar.mo19615a((Map<String, String>) C10862r.m22023a(jSONObject3.optJSONObject("headers")));
            String string = jSONObject3.getString("body");
            C52711k.m112236a((Object) string, "getString(\"body\")");
            Charset charset = C52808d.f131043a;
            if (string != null) {
                byte[] bytes = string.getBytes(charset);
                C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                bVar.mo19616a(bytes);
                kVar.f29112c = bVar;
                return kVar;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: com.bytedance.ies.g.c.k$b */
    public interface C10845b {
        /* renamed from: a */
        void mo19623a(C10832b bVar);

        /* renamed from: a */
        void mo19624a(Throwable th);
    }

    /* renamed from: com.bytedance.ies.g.c.k$c */
    static final class C10846c extends C52712l implements C52670a<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C10843k f29119a;

        C10846c(C10843k kVar) {
            this.f29119a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            JSONObject jSONObject;
            JSONObject put = new JSONObject().put("request", (JSONObject) this.f29119a.f29116g.f29135b.getValue()).put("timestamp", this.f29119a.f29117h).put("expires", this.f29119a.f29118i);
            String str = "response";
            C10832b bVar = this.f29119a.f29112c;
            if (bVar == null) {
                jSONObject = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                String str2 = "headers";
                JSONObject jSONObject3 = new JSONObject();
                for (Entry entry : bVar.mo19614a().entrySet()) {
                    jSONObject3.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject = jSONObject2.put(str2, jSONObject3).put("body", new String(bVar.mo19617b(), C52808d.f131043a));
            }
            return put.put(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo19612a(C10832b bVar) {
        C52711k.m112240b(bVar, "response");
        this.f29112c = bVar;
        for (C10845b a : this.f29111b) {
            a.mo19623a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo19613a(Throwable th) {
        C52711k.m112240b(th, "throwable");
        this.f29113d = th;
        for (C10845b a : this.f29111b) {
            a.mo19624a(th);
        }
    }

    public C10843k(C10853m mVar, long j) {
        C52711k.m112240b(mVar, "request");
        this(mVar, System.currentTimeMillis(), j);
    }

    public C10843k(C10853m mVar, long j, long j2) {
        C52711k.m112240b(mVar, "request");
        this.f29116g = mVar;
        this.f29117h = j;
        this.f29118i = j2;
        this.f29111b = new HashSet<>();
        this.f29114e = 2;
        this.f29115f = C52732g.m112285a(new C10846c(this));
    }
}
