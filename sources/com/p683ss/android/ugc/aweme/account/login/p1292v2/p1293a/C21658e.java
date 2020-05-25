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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.e */
public final class C21658e extends C13090h<C12993e<C21661g>> {

    /* renamed from: e */
    public static final C21659a f58689e = new C21659a(null);

    /* renamed from: f */
    private final C21661g f58690f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.e$a */
    public static final class C21659a {
        private C21659a() {
        }

        public /* synthetic */ C21659a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C21658e mo45916a(Context context, String str, String str2, boolean z, C21660f fVar) {
            String str3;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "email");
            C52711k.m112240b(str2, "code");
            C52711k.m112240b(fVar, "call");
            C21661g gVar = new C21661g(str, str2);
            C13074a aVar = new C13074a();
            if (z) {
                str3 = "/passport/email/bind_with_change_password/";
            } else {
                str3 = "/passport/email/bind/";
            }
            C13074a a = aVar.mo24752a(str3);
            C52711k.m112240b(gVar, "queryObj");
            Map hashMap = new HashMap();
            String d = C9431p.m18668d(gVar.f58691a);
            C52711k.m112236a((Object) d, "StringUtils.encryptWithXor(queryObj.email)");
            hashMap.put("email", d);
            String d2 = C9431p.m18668d(gVar.f58692b);
            C52711k.m112236a((Object) d2, "StringUtils.encryptWithXor(queryObj.code)");
            hashMap.put("code", d2);
            hashMap.put("mix_mode", "1");
            C13073a c = a.mo24754a(hashMap).mo24757c();
            C52711k.m112236a((Object) c, "request");
            return new C21658e(context, c, gVar, fVar);
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
        this.f58690f.f34279l = jSONObject2;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C52711k.m112240b(jSONObject, "result");
        C52711k.m112240b(jSONObject2, "data");
        this.f58690f.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C52711k.m112240b(bVar, "response");
        this.f58690f.f34275h = bVar.f34150b;
        this.f58690f.f34276i = bVar.f34151c;
        return new C12993e(z, 1009, this.f58690f);
    }

    public C21658e(Context context, C13073a aVar, C21661g gVar, C21660f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(gVar, "queryObj");
        C52711k.m112240b(fVar, "call");
        super(context, aVar, fVar);
        this.f58690f = gVar;
    }
}
