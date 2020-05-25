package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13090h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.p */
public final class C21672p extends C13090h<C12993e<C21671o>> {

    /* renamed from: e */
    public static final C21673a f58704e = new C21673a(null);

    /* renamed from: f */
    private final C21671o f58705f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.p$a */
    public static final class C21673a {
        private C21673a() {
        }

        public /* synthetic */ C21673a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C21672p mo45928a(Context context, String str, int i, C21670n nVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "code");
            C52711k.m112240b(nVar, "call");
            C21671o oVar = new C21671o(str, i);
            C13074a a = new C13074a().mo24752a("/passport/email/verify/");
            C52711k.m112240b(oVar, "queryObj");
            Map hashMap = new HashMap();
            String d = C9431p.m18668d(oVar.f58702a);
            C52711k.m112236a((Object) d, "StringUtils.encryptWithXor(queryObj.code)");
            hashMap.put("code", d);
            String d2 = C9431p.m18668d(String.valueOf(oVar.f58703b));
            C52711k.m112236a((Object) d2, "StringUtils.encryptWithX…queryObj.type.toString())");
            hashMap.put("type", d2);
            hashMap.put("mix_mode", "1");
            C13073a b = a.mo24754a(hashMap).mo24756b();
            C52711k.m112236a((Object) b, "request");
            return new C21672p(context, b, oVar, nVar);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        C52711k.m112240b((C12993e) bVar, "response");
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C52711k.m112240b(jSONObject, "data");
        C52711k.m112240b(jSONObject2, "result");
        this.f58705f.f34279l = jSONObject2;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C52711k.m112240b(jSONObject, "result");
        C52711k.m112240b(jSONObject2, "data");
        this.f58705f.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C52711k.m112240b(bVar, "response");
        this.f58705f.f34275h = bVar.f34150b;
        this.f58705f.f34276i = bVar.f34151c;
        return new C12993e(z, 1009, this.f58705f);
    }

    public C21672p(Context context, C13073a aVar, C21671o oVar, C21670n nVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(oVar, "queryObj");
        C52711k.m112240b(nVar, "call");
        super(context, aVar, nVar);
        this.f58705f = oVar;
    }
}
