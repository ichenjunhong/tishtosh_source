package com.bytedance.sdk.account.p876k;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.C12997b.C12999b;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12995g;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.k.e */
public final class C13199e extends C13090h<C12995g> {

    /* renamed from: e */
    private C13200a f34464e = new C13200a();

    /* renamed from: com.bytedance.sdk.account.k.e$a */
    public static class C13200a extends C13203g {

        /* renamed from: a */
        JSONObject f34465a;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        String str;
        C12995g gVar = (C12995g) bVar;
        if (!TextUtils.isEmpty(gVar.f33999b)) {
            if (gVar.f33999b.contains(C12999b.m26135a("/passport/auth/bind_with_mobile_login/"))) {
                str = "passport_auth_bind_with_mobile_login_click";
            } else if (gVar.f33999b.contains(C12999b.m26135a(" /passport/auth/share_login/"))) {
                str = "passport_auth_share_login";
            } else {
                str = "passport_oauth_login_click";
            }
            C13168a.m26527a(str, this.f34210b.mo24750a("platform"), "login", (C12990b) gVar, this.f34211c);
        }
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C13079a.m26268a(jSONObject, jSONObject2, (C13203g) this.f34464e);
        this.f34464e.f34465a = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13079a.m26267a((C13203g) this.f34464e, jSONObject);
        this.f34464e.f34465a = jSONObject2;
        if (jSONObject != null) {
            this.f34464e.f34444i = jSONObject.optString("profile_key");
            this.f34464e.f34445j = jSONObject.optString("shark_ticket");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C12995g gVar = new C12995g(z, 1);
        if (z) {
            gVar.f34009h = this.f34464e.f34467b;
        } else {
            gVar.f34000c = this.f34464e.f34442g;
            gVar.f34001d = this.f34464e.f34443h;
            gVar.f34013l = this.f34464e.f34445j;
            gVar.f34019r = this.f34464e.f34444i;
            if (this.f34464e.f34442g == 1075) {
                gVar.f34015n = this.f34464e.f34448m;
                gVar.f34018q = this.f34464e.f34451p;
                gVar.f34017p = this.f34464e.f34450o;
                gVar.f34016o = this.f34464e.f34449n;
                gVar.f34014m = this.f34464e.f34447l;
            }
            gVar.f34020s = this.f34464e.f34452q;
        }
        gVar.f34003f = this.f34464e.f34465a;
        return gVar;
    }

    public C13199e(Context context, C13073a aVar, C12989a<C12995g> aVar2) {
        super(context, aVar, aVar2);
    }
}
