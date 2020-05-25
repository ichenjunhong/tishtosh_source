package com.bytedance.sdk.account.p876k;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12994f;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13090h;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.k.c */
public final class C13195c extends C13090h<C12994f> {

    /* renamed from: e */
    private C13196a f34459e = new C13196a();

    /* renamed from: com.bytedance.sdk.account.k.c$a */
    static class C13196a extends C13193a {

        /* renamed from: a */
        String f34460a;

        C13196a() {
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26264a(this.f34459e, jSONObject, jSONObject2);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34459e.f34460a = jSONObject2.optString("token");
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C12994f fVar = new C12994f(z, 10006);
        if (z) {
            fVar.f34008h = this.f34459e.f34460a;
        } else {
            fVar.f34001d = this.f34459e.f34443h;
            fVar.f34000c = this.f34459e.f34442g;
        }
        return fVar;
    }

    public C13195c(Context context, C13073a aVar, C12989a<C12994f> aVar2) {
        super(context, aVar, aVar2);
    }
}
