package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13116o;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13133j;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.l */
public final class C13154l extends C13090h<C12993e<C13116o>> {

    /* renamed from: e */
    private C13116o f34352e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_login", "mobile", "login", (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1006, this.f34352e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34352e.f34302e = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34352e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34352e, jSONObject);
        this.f34352e.f34279l = jSONObject2;
    }

    private C13154l(Context context, C13073a aVar, C13116o oVar, C13133j jVar) {
        super(context, aVar, jVar);
        this.f34352e = oVar;
    }

    /* renamed from: a */
    public static C13154l m26463a(Context context, String str, String str2, Integer num, String str3, C13133j jVar) {
        C13116o oVar = new C13116o(str, str2, num, str3);
        C13074a a = new C13074a().mo24752a(C12998a.m26119b());
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C9431p.m18668d(oVar.f34298a));
        if (!TextUtils.isEmpty(oVar.f34301d)) {
            hashMap.put("captcha", oVar.f34301d);
        }
        hashMap.put("code", C9431p.m18668d(String.valueOf(oVar.f34299b)));
        hashMap.put("mix_mode", "1");
        if (oVar.f34300c != null) {
            hashMap.put("auth_opposite", String.valueOf(oVar.f34300c));
        }
        return new C13154l(context, a.mo24754a((Map<String, String>) hashMap).mo24751a().mo24757c(), oVar, jVar);
    }
}
