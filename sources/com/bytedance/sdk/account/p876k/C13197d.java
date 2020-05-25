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

/* renamed from: com.bytedance.sdk.account.k.d */
public final class C13197d extends C13090h<C12995g> {

    /* renamed from: e */
    private C13198a f34461e = new C13198a();

    /* renamed from: f */
    private String f34462f;

    /* renamed from: com.bytedance.sdk.account.k.d$a */
    public static class C13198a extends C13203g {

        /* renamed from: a */
        JSONObject f34463a;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        String str;
        C12995g gVar = (C12995g) bVar;
        if (!TextUtils.isEmpty(gVar.f33999b)) {
            if (gVar.f33999b.contains(C12999b.m26135a("/passport/auth/bind_with_mobile/"))) {
                str = "passport_oauth_bind_with_mobile_click";
            } else {
                str = "passport_oauth_bind_click";
            }
            C13168a.m26527a(str, this.f34210b.mo24750a("platform"), "auth_bind", (C12990b) gVar, this.f34211c);
        }
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C13079a.m26268a(jSONObject, jSONObject2, (C13203g) this.f34461e);
        this.f34461e.f34463a = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13079a.m26267a((C13203g) this.f34461e, jSONObject);
        this.f34461e.f34463a = jSONObject2;
        if (jSONObject != null) {
            this.f34461e.f34444i = jSONObject.optString("profile_key");
            this.f34461e.f34445j = jSONObject.optString("shark_ticket");
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C12995g a = C13079a.m26265a((C13203g) this.f34461e, z, 0);
        if (z) {
            a.f34009h = this.f34461e.f34467b;
        } else {
            a.f34000c = this.f34461e.f34442g;
            a.f34001d = this.f34461e.f34443h;
            a.f34013l = this.f34461e.f34445j;
            a.f34019r = this.f34461e.f34444i;
            if (this.f34461e.f34442g == 1075) {
                a.f34015n = this.f34461e.f34448m;
                a.f34018q = this.f34461e.f34451p;
                a.f34017p = this.f34461e.f34450o;
                a.f34016o = this.f34461e.f34449n;
                a.f34014m = this.f34461e.f34447l;
            }
        }
        a.f34003f = this.f34461e.f34463a;
        return a;
    }

    public C13197d(Context context, C13073a aVar, C12989a<C12995g> aVar2) {
        super(context, aVar, aVar2);
        this.f34462f = aVar.f34143a;
    }
}
