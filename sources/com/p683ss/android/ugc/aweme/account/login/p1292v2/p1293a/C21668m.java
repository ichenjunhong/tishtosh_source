package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import android.content.Context;
import android.text.TextUtils;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.m */
public final class C21668m extends C13090h<C12993e<C21667l>> {

    /* renamed from: e */
    public static final C21669a f58700e = new C21669a(null);

    /* renamed from: f */
    private final C21667l f58701f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.m$a */
    public static final class C21669a {
        private C21669a() {
        }

        public /* synthetic */ C21669a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C21668m mo45924a(Context context, String str, String str2, String str3, boolean z, C21666k kVar) {
            String str4;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "code");
            C52711k.m112240b(str2, "email");
            C52711k.m112240b(str3, "ticket");
            C52711k.m112240b(kVar, "call");
            C21667l lVar = new C21667l(str, str2, str3);
            C13074a aVar = new C13074a();
            if (z) {
                str4 = "/passport/email/change_with_update_password/";
            } else {
                str4 = "/passport/email/change/";
            }
            C13074a a = aVar.mo24752a(str4);
            C52711k.m112240b(lVar, "queryObj");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(lVar.f58699c)) {
                hashMap.put("ticket", lVar.f58699c);
            }
            Map map = hashMap;
            String d = C9431p.m18668d(lVar.f58697a);
            C52711k.m112236a((Object) d, "StringUtils.encryptWithXor(queryObj.code)");
            map.put("code", d);
            map.put("mix_mode", "1");
            String d2 = C9431p.m18668d(lVar.f58698b);
            C52711k.m112236a((Object) d2, "StringUtils.encryptWithXor(queryObj.email)");
            map.put("email", d2);
            String d3 = C9431p.m18668d("6");
            C52711k.m112236a((Object) d3, "StringUtils.encryptWithX…_EMAIL_VERIFY.toString())");
            map.put("type", d3);
            C13073a c = a.mo24754a(map).mo24757c();
            C52711k.m112236a((Object) c, "request");
            return new C21668m(context, c, lVar, kVar);
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
        this.f58701f.f34279l = jSONObject2;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C52711k.m112240b(jSONObject, "result");
        C52711k.m112240b(jSONObject2, "data");
        this.f58701f.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C52711k.m112240b(bVar, "response");
        this.f58701f.f34275h = bVar.f34150b;
        this.f58701f.f34276i = bVar.f34151c;
        return new C12993e(z, 1009, this.f58701f);
    }

    public C21668m(Context context, C13073a aVar, C21667l lVar, C21666k kVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(lVar, "queryObj");
        C52711k.m112240b(kVar, "call");
        super(context, aVar, kVar);
        this.f58701f = lVar;
    }
}
