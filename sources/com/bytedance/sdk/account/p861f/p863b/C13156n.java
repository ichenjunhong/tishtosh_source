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
import com.bytedance.sdk.account.p861f.p862a.C13115n;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13135l;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.n */
public final class C13156n extends C13090h<C12993e<C13115n>> {

    /* renamed from: e */
    private C13115n f34354e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_login_only", "mobile", "login_only", (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1021, this.f34354e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34354e.f34297e = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34354e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34354e, jSONObject);
        this.f34354e.f34279l = jSONObject2;
        try {
            this.f34354e.f34296d = jSONObject.optString("sms_code_key");
        } catch (Exception unused) {
        }
    }

    private C13156n(Context context, C13073a aVar, C13115n nVar, C13135l lVar) {
        super(context, aVar, lVar);
        this.f34354e = nVar;
    }

    /* renamed from: a */
    public static C13156n m26473a(Context context, String str, String str2, String str3, C13135l lVar) {
        C13115n nVar = new C13115n(str, str2, str3);
        C13074a a = new C13074a().mo24752a(C12998a.m26118a("/passport/mobile/sms_login_only/"));
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C9431p.m18668d(nVar.f34293a));
        if (!TextUtils.isEmpty(nVar.f34295c)) {
            hashMap.put("captcha", nVar.f34295c);
        }
        hashMap.put("code", C9431p.m18668d(String.valueOf(nVar.f34294b)));
        hashMap.put("mix_mode", "1");
        return new C13156n(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), nVar, lVar);
    }
}
