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
import com.bytedance.sdk.account.p861f.p862a.C13103b;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13125b;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.b */
public final class C13144b extends C13090h<C12993e<C13103b>> {

    /* renamed from: e */
    private C13103b f34342e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_bind", "mobile", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1013, this.f34342e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34342e.f34239f = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34342e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34342e, jSONObject);
        this.f34342e.f34279l = jSONObject2;
    }

    private C13144b(Context context, C13073a aVar, C13103b bVar, C13125b bVar2) {
        super(context, aVar, bVar2);
        this.f34342e = bVar;
    }

    /* renamed from: a */
    public static C13144b m26410a(Context context, String str, String str2, String str3, String str4, int i, C13125b bVar) {
        String str5;
        C13103b bVar2 = new C13103b(str, str2, str3, str4, i);
        C13074a aVar = new C13074a();
        if (TextUtils.isEmpty(str3)) {
            str5 = C12998a.m26126i();
        } else {
            str5 = C12998a.m26125h();
        }
        C13074a a = aVar.mo24752a(str5);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(bVar2.f34236c)) {
            hashMap.put("captcha", bVar2.f34236c);
        }
        hashMap.put("code", C9431p.m18668d(bVar2.f34235b));
        hashMap.put("mobile", C9431p.m18668d(bVar2.f34234a));
        hashMap.put("password", C9431p.m18668d(bVar2.f34237d));
        hashMap.put("unbind_exist", C9431p.m18668d(String.valueOf(bVar2.f34238e)));
        hashMap.put("mix_mode", "1");
        return new C13144b(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), bVar2, bVar);
    }
}
