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
import com.bytedance.sdk.account.p861f.p862a.C13111j;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13132i;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.j */
public final class C13152j extends C13090h<C12993e<C13111j>> {

    /* renamed from: e */
    private C13111j f34350e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_account_login", "mobile", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1007, this.f34350e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34350e.f34274d = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34350e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34350e, jSONObject);
        this.f34350e.f34279l = jSONObject2;
    }

    private C13152j(Context context, C13073a aVar, C13111j jVar, C13132i iVar) {
        super(context, aVar, iVar);
        this.f34350e = jVar;
    }

    /* renamed from: a */
    public static C13152j m26454a(Context context, String str, String str2, String str3, C13132i iVar) {
        C13111j jVar = new C13111j(str, str2, str3);
        C13074a a = new C13074a().mo24752a(C12998a.m26118a("/passport/mobile/login/"));
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C9431p.m18668d(jVar.f34271a));
        if (!TextUtils.isEmpty(jVar.f34273c)) {
            hashMap.put("captcha", jVar.f34273c);
        }
        hashMap.put("password", C9431p.m18668d(jVar.f34272b));
        hashMap.put("mix_mode", "1");
        return new C13152j(context, a.mo24754a((Map<String, String>) hashMap).mo24751a().mo24757c(), jVar, iVar);
    }
}
