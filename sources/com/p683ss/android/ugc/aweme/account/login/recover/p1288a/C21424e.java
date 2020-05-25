package com.p683ss.android.ugc.aweme.account.login.recover.p1288a;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.bytedance.sdk.account.p865g.C13168a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.e */
public final class C21424e extends C13090h<C12993e<C13120s>> {

    /* renamed from: f */
    public static final C21425a f58113f = new C21425a(null);

    /* renamed from: e */
    public final C13120s f58114e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.e$a */
    public static final class C21425a {
        private C21425a() {
        }

        public /* synthetic */ C21425a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        C12993e eVar = (C12993e) bVar;
        C52711k.m112240b(eVar, "response");
        C13168a.m26527a("passport_mobile_sendcode", "mobile", this.f34210b.mo24750a("type"), (C12990b) eVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C52711k.m112240b(bVar, "response");
        return new C12993e(z, BaseNotice.CHECK_PROFILE, this.f58114e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C52711k.m112240b(jSONObject, "result");
        C52711k.m112240b(jSONObject2, "data");
        C13120s sVar = this.f58114e;
        if (sVar != null) {
            sVar.f34321s = jSONObject2.optInt("retry_time", 30);
        }
        C13120s sVar2 = this.f58114e;
        if (sVar2 != null) {
            sVar2.f34279l = jSONObject;
        }
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C52711k.m112240b(jSONObject, "data");
        C52711k.m112240b(jSONObject2, "result");
        C13078b.m26263a(this.f58114e, jSONObject);
        C13120s sVar = this.f58114e;
        if (sVar != null) {
            sVar.f34279l = jSONObject2;
        }
    }

    public C21424e(Context context, C13073a aVar, C13120s sVar, C13139p pVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(sVar, "queryObj");
        C52711k.m112240b(pVar, "call");
        super(context, aVar, pVar);
        this.f58114e = sVar;
    }
}
