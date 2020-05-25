package com.bytedance.sdk.account.p876k;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12995g;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.k.h */
public final class C13204h extends C13090h<C12995g> {

    /* renamed from: e */
    private C13205a f34472e = new C13205a();

    /* renamed from: com.bytedance.sdk.account.k.h$a */
    public static class C13205a extends C13203g {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13079a.m26267a((C13203g) this.f34472e, jSONObject);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C13079a.m26268a(jSONObject, jSONObject2, (C13203g) this.f34472e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C12995g a = C13079a.m26265a((C13203g) this.f34472e, z, 0);
        if (z) {
            a.f34009h = this.f34472e.f34467b;
        } else {
            a.f34000c = this.f34472e.f34442g;
            a.f34001d = this.f34472e.f34443h;
        }
        return a;
    }

    public C13204h(Context context, C13073a aVar, C12989a<C12995g> aVar2) {
        super(context, aVar, aVar2);
    }
}
