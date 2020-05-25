package com.bytedance.sdk.account;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12991c;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import com.bytedance.sdk.account.p876k.C13193a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.a */
public final class C12987a extends C13090h<C12991c> {

    /* renamed from: e */
    private C13193a f33996e = new C13193a();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_logout", (String) null, (String) null, (C12990b) (C12991c) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26264a(this.f33996e, jSONObject, jSONObject2);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f33996e.f34446k = jSONObject.optString("session_key");
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C12991c cVar = new C12991c(z, 10001);
        if (z) {
            cVar.f34005h = this.f33996e.f34446k;
        } else {
            cVar.f34000c = this.f33996e.f34442g;
            cVar.f34001d = this.f33996e.f34443h;
        }
        return cVar;
    }

    public C12987a(Context context, C13073a aVar, C12989a<C12991c> aVar2) {
        super(context, aVar, aVar2);
    }
}
