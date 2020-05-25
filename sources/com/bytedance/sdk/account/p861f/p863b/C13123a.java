package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13102a;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13124a;
import com.bytedance.sdk.account.p865g.C13168a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.a */
public final class C13123a extends C13090h<C12993e<C13102a>> {

    /* renamed from: e */
    private C13102a f34341e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_bind_login", "mobile", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 10005, this.f34341e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34341e.f34233e = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34341e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34341e, jSONObject);
        this.f34341e.f34279l = jSONObject2;
    }

    public C13123a(Context context, C13073a aVar, C13102a aVar2, C13124a aVar3) {
        super(context, aVar, aVar3);
        this.f34341e = aVar2;
    }
}
