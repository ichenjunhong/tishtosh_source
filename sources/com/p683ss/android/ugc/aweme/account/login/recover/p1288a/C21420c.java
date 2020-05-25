package com.p683ss.android.ugc.aweme.account.login.recover.p1288a;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13116o;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13133j;
import com.bytedance.sdk.account.p865g.C13168a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.c */
public final class C21420c extends C13090h<C12993e<C13116o>> {

    /* renamed from: f */
    public static final C21421a f58109f = new C21421a(null);

    /* renamed from: e */
    public final C13116o f58110e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.c$a */
    public static final class C21421a {
        private C21421a() {
        }

        public /* synthetic */ C21421a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        C12993e eVar = (C12993e) bVar;
        C52711k.m112240b(eVar, "response");
        C13168a.m26527a("passport_mobile_login", "mobile", "login", (C12990b) eVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C52711k.m112240b(bVar, "response");
        return new C12993e(z, 1006, this.f58110e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C52711k.m112240b(jSONObject, "result");
        C52711k.m112240b(jSONObject2, "data");
        this.f58110e.f34302e = C13079a.m26266a(jSONObject, jSONObject2);
        this.f58110e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C52711k.m112240b(jSONObject, "data");
        C52711k.m112240b(jSONObject2, "result");
        C13078b.m26263a(this.f58110e, jSONObject);
        this.f58110e.f34279l = jSONObject2;
    }

    public C21420c(Context context, C13073a aVar, C13116o oVar, C13133j jVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(oVar, "queryObj");
        C52711k.m112240b(jVar, "call");
        super(context, aVar, jVar);
        this.f58110e = oVar;
    }
}
