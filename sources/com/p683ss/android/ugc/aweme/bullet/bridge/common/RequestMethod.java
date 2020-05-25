package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48306a;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48308c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod */
public final class RequestMethod extends BaseBridgeMethod {

    /* renamed from: c */
    public static final C24169a f64108c = new C24169a(null);

    /* renamed from: b */
    public C22521l f64109b;

    /* renamed from: d */
    private final String f64110d = "request";

    /* renamed from: e */
    private C10269a f64111e = C10269a.PROTECT;

    /* renamed from: f */
    private final C48308c f64112f = new C24171c(this);

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod$a */
    public static final class C24169a {
        private C24169a() {
        }

        public /* synthetic */ C24169a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod$b */
    static final class C24170b implements C48306a {

        /* renamed from: a */
        final /* synthetic */ C24112a f64113a;

        C24170b(C24112a aVar) {
            this.f64113a = aVar;
        }

        /* renamed from: a */
        public final void mo49920a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("_raw"));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("response", jSONObject2);
            this.f64113a.mo49911a((Object) jSONObject3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod$c */
    static final class C24171c implements C48308c {

        /* renamed from: a */
        final /* synthetic */ RequestMethod f64114a;

        C24171c(RequestMethod requestMethod) {
            this.f64114a = requestMethod;
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49921a(com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48307b r7, com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48309d r8) {
            /*
                r6 = this;
                if (r7 != 0) goto L_0x000e
                com.ss.android.ugc.aweme.af.a.b r7 = new com.ss.android.ugc.aweme.af.a.b
                java.lang.String r0 = ""
                java.lang.String r1 = ""
                java.lang.String r2 = ""
                r7.<init>(r0, r1, r2)
                goto L_0x0042
            L_0x000e:
                com.ss.android.ugc.aweme.af.a.b r0 = new com.ss.android.ugc.aweme.af.a.b
                java.lang.String r1 = r7.f121541b
                if (r1 != 0) goto L_0x0017
                java.lang.String r1 = ""
                goto L_0x0019
            L_0x0017:
                java.lang.String r1 = r7.f121541b
            L_0x0019:
                java.lang.String r2 = "if (request.url == null) \"\" else request.url"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.String r2 = r7.f121540a
                if (r2 != 0) goto L_0x0025
                java.lang.String r2 = ""
                goto L_0x0027
            L_0x0025:
                java.lang.String r2 = r7.f121540a
            L_0x0027:
                java.lang.String r3 = "if (request.method == null) \"\" else request.method"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                org.json.JSONObject r3 = r7.f121542c
                if (r3 != 0) goto L_0x0033
                java.lang.String r7 = ""
                goto L_0x003e
            L_0x0033:
                org.json.JSONObject r7 = r7.f121542c
                java.lang.String r7 = r7.toString()
                java.lang.String r3 = "request.body.toString()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r3)
            L_0x003e:
                r0.<init>(r1, r2, r7)
                r7 = r0
            L_0x0042:
                r0 = 0
                if (r8 == 0) goto L_0x00d2
                java.lang.Exception r1 = r8.f121544b
                if (r1 == 0) goto L_0x005b
                com.ss.android.ugc.aweme.af.a.c r1 = new com.ss.android.ugc.aweme.af.a.c
                java.lang.String r2 = "network_error"
                java.lang.Exception r8 = r8.f121544b
                java.lang.String r3 = "response.e"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r3)
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                r1.<init>(r2, r8)
                goto L_0x00d3
            L_0x005b:
                org.json.JSONObject r1 = r8.f121543a
                if (r1 == 0) goto L_0x00d2
                org.json.JSONObject r1 = r8.f121543a
                java.lang.String r2 = "message"
                boolean r1 = r1.has(r2)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x007d
                java.lang.String r1 = "success"
                org.json.JSONObject r4 = r8.f121543a
                java.lang.String r5 = "message"
                java.lang.String r4 = r4.optString(r5)
                boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r4)
                r1 = r1 ^ r3
                if (r1 == 0) goto L_0x007d
                goto L_0x00bb
            L_0x007d:
                org.json.JSONObject r1 = r8.f121543a
                java.lang.String r4 = "code"
                boolean r1 = r1.has(r4)
                if (r1 == 0) goto L_0x0090
                org.json.JSONObject r1 = r8.f121543a
                java.lang.String r4 = "code"
                int r1 = r1.optInt(r4)
                goto L_0x00b7
            L_0x0090:
                org.json.JSONObject r1 = r8.f121543a
                java.lang.String r4 = "status_code"
                boolean r1 = r1.has(r4)
                if (r1 == 0) goto L_0x00a3
                org.json.JSONObject r1 = r8.f121543a
                java.lang.String r4 = "status_code"
                int r1 = r1.optInt(r4)
                goto L_0x00b7
            L_0x00a3:
                org.json.JSONObject r1 = r8.f121543a
                java.lang.String r4 = "statusCode"
                boolean r1 = r1.has(r4)
                if (r1 == 0) goto L_0x00b6
                org.json.JSONObject r1 = r8.f121543a
                java.lang.String r4 = "statusCode"
                int r1 = r1.optInt(r4)
                goto L_0x00b7
            L_0x00b6:
                r1 = 0
            L_0x00b7:
                if (r1 == 0) goto L_0x00ba
                goto L_0x00bb
            L_0x00ba:
                r3 = 0
            L_0x00bb:
                if (r3 == 0) goto L_0x00d2
                com.ss.android.ugc.aweme.af.a.c r1 = new com.ss.android.ugc.aweme.af.a.c
                java.lang.String r2 = "api_error"
                java.lang.Exception r3 = new java.lang.Exception
                org.json.JSONObject r8 = r8.f121543a
                java.lang.String r8 = r8.toString()
                r3.<init>(r8)
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r1.<init>(r2, r3)
                goto L_0x00d3
            L_0x00d2:
                r1 = r0
            L_0x00d3:
                com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod r8 = r6.f64114a
                com.ss.android.ugc.aweme.af.a.l r8 = r8.f64109b
                if (r8 == 0) goto L_0x00f0
                boolean r2 = r8.f60539c
                if (r2 == 0) goto L_0x00de
                goto L_0x00df
            L_0x00de:
                r8 = r0
            L_0x00df:
                if (r8 == 0) goto L_0x00f0
                java.lang.Class<com.ss.android.ugc.aweme.af.a.n> r0 = com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n.class
                com.ss.android.ugc.aweme.af.a.t r8 = r8.mo46870a(r0)
                com.ss.android.ugc.aweme.af.a.n r8 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n) r8
                if (r8 == 0) goto L_0x00ef
                r8.mo46855a(r7, r1)
                goto L_0x00f0
            L_0x00ef:
                return
            L_0x00f0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.common.RequestMethod.C24171c.mo49921a(com.ss.android.ugc.aweme.web.jsbridge.a.a$b, com.ss.android.ugc.aweme.web.jsbridge.a.a$d):void");
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64111e;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64110d;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64111e = aVar;
    }

    public RequestMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            C48305a.m104635a(m58998a(jSONObject), jSONObject.optJSONObject("res"), null, new C24170b(aVar), this.f64112f).mo95796a();
        } catch (Exception unused) {
        }
    }
}
