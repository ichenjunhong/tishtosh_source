package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13117p;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.o */
public final class C13157o extends C13090h<C12993e<C13117p>> {

    /* renamed from: e */
    private C13117p f34355e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_recaptcha_captcha", "mobile", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1000, this.f34355e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34355e.f34303a = jSONObject2.optString("captcha");
        this.f34355e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34355e, jSONObject);
        this.f34355e.f34279l = jSONObject2;
    }

    /* renamed from: a */
    public static C13157o m26478a(Context context, int i, C13136m mVar) {
        C13117p pVar = new C13117p(i);
        C13074a a = new C13074a().mo24752a(C12998a.m26118a("/passport/mobile/refresh_captcha/"));
        HashMap hashMap = new HashMap();
        hashMap.put("type", String.valueOf(pVar.f34285r));
        return new C13157o(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), pVar, mVar);
    }

    private C13157o(Context context, C13073a aVar, C13117p pVar, C13136m mVar) {
        super(context, aVar, mVar);
        this.f34355e = pVar;
    }
}
