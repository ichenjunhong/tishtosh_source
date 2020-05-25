package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
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
import com.bytedance.sdk.account.p861f.p862a.C13118q;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13137n;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.p */
public final class C13158p extends C13090h<C12993e<C13118q>> {

    /* renamed from: e */
    private C13118q f34356e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_register", "mobile", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1004, this.f34356e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34356e.f34308e = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34356e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34356e, jSONObject);
        this.f34356e.f34279l = jSONObject2;
    }

    private C13158p(Context context, C13073a aVar, C13118q qVar, C13137n nVar) {
        super(context, aVar, nVar);
        this.f34356e = qVar;
    }

    /* renamed from: a */
    public static C13158p m26483a(Context context, String str, String str2, String str3, String str4, C13137n nVar) {
        C13118q qVar = new C13118q(str, str2, str3, str4);
        C13074a a = new C13074a().mo24752a(C12998a.m26118a("/passport/mobile/register/"));
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C9431p.m18668d(qVar.f34304a));
        hashMap.put("captcha", qVar.f34306c);
        hashMap.put("code", C9431p.m18668d(String.valueOf(qVar.f34305b)));
        hashMap.put("password", C9431p.m18668d(qVar.f34307d));
        hashMap.put("type", C9431p.m18668d(String.valueOf(qVar.f34285r)));
        hashMap.put("mix_mode", "1");
        return new C13158p(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), qVar, nVar);
    }
}
