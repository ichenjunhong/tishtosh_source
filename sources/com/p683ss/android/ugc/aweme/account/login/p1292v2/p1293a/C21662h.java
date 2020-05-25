package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13090h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.h */
public final class C21662h extends C13090h<C12993e<C21665j>> {

    /* renamed from: e */
    public static final C21663a f58693e = new C21663a(null);

    /* renamed from: f */
    private final C21665j f58694f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.h$a */
    public static final class C21663a {
        private C21663a() {
        }

        public /* synthetic */ C21663a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C21662h mo45920a(Context context, String str, String str2, C21664i iVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "ticket");
            C52711k.m112240b(str2, "pwd");
            C52711k.m112240b(iVar, "call");
            C21665j jVar = new C21665j(str, str2);
            C13074a a = new C13074a().mo24752a("/passport/email/change_password/");
            C52711k.m112240b(jVar, "queryObj");
            Map hashMap = new HashMap();
            String d = C9431p.m18668d(jVar.f58695a);
            C52711k.m112236a((Object) d, "StringUtils.encryptWithXor(queryObj.ticket)");
            hashMap.put("ticket", d);
            String d2 = C9431p.m18668d(jVar.f58696b);
            C52711k.m112236a((Object) d2, "StringUtils.encryptWithXor(queryObj.mPassword)");
            hashMap.put("password", d2);
            hashMap.put("mix_mode", "1");
            C13073a c = a.mo24754a(hashMap).mo24757c();
            C52711k.m112236a((Object) c, "request");
            C21662h hVar = new C21662h(context, c, jVar, iVar, null);
            return hVar;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        C52711k.m112240b((C12993e) bVar, "response");
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C52711k.m112240b(jSONObject, "result");
        C52711k.m112240b(jSONObject2, "data");
        this.f58694f.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C52711k.m112240b(bVar, "response");
        return new C12993e(z, 1010, this.f58694f);
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C52711k.m112240b(jSONObject, "data");
        C52711k.m112240b(jSONObject2, "result");
        C13078b.m26263a(this.f58694f, jSONObject);
        this.f58694f.f34279l = jSONObject2;
    }

    private C21662h(Context context, C13073a aVar, C21665j jVar, C21664i iVar) {
        super(context, aVar, iVar);
        this.f58694f = jVar;
    }

    public /* synthetic */ C21662h(Context context, C13073a aVar, C21665j jVar, C21664i iVar, C52707g gVar) {
        this(context, aVar, jVar, iVar);
    }
}
