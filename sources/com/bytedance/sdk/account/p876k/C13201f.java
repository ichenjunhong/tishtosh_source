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

/* renamed from: com.bytedance.sdk.account.k.f */
public final class C13201f extends C13090h<C12995g> {

    /* renamed from: e */
    private C13202a f34466e = new C13202a();

    /* renamed from: com.bytedance.sdk.account.k.f$a */
    public static class C13202a extends C13203g {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C13079a.m26268a(jSONObject, jSONObject2, (C13203g) this.f34466e);
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13079a.m26267a((C13203g) this.f34466e, jSONObject);
        if (jSONObject != null) {
            this.f34466e.f34444i = jSONObject.optString("profile_key");
            this.f34466e.f34445j = jSONObject.optString("shark_ticket");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C12995g gVar = new C12995g(z, 1);
        if (z) {
            gVar.f34009h = this.f34466e.f34467b;
        } else {
            gVar.f34019r = this.f34466e.f34444i;
            gVar.f34000c = this.f34466e.f34442g;
            gVar.f34001d = this.f34466e.f34443h;
            gVar.f34013l = this.f34466e.f34445j;
            if (this.f34466e.f34442g == 1075) {
                gVar.f34015n = this.f34466e.f34448m;
                gVar.f34018q = this.f34466e.f34451p;
                gVar.f34017p = this.f34466e.f34450o;
                gVar.f34016o = this.f34466e.f34449n;
                gVar.f34014m = this.f34466e.f34447l;
            }
        }
        return gVar;
    }

    public C13201f(Context context, C13073a aVar, C12989a<C12995g> aVar2) {
        super(context, aVar, aVar2);
    }
}
